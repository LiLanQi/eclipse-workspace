/*
Navicat MySQL Data Transfer

Source Server         : venus
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : db_studentinfo

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-12-02 08:28:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `messagetable`
-- ----------------------------
DROP TABLE IF EXISTS `messagetable`;
CREATE TABLE `messagetable` (
  `title` varchar(20) DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  `content` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of messagetable
-- ----------------------------
INSERT INTO `messagetable` VALUES ('华为手机', '张三丰', 'abc@163.com', '我觉得大家都很棒');
INSERT INTO `messagetable` VALUES ('华为手机', '李四郎', '123@qq.com', '精彩的比赛');
