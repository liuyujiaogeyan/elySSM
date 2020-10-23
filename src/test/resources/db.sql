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

# 通理过批处插入测试数据
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
alter table seller add column add_time timestamp not null default current_timestamp comment '创建时间';
alter table seller add column up_time  timestamp not null default current_timestamp on update current_timestamp comment '修改时间';
commit ;

# 添加商家信息表的数据
insert into  seller (sname,spassword,simg,mark,hid,express,recommend) values ('万家饺子馆','123546',null,4.8,2,'蜂鸟专送',true),
                                                                             ('小锅饭豆腐馆','123546',null,4.9,3,'美团专送',true),
                                                                             ('大理寺砂锅米线','123546',null,4.6,2,'美团专送',false),
                                                                             ('重庆小面','123546',null,4.8,1,'蜂鸟专送',true),
                                                                             ('小红旗臭豆腐','123546',null,4.7,2,'美团专送',true),
                                                                             ('小二家水果捞','123546',null,4.8,1,'蜂鸟专送',false),
                                                                             ('韩式烤肉拌饭','123546',null,4.6,3,'美团专送',false),
                                                                             ('Coco奶茶','123546',null,4.8,1,'美团专送',true),
                                                                             ('满园春饼','123546',null,4.9,2,'蜂鸟专送',false),
                                                                             ('麦当劳','123546',null,4.9,1,'蜂鸟专送',true),
                                                                             ('肯德基','123546',null,4.9,4,'蜂鸟专送',true),
                                                                             ('香满城炸肉','123546',null,4.9,5,'蜂鸟专送',false),
                                                                             ('冷锅串串','123546',null,4.6,4,'美团专送',true);

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
alter table sevent add column add_time timestamp not null default current_timestamp comment '创建时间';
alter table sevent add column up_time  timestamp not null default current_timestamp on update current_timestamp comment '修改时间';
commit ;


# 活动表
drop table if exists event;
create table if not exists event(
    eid INTEGER auto_increment comment '活动的id',
    ename VARCHAR(30) not null comment '活动名称',
    edesc VARCHAR(100) comment '活动简介',
    primary key (`eid`)
);
alter table event add column add_time timestamp not null default current_timestamp comment '创建时间';
alter table event add column up_time  timestamp not null default current_timestamp on update current_timestamp comment '修改时间';
commit ;


# 商品表
drop table if exists product;
create table if not exists product(
    pid INTEGER auto_increment comment '商品id',
    pname VARCHAR(20) not null comment '商品名称',
    pimg VARCHAR(128) not null comment '商品图片',
    pdesc VARCHAR(50) comment '商品介绍',
    price DOUBLE not null comment '商品价格',
    tid INTEGER comment '对应商品类别的编号',
    primary key (`pid`)
);
alter table product add column fsid INTEGER comment '所属商家';
alter table product add constraint `fk_product_to_seller_sid` foreign key product(`fsid`) references seller(`sid`);
alter table product add constraint `fk_product_to_prot_ptid` foreign key product(`tid`) references product_type(`ptid`);
alter table product add column add_time timestamp not null default current_timestamp comment '创建时间';
alter table product add column up_time  timestamp not null default current_timestamp on update current_timestamp comment '修改时间';
commit ;


# 创建订单表
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
                           `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单编号',
                           `ocount` int(11) NULL DEFAULT NULL COMMENT '商品数量',
                           `oamount_status` int(11) NOT NULL COMMENT '订单状态',
                           `receivename` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人姓名',
                           `receiveaddress` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货地址',
                           `receivetel` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货人电话',
                           `add_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
                           `up_time` timestamp(0) NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改时间',
                           `fcid` int(11) NOT NULL COMMENT '所属用户',
                           `fpid` int(11) NOT NULL COMMENT '商品代码',
                           PRIMARY KEY (`oid`) USING BTREE,
                           INDEX `fk_or_fcid_cus_cid`(`fcid`) USING BTREE,
                           INDEX `fk_or_fpid_pro_pid`(`fpid`) USING BTREE,
                           CONSTRAINT `fk_or_fcid_cus_cid` FOREIGN KEY (`fcid`) REFERENCES `customer` (`cid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                           CONSTRAINT `fk_or_fpid_pro_pid` FOREIGN KEY (`fpid`) REFERENCES `product` (`pid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 1, 1, '心静', '东软', '1388888888', '2020-10-22 15:15:53', '0000-00-00 00:00:00', 1, 1);
INSERT INTO `orders` VALUES (2, 2, 2, '心境', '睿道', '1399999999', '2020-10-22 15:16:52', '0000-00-00 00:00:00', 2, 1);
INSERT INTO `orders` VALUES (3, 3, 3, '新景', '普兰店', '1377777777', '2020-10-22 15:26:05', '0000-00-00 00:00:00', 3, 1);


INSERT INTO `product` VALUES (1, '芹菜饺子', '美食', '好吃', 2, 8,1);
INSERT INTO product (pname,pimg,pdesc,price,tid,fsid) VALUES ( '菌汤麻辣烫', '***', '鲜美', 12.8, 1,9),
                             ('石锅烤肉拌饭', '***', '现烤鸡肉,韩国进口拌饭酱', 15.2, 3,7),
                             ( '桃桃酸奶果汁', '***', '新鲜桃肉,自制酸奶,美味健康', 12.8, 4,8),
                             ( '牛肉汤面', '***', '地道重庆小面,骨汤熬制', 16.3, 2,4),
                             ( '肥羊米线', '***', '米线由大米制作,无添加剂,食材新鲜,放心食用', 12.8, 5,3),
                             ( '冷面卷臭豆腐', '***', '刷点臭酱超好吃', 4, 7,5);


DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type`  (
                                 `ptid` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类代码',
                                 `ptname` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '分类名称',
                                 `ptlevel` int(11) NOT NULL COMMENT '分类等级',
                                 `fparentlevel` int(11) NULL DEFAULT NULL COMMENT '上级分类',
                                 PRIMARY KEY (`ptid`) USING BTREE,
                                 UNIQUE INDEX `ptname`(`ptname`) USING BTREE,
                                 INDEX `fk_pt_fptl_pt_ptid`(`fparentlevel`) USING BTREE,
                                 CONSTRAINT `fk_pt_fptl_pt_ptid` FOREIGN KEY (`fparentlevel`) REFERENCES `product_type` (`ptid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;



INSERT INTO `product_type` VALUES (1, '中餐', 1, NULL);
INSERT INTO `product_type` VALUES (2, '西餐', 1, NULL);
INSERT INTO `product_type` VALUES (3, '快餐', 2, 1);
INSERT INTO `product_type` VALUES (4, '熟食', 2, 1);
INSERT INTO `product_type` VALUES (5, '拌菜', 2, 1);
INSERT INTO `product_type` VALUES (6, '肯德基', 2, 2);
INSERT INTO `product_type` VALUES (7, '麦当劳', 2, 2);
INSERT INTO `product_type` VALUES (8, '饺子', 2, 2);