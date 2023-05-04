create database erp_approval;
use erp_approval;
create table approval_config
(
    id                   bigint unsigned auto_increment not null comment '自增ID' primary key,
    approval_config_id   varchar(32) unique             not null comment '审批配置ID',
    approval_config_name varchar(64)                    not null comment '审批配置名称',
    notice               tinyint(4) default 0           not null comment '是否发送通知: 0-否; 1-是;',
    cc_type              tinyint(4) default 0           not null comment '抄送人类型: 0-配置;1-提交时指定;',
    description          varchar(256)                   null comment '描述',
    create_time          datetime                       not null comment '创建时间',
    update_time          datetime                       not null comment '修改时间'
) comment '审批配置信息';

create table approval_node_config
(
    id                           bigint unsigned auto_increment not null comment '自增ID' primary key,
    approval_config_id           varchar(32)                    not null comment '审批配置ID',
    approval_condition_config_id varchar(32)                    not null comment '审批条件配置ID',
    approval_user_id             varchar(23)                    not null comment '审批人ID',
    pass_type                    varchar(32) default 'ALL'      not null comment '节点审批通过类型: ALL-必须所有都通过; ONE-只需一个人通过;',
    sort                         int         default 0          not null comment '排序',
    create_time                  datetime                       not null comment '创建时间',
    update_time                  datetime                       not null comment '修改时间'
) comment '审批节点';

create table approval_cc_config
(
    id                           bigint unsigned auto_increment not null comment '自增ID' primary key,
    approval_config_id           varchar(32)                    not null comment '审批配置ID',
    approval_condition_config_id varchar(32)                    not null comment '审批条件配置ID',
    cc_user_id                   varchar(32)                    not null comment '抄送人ID',
    create_time                  datetime                       not null comment '创建时间',
    update_time                  datetime                       not null comment '修改时间'
) comment '审批抄送';

create table approval_condition_config
(
    id                           bigint unsigned auto_increment not null comment '自增ID' primary key,
    approval_condition_config_id varchar(32) unique             not null comment '审批条件配置ID',
    approval_config_id           varchar(32)                    not null comment '审批配置ID',
    type                         varchar(32)                    not null comment '条件类型',
    condition_json               varchar(256)                   not null comment '条件JSON格式',
    create_time                  datetime                       not null comment '创建时间',
    update_time                  datetime                       not null comment '修改时间'
) comment '审批条件';

create table approval_notice_config
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    approval_config_id varchar(32)                    not null comment '审批配置ID',
    type               varchar(32)                    not null comment '类型',
    notice_template    varchar(256)                   not null comment '通知模板',
    target             varchar(32)                    not null comment '审批通知对象',
    valid_status       tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '审批通知';

create table approval
(
    id                   bigint unsigned auto_increment not null comment '自增ID' primary key,
    approval_id          varchar(32) unique             not null comment '审批单ID',
    approval_config_id   varchar(32)                    not null comment '审批配置ID',
    business_id          varchar(32)                    not null comment '业务ID',
    applicant_id         varchar(32)                    not null comment '申请人',
    status               tinyint(4) default 0           not null comment '审批状态: 0-审批中; 1-同意; 2-驳回;',
    remark               varchar(256)                   null comment '审批备注',
    approval_finish_time datetime                       null comment '审批完成时间',
    create_time          datetime                       not null comment '创建时间',
    update_time          datetime                       not null comment '修改时间'
) comment '审批单';

create table approval_node_record
(
    id               bigint unsigned auto_increment not null comment '自增ID' primary key,
    approval_id      varchar(32)                    not null comment '审批单ID',
    approval_user_id varchar(23)                    not null comment '审批人ID',
    pass_type        varchar(32) default 'ALL'      not null comment '节点审批通过类型',
    status           tinyint(4)  default 0          not null comment '审批状态: 0-审批中; 1-同意; 2-驳回;',
    sort             int         default 0          not null comment '排序',
    create_time      datetime                       not null comment '创建时间',
    update_time      datetime                       not null comment '修改时间'
) comment '审批节点记录';

create table approval_cc_record
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    approval_id varchar(32)                    not null comment '审批单ID',
    cc_user_id  varchar(32)                    not null comment '抄送人ID',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '审批抄送记录';

# 流程定义
# 事件
# 事件体
