drop table if exists user ;
create table `user` (
  `id` bigint(20) not null auto_increment comment '主键',
  `name` varchar(20) not null comment '姓名',
  `age` int(5) default null comment '年龄',
  primary key (`id`)
) engine=innodb default charset=utf8mb4;
