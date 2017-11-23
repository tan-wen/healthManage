/*
Navicat MySQL Data Transfer

Source Server         : root@localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : admin

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2017-11-23 22:27:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` varchar(50) NOT NULL,
  `NAME` varchar(50) DEFAULT NULL,
  `CREATE_BY` varchar(50) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `LAST_MODIFY_BY` varchar(50) DEFAULT NULL,
  `LAST_MODIFY_TIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `PASSWORD` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '1', '2017-11-16 16:31:19', '1', '2017-11-16 16:31:11', null);
INSERT INTO `user` VALUES ('2', '李四2', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('3', '李四3', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('4', '李四4', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('5', '李四5', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('6', '李四6', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('7', '李四7', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('8', '李四8', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('9', '李四9', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('17', '李四17', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('10', '李四10', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('11', '李四11', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('12', '李四12', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('13', '李四13', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('14', '李四14', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('15', '李四15', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
INSERT INTO `user` VALUES ('16', '李四16', '1', '2017-11-16 16:35:50', '1', '2017-11-16 16:35:50', null);
