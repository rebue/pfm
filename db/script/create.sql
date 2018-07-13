/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/7/13 16:42:10                           */
/*==============================================================*/


drop table if exists PFM_SYS;

/*==============================================================*/
/* Table: PFM_SYS                                               */
/*==============================================================*/
create table PFM_SYS
(
   ID                   varchar(20) not null comment '系统ID',
   NAME                 varchar(20) not null comment '系统名称',
   REMARK               varchar(100) not null comment '系统备注',
   primary key (ID),
   unique key AK_SYS_NAME (NAME)
);

alter table PFM_SYS comment '系统信息';

