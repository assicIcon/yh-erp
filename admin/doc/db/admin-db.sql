create database erp_admin charset utf8 collate utf8_general_ci;
use erp_admin;
create table menu
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    menu_id        varchar(32) unique             not null comment '菜单ID',
    parent_menu_id varchar(32)                    not null comment '父菜单ID',
    menu_name      varchar(64)                    not null comment '菜单名称',
    icon           varchar(256)                   null comment '图标',
    valid_status   tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    sort           int        default 0           not null comment '排序',
    description    varchar(256)                   null comment '描述',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '菜单信息';

create table menu_function
(
    id                 bigint unsigned auto_increment not null comment '自增ID' primary key,
    menu_function_id   varchar(32) unique             not null comment '菜单功能ID',
    menu_id            varchar(32)                    not null comment '菜单ID',
    menu_function_name varchar(64)                    not null comment '菜单功能名称',
    description        varchar(256)                   null comment '描述',
    create_time        datetime                       not null comment '创建时间',
    update_time        datetime                       not null comment '修改时间'
) comment '菜单功能';

create table role
(
    id             bigint unsigned auto_increment not null comment '自增ID' primary key,
    role_id        varchar(32) unique             not null comment '角色ID',
    parent_role_id varchar(21) default ''         not null comment '父角色ID',
    role_name      varchar(64)                    not null comment '角色名称',
    description    varchar(256)                   null comment '描述',
    create_time    datetime                       not null comment '创建时间',
    update_time    datetime                       not null comment '修改时间'
) comment '角色';

create table role_permissions
(
    id               bigint unsigned auto_increment not null comment '自增ID' primary key,
    role_id          varchar(32)                    not null comment '角色ID',
    menu_function_id varchar(32)                    not null comment '菜单功能ID',
    create_time      datetime                       not null comment '创建时间',
    update_time      datetime                       not null comment '修改时间'
) comment '角色权限';

create table department
(
    id              bigint unsigned auto_increment not null comment '自增ID' primary key,
    department_id   varchar(32) unique             not null comment '部门ID',
    department_name varchar(64)                    not null comment '部门名称',
    valid_status    tinyint(4) default 1           not null comment '生效状态: 0-无效; 1-有效;',
    description     varchar(256)                   null comment '描述',
    create_time     datetime                       not null comment '创建时间',
    update_time     datetime                       not null comment '修改时间'
) comment '部门信息';

create table user
(
    id            bigint unsigned auto_increment not null comment '自增ID' primary key,
    user_id       varchar(32) unique             not null comment '用户ID',
    department_id varchar(32)                    not null comment '部门ID',
    user_name     varchar(64)                    not null comment '用户名称',
    password      varchar(64)                    null comment '用户密码',
    avatar        varchar(128)                   null comment '头像',
    email         varchar(128)                   null comment '邮箱',
    phone_number  varchar(64)                    null comment '手机号',
    create_time   datetime                       not null comment '创建时间',
    update_time   datetime                       not null comment '修改时间'
) comment '用户信息';

create table user_role
(
    id          bigint unsigned auto_increment not null comment '自增ID' primary key,
    user_id     varchar(32)                    not null comment '用户ID',
    role_id     varchar(32)                    not null comment '角色ID',
    create_time datetime                       not null comment '创建时间',
    update_time datetime                       not null comment '修改时间'
) comment '用户角色';
