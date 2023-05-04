create database erp_financial;
use erp_financial;

create table invoice
(
    id               bigint unsigned auto_increment not null comment '自增ID' primary key,
    invoice_id       varchar(32) unique             not null comment '发票ID',
    amount           decimal(10, 2)                 not null comment '发票金额',
    available_amount decimal(10, 2)                 not null comment '可用金额',
    currency         varchar(16)    default 'RMB'   not null comment '币种',
    exchange_rate    decimal(10, 2) default 1       not null comment '兑人民币汇率',
    attachment_url   varchar(256)                   not null comment '发票附件',
    issue_date       datetime                       not null comment '开票日期',
    create_time      datetime                       not null comment '创建时间',
    update_time      datetime                       not null comment '修改时间'
) comment '发票';

create table company
(
    id                   bigint unsigned auto_increment not null comment '自增ID' primary key,
    company_id           varchar(32) unique             not null comment '公司ID',
    registration_country varchar(32) default '中国'       not null comment '注册国家',
    company_name         varchar(64)                    not null comment '公司名称',
    company_type         varchar(64)                    not null comment '公司类型',
    social_credit_code   varchar(64)                    not null comment '统一社会信用代码',
    legal_person         varchar(32)                    not null comment '法人',
    address              varchar(256)                   not null comment '地址',
    establishment_date   datetime                       not null comment '成立日期',
    create_time          datetime                       not null comment '创建时间',
    update_time          datetime                       not null comment '修改时间'
) comment '公司';

create table payment_apply
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    payment_apply_id   varchar(32) unique             not null comment '付款申请ID',
    applicant_id       varchar(32)                    not null comment '申请人ID',
    payment_company_id varchar(32)                    not null comment '付款公司ID',
    payment_type       varchar(16)                    not null comment '付款类型',
    status             tinyint(4)                     not null comment '状态',
    payee              varchar(64)                    not null comment '收款人',
    collection_account varchar(64)                    not null comment '收款账号',
    bank_name          varchar(64)                    not null comment '收款账号开户行',
    amount             decimal(12, 2)                 not null comment '应付金额',
    currency           varchar(16)    default 'RMB'   not null comment '币种',
    exchange_rate      decimal(10, 2) default 1       not null comment '兑人民币汇率',
    apply_time         datetime                       not null comment '申请时间',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '付款申请';

create table payment_apply_item
(
    id                bigint unsigned auto_increment not null comment '自增ID' primary key,
    payment_order_id  varchar(32) unique             not null comment '付款单ID',
    invoice_id        varchar(32)                    not null comment '发票ID',
    payment_item_name varchar(64)                    not null comment '付款项目摘要',
    amount            decimal(12, 2)                 not null comment '应付金额',
    currency          varchar(16)    default 'RMB'   not null comment '币种',
    exchange_rate     decimal(10, 2) default 1       not null comment '兑人民币汇率',
    create_time       datetime                       not null comment '创建时间',
    update_time       datetime                       not null comment '修改时间'
) comment '付款单明细';

create table payment_order
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    payment_order_id   varchar(32) unique             not null comment '付款单ID',
    payment_apply_id   varchar(32)                    not null comment '付款申请ID',
    payment_company_id varchar(32)                    not null comment '付款公司ID',
    payment_type       varchar(16)                    not null comment '付款类型',
    payment_method     varchar(16)                    not null comment '付款方式',
    status             tinyint(4)                     not null comment '状态',
    payee              varchar(64)                    not null comment '收款人',
    collection_account varchar(64)                    not null comment '收款账号',
    bank_name          varchar(64)                    not null comment '收款账号开户行',
    amount             decimal(12, 2)                 not null comment '应付金额',
    currency           varchar(16)    default 'RMB'   not null comment '币种',
    exchange_rate      decimal(10, 2) default 1       not null comment '兑人民币汇率',
    payment_time       datetime                       null comment '付款时间',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '付款单';

create table payment_record
(
    id               bigint unsigned auto_increment not null comment '自增ID' primary key,
    payment_order_id varchar(32)                    not null comment '付款单ID',
    operator_id      varchar(32)                    not null comment '操作人ID',
    payment_amount   decimal(12, 2)                 not null comment '付款金额',
    currency         varchar(16)    default 'RMB'   not null comment '币种',
    exchange_rate    decimal(10, 2) default 1       not null comment '兑人民币汇率',
    payment_time     datetime                       null comment '付款时间',
    create_time      datetime                       not null comment '创建时间',
    update_time      datetime                       not null comment '修改时间'
) comment '付款单付款记录';
