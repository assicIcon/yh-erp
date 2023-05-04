create database erp_order;
use erp_order;

create table `order`
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id        varchar(32) unique             not null comment '订单ID',
    member_id       varchar(32)                    not null comment '会员ID',
    country         varchar(32)                    not null comment '国家',
    status          tinyint(4)     default 0       not null comment '状态',
    total_amount    decimal(10, 2)                 not null comment '订单总金额',
    discount_amount decimal(10, 2)                 not null comment '优惠金额',
    pay_amount      decimal(10, 2)                 not null comment '应付总金额',
    currency        varchar(16)                    not null comment '金额币种',
    exchange_rage   decimal(10, 2) default 1       not null comment '兑人民币汇率',
    order_time      datetime                       not null comment '下单时间',
    source_type     varchar(16)                    not null comment '订单来源',
    remark          varchar(256)                   null comment '订单备注',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '订单信息';

create table order_item
(
    id                   bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id             varchar(32)                    not null comment '订单ID',
    sku_id               varchar(32)                    not null comment '产品SKU_ID',
    product_name         varchar(64)                    not null comment '产品名称',
    count                int                            not null comment '数量',
    unit_price           decimal(10, 2)                 not null comment '单价',
    unit_discount_amount decimal(10, 2)                 not null comment '单个优惠价格',
    create_time          datetime                       not null comment '创建时间',
    update_time          datetime                       not null comment '修改时间'
) comment '订单明细';

create table order_discount
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id        varchar(32)                    not null comment '订单ID',
    relation_id     varchar(32)                    not null comment '优惠关联ID',
    discount_type   varchar(16)                    not null comment '优惠类型',
    discount_amount decimal(10, 2)                 not null comment '优惠金额',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '订单优惠';
create index idx_order_id on order_discount (order_id) comment '订单ID索引';
create index idx_relation_id on order_discount (relation_id) comment '优惠关联ID索引';

create table order_item_discount
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id        varchar(32)                    not null comment '订单ID',
    sku_id          varchar(32)                    not null comment '产品SKU_ID',
    relation_id     varchar(32)                    not null comment '优惠关联ID',
    discount_type   varchar(16)                    not null comment '优惠类型',
    discount_amount decimal(10, 2)                 not null comment '优惠金额',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '订单优惠明细';
create index idx_order_id on order_item_discount (order_id) comment '订单ID索引';
create index idx_sku_id on order_item_discount (sku_id) comment '产品SKU_ID索引';
create index idx_relation_id on order_item_discount (relation_id) comment '优惠关联ID索引';

create table order_logistics
(
    id                     bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id               varchar(32)                    not null comment '订单ID',
    logistics_order_id     varchar(32)                    not null comment '物流单ID',
    logistics_providers_id varchar(16)                    not null comment '物流商ID',
    waybill_no             varchar(32)                    null comment '物流单号',
    status                 tinyint(4)                     not null comment '物流状态',
    country                varchar(32)                    not null comment '国家',
    province               varchar(32)                    not null comment '省',
    city                   varchar(32)                    not null comment '城市',
    region                 varchar(32)                    not null comment '地区',
    street                 varchar(32)                    not null comment '街道',
    address                varchar(256)                   not null comment '详细地址',
    collect_time           datetime                       null comment '揽收时间',
    delivery_time          datetime                       null comment '发货时间',
    confirm_receipt_time   datetime                       null comment '确认收货时间',
    create_time            datetime                       not null comment '创建时间',
    update_time            datetime                       not null comment '修改时间'
) comment '订单物流信息';

create table order_payment
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    order_id     varchar(32)                    not null comment '订单ID',
    payment_id   varchar(32)                    not null comment '付款流水ID',
    pay_amount   decimal(10, 2)                 not null comment '付款金额',
    pay_method   varchar(16)                    not null comment '付款方式',
    status       tinyint(4) default 0           not null comment '付款状态',
    confirm_time datetime                       not null comment '付款确认时间',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '订单付款信息';

/*
create table walmart_order
(
    id                   bigint unsigned auto_increment not null comment '自增ID' primary key,
    walmart_order_id     varchar(32)                    not null comment '沃尔玛订单ID',
    order_id             varchar(32)                    not null comment '系统订单ID',
    walmart_order_status varchar(64)                    not null comment '沃尔玛订单状态',
    walmart_order_type   varchar(64)                    null comment '订单类型',
    local_order_time     datetime                       not null comment '当地下单时间',
    create_time          datetime                       not null comment '创建时间',
    update_time          datetime                       not null comment '修改时间'
) comment '沃尔玛订单信息';
*/
