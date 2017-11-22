/*
Navicat MySQL Data Transfer

Source Server         : root@localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : admin

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2017-11-22 20:01:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `ID` varchar(50) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `PARENT_ID` varchar(50) DEFAULT NULL,
  `ORDER` int(11) DEFAULT NULL,
  `URL` varchar(255) DEFAULT NULL,
  `DELETED` bit(1) DEFAULT NULL,
  `CREATE_BY` varchar(255) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `LAST_MODIFY_TIME` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `LAST_MODIFY_BY` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', 'root', null, '1', '#', '\0', null, '2017-11-22 19:27:31', '2017-11-22 19:27:35', '');
INSERT INTO `menu` VALUES ('2', '一级菜单', '1', '1', '#1.0', '\0', null, '2017-11-22 19:35:00', '2017-11-22 19:35:04', null);
INSERT INTO `menu` VALUES ('3', '二级菜单', '2', '1', '#2.0', '\0', null, '2017-11-22 19:35:36', '2017-11-22 19:35:39', null);
INSERT INTO `menu` VALUES ('4', '二级菜单2', '2', '2', '#2.1', '\0', null, '2017-11-22 19:36:08', '2017-11-22 19:36:11', null);
