drop table if exists sys_user ;
create table `sys_user` (
  `id` bigint(20) not null auto_increment comment '主键',
  `username` varchar(100) not null unique comment '用户名',
  `password` varchar(100) not null comment '密码',
  `age` int(5) default null comment '年龄',
  primary key (`id`)
) engine=innodb default charset=utf8mb4;
