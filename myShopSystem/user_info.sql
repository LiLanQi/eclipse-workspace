/*
Navicat MySQL Data Transfer

Source Server         : lilanqi
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : mygoods

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-30 20:19:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `name` varchar(36) DEFAULT NULL,
  `sex` int(11) DEFAULT '1',
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(36) DEFAULT NULL,
  `password` varchar(36) NOT NULL,
  `date` datetime DEFAULT NULL,
  `tempname` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', null, '1', '111', null, '111', null, null);
INSERT INTO `user_info` VALUES ('2', null, '1', '111', null, '111', null, null);
INSERT INTO `user_info` VALUES ('3', null, '1', '111', null, '111', null, null);
INSERT INTO `user_info` VALUES ('4', '李岚祺', '1', '18236917829', '1042520531@qq.com', '123456', '2015-12-21 00:00:00', '风的追忆');
INSERT INTO `user_info` VALUES ('7', null, '1', null, '1042520531@qq.com', '123456', null, null);
INSERT INTO `user_info` VALUES ('8', null, '1', null, '1042520531@qq.com', '123456', null, null);
INSERT INTO `user_info` VALUES ('9', null, '1', null, '1042520531@qq.com', '123456', null, null);
