package com.ely.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.ely.domain.User;
import com.ely.domain.UserExample;
import com.ely.service.UserService;
import com.ely.utils.MD5Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/19 0019
 * @描述
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public ModelAndView list(
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ){
        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pages/user/list");
        List<User> users = userService.selectByExample(null);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(users, 8);
        modelAndView.addObject("pageInfo",pageInfo);
        return modelAndView;
    }

    @RequestMapping(value = "/ins")
    public String ins(){
        return "pages/user/insForm";
    }

    @RequestMapping(value = "/insert",method = {RequestMethod.POST})
    public String insert(@Validated @ModelAttribute(value = "user") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "forward:ins";
        }
        Integer update = userService.insertSelective(user);
        return "redirect:list";
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.GET})
    public String delete(@RequestParam(value = "uid",required = true)Integer uid){
        Integer delete = userService.deleteByPrimaryKey(uid);
        return "redirect:list";
    }


    @RequestMapping(value = "/upt")
    public ModelAndView upt(@RequestParam(value = "uid",required = true)Integer uid){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("pages/user/uptForm");
        User user = userService.selectByPrimaryKey(uid);
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    @RequestMapping(value = "/update")
    public String update(User user){
        Integer update = userService.updateByPrimaryKeySelective(user);
        return "redirect:list";
    }

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String toLogin(){
        return "pages/user/login";
    }

    @RequestMapping(value = "/loginCheck")
    public String loginCheck(User user, HttpServletRequest request){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        user.setPassword(MD5Util.getMD5(user.getPassword()));
        criteria.andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(user.getPassword());
        List<User> byUser = userService.selectByExample(userExample);
        if(byUser.size()>0){
//            将用户基本信息记录在session中
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(3600);//会话时间3600秒
            session.setAttribute("USER_SESSION",byUser.get(0).getUsername());
            return "admin";
        }else{
            return "pages/user/login";
        }
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request){
//            将用户基本信息从session中清除
            HttpSession session = request.getSession();
            session.setAttribute("USER_SESSION","");//单独设置session
//            session.invalidate();//使所有的session失效
            return "redirect:/index.jsp";
    }

}
