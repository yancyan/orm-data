create table if not exists `t_student`
(
    `id`              bigint(20) not null auto_increment comment '主键',
    `code`            varchar(100) not null comment '编码',
    `name`            varchar(100),
    `author`          varchar(100),
    `submission_date` date,
    `birthday`        datetime,
    `create_data`     timestamp,
    primary key (`id`)
) engine = innodb default charset = utf8mb4;
