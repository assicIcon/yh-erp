create database erp_purchase;
use erp_purchase;
create table supplier
(
    id                  bigint unsigned auto_increment not null comment '自增ID' primary key,
    supplier_id         varchar(32) unique             not null comment '供应商ID',
    supplier_name       varchar(64)                    not null comment '供应商名称',
    supplier_short_name varchar(32) default ''         not null comment '简称',
    level               tinyint(4)                     not null comment '等级',
    status              tinyint(4)  default 0          not null comment '状态',
    description         varchar(256)                   null comment '描述',
    create_time         datetime                       not null comment '创建时间',
    update_time         datetime                       not null comment '修改时间'
) comment '供应商信息';

create table supplier_account
(
    id                  bigint unsigned auto_increment not null comment '自增ID' primary key,
    supplier_account_id varchar(32) unique             not null comment '供应商账户ID',
    supplier_id         varchar(32) unique             not null comment '供应商ID',
    account_type        tinyint(4)                     not null comment '账户类型',
    payee               varchar(64)                    not null comment '收款人',
    collection_account  varchar(64)                    not null comment '收款账号',
    bank_name           varchar(64)                    not null comment '收款账号开户行',
    create_time         datetime                       not null comment '创建时间',
    update_time         datetime                       not null comment '修改时间'
) comment '供应商账户信息';

create table supplier_contact
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    supplier_id   varchar(32)                    not null comment '供应商ID',
    contract_name varchar(64)                    not null comment '联系人名称',
    phone_number  varchar(64)                    not null comment '联系人手机号码',
    sort          int default 0                  not null comment '排序',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '供应商联系人';

create table supplier_quotation
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    supplier_id varchar(32) unique             not null comment '供应商ID',
    sku_id      varchar(32)                    not null comment '产品SKU_ID',
    operator_id varchar(32)                    not null comment '操作人',
    unit_price  decimal(10, 2)                 not null comment '单价',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '供应商报价';

create table purchase_order
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    purchase_id   varchar(32) unique             not null comment '采购ID',
    supplier_id   varchar(32)                    not null comment '供应商ID',
    creator_id    varchar(32)                    not null comment '创建人ID',
    status        tinyint(4) default 0           not null comment '状态',
    total_amount  decimal(10, 2)                 not null comment '总金额',
    purchase_time datetime                       null comment '采购时间',
    arrival_time  datetime                       null comment '到货时间',
    remark        varchar(256)                   null comment '备注',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '采购单';

create table purchase_order_item
(
    id                bigint unsigned auto_increment not null comment '自增ID' primary key,
    purchase_batch_id varchar(32) unique             not null comment '采购批次ID',
    purchase_id       varchar(32)                    not null comment '采购单ID',
    sku_id            varchar(32)                    not null comment '产品SKU_ID',
    price             decimal(10, 2)                 not null comment '单价',
    count             int                            not null comment '数量',
    arrival_count     int default 0                  not null comment '到货数量',
    create_time       datetime                       not null comment '创建时间',
    update_time       datetime                       not null comment '修改时间'
) comment '采购单明细';
