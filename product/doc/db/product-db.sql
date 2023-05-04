create database erp_product;
use erp_product;

# 产品分类
create table category
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    category_id        varchar(32) unique             not null comment '分类ID',
    parent_category_id varchar(32) default ''         not null comment '父分类ID',
    category_name      varchar(64)                    not null comment '分类名称',
    icon               varchar(128)                   null comment '图标',
    valid_status       tinyint(4)  default 0          not null comment '生效状态: 0-无效; 1-有效;',
    sort               int         default 0          not null comment '排序',
    description        varchar(256)                   null comment '描述',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '产品分类';
create index idx_parent_category_id on category (parent_category_id) comment '父分类ID索引';

# 品牌信息
create table brand
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    brand_id     varchar(32) unique             not null comment '品牌ID',
    brand_name   varchar(64)                    not null comment '品牌名称',
    logo         varchar(128)                   null comment '品牌LOGO',
    valid_status tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    sort         int        default 0           not null comment '排序',
    description  varchar(256)                   null comment '描述',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '品牌';


### 属性 ###

# 属性
create table attr
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    attr_id       varchar(32) unique             not null comment '属性ID',
    category_id   varchar(32)                    not null comment '分类ID',
    attr_name     varchar(64)                    not null comment '属性名称',
    icon          varchar(128)                   null comment '图标',
    optional_type tinyint(4) default 0           not null comment '可选类型: 0-不可选; 1-可选;',
    valid_status  tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    sort          int        default 0           not null comment '排序',
    description   varchar(256)                   null comment '描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '属性';
create index idx_category_id on attr (category_id) comment '分类ID索引';

# 属性可选值
create table attr_optional_value
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    attr_id     varchar(32)                    not null comment '属性ID',
    value       varchar(64)                    not null comment '值',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '属性可选值';
create index idx_attr_id on attr_optional_value (attr_id) comment '属性ID索引';

# 分组
create table `group`
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    group_id    varchar(32) unique             not null comment '分组ID',
    category_id varchar(32)                    not null comment '分类ID',
    group_name  varchar(64)                    not null comment '分组名称',
    icon        varchar(128)                   null comment '图标',
    sort        int default 0                  not null comment '排序',
    description varchar(256)                   null comment '描述',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '分组';
create index idx_category_id on `group` (category_id) comment '分类ID索引';

# 分组属性
create table group_attr
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    group_id    varchar(32)                    not null comment '分组ID',
    attr_id     varchar(32)                    not null comment '属性ID',
    sort        int default 0                  not null comment '排序',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间',
    constraint unique (group_id, attr_id) comment '分组ID+属性ID唯一索引'
) comment '分组属性';

# 产品SPU信息
create table product_spu
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    spu_id      varchar(32) unique             not null comment '产品SPU_ID',
    category_id  varchar(32)                    not null comment '分类ID',
    brand_id     varchar(32)                    not null comment '品牌ID',
    product_name varchar(64)                    not null comment '产品名称',
    image        varchar(128)                   null comment '主图',
    valid_status tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    description  varchar(256)                   null comment '描述',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '产品SPU信息';

# 产品SKU基本信息
create table product_sku
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id        varchar(32) unique             not null comment '产品SKU_ID',
    spu_id       varchar(32)                    not null comment '产品SPU_ID',
    sku_name      varchar(64)                    not null comment '产品SKU名称',
    default_image varchar(128)                   null comment '默认图片',
    valid_status  tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    description   varchar(256)                   null comment '描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '产品SKU基本信息';

# 产品SKU销售属性
create table product_sku_attr
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id      varchar(32)                    not null comment 'SKU_ID',
    attr_id     varchar(32)                    not null comment '属性ID',
    attr_name   varchar(64)                    not null comment '属性名称',
    attr_value  varchar(128)                   not null comment '属性值',
    sort        int default 0                  not null comment '排序',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '产品SKU属性';
create index idx_sku_id on product_sku_attr (sku_id) comment 'SKU_ID索引';
create index idx_attr_id on product_sku_attr (attr_id) comment '属性ID索引';

# 产品SKU负责人
create table product_sku_principal
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id         varchar(32)                    not null comment '产品SKU_ID',
    principal_id   varchar(32)                    not null comment '负责人ID',
    principal_type varchar(16)                    not null comment '负责类型',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '产品SKU负责人';

# 产品SKU清关信息
create table product_sku_customs
(
    id                          bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id                      varchar(32)                    not null comment '产品SKU_ID',
    customs_id                  varchar(32)                    not null comment '海关编码',
    customs_name_cn             varchar(64)                    not null comment '中文报关名称',
    customs_name_en             varchar(64)                    not null comment '英文报关名称',
    chinese_invoice             varchar(64)                    not null comment '中文发票',
    overseas_invoice            varchar(64)                    not null comment '海外发票',
    declaration_price           decimal(10, 2)                 not null comment '申报价',
    custom_clearance_unit_price decimal(10, 2)                 not null comment '清关单价',
    create_time                 datetime                       not null comment '创建时间',
    update_time                 datetime                       not null comment '修改时间'
) comment '产品SKU清关信息';

# 产品SKU包装信息
create table product_sku_package
(
    id               bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id           varchar(32)                    not null comment '产品SKU_ID',
    length           decimal(10, 2)                 null comment '长(单位:cm)',
    width            decimal(10, 2)                 null comment '宽(单位:cm)',
    height           decimal(10, 2)                 null comment '高(单位:cm)',
    weight           decimal(10, 2)                 null comment '重量(单位:kg)',
    package_quantity int                            null comment '包装数量',
    package_length   decimal(10, 2)                 null comment '包装长(单位:cm)',
    package_width    decimal(10, 2)                 null comment '包装宽(单位:cm)',
    package_height   decimal(10, 2)                 null comment '包装高(单位:cm)',
    package_weight   decimal(10, 2)                 null comment '包装重量(单位:kg)',
    create_time      datetime                       not null comment '创建时间',
    update_time      datetime                       not null comment '修改时间'
) comment '产品SKU包装信息';

# 产品SKU图片
create table product_sku_image
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id      varchar(32)                    not null comment '产品SKU_ID',
    image_url   varchar(128)                   not null comment '图片URL',
    image_name  varchar(64)                    not null comment '图片名称',
    sort        int default 0                  not null comment '排序',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '产品SKU图片';

# 产品SKU资源
create table product_sku_resource
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    sku_id        varchar(32)                    not null comment '产品SKU_ID',
    resource_url  varchar(128)                   not null comment '资源URL',
    resource_name varchar(64)                    not null comment '资源名称',
    resource_type varchar(16)                    not null comment '资源类型',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '产品SKU资源';
