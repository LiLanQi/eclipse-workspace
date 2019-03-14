/*
Navicat MySQL Data Transfer

Source Server         : lilanqi
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : mygoods

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-11-30 20:29:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user_info_address`
-- ----------------------------
DROP TABLE IF EXISTS `user_info_address`;
CREATE TABLE `user_info_address` (
  `id` varchar(36) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `detailaddress` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info_address
-- ----------------------------
INSERT INTO `user_info_address` VALUES ('028319f3-3a23-4acf-b123-dc659e6cfffe', '李岚祺', '18236917829', '湖北省武汉市洪山区', 'sad sad ');
INSERT INTO `user_info_address` VALUES ('157a47f4-ef0b-4163-a7db-9868b2b2c9ac', '李岚祺', '18236917829', '湖北省武汉市洪山区', 'sad sad ');
INSERT INTO `user_info_address` VALUES ('1aedf49f-d5ba-4ac3-8ca6-cdc3053e86a8', '李岚祺', '18236917829', '浙江省武汉市洪山区', 'asdasd阿什顿撒旦威锋网额无法effective');
INSERT INTO `user_info_address` VALUES ('1ecd5e96-e716-4b26-94a5-e61598b684d1', '李岚祺', '18236917829', '湖北省武汉市洪山区', '阿什顿撒旦');
INSERT INTO `user_info_address` VALUES ('3cde22d2-7b2c-4b13-b91c-c38875e8b431', '李岚祺', '18236917829', '湖北省武汉市洪山区', '阿什顿阿什顿');
INSERT INTO `user_info_address` VALUES ('4', '李岚祺', '18236917829', '湖北省武汉市洪山区', '撒旦撒旦阿什顿阿德按时');
INSERT INTO `user_info_address` VALUES ('48a6e5b1-1eff-4963-a3df-173014b8729c', '李岚祺', '18236917829', '浙江省武汉市洪山区', '阿什顿撒旦撒旦');
INSERT INTO `user_info_address` VALUES ('7441468c-9873-4b0b-8594-55fd3e760cae', '李岚祺', '18236917829', '湖北省武汉市洪山区', '郑州大学');
INSERT INTO `user_info_address` VALUES ('773a62fe-34d8-4a19-9854-0923b59507de', '李岚祺', '18236917829', '湖北省武汉市洪山区', '阿是飞洒发顺丰水电费');
INSERT INTO `user_info_address` VALUES ('776508a0-6e84-4650-b693-e0563abf5e2b', '李岚祺', '18236917829', '湖北省武汉市洪山区', '阿什顿阿什顿阿什顿');
INSERT INTO `user_info_address` VALUES ('7ba55ff1-4a71-4354-80ce-fae1d7c8cd0c', '李岚祺', '18236917829', '浙江省武汉市洪山区', '撒旦阿什顿');
INSERT INTO `user_info_address` VALUES ('874a0782-caed-4485-b46a-10bf60bd83e1', '李岚祺', '18236917829', '湖北省武汉市洪山区', '我去饿我去饿');
INSERT INTO `user_info_address` VALUES ('88058990-3392-47a3-82d1-54a499161452', '李岚祺', '18236917829', '湖北省武汉市洪山区', '撒旦撒旦 ');
INSERT INTO `user_info_address` VALUES ('9031d0a2-23df-43f0-a287-a7fd24db0928', '李岚祺', '18236917829', '湖北省武汉市洪山区', '阿什顿阿什顿');
INSERT INTO `user_info_address` VALUES ('99d9cadd-bb92-459e-af91-b2543359ccc5', '李岚祺', '18236917829', '湖北省武汉市洪山区', '阿是飞洒发顺丰水电费');
INSERT INTO `user_info_address` VALUES ('bfa192e4-c7cd-4e94-8620-c891e0a28006', '李岚祺', '18236917829', '湖北省武汉市洪山区', '河南师大撒旦郑州大学');
INSERT INTO `user_info_address` VALUES ('c79c9b13-9ce6-4748-9db3-71a70c774c76', '李岚祺', '18236917829', '湖北省武汉市洪山区', '撒旦撒旦');
INSERT INTO `user_info_address` VALUES ('d2101dc3-33cd-4332-8fae-5895f9fbc86f', '李岚祺', '18236917829', '湖北省武汉市洪山区', '阿什顿阿什顿');
INSERT INTO `user_info_address` VALUES ('d424c653-d007-44ed-a802-de304f7eb223', '李岚祺', '18236917829', '湖北省武汉市洪山区', '阿瑟东撒的');
INSERT INTO `user_info_address` VALUES ('dc509161-a20b-4f82-adc2-b22b6f56afd4', '李岚祺', '18236917829', '湖北省武汉市洪山区', '撒旦阿什顿');
INSERT INTO `user_info_address` VALUES ('e726673b-be0a-4be6-9da9-e3b327116b6d', '李岚祺', '18236917829', '湖北省武汉市洪山区', 'asdasd');
INSERT INTO `user_info_address` VALUES ('ea17b15a-fa2d-4fc0-b623-02947ed3dafc', '李岚祺', '18236917829', '湖北省武汉市洪山区', '撒旦撒旦');
INSERT INTO `user_info_address` VALUES ('f5d5f3d6-625c-4936-a3e7-48878d8a8983', '李岚祺', '撒旦阿什顿', '湖北省武汉市洪山区', '飒飒的撒旦');
INSERT INTO `user_info_address` VALUES ('fb810b73-ea84-41fc-980f-c02fa2a040fa', '李岚祺', '18236917829', '湖北省武汉市洪山区', '撒旦阿什顿');
