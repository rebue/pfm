/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/7/10 14:18:20                           */
/*==============================================================*/


drop table if exists PFM_SYS;

/*==============================================================*/
/* Table: PFM_SYS                                               */
/*==============================================================*/
create table PFM_SYS
(
   ID                   bigint not null comment '系统ID',
   NAME                 varchar(100) not null comment '系统名字',
   REMARK               varchar(100) not null comment '系统备注',
   primary key (ID)
);

alter table PFM_SYS comment '大卖系统管理';
