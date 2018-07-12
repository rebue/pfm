/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/7/11 17:39:01                           */
/*==============================================================*/


drop table if exists PFM_SYS;

/*==============================================================*/
/* Table: PFM_SYS                                               */
/*==============================================================*/
create  table PFM_SYS
(
   ID                   varchar(20) not null comment '系统ID',
   NAME                 varchar(20) not null comment '系统名字',
   REMARK               varchar(100) not null comment '系统备注',
   primary key (ID),
   unique key AK_Key_2 (NAME)
);

alter table PFM_SYS comment '大卖系统管理';
