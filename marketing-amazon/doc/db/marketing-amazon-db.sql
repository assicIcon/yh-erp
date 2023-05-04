create table marketplace
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    marketplace_id varchar(32) unique             not null comment '市场ID',
    country        varchar(32)                    not null comment '国家',
    region         varchar(32)                    not null comment '区域',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '市场';

create table shop
(
    id                   bigint unsigned auto_increment not null comment '自增ID' primary key,
    shop_id              varchar(32) unique             not null comment '店铺ID',
    shop_name            varchar(64)                    not null comment '店铺名称',
    valid_status         tinyint(4) default 1           not null comment '生效状态',
    seller_id            varchar(32)                    null comment '亚马逊销售伙伴标识符',
    amazon_auth_token    varchar(256)                   null comment '亚马逊授权TOKEN',
    amazon_refresh_token varchar(256)                   null comment '亚马逊刷新TOKEN',
    create_time          datetime                       not null comment '创建时间',
    update_time          datetime                       not null comment '修改时间'
) comment '店铺';

create table shop_marketplace
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    shop_id        varchar(32)                    not null comment '店铺ID',
    marketplace_id varchar(32)                    not null comment '市场ID',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '店铺市场';

create table listing_asin
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    asin_id        varchar(32)                    not null comment 'ASIN_ID',
    parent_asin_id varchar(32) default ''         not null comment '父ASIN',
    product_name   varchar(64)                    not null comment '产品名称',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '产品ASIN信息';

create table listing_sku
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id      varchar(32)                    not null comment '产品SKU_ID',
    asin_id     varchar(32)                    not null comment 'ASIN_ID',
    fnsku_id    varchar(32)                    not null comment 'FNSKU_ID',
    image       varchar(256)                   not null comment '图片',
    title       varchar(256)                   not null comment '标题',
    status      varchar(32)                    not null comment '状态',
    price       decimal(10, 2)                 not null comment '价格',
    fba_fee     decimal(10, 2)                 null comment 'FBA费',
    shelve_time datetime                       null comment '上架时间',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '产品SKU信息';

create table listing_sku_stock
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id      varchar(32)                    not null comment '产品skuId',
    fba_sale    int                            null comment 'fba可售',

    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
);

create table amazon_order
(
    id                  bigint unsigned auto_increment not null comment '自增ID' primary key,
    amazon_order_id     varchar(32)                    not null comment '亚马逊订单ID',
    order_id            varchar(32)                    not null comment '系统订单ID',
    shop_id             varchar(32)                    not null comment '亚马逊店铺ID',
    marketplace_id      varchar(32)                    not null comment '亚马逊市场ID',
    amazon_order_status varchar(64)                    not null comment '亚马逊订单状态',
    amazon_order_type   varchar(64)                    null comment '订单类型',
    local_order_time    datetime                       not null comment '当地下单时间',
    create_time         datetime                       not null comment '创建时间',
    update_time         datetime                       not null comment '修改时间'
) comment '亚马逊订单信息';


#
# 产品开发人员  选品 -> 建品
# 采购一一人员  采购建单
# 质检一一人员  质检入库 仓库管理
# 备货一一人员  备货
# 物流一一人员  商品出库 物流跟踪 商品到货 商品入库
# 销售一一人员  商品上架 商品营销/销售


# 产品
### 产品分类
### 产品品牌
### 产品ASIN信息
### 产品SKU信息
### 新品开发 (包装设计 + 图片设计 + 摄影 + 文案)

