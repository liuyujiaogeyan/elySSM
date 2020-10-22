# 首先创建一个数据库(Tab补全)
drop database if exists java6ssm;
create database if not exists java6ssm;

use java6ssm;

# 创建管理用户数据表
drop table if exists adminuser;
create table if not exists adminuser
(
    uid      integer auto_increment comment '用户id',
    username varchar(20) not null comment '用户登录名',
    password varchar(32) not null comment '登录密码',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`uid`)
) comment '管理用户登录表';

commit;
# 插入管理用户测试数据
insert into adminuser (username, password)
values ('wzf', 'fe8fb64eb34764f9e0a58a32a819dcb2');
insert into adminuser (uid, username, password)
values (null, 'admin', 'fe8fb64eb34764f9e0a58a32a819dcb2');

# 批量插入测试数据
DROP PROCEDURE
    IF
        EXISTS adminuser_insert;

DELIMITER $$
CREATE PROCEDURE adminuser_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into adminuser (username,password) value (concat('user',i),'fe8fb64eb34764f9e0a58a32a819dcb2') ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL adminuser_insert ();



commit;

# 创建客户数据表
drop table if exists customer;
create table if not exists customer
(
    cid integer auto_increment comment '客户id',
    cname varchar(20) not null comment '客户姓名',
    cphone varchar(20) default null comment '联系电话',
    cemail varchar(64) default null comment '邮箱地址',
    cpass varchar(32) not null comment '密码',
    cbirth date default null comment '生日',
    cavatar varchar(50) default null comment '头像',
    cgender boolean default false comment '性别',
    cstatus boolean default false comment '是否禁用',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`cid`),
    UNIQUE KEY `cid` (`cid`),
    UNIQUE KEY `cname` (`cname`),
    UNIQUE KEY `cphone` (`cphone`),
    UNIQUE KEY `cemail` (`cemail`)
) auto_increment=1 charset=utf8 comment '客户基本信息表';
commit ;

# 通过批处理插入测试数据
DROP PROCEDURE
    IF
        EXISTS customer_insert;

DELIMITER $$
CREATE PROCEDURE customer_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into customer (cname,cpass) value (concat('cus',i),'696aa7bb5ee7ac9135f7ed4ef526fe4d') ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL customer_insert ();

-- 商家信息表
drop table if exists seller;
create table if not exists seller(
                                     sid INTEGER auto_increment comment '商家id',
                                     sname VARCHAR(30) not null comment '商家名称',
                                     spassword VARCHAR(30) not null comment '商家密码',
                                     simg VARCHAR(128) comment '商家图片',
                                     mark DOUBLE comment '评分',
                                     hid INTEGER comment '活动id',
                                     express VARCHAR(20) not null comment '配送快递方式',
                                     recommend BOOLEAN comment '是否推荐',
                                     primary key (`sid`)
);
commit ;


# 商家活动表
drop table if exists sevent;
create table if not exists sevent(
    id INTEGER auto_increment comment '商家活动表的id,主键',
    sid INTEGER not null comment '对应的商家id',
    eid INTEGER not null comment '对应的活动id',
    primary key (`id`),
#     添加和商家信息表的外键约束
    constraint `fk_sevent_to_seller_sid` foreign key account(`sid`) references seller(`sid`),
#     添加和活动表的外键约束
    constraint `fk_sevent_to_event_eid` foreign key account(`eid`) references event(`eid`)
);
commit ;


# 活动表
drop table if exists event;
create table if not exists event(
    eid INTEGER auto_increment comment '活动的id',
    ename VARCHAR(30) not null comment '活动名称',
    edesc VARCHAR(100) comment '活动简介',
    primary key (`eid`)
);
commit ;


# 商品表
drop table  if exists product;
create table if not exists product(
    pid INTEGER auto_increment comment '商品id',
    pname VARCHAR(20) not null comment '商品名称',
    pimg VARCHAR(128) not null comment '商品图片',
    pdesc VARCHAR(50) comment '商品介绍',
    price DOUBLE not null comment '商品价格',
    tid INTEGER comment '对应商品类别的编号',
    primary key (`pid`)
);
alter table product add constraint `fk_product_to_prot_ptid` foreign key product(`tid`) references product_type(`ptid`);
commit ;
