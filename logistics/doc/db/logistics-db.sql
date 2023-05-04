

create table fee_item
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    fee_item_id   varchar(32) unique             not null comment '费用项ID',
    fee_item_name varchar(64)                    not null comment '费用项名称',
    description   varchar(256)                   null comment '描述',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '费用项';

create table transport_method
(
    id                    bigint unsigned auto_increment not null comment '自增ID' primary key,
    transport_method_id   varchar(32) unique             not null comment '运输方式ID',
    transport_method_name varchar(64)                    not null comment '运输方式名称',
    description           varchar(256)                   null comment '描述',
    create_time           datetime                       not null comment '创建时间',
    update_time           datetime                       not null comment '修改时间'
) comment '运输方式';

create table logistics_provider
(
    id                      bigint unsigned auto_increment not null comment '自增ID' primary key,
    logistics_provider_id   varchar(32) unique             not null comment '物流商ID',
    logistics_provider_name varchar(64)                    not null comment '物流商名称',
    level                   tinyint(4)                     not null comment '等级',
    status                  tinyint(4) default 0           not null comment '状态',
    description             varchar(256)                   null comment '描述',
    create_time             datetime                       not null comment '创建时间',
    update_time             datetime                       not null comment '修改时间'
) comment '物流商';

create table logistics_provider_quotation
(
    id                    bigint unsigned auto_increment not null comment '自增ID' primary key,
    logistics_provider_id varchar(32) unique             not null comment '物流商ID',
    transport_method_id   varchar(32) unique             not null comment '运输方式',
    billing_method        varchar(16)                    not null comment '计费方式',
    shipping_area         varchar(16)                    not null comment '发货地区',
    destination_area      varchar(16)                    not null comment '目的地区',
    fee_item_id           varchar(32) unique             not null comment '费用项ID',
    fee                   decimal(10, 2)                 not null comment '费用',
    currency              varchar(16)  default 'RMB'     not null comment '币种',
    calculation_formula   varchar(128) default 'fee'     not null comment '计算公式',
    create_time           datetime                       not null comment '创建时间',
    update_time           datetime                       not null comment '修改时间'
) comment '物流商报价';

create table logistics_provider_contact
(
    id                    bigint unsigned auto_increment not null comment '自增ID' primary key,
    logistics_provider_id varchar(32)                    not null comment '供应商ID',
    contract_name         varchar(64)                    not null comment '联系人名称',
    phone_number          varchar(64)                    not null comment '联系人手机号码',
    sort                  int default 0                  not null comment '排序',
    create_time           datetime                       not null comment '创建时间',
    update_time           datetime                       not null comment '修改时间'
) comment '物流商联系人';

create table logistics_order
(
    id                    bigint unsigned auto_increment not null comment '自增ID' primary key,
    logistics_order_id    varchar(32) unique             not null comment '物流单ID',
    logistics_provider_id varchar(32)                    not null comment '物流商ID',
    warehouse_id          varchar(32)                    not null comment '发货仓库ID',
    transport_method_id   varchar(32)                    not null comment '运输方式ID',
    waybill_no            varchar(32)                    null comment '运单号',
    status                tinyint(4) default 0           not null comment '状态',
    billing_method        varchar(16)                    not null comment '计费方式',
    total_quantity        int                            not null comment '总件数',
    total_weight          decimal(10, 2)                 not null comment '总重量(kg)',
    total_volume          decimal(10, 2)                 not null comment '总体积(m³)',
    total_amount          decimal(10, 2)                 not null comment '金额(RMB)',
    collect_time          datetime                       null comment '揽收时间',
    delivery_time         datetime                       null comment '发货时间',
    confirm_receipt_time  datetime                       null comment '确认收货时间',
    create_time           datetime                       not null comment '创建时间',
    update_time           datetime                       not null comment '修改时间'
) comment '物理订单';

create table logistics_order_address
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    logistics_order_id varchar(32) unique             not null comment '物流单ID',
    contract_name      varchar(64)                    not null comment '联系人名称',
    phone_number       varchar(64)                    not null comment '联系人手机号码',
    country            varchar(32)                    not null comment '国家',
    province           varchar(32)                    not null comment '省',
    city               varchar(32)                    not null comment '城市',
    region             varchar(32)                    not null comment '地区',
    street             varchar(32)                    not null comment '街道',
    address            varchar(256)                   not null comment '详细地址',
    sort               int default 0                  not null comment '排序',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '物流订单地址';

create table logistics_order_fee
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    logistics_order_id varchar(32)                    not null comment '物流单ID',
    fee_item_id        varchar(32)                    not null comment '费用项ID',
    fee_item_name      varchar(64)                    not null comment '费用项名称',
    type               tinyint(4)     default 0       not null comment '费用类型',
    fee                decimal(10, 2)                 not null comment '费用',
    currency           varchar(16)    default 'RMB'   not null comment '币种',
    exchange_rate      decimal(10, 2) default 1       not null comment '兑人民币汇率',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '物流单费用';
