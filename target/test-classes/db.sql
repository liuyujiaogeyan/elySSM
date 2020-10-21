# 首先创建一个数据库(Tab补全)
drop database if exists java6ssm;
create database if not exists java6ssm;

# 手动提交
commit ;

use java6ssm;

# 创建数据表
drop table if exists user;
create table if not exists user(
    uid integer auto_increment comment '用户id',
    username varchar(20) not null comment '用户登录名',
    password varchar(32) not null comment '登录密码',
    primary key (`uid`)
)comment '管理用户登录表';

commit ;
# 插入测试数据
insert into user (username, password) values ('wzf','696aa7bb5ee7ac9135f7ed4ef526fe4d');
insert into user (uid, username, password) values (null,'zs','696aa7bb5ee7ac9135f7ed4ef526fe4d');

commit ;

drop table if exists seller;
create table if not exists seller(
    sid INTEGER auto_increment comment '商家id',
    sname VARCHAR(30) not null comment '商家名称',
    spassword VARCHAR(30) not null comment '商家密码',
    simg VARCHAR(128) comment '商家图片',
    mark DOUBLE comment '评分',
    express VARCHAR(20) not null comment '配送快递方式',
    primary key (`sid`)
);