SET NAMES utf8mb4;
SET
    FOREIGN_KEY_CHECKS = 0;
CREATE
    database cloud_study;
USE
    cloud_study;

DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`
(
    `id`     bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `serial` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '支付流水号',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci COMMENT = '支付表'
  ROW_FORMAT = Dynamic;