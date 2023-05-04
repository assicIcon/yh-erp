create database erp_warehouse;
use erp_warehouse;

create table warehouse
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    warehouse_id       varchar(32) unique             not null comment '仓库ID',
    warehouse_name     varchar(64)                    not null comment '仓库名称',
    type               varchar(16)                    not null comment '仓库类型',
    valid_status       tinyint(4) default 1           not null comment '生效状态:0-无效; 1-有效;',
    storage_capacity   decimal(12, 2)                 null comment '库容量',
    country            varchar(32)                    null comment '国家',
    province           varchar(32)                    null comment '省',
    city               varchar(32)                    null comment '城市',
    region             varchar(32)                    null comment '地区',
    street             varchar(32)                    null comment '街道',
    address            varchar(256)                   null comment '详细地址',
    description        varchar(256)                   null comment '描述',
    available_capacity decimal(12, 2)                 null comment '可用库容量',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '仓库信息';

create table warehouse_manager
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    warehouse_id  varchar(32)                    not null comment '仓库ID',
    contract_name varchar(64)                    not null comment '联系人名称',
    phone_number  varchar(64)                    not null comment '联系人手机号码',
    sort          int default 0                  not null comment '排序',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '仓库管理员';

create table warehouse_inventory
(
    id                  bigint unsigned auto_increment not null comment '自增ID' primary key,
    warehouse_id        varchar(32)                    not null comment '仓库ID',
    sku_id              varchar(32)                    not null comment '产品SKU_ID',
    plan_quantity       bigint default 0               not null comment '计划数量',
    product_quantity    bigint default 0               not null comment '生产中数量',
    in_transit_quantity bigint default 0               not null comment '在途数量',
    inbound_quantity    bigint default 0               not null comment '入库中数量',
    lock_quantity       bigint default 0               not null comment '锁定数量',
    available_quantity  bigint default 0               not null comment '可用数量',
    bad_quantity        bigint default 0               not null comment '不良数量',
    create_time         datetime                       not null comment '创建时间',
    update_time         datetime                       not null comment '修改时间'
) comment '仓库库存';
create index idx_warehouse_id on warehouse_inventory (warehouse_id) comment '仓库ID索引';
create index idx_sku_id on warehouse_inventory (sku_id) comment '产品SKU_ID索引';

create table warehouse_batch_inventory
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    batch_id           varchar(32) unique             not null comment '批次ID',
    warehouse_id       varchar(32)                    not null comment '仓库ID',
    sku_id             varchar(32)                    not null comment '产品SKU_ID',
    status             varchar(32)                    not null comment '状态',
    lock_quantity      bigint                         not null comment '锁定数量',
    available_quantity bigint                         not null comment '可用数量',
    bad_quantity       bigint default 0               not null comment '不良数量',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '仓库批次库存';

# 仓库库存明细
create table warehouse_inventory_detail
(
    id           bigint unsigned auto_increment not null comment '自增ID' primary key,
    warehouse_id varchar(32)                    not null comment '仓库ID',
    sku_id       varchar(32)                    not null comment '产品SKU_ID',
    batch_id     varchar(32)                    not null comment '批次ID',
    relation_id  varchar(32)                    not null comment '关联ID',
    operator_id  varchar(32)                    not null comment '操作人ID',
    type         tinyint(4) default 0           not null comment '出入库类型',
    count        int                            not null comment '出入库数量',
    remark       varchar(256)                   null comment '备注',
    create_time  datetime                       not null comment '创建时间',
    update_time  datetime                       not null comment '修改时间'
) comment '仓库库存明细';
create index idx_warehouse_id on warehouse_inventory_detail (warehouse_id) comment '仓库ID索引';
create index idx_sku_id on warehouse_inventory_detail (sku_id) comment '产品SKU_ID索引';
create index idx_relation_id on warehouse_inventory_detail (relation_id) comment '关联ID索引';
create index idx_operator_id on warehouse_inventory_detail (operator_id) comment '操作人ID索引';

create table inbound_order
(
    id               bigint unsigned auto_increment not null comment '自增ID' primary key,
    inbound_order_id varchar(32) unique             not null comment '入库单ID',
    warehouse_id     varchar(32)                    not null comment '仓库ID',
    operator_id      varchar(32)                    not null comment '操作人ID',
    status           tinyint(4) default 0           not null comment '状态',
    type             varchar(16)                    not null comment '入库类型',
    total_count      int                            not null comment '总数量',
    total_quantity   int                            not null comment '总件数',
    total_volume     decimal(10, 2)                 not null comment '总体积(m³)',
    total_weight     decimal(10, 2)                 not null comment '总重量(kg)',
    create_time      datetime                       not null comment '创建时间',
    update_time      datetime                       not null comment '修改时间'
) comment '入库单';

create table inbound_order_item
(
    id               bigint unsigned auto_increment not null comment '自增ID' primary key,
    inbound_order_id varchar(32) unique             not null comment '入库单ID',
    batch_id         varchar(32)                    not null comment '批次ID',
    sku_id           varchar(32)                    not null comment '产品SKU_ID',
    count            int                            not null comment '数量',
    package_quantity int                            not null comment '包装数量',
    package_length   decimal(10, 2)                 not null comment '包装长(单位:cm)',
    package_width    decimal(10, 2)                 not null comment '包装宽(单位:cm)',
    package_height   decimal(10, 2)                 not null comment '包装高(单位:cm)',
    package_weight   decimal(10, 2)                 not null comment '包装重量(单位:kg)',
    create_time      datetime                       not null comment '创建时间',
    update_time      datetime                       not null comment '修改时间'
) comment '入库单明细';

create table outbound_order
(
    id                       bigint unsigned auto_increment not null comment '自增ID' primary key,
    outbound_order_id        varchar(32) unique             not null comment '出库单ID',
    shipping_warehouse_id    varchar(32)                    not null comment '发货仓库ID',
    destination_warehouse_id varchar(32)                    not null comment '目的仓库ID',
    operator_id              varchar(32)                    not null comment '操作人ID',
    status                   tinyint(4) default 0           not null comment '状态',
    type                     varchar(16)                    not null comment '出库类型',
    total_count              int                            not null comment '总数量',
    total_quantity           int                            not null comment '总件数',
    total_volume             decimal(10, 2)                 not null comment '总体积(m³)',
    total_weight             decimal(10, 2)                 not null comment '总重量(kg)',
    create_time              datetime                       not null comment '创建时间',
    update_time              datetime                       not null comment '修改时间'
) comment '出库单';

create table outbound_order_item
(
    id                bigint unsigned auto_increment not null comment '自增ID' primary key,
    outbound_order_id varchar(32) unique             not null comment '出库单ID',
    sku_id            varchar(32)                    not null comment '产品SKU_ID',
    batch_id          varchar(32)                    not null comment '批次ID',
    count             int                            not null comment '数量',
    package_quantity  int                            not null comment '包装数量',
    package_length    decimal(10, 2)                 not null comment '包装长(单位:cm)',
    package_width     decimal(10, 2)                 not null comment '包装宽(单位:cm)',
    package_height    decimal(10, 2)                 not null comment '包装高(单位:cm)',
    package_weight    decimal(10, 2)                 not null comment '包装重量(单位:kg)',
    create_time       datetime                       not null comment '创建时间',
    update_time       datetime                       not null comment '修改时间'
) comment '出库单明细';
