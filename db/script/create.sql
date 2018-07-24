/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/7/24 10:31:39                           */
/*==============================================================*/


DROP TABLE IF EXISTS PFM_ACTI;

DROP TABLE IF EXISTS PFM_ACTI_MENU;

DROP TABLE IF EXISTS PFM_ACTI_URN;

DROP TABLE IF EXISTS PFM_FUNC;

DROP TABLE IF EXISTS PFM_MENU;

DROP TABLE IF EXISTS PFM_ROLE;

DROP TABLE IF EXISTS PFM_ROLE_ACTI;

DROP TABLE IF EXISTS PFM_SYS;

/*==============================================================*/
/* Table: PFM_ACTI                                              */
/*==============================================================*/
CREATE TABLE PFM_ACTI
(
   ID                   BIGINT NOT NULL COMMENT '动作ID',
   SYS_ID               VARCHAR(20) NOT NULL COMMENT '系统ID',
   FUNC_ID              BIGINT NOT NULL COMMENT '功能ID',
   NAME                 VARCHAR(20) NOT NULL COMMENT '动作名称',
   IS_AUTH              BOOL NOT NULL DEFAULT FALSE COMMENT '是否鉴权',
   IS_ENABLED           BOOL NOT NULL DEFAULT FALSE COMMENT '是否启用',
   ORDER_NO             TINYINT NOT NULL COMMENT '顺序号',
   REMARK               VARCHAR(50) COMMENT '动作备注',
   PRIMARY KEY (ID)
);

ALTER TABLE PFM_ACTI COMMENT '动作信息';

/*==============================================================*/
/* Table: PFM_ACTI_MENU                                         */
/*==============================================================*/
CREATE TABLE PFM_ACTI_MENU
(
   ID                   BIGINT NOT NULL COMMENT '动作菜单ID',
   ACTI_ID              BIGINT NOT NULL COMMENT '动作ID',
   MENU_ID              BIGINT NOT NULL COMMENT '菜单ID',
   PRIMARY KEY (ID)
);

ALTER TABLE PFM_ACTI_MENU COMMENT '动作菜单';

/*==============================================================*/
/* Table: PFM_ACTI_URN                                          */
/*==============================================================*/
CREATE TABLE PFM_ACTI_URN
(
   ID                   BIGINT NOT NULL COMMENT '动作URN的ID',
   ACTI_ID              BIGINT NOT NULL COMMENT '动作ID',
   URN                  VARCHAR(100) NOT NULL COMMENT 'URN',
   PRIMARY KEY (ID)
);

ALTER TABLE PFM_ACTI_URN COMMENT '动作URN';

/*==============================================================*/
/* Table: PFM_FUNC                                              */
/*==============================================================*/
CREATE TABLE PFM_FUNC
(
   ID                   BIGINT NOT NULL COMMENT '功能ID',
   SYS_ID               VARCHAR(20) NOT NULL COMMENT '系统ID',
   NAME                 VARCHAR(20) NOT NULL COMMENT '功能名称',
   IS_ENABLED           BOOL NOT NULL DEFAULT FALSE COMMENT '是否启用',
   ORDER_NO             TINYINT NOT NULL COMMENT '顺序号',
   REMARK               VARCHAR(50) COMMENT '功能备注',
   PRIMARY KEY (ID),
   UNIQUE KEY AK_SYS_AND_FUNC_NAME (SYS_ID, NAME)
);

ALTER TABLE PFM_FUNC COMMENT '功能信息';

/*==============================================================*/
/* Table: PFM_MENU                                              */
/*==============================================================*/
CREATE TABLE PFM_MENU
(
   ID                   BIGINT NOT NULL COMMENT '菜单ID',
   SYS_ID               VARCHAR(20) NOT NULL COMMENT '系统ID',
   CODE                 VARCHAR(20) NOT NULL COMMENT '菜单编码',
   NAME                 VARCHAR(20) NOT NULL COMMENT '菜单名称',
   PATH                 VARCHAR(20) NOT NULL COMMENT '路径',
   IS_ENABLED           BOOL NOT NULL DEFAULT FALSE COMMENT '是否启用',
   ICON                 VARCHAR(20) COMMENT '菜单图标',
   REMARK               VARCHAR(50) COMMENT '菜单备注',
   PRIMARY KEY (ID)
);

ALTER TABLE PFM_MENU COMMENT '菜单信息';

/*==============================================================*/
/* Table: PFM_ROLE                                              */
/*==============================================================*/
CREATE TABLE PFM_ROLE
(
   ID                   BIGINT NOT NULL COMMENT '角色ID',
   SYS_ID               VARCHAR(20) NOT NULL COMMENT '系统ID',
   NAME                 VARCHAR(20) NOT NULL COMMENT '角色名称',
   IS_ENABLED           BOOL NOT NULL DEFAULT FALSE COMMENT '是否启用',
   ORDER_NO             TINYINT NOT NULL COMMENT '顺序号',
   REMARK               VARCHAR(50) COMMENT '角色备注',
   PRIMARY KEY (ID),
   UNIQUE KEY AK_SYS_AND_ROLE_NAME (SYS_ID, NAME)
);

ALTER TABLE PFM_ROLE COMMENT '角色信息';

/*==============================================================*/
/* Table: PFM_ROLE_ACTI                                         */
/*==============================================================*/
CREATE TABLE PFM_ROLE_ACTI
(
   ID                   BIGINT NOT NULL COMMENT '角色动作ID',
   ROLE_ID              BIGINT NOT NULL COMMENT '角色ID',
   ACTI_ID              BIGINT NOT NULL COMMENT '动作ID',
   PRIMARY KEY (ID)
);

ALTER TABLE PFM_ROLE_ACTI COMMENT '角色动作';

/*==============================================================*/
/* Table: PFM_SYS                                               */
/*==============================================================*/
CREATE TABLE PFM_SYS
(
   ID                   VARCHAR(20) NOT NULL COMMENT '系统ID',
   NAME                 VARCHAR(20) NOT NULL COMMENT '系统名称',
   REMARK               VARCHAR(50) COMMENT '系统备注',
   PRIMARY KEY (ID),
   UNIQUE KEY AK_SYS_NAME (NAME)
);

ALTER TABLE PFM_SYS COMMENT '系统信息';

