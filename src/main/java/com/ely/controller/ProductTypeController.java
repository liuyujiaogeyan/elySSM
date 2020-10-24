package com.ely.controller;

import com.ely.domain.*;
import com.ely.service.ProductTypeService;
import com.ely.utils.MessageAndData;
import com.ely.vo.ProductTypeCondition;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/productTypes")
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;

    @ResponseBody
    @RequestMapping("/list")
    public MessageAndData list(@Validated @ModelAttribute(value = "productTypeCondition") ProductTypeCondition productTypeCondition, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) throws ParseException {
        System.out.println("productTypes");
        System.out.println(productTypeCondition);

        ProductTypeExample pe = new ProductTypeExample();
        ProductTypeExample.Criteria pc = pe.createCriteria();

        //根据名称检索数据
        String productTypeName = "";
        if (productTypeCondition.getPtname() != null && "".equals(productTypeCondition.getPtname())) {
            productTypeName = "%" + productTypeCondition.getPtname() + "%";
            pc.andPtnameLike(productTypeName);
        }

        //根据ptid检索数据
        System.out.println("productTypeCondition = " + productTypeCondition);
        Integer ptIdC = productTypeCondition.getPtidC();
        if (ptIdC != null && productTypeCondition.getPtid() != null) {
            switch (ptIdC) {
                case 0:
                    pc.andPtidGreaterThan(productTypeCondition.getPtid());
                    break;
                case 1:
                    pc.andPtidEqualTo(productTypeCondition.getPtid());
                    break;
                case 2:
                    pc.andPtidLessThan(productTypeCondition.getPtid());
                    break;
            }
        }
        //根据类别检索数据
        if(productTypeCondition.getPtlevel() != null) {
            pc.andPtlevelEqualTo(productTypeCondition.getPtlevel());
        }
        //根据记录添加时间检索数据
        Date startDate = productTypeCondition.getStartDate() == null ? new Date(Long.MIN_VALUE) : productTypeCondition.getStartDate();
        Date endDate = productTypeCondition.getEndDate() == null ? new Date(Long.MAX_VALUE) : productTypeCondition.getEndDate();
        if (startDate.after(endDate)) {
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }
        pc.andAddTimeBetween(startDate, endDate);


        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<ProductType> productTypes = productTypeService.selectByExample(pe);
        System.out.println("productTypes = ");
        System.out.println(productTypes);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(productTypes, 8);
        return MessageAndData.success("").add("pageInfo", pageInfo);
    }
}
