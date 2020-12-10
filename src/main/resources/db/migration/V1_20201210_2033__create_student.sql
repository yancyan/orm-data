CREATE TABLE IF NOT EXISTS `t_student`
(
    `id`              bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `code`            VARCHAR(100) NOT NULL COMMENT '编码',
    `name`            VARCHAR(100),
    `author`          VARCHAR(100),
    `submission_date` DATE,
    `birthday`        DATETIME,
    `create_data`     TIMESTAMP,
    INDEX idx_name (name),
    INDEX idx_id (id(20)),
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

CREATE INDEX idx_code ON t_student (code);
