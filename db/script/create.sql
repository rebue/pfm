/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/8/3 8:56:06                             */
/*==============================================================*/


drop table if exists PFM_ACTI;

drop table if exists PFM_ACTI_MENU;

drop table if exists PFM_ACTI_URN;

drop table if exists PFM_FUNC;

drop table if exists PFM_MENU;

drop table if exists PFM_ROLE;

drop table if exists PFM_ROLE_ACTI;

drop table if exists PFM_SYS;

drop table if exists PFM_USER_ROLE;

/*==============================================================*/
/* Table: PFM_ACTI                                              */
/*==============================================================*/
create table PFM_ACTI
(
   ID                   bigint not null comment '动作ID',
   SYS_ID               varchar(20) not null comment '系统ID',
   FUNC_ID              bigint not null comment '功能ID',
   NAME                 varchar(20) not null comment '动作名称',
   IS_AUTH              bool not null default false comment '是否鉴权',
   IS_ENABLED           bool not null default false comment '是否启用',
   ORDER_NO             tinyint not null comment '顺序号',
   REMARK               varchar(50) comment '动作备注',
   primary key (ID),
   unique key AK_FUNC_AND_ACTI_NAME (FUNC_ID, NAME)
);

alter table PFM_ACTI comment '动作信息';

/*==============================================================*/
/* Table: PFM_ACTI_MENU                                         */
/*==============================================================*/
create table PFM_ACTI_MENU
(
   ID                   bigint not null comment '动作菜单ID',
   ACTI_ID              bigint not null comment '动作ID',
   MENU_ID              bigint not null comment '菜单ID',
   primary key (ID),
   unique key AK_ACTI_AND_MENU (ACTI_ID, MENU_ID)
);

alter table PFM_ACTI_MENU comment '动作菜单';

/*==============================================================*/
/* Table: PFM_ACTI_URN                                          */
/*==============================================================*/
create table PFM_ACTI_URN
(
   ID                   bigint not null comment '动作URN的ID',
   ACTI_ID              bigint not null comment '动作ID',
   URN                  varchar(100) not null comment 'URN',
   primary key (ID),
   unique key AK_ACTI_AND_URN (ACTI_ID, URN)
);

alter table PFM_ACTI_URN comment '动作URN';

/*==============================================================*/
/* Table: PFM_FUNC                                              */
/*==============================================================*/
create table PFM_FUNC
(
   ID                   bigint not null comment '功能ID',
   SYS_ID               varchar(20) not null comment '系统ID',
   NAME                 varchar(20) not null comment '功能名称',
   IS_ENABLED           bool not null default false comment '是否启用',
   ORDER_NO             tinyint not null comment '顺序号',
   REMARK               varchar(50) comment '功能备注',
   primary key (ID),
   unique key AK_SYS_AND_FUNC_NAME (SYS_ID, NAME)
);

alter table PFM_FUNC comment '功能信息';

/*==============================================================*/
/* Table: PFM_MENU                                              */
/*==============================================================*/
create table PFM_MENU
(
   ID                   bigint not null comment '菜单ID',
   SYS_ID               varchar(20) not null comment '系统ID',
   CODE                 varchar(20) not null comment '菜单编码',
   NAME                 varchar(20) not null comment '菜单名称',
   PATH                 varchar(20) not null comment '路径',
   IS_ENABLED           bool not null default false comment '是否启用',
   ICON                 varchar(20) comment '菜单图标',
   REMARK               varchar(50) comment '菜单备注',
   primary key (ID)
);

alter table PFM_MENU comment '菜单信息';

/*==============================================================*/
/* Table: PFM_ROLE                                              */
/*==============================================================*/
create table PFM_ROLE
(
   ID                   bigint not null comment '角色ID',
   SYS_ID               varchar(20) not null comment '系统ID',
   NAME                 varchar(20) not null comment '角色名称',
   IS_ENABLED           bool not null default false comment '是否启用',
   ORDER_NO             tinyint not null comment '顺序号',
   REMARK               varchar(50) comment '角色备注',
   primary key (ID),
   unique key AK_SYS_AND_ROLE_NAME (SYS_ID, NAME)
);

alter table PFM_ROLE comment '角色信息';

/*==============================================================*/
/* Table: PFM_ROLE_ACTI                                         */
/*==============================================================*/
create table PFM_ROLE_ACTI
(
   ID                   bigint not null comment '角色动作ID',
   ROLE_ID              bigint not null comment '角色ID',
   ACTI_ID              bigint not null comment '动作ID',
   primary key (ID),
   unique key AK_ROLE_AND_ACTI (ROLE_ID, ACTI_ID)
);

alter table PFM_ROLE_ACTI comment '角色动作';

/*==============================================================*/
/* Table: PFM_SYS                                               */
/*==============================================================*/
create table PFM_SYS
(
   ID                   varchar(20) not null comment '系统ID',
   NAME                 varchar(20) not null comment '系统名称',
   REMARK               varchar(50) comment '系统备注',
   primary key (ID),
   unique key AK_SYS_NAME (NAME)
);

alter table PFM_SYS comment '系统信息';

/*==============================================================*/
/* Table: PFM_USER_ROLE                                         */
/*==============================================================*/
create table PFM_USER_ROLE
(
   ID                   bigint not null comment '用户角色ID',
   SYS_ID               varchar(20) not null comment '系统ID',
   USER_ID              bigint not null comment '用户ID',
   ROLE_ID              bigint not null comment '角色ID',
   primary key (ID),
   unique key AK_USER_AND_ROLE (USER_ID, ROLE_ID)
);

alter table PFM_USER_ROLE comment '用户角色';

alter table PFM_ACTI add constraint FK_Relationship_6 foreign key (FUNC_ID)
      references PFM_FUNC (ID) on delete restrict on update restrict;

alter table PFM_ACTI add constraint FK_Relationship_7 foreign key (SYS_ID)
      references PFM_SYS (ID) on delete restrict on update restrict;

alter table PFM_ACTI_MENU add constraint FK_Relationship_3 foreign key (ACTI_ID)
      references PFM_ACTI (ID) on delete restrict on update restrict;

alter table PFM_ACTI_MENU add constraint FK_Relationship_4 foreign key (MENU_ID)
      references PFM_MENU (ID) on delete restrict on update restrict;

alter table PFM_ACTI_URN add constraint FK_Relationship_5 foreign key (ACTI_ID)
      references PFM_ACTI (ID) on delete restrict on update restrict;

alter table PFM_FUNC add constraint FK_Relationship_10 foreign key (SYS_ID)
      references PFM_SYS (ID) on delete restrict on update restrict;

alter table PFM_MENU add constraint FK_Relationship_1 foreign key (SYS_ID)
      references PFM_SYS (ID) on delete restrict on update restrict;

alter table PFM_ROLE add constraint FK_Relationship_8 foreign key (SYS_ID)
      references PFM_SYS (ID) on delete restrict on update restrict;

alter table PFM_ROLE_ACTI add constraint FK_Relationship_11 foreign key (ACTI_ID)
      references PFM_ACTI (ID) on delete restrict on update restrict;

alter table PFM_ROLE_ACTI add constraint FK_Relationship_9 foreign key (ROLE_ID)
      references PFM_ROLE (ID) on delete restrict on update restrict;

alter table PFM_USER_ROLE add constraint FK_Relationship_12 foreign key (ROLE_ID)
      references PFM_ROLE (ID) on delete restrict on update restrict;

