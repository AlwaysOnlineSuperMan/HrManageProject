/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : hr_db

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2015-01-22 13:05:07
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `bonus`
-- ----------------------------
DROP TABLE IF EXISTS `bonus`;
CREATE TABLE `bonus` (
  `bon_id` smallint(6) NOT NULL auto_increment,
  `major_kind_id` char(2) default NULL,
  `major_kind_name` varchar(60) default NULL,
  `major_id` char(2) default NULL,
  `major_name` varchar(60) default NULL,
  `human_id` varchar(30) default NULL,
  `human_name` varchar(60) default NULL,
  `bonus_item` varchar(60) default NULL,
  `bonus_worth` float(8,2) default NULL,
  `bonus_degree` varchar(60) default NULL,
  `remark` text,
  `register` varchar(60) default NULL,
  `checker` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `check_time` datetime default NULL,
  `check_status` smallint(6) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`bon_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bonus
-- ----------------------------

-- ----------------------------
-- Table structure for `config_file_first_kind`
-- ----------------------------
DROP TABLE IF EXISTS `config_file_first_kind`;
CREATE TABLE `config_file_first_kind` (
  `ffk_id` smallint(6) NOT NULL auto_increment,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `first_kind_salary_id` text,
  `first_kind_sale_id` text,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`ffk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_file_first_kind
-- ----------------------------
INSERT INTO config_file_first_kind VALUES ('1', '1', '娃娃', '1', '1', '2015-01-21');
INSERT INTO config_file_first_kind VALUES ('2', null, null, null, null, null);

-- ----------------------------
-- Table structure for `config_file_second_kind`
-- ----------------------------
DROP TABLE IF EXISTS `config_file_second_kind`;
CREATE TABLE `config_file_second_kind` (
  `fsk_id` smallint(6) NOT NULL auto_increment,
  `first_kind_id` smallint(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `second_salary_id` text,
  `second_sale_id` text,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`fsk_id`),
  KEY `FK_config_file_second_kind_config_file_first_kind` (`first_kind_id`),
  CONSTRAINT `FK_config_file_second_kind_config_file_first_kind` FOREIGN KEY (`first_kind_id`) REFERENCES `config_file_first_kind` (`ffk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_file_second_kind
-- ----------------------------
INSERT INTO config_file_second_kind VALUES ('1', '1', '娃娃', '1', '软件公司', '1', '1', '2015-01-21');
INSERT INTO config_file_second_kind VALUES ('2', '1', '娃娃', '2', '生物科技有限公司', '1', '1', '2015-01-21');

-- ----------------------------
-- Table structure for `config_file_third_kind`
-- ----------------------------
DROP TABLE IF EXISTS `config_file_third_kind`;
CREATE TABLE `config_file_third_kind` (
  `ftk_id` smallint(6) NOT NULL auto_increment,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` smallint(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `third_kind_id` char(2) default NULL,
  `third_kind_name` varchar(60) default NULL,
  `third_kind_sale_id` text,
  `third_kind_is_retail` char(2) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`ftk_id`),
  KEY `FK_config_file_third_kind_config_file_second_kind` (`second_kind_id`),
  CONSTRAINT `FK_config_file_third_kind_config_file_second_kind` FOREIGN KEY (`second_kind_id`) REFERENCES `config_file_second_kind` (`fsk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_file_third_kind
-- ----------------------------
INSERT INTO config_file_third_kind VALUES ('1', '1', '请求', '1', '1', '1', '外包组', '1', '否', null);
INSERT INTO config_file_third_kind VALUES ('2', '2', 'NULL', '2', '2', '2', '药店', '1', '是', null);

-- ----------------------------
-- Table structure for `config_major`
-- ----------------------------
DROP TABLE IF EXISTS `config_major`;
CREATE TABLE `config_major` (
  `mak_id` smallint(6) NOT NULL auto_increment,
  `major_kind_id` smallint(2) default NULL,
  `major_kind_name` varchar(60) default NULL,
  `major_id` char(2) default NULL,
  `major_name` varchar(60) default NULL,
  `test_amount` smallint(6) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`mak_id`),
  KEY `FK_config_major_config_major_kind` (`major_kind_id`),
  CONSTRAINT `FK_config_major_config_major_kind` FOREIGN KEY (`major_kind_id`) REFERENCES `config_major_kind` (`mfk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_major
-- ----------------------------
INSERT INTO config_major VALUES ('1', '1', 'NULL', '1', '区域经理', '3', null);
INSERT INTO config_major VALUES ('2', '2', 'NULL', '2', '总经理', '2', null);
INSERT INTO config_major VALUES ('4', '2', 'NULL', '2', '程序员', '1', null);
INSERT INTO config_major VALUES ('6', '3', 'NULL', '2', '专员', '0', null);
INSERT INTO config_major VALUES ('8', '4', 'NULL', '2', '技术工人', '1', null);

-- ----------------------------
-- Table structure for `config_major_designation`
-- ----------------------------
DROP TABLE IF EXISTS `config_major_designation`;
CREATE TABLE `config_major_designation` (
  `cmd_id` smallint(6) NOT NULL auto_increment,
  `cmd_name` varchar(60) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`cmd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_major_designation
-- ----------------------------
INSERT INTO config_major_designation VALUES ('1', '工程师', null);
INSERT INTO config_major_designation VALUES ('2', '经理', null);
INSERT INTO config_major_designation VALUES ('3', '助理', null);
INSERT INTO config_major_designation VALUES ('4', '教授', null);
INSERT INTO config_major_designation VALUES ('5', '讲师', null);
INSERT INTO config_major_designation VALUES ('6', '技术支持', null);
INSERT INTO config_major_designation VALUES ('7', '程序员', null);

-- ----------------------------
-- Table structure for `config_major_kind`
-- ----------------------------
DROP TABLE IF EXISTS `config_major_kind`;
CREATE TABLE `config_major_kind` (
  `mfk_id` smallint(6) NOT NULL auto_increment,
  `major_kind_name` varchar(60) default NULL,
  `major_kind_id` char(2) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`mfk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_major_kind
-- ----------------------------
INSERT INTO config_major_kind VALUES ('1', '销售', '1', null);
INSERT INTO config_major_kind VALUES ('2', '软件开发', '2', null);
INSERT INTO config_major_kind VALUES ('3', '人力资源', '3', null);
INSERT INTO config_major_kind VALUES ('4', '生产部', '4', null);

-- ----------------------------
-- Table structure for `config_primary_key`
-- ----------------------------
DROP TABLE IF EXISTS `config_primary_key`;
CREATE TABLE `config_primary_key` (
  `prk_id` smallint(6) NOT NULL auto_increment,
  `primary_key_table` varchar(60) default NULL,
  `primary_key` varchar(60) default NULL,
  `key_name` varchar(60) default NULL,
  `primary_key_status` tinyint(1) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`prk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_primary_key
-- ----------------------------
INSERT INTO config_primary_key VALUES ('1', 'HumanFile', 'firstKindName', 'I机机构名称', '0', null);
INSERT INTO config_primary_key VALUES ('2', 'HumanFile', 'secondKindName', 'II机机构名称', '0', null);
INSERT INTO config_primary_key VALUES ('3', 'HumanFile', 'thirdKindName', 'III机机构名称', '0', null);
INSERT INTO config_primary_key VALUES ('4', 'HumanFile', 'humanId', '档案编号', '0', null);
INSERT INTO config_primary_key VALUES ('5', 'HumanFile', 'humanName', '姓名', '0', null);
INSERT INTO config_primary_key VALUES ('6', 'HumanFile', 'humanAddress', '住址', '0', null);
INSERT INTO config_primary_key VALUES ('7', 'HumanFile', 'humanPostcode', '邮编', '0', null);
INSERT INTO config_primary_key VALUES ('8', 'HumanFile', 'humanProDesignation', '职称', '0', null);
INSERT INTO config_primary_key VALUES ('9', 'HumanFile', 'humanMajorKindName', '职位分类名称', '0', null);
INSERT INTO config_primary_key VALUES ('10', 'HumanFile', 'hunmaMajorName', '职位名称', '0', null);
INSERT INTO config_primary_key VALUES ('11', 'HumanFile', 'humanBank', '开户银行', '0', null);
INSERT INTO config_primary_key VALUES ('12', 'HumanFile', 'humanAccount', '银行帐号', '0', null);
INSERT INTO config_primary_key VALUES ('13', 'HumanFile', 'humanTelephone', '电话', '0', null);
INSERT INTO config_primary_key VALUES ('14', 'HumanFile', 'humanMobilephone', '手机号码', '0', null);
INSERT INTO config_primary_key VALUES ('15', 'HumanFile', 'humanEmail', 'E-mail', '0', null);
INSERT INTO config_primary_key VALUES ('16', 'HumanFile', 'humanHobby', '爱好', '0', null);
INSERT INTO config_primary_key VALUES ('17', 'HumanFile', 'humanSpeciality', '特长', '0', null);
INSERT INTO config_primary_key VALUES ('18', 'HumanFile', 'humanSex', '性别', '0', null);
INSERT INTO config_primary_key VALUES ('19', 'HumanFile', 'humanReligion', '宗教信仰', '0', null);
INSERT INTO config_primary_key VALUES ('20', 'HumanFile', 'humanParty', '政治面貌', '0', null);
INSERT INTO config_primary_key VALUES ('21', 'HumanFile', 'humanNationality', '国籍', '0', null);
INSERT INTO config_primary_key VALUES ('22', 'HumanFile', 'humanRace', '民族', '0', null);
INSERT INTO config_primary_key VALUES ('23', 'HumanFile', 'humanBirthday', '生日', '0', null);
INSERT INTO config_primary_key VALUES ('24', 'HumanFile', 'humanBirthplace', '出生地', '0', null);
INSERT INTO config_primary_key VALUES ('25', 'HumanFile', 'humanAge', '年龄', '0', null);
INSERT INTO config_primary_key VALUES ('26', 'HumanFile', 'humanEducatedDegree', '学历', '0', null);
INSERT INTO config_primary_key VALUES ('27', 'HumanFile', 'humanEducatedYears', '教育年限', '0', null);
INSERT INTO config_primary_key VALUES ('28', 'HumanFile', 'humanEducatedMajor', '专业', '0', null);
INSERT INTO config_primary_key VALUES ('29', 'HumanFile', 'humanSocietySecurityId', '社会保障号码', '0', null);
INSERT INTO config_primary_key VALUES ('30', 'HumanFile', 'humanIdCard', '身份证号码', '0', null);
INSERT INTO config_primary_key VALUES ('31', 'HumanFile', 'salaryStandardId', '薪酬标准编号', '0', null);
INSERT INTO config_primary_key VALUES ('32', 'HumanFile', 'salaryStandardName', '薪酬标准', '0', null);
INSERT INTO config_primary_key VALUES ('33', 'HumanFile', 'majorChangeAmount', '调动次数', '0', null);
INSERT INTO config_primary_key VALUES ('34', 'HumanFile', 'bonusAmount', '激励次数', '0', null);
INSERT INTO config_primary_key VALUES ('35', 'HumanFile', 'trainingAmount', '培训次数', '0', null);
INSERT INTO config_primary_key VALUES ('36', 'HumanFile', 'fileChangAmount', '档案变更次数', '0', null);
INSERT INTO config_primary_key VALUES ('37', 'HumanFile', 'remark', '备注', '0', null);
INSERT INTO config_primary_key VALUES ('38', 'HumanFile', 'humanHistroyRecords', '简历', '0', null);
INSERT INTO config_primary_key VALUES ('39', 'HumanFile', 'humanFamilyMembership', '家庭关系', '0', null);
INSERT INTO config_primary_key VALUES ('40', 'HumanFile', 'register', '登记人', '0', null);
INSERT INTO config_primary_key VALUES ('41', 'SalaryStandard', 'standardId', '薪酬标准编号', '0', null);
INSERT INTO config_primary_key VALUES ('42', 'SalaryStandard', 'standardName', '薪酬标准名称', '0', null);
INSERT INTO config_primary_key VALUES ('43', 'SalaryStandard', 'designer', '设计人', '0', null);
INSERT INTO config_primary_key VALUES ('44', 'SalaryGrant', 'salaryStandardId', '薪酬标准编号', '0', null);
INSERT INTO config_primary_key VALUES ('45', 'SalaryGrant', 'salaryGrantId', '薪酬发放编号', '0', null);
INSERT INTO config_primary_key VALUES ('46', 'Bonus', 'majorKindName', '职位分类名称', '0', null);
INSERT INTO config_primary_key VALUES ('47', 'Bonus', 'majorName', '职位名称', '0', null);
INSERT INTO config_primary_key VALUES ('48', 'Bonus', 'humanId', '员工编号', '0', null);
INSERT INTO config_primary_key VALUES ('49', 'Bonus', 'humanName', '职员工姓名', '0', null);
INSERT INTO config_primary_key VALUES ('50', 'Bonus', 'bonusItem', '激励项目', '0', null);
INSERT INTO config_primary_key VALUES ('51', 'Bonus', 'bonusDegree', '激励等级', '0', null);
INSERT INTO config_primary_key VALUES ('52', 'Bonus', 'remark', '备注', '0', null);
INSERT INTO config_primary_key VALUES ('53', 'Training', 'majorKindName', '职位分类名称', '0', null);
INSERT INTO config_primary_key VALUES ('54', 'Training', 'majorName', '职位名称', '0', null);
INSERT INTO config_primary_key VALUES ('55', 'Training', 'humanId', '员工编号', '0', null);
INSERT INTO config_primary_key VALUES ('56', 'Training', 'humanName', '职员工姓名', '0', null);
INSERT INTO config_primary_key VALUES ('57', 'Training', 'trainingItem', '培训项目', '0', null);
INSERT INTO config_primary_key VALUES ('58', 'Training', 'trainingDegree', '培训等级', '0', null);
INSERT INTO config_primary_key VALUES ('59', 'Training', 'remark', '备注', '0', null);
INSERT INTO config_primary_key VALUES ('60', 'MajorChange', 'firstKindName', 'I机机构', '0', null);
INSERT INTO config_primary_key VALUES ('61', 'MajorChange', 'secondKindName', 'II机机构', '0', null);
INSERT INTO config_primary_key VALUES ('62', 'MajorChange', 'thirdKindName', 'III机机构', '0', null);
INSERT INTO config_primary_key VALUES ('63', 'MajorChange', 'majorKindName', '职位分类', '0', null);
INSERT INTO config_primary_key VALUES ('64', 'MajorChange', 'majorName', '职位', '0', null);
INSERT INTO config_primary_key VALUES ('65', 'MajorChange', 'humanId', '员工编号', '0', null);
INSERT INTO config_primary_key VALUES ('66', 'MajorChange', 'humanName', '员工姓名', '0', null);
INSERT INTO config_primary_key VALUES ('67', 'MajorChange', 'changeReason', '调动原因', '0', null);
INSERT INTO config_primary_key VALUES ('68', 'HumanFile', 'firstKindName', 'I机机构名称', '0', null);
INSERT INTO config_primary_key VALUES ('69', 'HumanFile', 'secondKindName', 'II机机构名称', '0', null);
INSERT INTO config_primary_key VALUES ('70', 'HumanFile', 'thirdKindName', 'III机机构名称', '0', null);
INSERT INTO config_primary_key VALUES ('71', 'HumanFile', 'humanId', '档案编号', '0', null);
INSERT INTO config_primary_key VALUES ('72', 'HumanFile', 'humanName', '姓名', '0', null);
INSERT INTO config_primary_key VALUES ('73', 'HumanFile', 'humanAddress', '住址', '0', null);
INSERT INTO config_primary_key VALUES ('74', 'HumanFile', 'humanPostcode', '邮编', '0', null);
INSERT INTO config_primary_key VALUES ('75', 'HumanFile', 'humanProDesignation', '职称', '0', null);
INSERT INTO config_primary_key VALUES ('76', 'HumanFile', 'humanMajorKindName', '职位分类名称', '0', null);
INSERT INTO config_primary_key VALUES ('77', 'HumanFile', 'hunmaMajorName', '职位名称', '0', null);
INSERT INTO config_primary_key VALUES ('78', 'HumanFile', 'humanBank', '开户银行', '0', null);
INSERT INTO config_primary_key VALUES ('79', 'HumanFile', 'humanAccount', '银行帐号', '0', null);
INSERT INTO config_primary_key VALUES ('80', 'HumanFile', 'humanTelephone', '电话', '0', null);
INSERT INTO config_primary_key VALUES ('81', 'HumanFile', 'humanMobilephone', '手机号码', '0', null);
INSERT INTO config_primary_key VALUES ('82', 'HumanFile', 'humanEmail', 'E-mail', '0', null);
INSERT INTO config_primary_key VALUES ('83', 'HumanFile', 'humanHobby', '爱好', '0', null);
INSERT INTO config_primary_key VALUES ('84', 'HumanFile', 'humanSpeciality', '特长', '0', null);
INSERT INTO config_primary_key VALUES ('85', 'HumanFile', 'humanSex', '性别', '0', null);
INSERT INTO config_primary_key VALUES ('86', 'HumanFile', 'humanReligion', '宗教信仰', '0', null);
INSERT INTO config_primary_key VALUES ('87', 'HumanFile', 'humanParty', '政治面貌', '0', null);
INSERT INTO config_primary_key VALUES ('88', 'HumanFile', 'humanNationality', '国籍', '0', null);
INSERT INTO config_primary_key VALUES ('89', 'HumanFile', 'humanRace', '民族', '0', null);
INSERT INTO config_primary_key VALUES ('90', 'HumanFile', 'humanBirthday', '生日', '0', null);
INSERT INTO config_primary_key VALUES ('91', 'HumanFile', 'humanBirthplace', '出生地', '0', null);
INSERT INTO config_primary_key VALUES ('92', 'HumanFile', 'humanAge', '年龄', '0', null);
INSERT INTO config_primary_key VALUES ('93', 'HumanFile', 'humanEducatedDegree', '学历', '0', null);
INSERT INTO config_primary_key VALUES ('94', 'HumanFile', 'humanEducatedYears', '教育年限', '0', null);
INSERT INTO config_primary_key VALUES ('95', 'HumanFile', 'humanEducatedMajor', '专业', '0', null);
INSERT INTO config_primary_key VALUES ('96', 'HumanFile', 'humanSocietySecurityId', '社会保障号码', '0', null);
INSERT INTO config_primary_key VALUES ('97', 'HumanFile', 'humanIdCard', '身份证号码', '0', null);
INSERT INTO config_primary_key VALUES ('98', 'HumanFile', 'salaryStandardId', '薪酬标准编号', '0', null);
INSERT INTO config_primary_key VALUES ('99', 'HumanFile', 'salaryStandardName', '薪酬标准', '0', null);
INSERT INTO config_primary_key VALUES ('100', 'HumanFile', 'majorChangeAmount', '调动次数', '0', null);
INSERT INTO config_primary_key VALUES ('101', 'HumanFile', 'bonusAmount', '激励次数', '0', null);
INSERT INTO config_primary_key VALUES ('102', 'HumanFile', 'trainingAmount', '培训次数', '0', null);
INSERT INTO config_primary_key VALUES ('103', 'HumanFile', 'fileChangAmount', '档案变更次数', '0', null);
INSERT INTO config_primary_key VALUES ('104', 'HumanFile', 'remark', '备注', '0', null);
INSERT INTO config_primary_key VALUES ('105', 'HumanFile', 'humanHistroyRecords', '简历', '0', null);
INSERT INTO config_primary_key VALUES ('106', 'HumanFile', 'humanFamilyMembership', '家庭关系', '0', null);
INSERT INTO config_primary_key VALUES ('107', 'HumanFile', 'register', '登记人', '0', null);
INSERT INTO config_primary_key VALUES ('108', 'SalaryStandard', 'standardId', '薪酬标准编号', '0', null);
INSERT INTO config_primary_key VALUES ('109', 'SalaryStandard', 'standardName', '薪酬标准名称', '0', null);
INSERT INTO config_primary_key VALUES ('110', 'SalaryStandard', 'designer', '设计人', '0', null);
INSERT INTO config_primary_key VALUES ('111', 'SalaryGrant', 'salaryStandardId', '薪酬标准编号', '0', null);
INSERT INTO config_primary_key VALUES ('112', 'SalaryGrant', 'salaryGrantId', '薪酬发放编号', '0', null);
INSERT INTO config_primary_key VALUES ('113', 'Bonus', 'majorKindName', '职位分类名称', '0', null);
INSERT INTO config_primary_key VALUES ('114', 'Bonus', 'majorName', '职位名称', '0', null);
INSERT INTO config_primary_key VALUES ('115', 'Bonus', 'humanId', '员工编号', '0', null);
INSERT INTO config_primary_key VALUES ('116', 'Bonus', 'humanName', '职员工姓名', '0', null);
INSERT INTO config_primary_key VALUES ('117', 'Bonus', 'bonusItem', '激励项目', '0', null);
INSERT INTO config_primary_key VALUES ('118', 'Bonus', 'bonusDegree', '激励等级', '0', null);
INSERT INTO config_primary_key VALUES ('119', 'Bonus', 'remark', '备注', '0', null);
INSERT INTO config_primary_key VALUES ('120', 'Training', 'majorKindName', '职位分类名称', '0', null);
INSERT INTO config_primary_key VALUES ('121', 'Training', 'majorName', '职位名称', '0', null);
INSERT INTO config_primary_key VALUES ('122', 'Training', 'humanId', '员工编号', '0', null);
INSERT INTO config_primary_key VALUES ('123', 'Training', 'humanName', '职员工姓名', '0', null);
INSERT INTO config_primary_key VALUES ('124', 'Training', 'trainingItem', '培训项目', '0', null);
INSERT INTO config_primary_key VALUES ('125', 'Training', 'trainingDegree', '培训等级', '0', null);
INSERT INTO config_primary_key VALUES ('126', 'Training', 'remark', '备注', '0', null);
INSERT INTO config_primary_key VALUES ('127', 'MajorChange', 'firstKindName', 'I机机构', '0', null);
INSERT INTO config_primary_key VALUES ('128', 'MajorChange', 'secondKindName', 'II机机构', '0', null);
INSERT INTO config_primary_key VALUES ('129', 'MajorChange', 'thirdKindName', 'III机机构', '0', null);
INSERT INTO config_primary_key VALUES ('130', 'MajorChange', 'majorKindName', '职位分类', '0', null);
INSERT INTO config_primary_key VALUES ('131', 'MajorChange', 'majorName', '职位', '0', null);
INSERT INTO config_primary_key VALUES ('132', 'MajorChange', 'humanId', '员工编号', '0', null);
INSERT INTO config_primary_key VALUES ('133', 'MajorChange', 'humanName', '员工姓名', '0', null);
INSERT INTO config_primary_key VALUES ('134', 'MajorChange', 'changeReason', '调动原因', '0', null);

-- ----------------------------
-- Table structure for `config_public_char`
-- ----------------------------
DROP TABLE IF EXISTS `config_public_char`;
CREATE TABLE `config_public_char` (
  `pbc_id` smallint(6) NOT NULL auto_increment,
  `attribute_kind` varchar(60) default NULL,
  `attribute_name` varchar(60) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`pbc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_public_char
-- ----------------------------
INSERT INTO config_public_char VALUES ('1', '国籍', '中国', null);
INSERT INTO config_public_char VALUES ('2', '国籍', '美国', null);
INSERT INTO config_public_char VALUES ('3', '民族', '汉族', null);
INSERT INTO config_public_char VALUES ('4', '民族', '回族', null);
INSERT INTO config_public_char VALUES ('5', '宗教信仰', '无', null);
INSERT INTO config_public_char VALUES ('6', '宗教信仰', '佛教', null);
INSERT INTO config_public_char VALUES ('7', '政治面貌', '党员', null);
INSERT INTO config_public_char VALUES ('8', '政治面貌', '群众', null);
INSERT INTO config_public_char VALUES ('9', '教育年限', '12', null);
INSERT INTO config_public_char VALUES ('11', '学历', '本科', null);
INSERT INTO config_public_char VALUES ('12', '学历', '大专', null);
INSERT INTO config_public_char VALUES ('13', '专业', '生物工程', null);
INSERT INTO config_public_char VALUES ('14', '专业', '计算机', null);
INSERT INTO config_public_char VALUES ('15', '特长', '数据库', null);
INSERT INTO config_public_char VALUES ('16', '特长', 'java', null);
INSERT INTO config_public_char VALUES ('17', '爱好', '篮球', null);
INSERT INTO config_public_char VALUES ('18', '爱好', '舞蹈', null);
INSERT INTO config_public_char VALUES ('19', '培训项目', '英语', null);
INSERT INTO config_public_char VALUES ('20', '培训项目', '管理', null);
INSERT INTO config_public_char VALUES ('21', '培训成绩', 'A', null);
INSERT INTO config_public_char VALUES ('22', '培训成绩', 'B', null);
INSERT INTO config_public_char VALUES ('23', '奖励项目', '技术攻关', null);
INSERT INTO config_public_char VALUES ('24', '奖励项目', '销售绩效', null);
INSERT INTO config_public_char VALUES ('25', '奖励等级', 'A', null);
INSERT INTO config_public_char VALUES ('26', '奖励等级', 'B', null);
INSERT INTO config_public_char VALUES ('27', '职称', '工程师', null);
INSERT INTO config_public_char VALUES ('28', '职称', '经理', null);
INSERT INTO config_public_char VALUES ('29', '职称', '助理', null);
INSERT INTO config_public_char VALUES ('30', '职称', '教授', null);
INSERT INTO config_public_char VALUES ('31', '职称', '讲师', null);
INSERT INTO config_public_char VALUES ('32', '职称', '技术支持', null);
INSERT INTO config_public_char VALUES ('33', '薪酬设置', '出差补助', null);
INSERT INTO config_public_char VALUES ('34', '薪酬设置', '交通补贴', null);
INSERT INTO config_public_char VALUES ('35', '薪酬设置', '住房补贴', null);
INSERT INTO config_public_char VALUES ('36', '薪酬设置', '基本工资', null);
INSERT INTO config_public_char VALUES ('37', '薪酬设置', '年终奖', null);
INSERT INTO config_public_char VALUES ('38', '薪酬设置', '误餐补助', null);
INSERT INTO config_public_char VALUES ('40', '国籍', '中国', null);
INSERT INTO config_public_char VALUES ('41', '国籍', '美国', null);
INSERT INTO config_public_char VALUES ('42', '民族', '汉族', null);
INSERT INTO config_public_char VALUES ('43', '民族', '回族', null);
INSERT INTO config_public_char VALUES ('44', '宗教信仰', '无', null);
INSERT INTO config_public_char VALUES ('45', '宗教信仰', '佛教', null);
INSERT INTO config_public_char VALUES ('46', '政治面貌', '党员', null);
INSERT INTO config_public_char VALUES ('47', '政治面貌', '群众', null);
INSERT INTO config_public_char VALUES ('48', '教育年限', '12', null);
INSERT INTO config_public_char VALUES ('49', '教育年限', '16', null);
INSERT INTO config_public_char VALUES ('50', '学历', '本科', null);
INSERT INTO config_public_char VALUES ('51', '学历', '大专', null);
INSERT INTO config_public_char VALUES ('52', '专业', '生物工程', null);
INSERT INTO config_public_char VALUES ('53', '专业', '计算机', null);
INSERT INTO config_public_char VALUES ('54', '特长', '数据库', null);
INSERT INTO config_public_char VALUES ('55', '特长', 'java', null);
INSERT INTO config_public_char VALUES ('56', '爱好', '篮球', null);
INSERT INTO config_public_char VALUES ('57', '爱好', '舞蹈', null);
INSERT INTO config_public_char VALUES ('58', '培训项目', '英语', null);
INSERT INTO config_public_char VALUES ('59', '培训项目', '管理', null);
INSERT INTO config_public_char VALUES ('60', '培训成绩', 'A', null);
INSERT INTO config_public_char VALUES ('61', '培训成绩', 'B', null);
INSERT INTO config_public_char VALUES ('62', '奖励项目', '技术攻关', null);
INSERT INTO config_public_char VALUES ('63', '奖励项目', '销售绩效', null);
INSERT INTO config_public_char VALUES ('64', '奖励等级', 'A', null);
INSERT INTO config_public_char VALUES ('65', '奖励等级', 'B', null);
INSERT INTO config_public_char VALUES ('66', '职称', '工程师', null);
INSERT INTO config_public_char VALUES ('67', '职称', '经理', null);
INSERT INTO config_public_char VALUES ('68', '职称', '助理', null);
INSERT INTO config_public_char VALUES ('69', '职称', '教授', null);
INSERT INTO config_public_char VALUES ('70', '职称', '讲师', null);
INSERT INTO config_public_char VALUES ('71', '职称', '技术支持', null);
INSERT INTO config_public_char VALUES ('72', '薪酬设置', '出差补助', null);
INSERT INTO config_public_char VALUES ('73', '薪酬设置', '交通补贴', null);
INSERT INTO config_public_char VALUES ('74', '薪酬设置', '住房补贴', null);
INSERT INTO config_public_char VALUES ('75', '薪酬设置', '基本工资', null);
INSERT INTO config_public_char VALUES ('76', '薪酬设置', '年终奖', null);
INSERT INTO config_public_char VALUES ('77', '薪酬设置', '误餐补助', null);

-- ----------------------------
-- Table structure for `config_question_first_kind`
-- ----------------------------
DROP TABLE IF EXISTS `config_question_first_kind`;
CREATE TABLE `config_question_first_kind` (
  `qfk_id` smallint(6) NOT NULL auto_increment,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`qfk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_question_first_kind
-- ----------------------------
INSERT INTO config_question_first_kind VALUES ('1', '1', '基础类', null);
INSERT INTO config_question_first_kind VALUES ('2', '2', '技术类', null);

-- ----------------------------
-- Table structure for `config_question_second_kind`
-- ----------------------------
DROP TABLE IF EXISTS `config_question_second_kind`;
CREATE TABLE `config_question_second_kind` (
  `qsk_id` smallint(6) NOT NULL auto_increment,
  `first_kind_id` smallint(10) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`qsk_id`),
  KEY `FK__config_qu__first__10566F31` (`first_kind_id`),
  CONSTRAINT `FK__config_qu__first__10566F31` FOREIGN KEY (`first_kind_id`) REFERENCES `config_question_first_kind` (`qfk_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config_question_second_kind
-- ----------------------------
INSERT INTO config_question_second_kind VALUES ('1', '1', 'NULL', '1', '语言类', null);
INSERT INTO config_question_second_kind VALUES ('2', '1', 'NULL', '1', '管理类', null);
INSERT INTO config_question_second_kind VALUES ('3', '2', 'NULL', '2', '软件开发类', null);
INSERT INTO config_question_second_kind VALUES ('4', '2', 'NULL', '2', '生物制药类', null);

-- ----------------------------
-- Table structure for `engage_answer`
-- ----------------------------
DROP TABLE IF EXISTS `engage_answer`;
CREATE TABLE `engage_answer` (
  `ans_id` smallint(6) NOT NULL auto_increment,
  `answer_number` varchar(30) default NULL,
  `exam_number` varchar(30) default NULL,
  `resume_id` smallint(6) default NULL,
  `interview_id` smallint(6) default NULL,
  `human_name` varchar(60) default NULL,
  `human_idcard` varchar(30) default NULL,
  `major_kind_id` char(2) default NULL,
  `major_kind_name` varchar(60) default NULL,
  `major_id` char(2) default NULL,
  `major_name` varchar(60) default NULL,
  `test_time` datetime default NULL,
  `use_time` varchar(20) default NULL,
  `total_point` decimal(5,2) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`ans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of engage_answer
-- ----------------------------
INSERT INTO engage_answer VALUES ('8', 'NULL', 'EN2011121394332', '3', '2', '张三', '24323424342', '3', 'NULL', '3', 'NULL', '2011-12-14 10:28:27', '0', '10.00', null);
INSERT INTO engage_answer VALUES ('9', 'NULL', 'EN2011121274257', '2', '2', '蔡依林', '44444444444555555555555', '4', 'NULL', '4', 'NULL', '2011-12-14 11:10:01', '0', '0.00', null);
INSERT INTO engage_answer VALUES ('10', 'NULL', 'EN2011121610252', '3', '1', '张三', '24323424342', '1', 'NULL', '1', 'NULL', '2011-12-16 10:04:19', '0', '10.00', null);
INSERT INTO engage_answer VALUES ('11', 'NULL', 'EN2011121614559', '3', '2', '张三', '24323424342', '2', 'NULL', '2', 'NULL', '2011-12-16 13:47:18', '0', '5.00', null);

-- ----------------------------
-- Table structure for `engage_answer_details`
-- ----------------------------
DROP TABLE IF EXISTS `engage_answer_details`;
CREATE TABLE `engage_answer_details` (
  `and_id` smallint(6) NOT NULL auto_increment,
  `answer_number` smallint(30) default NULL,
  `subject_id` smallint(6) default NULL,
  `answer` varchar(10) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`and_id`),
  KEY `answer_number` (`answer_number`),
  CONSTRAINT `engage_answer_details_ibfk_1` FOREIGN KEY (`answer_number`) REFERENCES `engage_answer` (`ans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of engage_answer_details
-- ----------------------------
INSERT INTO engage_answer_details VALUES ('15', '8', '3', 'b', null);
INSERT INTO engage_answer_details VALUES ('16', '8', '5', 'c', null);
INSERT INTO engage_answer_details VALUES ('17', '9', '2', 'a', null);
INSERT INTO engage_answer_details VALUES ('18', '9', '6', 'c', null);
INSERT INTO engage_answer_details VALUES ('19', '10', '2', 'a', null);
INSERT INTO engage_answer_details VALUES ('20', '10', '4', 'a', null);
INSERT INTO engage_answer_details VALUES ('21', '10', '8', 'b', null);
INSERT INTO engage_answer_details VALUES ('22', '10', '10', 'd', null);
INSERT INTO engage_answer_details VALUES ('23', '11', '2', 'b', null);
INSERT INTO engage_answer_details VALUES ('24', '11', '3', 'a', null);
INSERT INTO engage_answer_details VALUES ('25', '11', '7', 'a', null);
INSERT INTO engage_answer_details VALUES ('26', '11', '8', '未填', null);
INSERT INTO engage_answer_details VALUES ('27', '11', '1', 'c', null);
INSERT INTO engage_answer_details VALUES ('28', '11', '5', '未填', null);
INSERT INTO engage_answer_details VALUES ('29', '11', '9', 'a', null);
INSERT INTO engage_answer_details VALUES ('30', '11', '10', 'ab', null);

-- ----------------------------
-- Table structure for `engage_exam`
-- ----------------------------
DROP TABLE IF EXISTS `engage_exam`;
CREATE TABLE `engage_exam` (
  `exa_id` smallint(6) NOT NULL auto_increment,
  `exam_number` varchar(30) default NULL,
  `major_kind_id` char(2) default NULL,
  `major_kind_name` varchar(60) default NULL,
  `major_id` smallint(6) default NULL,
  `major_name` varchar(60) default NULL,
  `register` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `limite_time` smallint(6) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`exa_id`),
  KEY `major_id` (`major_id`),
  CONSTRAINT `engage_exam_ibfk_1` FOREIGN KEY (`major_id`) REFERENCES `config_major` (`mak_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of engage_exam
-- ----------------------------
INSERT INTO engage_exam VALUES ('1', 'EN2011121274257', '1', 'NULL', '1', 'NULL', '', '2011-12-12 00:00:00', '10', null);
INSERT INTO engage_exam VALUES ('2', 'EN2011121394332', '2', 'NULL', '1', 'NULL', '', '2011-12-13 00:00:00', '15', null);
INSERT INTO engage_exam VALUES ('3', 'EN2011121394435', '1', 'NULL', '1', 'NULL', '', '2011-12-13 00:00:00', '15', null);
INSERT INTO engage_exam VALUES ('4', 'EN2011121395025', '1', 'NULL', '2', 'NULL', '', '2011-12-13 00:00:00', '5', null);
INSERT INTO engage_exam VALUES ('5', 'EN2011121395039', '2', 'NULL', '2', 'NULL', '', '2011-12-13 00:00:00', '5', null);
INSERT INTO engage_exam VALUES ('6', 'EN2011121610252', '2', 'NULL', '4', 'NULL', '', '2011-12-16 00:00:00', '20', null);
INSERT INTO engage_exam VALUES ('7', 'EN2011121614559', '4', 'NULL', '8', 'NULL', '', '2011-12-16 00:00:00', '10', null);

-- ----------------------------
-- Table structure for `engage_exam_details`
-- ----------------------------
DROP TABLE IF EXISTS `engage_exam_details`;
CREATE TABLE `engage_exam_details` (
  `exd_id` smallint(6) NOT NULL auto_increment,
  `exam_number` varchar(30) default NULL,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `question_amount` smallint(6) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`exd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of engage_exam_details
-- ----------------------------
INSERT INTO engage_exam_details VALUES ('5', 'EN2011121274257', '1', 'NULL', '1', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('6', 'EN2011121274257', '2', 'NULL', '2', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('7', 'EN2011121394332', '2', 'NULL', '1', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('8', 'EN2011121394332', '1', 'NULL', '1', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('9', 'EN2011121394435', '3', 'NULL', '2', 'NULL', '2', null);
INSERT INTO engage_exam_details VALUES ('10', 'EN2011121394435', '1', 'NULL', '2', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('11', 'EN2011121395025', '2', 'NULL', '3', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('12', 'EN2011121395025', '3', 'NULL', '1', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('13', 'EN2011121395039', '2', 'NULL', '1', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('14', 'EN2011121395039', '3', 'NULL', '2', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('15', 'EN2011121610252', '4', 'NULL', '3', 'NULL', '2', null);
INSERT INTO engage_exam_details VALUES ('16', 'EN2011121610252', '4', 'NULL', '2', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('17', 'EN2011121610252', '4', 'NULL', '1', 'NULL', '1', null);
INSERT INTO engage_exam_details VALUES ('18', 'EN2011121614559', '2', 'NULL', '1', 'NULL', '2', null);
INSERT INTO engage_exam_details VALUES ('19', 'EN2011121614559', '1', 'NULL', '2', 'NULL', '2', null);
INSERT INTO engage_exam_details VALUES ('20', 'EN2011121614559', '1', 'NULL', '3', 'NULL', '2', null);
INSERT INTO engage_exam_details VALUES ('21', 'EN2011121614559', '2', 'NULL', '2', 'NULL', '2', null);

-- ----------------------------
-- Table structure for `engage_interview`
-- ----------------------------
DROP TABLE IF EXISTS `engage_interview`;
CREATE TABLE `engage_interview` (
  `ein_id` smallint(6) NOT NULL auto_increment,
  `human_name` varchar(60) default NULL,
  `interview_amount` smallint(6) default NULL,
  `human_major_id` char(2) default NULL,
  `hunma_major_name` varchar(60) default NULL,
  `human_major_kind_id` char(2) default NULL,
  `human_major_kind_name` varchar(60) default NULL,
  `image_degree` varchar(20) default NULL,
  `native_language_degree` varchar(20) default NULL,
  `foreign_language_degree` varchar(20) default NULL,
  `response_speed_degree` varchar(20) default NULL,
  `EQ_degree` varchar(20) default NULL,
  `IQ_degree` varchar(20) default NULL,
  `multi_quality_degree` varchar(20) default NULL,
  `register` varchar(60) default NULL,
  `checker` varchar(60) default NULL,
  `registe_time` datetime default NULL,
  `check_time` datetime default NULL,
  `resume_id` smallint(6) default NULL,
  `result` varchar(20) default NULL,
  `interview_comment` text,
  `check_comment` text,
  `interview_status` smallint(6) default NULL,
  `check_status` smallint(6) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`ein_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of engage_interview
-- ----------------------------
INSERT INTO engage_interview VALUES ('3', 'NULL', '1', '1', 'NULL', '1', 'NULL', 'A', 'A', 'B', 'B', 'B', 'B', 'A', '小样', 'NULL', '2011-12-09 18:25:57', '2011-12-10 13:11:59', '1', 'NULL', '总体较好', 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('4', 'NULL', '1', '2', 'NULL', '2', 'NULL', 'B', 'B', '未评', 'B', 'B', 'B', '未评', '小红', 'NULL', '2011-12-09 18:42:41', '2011-12-10 13:11:59', '3', 'NULL', '发生大', 'NULL', '2', '0', null);
INSERT INTO engage_interview VALUES ('5', 'NULL', '1', '3', 'NULL', '1', 'NULL', 'C', 'B', 'A', 'B', '未评', 'A', 'B', '王二', 'NULL', '2011-12-09 18:48:35', '2011-12-10 13:11:59', '3', 'NULL', '舒服点发沙发', 'NULL', '2', '0', null);
INSERT INTO engage_interview VALUES ('6', 'NULL', '1', '2', 'NULL', '2', 'NULL', 'B', 'A', 'B', 'B', 'B', 'A', 'B', 'ss', 'NULL', '2011-12-09 18:50:42', '2011-12-10 13:11:59', '1', 'NULL', 'sfasd', 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('7', 'NULL', '1', '1', 'NULL', '3', 'NULL', 'B', 'B', 'B', 'B', 'A', 'B', 'C', 'sef', 'NULL', '2011-12-09 18:57:02', '2011-12-10 13:11:59', '1', 'NULL', 'sfasd', 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('8', 'NULL', '1', '2', 'NULL', '1', 'NULL', 'B', 'A', 'B', '未评', 'B', 'B', 'B', 'df', 'NULL', '2011-12-09 18:59:38', '2011-12-10 13:11:59', '15', 'NULL', 'fsdfa', 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('9', 'NULL', '1', '3', 'NULL', '1', 'NULL', 'A', 'A', 'B', 'B', '未评', 'A', 'A', 'aa', 'NULL', '2011-12-09 19:04:21', '2011-12-15 18:26:13', '15', 'NULL', 'aaaaa', 'NULL', '1', '4', null);
INSERT INTO engage_interview VALUES ('10', 'NULL', '1', '1', 'NULL', '2', 'NULL', 'B', 'B', 'B', 'A', 'B', 'A', 'B', 'sfas', 'NULL', '2011-12-09 19:05:35', '2011-12-10 13:11:59', '1', 'NULL', 'fasdfas', 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('11', 'NULL', '1', '1', 'NULL', '3', 'NULL', 'B', 'B', 'B', 'B', '未评', 'B', 'B', '李璐', 'NULL', '2011-12-09 19:10:43', '2011-12-10 13:11:59', '3', 'NULL', '啦啦啦', 'NULL', '2', '0', null);
INSERT INTO engage_interview VALUES ('12', 'NULL', '1', '2', 'NULL', '3', 'NULL', 'A', 'B', 'B', 'A', 'B', 'B', 'C', '方式', 'NULL', '2011-12-09 19:19:01', '2011-12-10 13:11:59', '1', 'NULL', '暗示法', 'NULL', '1', '3', null);
INSERT INTO engage_interview VALUES ('13', 'NULL', '2', '3', 'NULL', '1', 'NULL', '未评', '未评', '未评', '未评', '未评', '未评', '未评', '', 'NULL', '2011-12-15 18:50:37', '2011-12-15 21:05:05', '13', 'NULL', null, 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('14', 'NULL', '2', '1', 'NULL', '2', 'NULL', '未评', '未评', '未评', '未评', '未评', '未评', '未评', '', 'NULL', '2011-12-15 18:51:39', '2011-12-15 21:05:05', '13', 'NULL', 'aaaa', 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('15', 'NULL', '2', '2', 'NULL', '2', 'NULL', 'B', 'B', 'B', '未评', '未评', '未评', '未评', '', 'NULL', '2011-12-15 19:56:01', '2011-12-15 21:05:05', '13', 'NULL', 'aaa', 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('16', 'NULL', '2', '1', 'NULL', '3', 'NULL', 'B', 'B', 'B', '未评', 'B', '未评', 'B', '', 'NULL', '2011-12-15 19:58:56', '2011-12-15 21:05:05', '13', 'NULL', 'aa', 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('17', 'NULL', '2', '1', 'NULL', '2', 'NULL', '未评', '未评', '未评', '未评', '未评', '未评', '未评', '', 'NULL', '2011-12-15 20:05:29', '2011-12-15 21:05:05', '13', 'NULL', null, 'NULL', '2', '0', null);
INSERT INTO engage_interview VALUES ('18', 'NULL', '2', '2', 'NULL', '1', 'NULL', 'B', '未评', '未评', '未评', '未评', '未评', '未评', '', 'NULL', '2011-12-15 20:06:52', '2011-12-15 20:07:48', '13', 'NULL', null, 'NULL', '2', '4', null);
INSERT INTO engage_interview VALUES ('19', 'NULL', '2', '2', 'NULL', '1', 'NULL', '未评', '未评', '未评', '未评', '未评', '未评', '未评', '', 'NULL', '2011-12-15 20:12:15', '2011-12-15 21:05:05', '16', 'NULL', null, 'NULL', '1', '0', null);
INSERT INTO engage_interview VALUES ('20', 'NULL', '2', '1', 'NULL', '2', 'NULL', '未评', '未评', '未评', '未评', 'A', '未评', '未评', '', 'NULL', '2011-12-15 20:14:15', '2011-12-15 21:05:05', '16', 'NULL', null, 'NULL', '2', '0', null);
INSERT INTO engage_interview VALUES ('21', 'NULL', '2', '3', 'NULL', '3', 'NULL', 'A', 'A', 'A', 'A', 'A', 'A', 'A', '', 'NULL', '2011-12-15 20:18:19', '2011-12-15 21:05:05', '16', 'NULL', null, 'NULL', '2', '0', null);
INSERT INTO engage_interview VALUES ('22', 'NULL', '2', '1', 'NULL', '4', 'NULL', 'B', '未评', '未评', '未评', 'B', '未评', '未评', '', 'NULL', '2011-12-15 20:53:48', '2011-12-15 21:05:05', '16', 'NULL', 'interview4', 'NULL', '2', '4', null);
INSERT INTO engage_interview VALUES ('23', 'NULL', '2', '1', 'NULL', '4', 'NULL', 'C', 'B', 'B', 'B', 'A', '未评', 'A', '', 'NULL', '2011-12-16 08:37:37', '2011-12-16 08:38:02', '18', 'NULL', '啊啊', 'NULL', '2', '4', null);

-- ----------------------------
-- Table structure for `engage_major_release`
-- ----------------------------
DROP TABLE IF EXISTS `engage_major_release`;
CREATE TABLE `engage_major_release` (
  `mre_id` smallint(6) NOT NULL auto_increment,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `third_kind_id` char(2) default NULL,
  `third_kind_name` varchar(60) default NULL,
  `major_id` char(2) default NULL,
  `major_name` varchar(60) default NULL,
  `major_kind_id` char(2) default NULL,
  `major_kind_name` varchar(60) default NULL,
  `human_amount` smallint(6) default NULL,
  `engage_type` varchar(60) default NULL,
  `deadline` datetime default NULL,
  `register` varchar(60) default NULL,
  `changer` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `change_time` datetime default NULL,
  `major_describe` text,
  `engage_required` text,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`mre_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of engage_major_release
-- ----------------------------
INSERT INTO engage_major_release VALUES ('1', '1', 'NULL', '1', 'NULL', '1', 'NULL', '8', 'NULL', '1', 'NULL', '3', '社会招聘', '2011-12-31 00:00:00', '张三', 'NULL', '2011-12-06 17:11:54', '2011-12-06 00:00:00', '职位描述，技术工', '技术熟练', null);
INSERT INTO engage_major_release VALUES ('2', '1', 'NULL', '1', 'NULL', '1', 'NULL', '4', 'NULL', '1', 'NULL', '5', '社会招聘', '2011-12-31 00:00:00', 'zhangsan', 'NULL', '2011-12-06 00:00:00', '2011-12-06 00:00:00', 'aaaa', 'aaaaa', null);
INSERT INTO engage_major_release VALUES ('5', '1', 'NULL', '1', 'NULL', '1', 'NULL', '8', 'NULL', '1', 'NULL', '2', '校园招聘', '2011-12-22 00:00:00', '', 'NULL', '2011-12-06 17:11:54', '2011-12-06 00:00:00', '得得得', '的大多数', null);
INSERT INTO engage_major_release VALUES ('6', '2', 'NULL', '2', 'NULL', '1', 'NULL', '6', 'NULL', '1', 'NULL', '4', '校园招聘', '2011-12-07 00:00:00', '', 'NULL', '2011-12-06 15:35:51', '2011-12-06 00:00:00', '肥嘟嘟 ', '梵蒂冈的', null);
INSERT INTO engage_major_release VALUES ('7', '1', 'NULL', '3', 'NULL', '1', 'NULL', '1', 'NULL', '1', 'NULL', '34', '校园招聘', '2011-12-31 00:00:00', '', 'admin', '2011-12-06 17:11:54', '2011-12-06 00:00:00', 'dff', 'vvvvvvvvv', null);

-- ----------------------------
-- Table structure for `engage_resume`
-- ----------------------------
DROP TABLE IF EXISTS `engage_resume`;
CREATE TABLE `engage_resume` (
  `res_id` smallint(6) NOT NULL auto_increment,
  `human_name` varchar(60) default NULL,
  `engage_type` varchar(30) default NULL,
  `human_address` varchar(200) default NULL,
  `human_postcode` varchar(10) default NULL,
  `human_major_id` char(2) default NULL,
  `hunma_major_name` varchar(60) default NULL,
  `human_major_kind_id` char(2) default NULL,
  `human_major_kind_name` varchar(60) default NULL,
  `human_telephone` varchar(60) default NULL,
  `human_homephone` varchar(60) default NULL,
  `human_mobilephone` varchar(60) default NULL,
  `human_email` varchar(60) default NULL,
  `human_hobby` varchar(200) default NULL,
  `human_specility` varchar(200) default NULL,
  `human_sex` char(2) default NULL,
  `human_religion` varchar(60) default NULL,
  `human_party` varchar(60) default NULL,
  `human_nationality` varchar(60) default NULL,
  `human_race` varchar(60) default NULL,
  `human_birthday` datetime default NULL,
  `human_age` smallint(6) default NULL,
  `human_educated_degree` varchar(60) default NULL,
  `human_educated_years` smallint(6) default NULL,
  `human_educated_major` varchar(60) default NULL,
  `human_college` varchar(60) default NULL,
  `human_idcard` varchar(60) default NULL,
  `human_birthplace` varchar(200) default NULL,
  `demand_salary_standard` decimal(15,2) default NULL,
  `human_history_records` text,
  `remark` text,
  `recomandation` text,
  `human_picture` varchar(60) default NULL,
  `attachment_name` varchar(60) default NULL,
  `check_status` smallint(6) default NULL,
  `register` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `checker` varchar(60) default NULL,
  `check_time` datetime default NULL,
  `interview_status` smallint(6) default NULL,
  `total_points` float default NULL,
  `test_amount` smallint(6) default NULL,
  `test_checker` varchar(60) default NULL,
  `test_check_time` datetime default NULL,
  `pass_register` varchar(60) default NULL,
  `pass_regist_time` datetime default NULL,
  `pass_checker` varchar(60) default NULL,
  `pass_check_time` datetime default NULL,
  `pass_check_status` smallint(6) default NULL,
  `pass_checkComment` varchar(60) default NULL,
  `pass_passComment` varchar(60) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of engage_resume
-- ----------------------------
INSERT INTO engage_resume VALUES ('1', '刘德华', '社会招聘', '', '', '1', 'NULL', '1', 'NULL', '', '', '', '', '篮球', '数据库', '男', '无', '无', '中国', '汉族', '2011-12-08 00:00:00', '34', '本科', '12', '生物工程', '', '234234242432323', '', '0.00', '发大水', '发沙发', null, 'NULL', 'NULL', '3', 'NULL', '2011-12-08 00:00:00', '', '2011-12-16 08:36:54', '1', '22', '1', 'NULL', '2011-12-16 08:36:54', 'NULL', '2011-12-16 08:36:54', 'NULL', '2011-12-16 00:00:00', '1', 'NULL', 'NULL', null);
INSERT INTO engage_resume VALUES ('2', '蔡依林', '社会招聘', '', '', '1', 'NULL', '1', 'NULL', '', '', '', '', '篮球', '数据库', '男', '无', '群众', '中国', '汉族', '2011-12-08 00:00:00', '0', '大专', '12', '计算机', '', '44444444444555555555555', '', '0.00', null, null, null, 'NULL', 'NULL', '2', 'NULL', '2011-12-08 00:00:00', '', '2011-12-16 08:36:54', '1', '22', '1', 'NULL', '2011-12-16 08:36:54', 'NULL', '2011-12-16 08:36:54', 'NULL', '2011-12-16 00:00:00', '1', 'NULL', 'NULL', null);
INSERT INTO engage_resume VALUES ('3', '张三', '社会招聘', '', '', '1', 'NULL', '1', 'NULL', '', '', '', '', '篮球', '数据库', '男', '无', '无', '中国', '汉族', '2011-12-08 00:00:00', '23', '本科', '12', '生物工程', '', '24323424342', '', '0.00', null, null, null, 'NULL', 'NULL', '4', 'NULL', '2011-12-08 00:00:00', '', '2011-12-16 08:36:54', '1', '35', '4', '', '2011-12-16 08:36:54', 'NULL', '2011-12-16 08:36:54', 'NULL', '2011-12-16 00:00:00', '1', '', 'NULL', null);
INSERT INTO engage_resume VALUES ('13', '小样', '社会招聘', '', '', '1', 'NULL', '1', 'NULL', '', '', '', 'xiaoyang@163.com', '篮球', '数据库', '男', '无', '无', '中国', '汉族', '2011-12-08 00:00:00', '0', '本科', '12', '生物工程', '', '888865545677', '', '0.00', null, null, null, 'NULL', 'NULL', '4', 'NULL', '2011-12-08 00:00:00', 'NULL', '2011-12-16 08:36:54', '1', '22', '1', 'NULL', '2011-12-16 08:36:54', '', '2011-12-16 08:36:54', '', '2011-12-16 00:00:00', '1', '2222', '', null);
INSERT INTO engage_resume VALUES ('15', 'peter', '社会招聘', '', '', '1', 'NULL', '1', 'NULL', '2328383', '', '122343243', 'peter', '篮球', '数据库', '男', '无', '无', '中国', '汉族', '2011-12-08 00:00:00', '0', '本科', '12', '生物工程', '', '43109932323', '', '0.00', '程序员', null, null, 'NULL', 'NULL', '4', 'NULL', '2011-12-08 00:00:00', 'NULL', '2011-12-16 08:36:54', '1', '22', '1', 'NULL', '2011-12-16 08:36:54', '', '2011-12-16 08:36:54', 'NULL', '2011-12-16 00:00:00', '0', '', '1212111', null);
INSERT INTO engage_resume VALUES ('16', 'aa', '社会招聘', '', '', '1', 'NULL', '1', 'NULL', '', '', '', '', '篮球', '数据库', '男', '无', '无', '中国', '汉族', '2011-12-08 00:00:00', '0', '本科', '12', '生物工程', '', 'a1112222222222', '', '0.00', 'aaaaaaa', 'aaaaaa', null, 'NULL', 'NULL', '4', 'NULL', '2011-12-08 00:00:00', 'NULL', '2011-12-16 08:36:54', '1', '22', '1', 'NULL', '2011-12-16 08:36:54', '', '2011-12-16 08:36:54', 'NULL', '2011-12-16 00:00:00', '0', '', '', null);
INSERT INTO engage_resume VALUES ('18', '小雅', '社会招聘', '', '', '1', 'NULL', '1', 'NULL', '', '', '', '', '篮球', '数据库', '男', '佛教', '无', '中国', '汉族', '2011-12-08 00:00:00', '0', '本科', '12', '生物工程', '', '12332', '', '0.00', '爱爱爱', '得得得', null, 'NULL', 'NULL', '4', 'NULL', '2011-12-16 00:00:00', '', '2011-12-16 08:36:54', '1', '99', '1', 'NULL', '2011-12-16 08:36:54', 'NULL', '2011-12-16 08:36:54', 'NULL', '2011-12-16 00:00:00', '0', 'NULL', 'NULL', null);

-- ----------------------------
-- Table structure for `engage_subjects`
-- ----------------------------
DROP TABLE IF EXISTS `engage_subjects`;
CREATE TABLE `engage_subjects` (
  `sub_id` smallint(6) NOT NULL auto_increment,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `register` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `derivation` varchar(60) default NULL,
  `content` text,
  `key_a` text,
  `key_b` text,
  `key_c` text,
  `key_d` text,
  `key_e` text,
  `correct_key` varchar(10) default NULL,
  `changer` varchar(60) default NULL,
  `change_time` datetime default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of engage_subjects
-- ----------------------------
INSERT INTO engage_subjects VALUES ('1', '1', 'NULL', '2', 'NULL', '张三', '2011-12-10 00:00:00', '', 'session的存活时间', '1小时', '30分钟', '1分钟', null, null, 'b', 'NULL', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('2', '1', 'NULL', '2', 'NULL', '张三', '2011-12-10 00:00:00', '', 'aaaaa', 'a', 'b', 'c', 'd', null, 'b', '', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('3', '1', 'NULL', '2', 'NULL', '张学友', '2011-12-13 00:00:00', 'aaa', '林冲出自下面哪本书', '《三国演义》', '《水浒传》', '《西游记》', '《红楼梦》', null, 'b', 'NULL', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('4', '1', 'NULL', '2', 'NULL', 'aa', '2011-12-13 00:00:00', '', '1111', '22', '212', 'wer', 'fs', null, 'a', 'NULL', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('5', '1', 'NULL', '2', 'NULL', '张三', '2011-12-13 00:00:00', '自编', '哪个不是访问修饰符', 'private', 'public ', 'final', 'protected', null, 'c', 'NULL', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('6', '1', 'NULL', '2', 'NULL', '李四', '2011-12-13 00:00:00', '乱七八糟', '阿百川', '发', '发生地', '是否', '沙发上', null, 'd', 'NULL', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('7', '1', 'NULL', '2', 'NULL', '小样', '2011-12-13 00:00:00', 'sss', '管理111', '阿发', '发生', '是否', '撒发生地', null, 'b', 'NULL', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('8', '1', 'NULL', '2', 'NULL', '', '2011-12-13 00:00:00', '', '管理22', 'sfss', 'sffs', 'sfs', 'fsgsf', null, 'd', 'NULL', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('9', '1', 'NULL', '2', 'NULL', 'zs', '2011-12-13 00:00:00', '', '蛋白质是什么', 'dddd', 'bbbb', 'zzz', 'ssss', null, 'c', 'NULL', '2011-12-11 00:00:00', null);
INSERT INTO engage_subjects VALUES ('10', '1', 'NULL', '2', 'NULL', '', '2011-12-13 00:00:00', 'af', '冬虫夏草', '草', '虫', '西藏', '冬虫夏草', null, 'd', 'NULL', '2011-12-11 00:00:00', null);

-- ----------------------------
-- Table structure for `human_file`
-- ----------------------------
DROP TABLE IF EXISTS `human_file`;
CREATE TABLE `human_file` (
  `huf_id` smallint(6) NOT NULL auto_increment,
  `human_id` varchar(30) default NULL,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `third_kind_id` char(2) default NULL,
  `third_kind_name` varchar(60) default NULL,
  `human_name` varchar(60) default NULL,
  `human_address` varchar(200) default NULL,
  `human_postcode` varchar(10) default NULL,
  `human_pro_designation` varchar(60) default NULL,
  `human_major_id` smallint(6) default NULL,
  `hunma_major_name` varchar(60) default NULL,
  `human_major_kind_id` char(2) default NULL,
  `human_major_kind_name` varchar(60) default NULL,
  `human_telephone` varchar(20) default NULL,
  `human_mobilephone` char(11) default NULL,
  `human_bank` varchar(50) default NULL,
  `human_account` varchar(30) default NULL,
  `human_qq` varchar(15) default NULL,
  `human_email` varchar(50) default NULL,
  `human_hobby` varchar(60) default NULL,
  `human_speciality` varchar(60) default NULL,
  `human_sex` char(2) default NULL,
  `human_religion` varchar(50) default NULL,
  `human_party` varchar(50) default NULL,
  `human_nationality` varchar(50) default NULL,
  `human_race` varchar(50) default NULL,
  `human_birthday` datetime default NULL,
  `human_birthplace` varchar(50) default NULL,
  `human_age` smallint(6) default NULL,
  `human_educated_degree` varchar(60) default NULL,
  `human_educated_years` smallint(6) default NULL,
  `human_educated_major` varchar(60) default NULL,
  `human_society_security_id` varchar(30) default NULL,
  `human_id_card` varchar(20) default NULL,
  `remark` text,
  `salary_standard_id` varchar(30) default NULL,
  `salary_standard_name` varchar(60) default NULL,
  `salary_sum` float(8,2) default NULL,
  `demand_salaray_sum` float(8,2) default NULL,
  `paid_salary_sum` float(8,2) default NULL,
  `major_change_amount` smallint(6) default NULL,
  `bonus_amount` smallint(6) default NULL,
  `training_amount` smallint(6) default NULL,
  `file_chang_amount` smallint(6) default NULL,
  `human_histroy_records` text,
  `human_family_membership` text,
  `human_picture` varchar(255) default NULL,
  `attachment_name` varchar(255) default NULL,
  `check_status` smallint(6) default NULL,
  `register` varchar(60) default NULL,
  `checker` varchar(60) default NULL,
  `changer` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `check_time` datetime default NULL,
  `change_time` datetime default NULL,
  `lastly_change_time` datetime default NULL,
  `delete_time` datetime default NULL,
  `recovery_time` datetime default NULL,
  `human_file_status` tinyint(1) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`huf_id`),
  KEY `human_major_id` (`human_major_id`),
  CONSTRAINT `human_file_ibfk_1` FOREIGN KEY (`human_major_id`) REFERENCES `config_major` (`mak_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of human_file
-- ----------------------------
INSERT INTO human_file VALUES ('1', 'HF1111115143012', '1', 'NULL', '1', 'NULL', '1', 'NULL', '11111', '', '', '工程师', '1', 'NULL', '1', 'NULL', '', '15822222222', '中国银行', '1245667778', '', '', '篮球', '数据库', '男', '无', '党员', '中国', '汉族', '2011-12-15 14:13:16', '', '17', '本科', '12', '生物工程', '', '2234324324', null, 'xc11111414', 'NULL', '22.00', '1.00', '11.00', '1', '1', '2', '1', null, null, '13239295663094.gif', '1323929582954.txt', '1', 'Lucy', 'Lucy', 'NULL', '2011-12-15 14:12:30', '2011-12-15 14:13:16', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '0', null);
INSERT INTO human_file VALUES ('2', 'HF1111115144314', '1', 'NULL', '2', 'NULL', '1', 'NULL', '222', '', '', '工程师', '1', 'NULL', '1', 'NULL', '', '1342432432', '中国银行', '453566544333', '', '', '篮球', '数据库', '男', '无', '党员', '中国', '汉族', '2011-12-15 14:13:16', '', '23', '本科', '12', '生物工程', '', '53423', null, 'xc11111414', 'NULL', '22.00', '1.00', '11.00', '2', '1', '2', '1', null, null, 'NULL', 'NULL', '1', 'Lucy', 'Lucy', 'NULL', '2011-12-15 14:14:43', '2011-12-15 14:16:41', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '0', null);
INSERT INTO human_file VALUES ('3', 'HF1111115144315', '1', 'NULL', '2', 'NULL', '1', 'NULL', '33333', '', '', '工程师', '1', 'NULL', '1', 'NULL', '', '1342432432', '中国银行', '523452345345', '', '', '篮球', '数据库', '男', '无', '党员', '中国', '汉族', '2011-12-15 14:13:16', '', '354', '本科', '12', '生物工程', '', '53423', null, 'xc11111414', 'NULL', '22.00', '1.00', '11.00', '2', '1', '2', '1', null, null, '13239297648409.jpg', '1323929790973.txt', '1', 'Lucy', 'Lucy', 'NULL', '2011-12-15 14:15:51', '2011-12-15 14:16:46', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '2011-12-15 14:12:30', '0', null);

-- ----------------------------
-- Table structure for `human_file_dig`
-- ----------------------------
DROP TABLE IF EXISTS `human_file_dig`;
CREATE TABLE `human_file_dig` (
  `hfd_id` smallint(6) NOT NULL auto_increment,
  `human_id` varchar(30) default NULL,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `third_kind_id` smallint(2) default NULL,
  `third_kind_name` varchar(60) default NULL,
  `human_name` varchar(60) default NULL,
  `human_address` varchar(200) default NULL,
  `human_postcode` varchar(10) default NULL,
  `human_pro_designation` varchar(60) default NULL,
  `human_major_id` smallint(2) default NULL,
  `hunma_major_name` varchar(60) default NULL,
  `human_major_kind_id` char(2) default NULL,
  `human_major_kind_name` varchar(60) default NULL,
  `human_telephone` varchar(20) default NULL,
  `human_mobilephone` char(11) default NULL,
  `human_bank` varchar(50) default NULL,
  `human_account` varchar(30) default NULL,
  `human_qq` varchar(15) default NULL,
  `human_email` varchar(50) default NULL,
  `human_hobby` varchar(60) default NULL,
  `human_speciality` varchar(60) default NULL,
  `human_sex` char(2) default NULL,
  `human_religion` varchar(50) default NULL,
  `human_party` varchar(50) default NULL,
  `human_nationality` varchar(50) default NULL,
  `human_race` varchar(50) default NULL,
  `human_birthday` datetime default NULL,
  `human_birthplace` varchar(50) default NULL,
  `human_age` smallint(6) default NULL,
  `human_educated_degree` varchar(60) default NULL,
  `human_educated_years` smallint(6) default NULL,
  `human_educated_major` varchar(60) default NULL,
  `human_society_security_id` varchar(30) default NULL,
  `human_id_card` varchar(20) default NULL,
  `remark` text,
  `salary_standard_id` varchar(30) default NULL,
  `salary_standard_name` varchar(60) default NULL,
  `salary_sum` float(8,2) default NULL,
  `demand_salaray_sum` float(8,2) default NULL,
  `paid_salary_sum` float(8,2) default NULL,
  `major_change_amount` smallint(6) default NULL,
  `bonus_amount` smallint(6) default NULL,
  `training_amount` smallint(6) default NULL,
  `file_chang_amount` smallint(6) default NULL,
  `human_histroy_records` text,
  `human_family_membership` text,
  `human_picture` varchar(255) default NULL,
  `attachment_name` varchar(255) default NULL,
  `check_status` smallint(6) default NULL,
  `register` varchar(60) default NULL,
  `checker` varchar(60) default NULL,
  `changer` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `check_time` datetime default NULL,
  `change_time` datetime default NULL,
  `lastly_change_time` datetime default NULL,
  `delete_time` datetime default NULL,
  `recovery_time` datetime default NULL,
  `human_file_status` tinyint(1) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`hfd_id`),
  KEY `human_major_id` (`human_major_id`),
  KEY `third_kind_id` (`third_kind_id`),
  CONSTRAINT `human_file_dig_ibfk_2` FOREIGN KEY (`third_kind_id`) REFERENCES `config_file_third_kind` (`ftk_id`),
  CONSTRAINT `human_file_dig_ibfk_1` FOREIGN KEY (`human_major_id`) REFERENCES `config_major` (`mak_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of human_file_dig
-- ----------------------------

-- ----------------------------
-- Table structure for `major_change`
-- ----------------------------
DROP TABLE IF EXISTS `major_change`;
CREATE TABLE `major_change` (
  `mch_id` smallint(6) NOT NULL auto_increment,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `third_kind_id` char(2) default NULL,
  `third_kind_name` varchar(60) default NULL,
  `major_id` char(2) default NULL,
  `major_name` varchar(60) default NULL,
  `major_kind_id` char(2) default NULL,
  `major_kind_name` varchar(60) default NULL,
  `new_first_kind_id` char(2) default NULL,
  `new_first_kind_name` varchar(60) default NULL,
  `new_second_kind_id` char(2) default NULL,
  `new_second_kind_name` varchar(60) default NULL,
  `new_third_kind_id` char(2) default NULL,
  `new_third_kind_name` varchar(60) default NULL,
  `new_major_id` char(2) default NULL,
  `new_major_name` varchar(60) default NULL,
  `new_major_kind_id` char(2) default NULL,
  `new_major_kind_name` varchar(60) default NULL,
  `human_id` varchar(30) default NULL,
  `human_name` varchar(60) default NULL,
  `salary_standard_id` varchar(30) default NULL,
  `salary_standard_name` varchar(60) default NULL,
  `salary_sum` float(8,2) default NULL,
  `new_salary_standard_id` varchar(30) default NULL,
  `new_salary_standard_name` varchar(60) default NULL,
  `new_salary_sum` float(8,2) default NULL,
  `change_reason` text,
  `check_reason` text,
  `check_status` smallint(6) default NULL,
  `register` varchar(60) default NULL,
  `checker` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `check_time` datetime default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`mch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of major_change
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` smallint(6) NOT NULL auto_increment,
  `role_name` varchar(50) default NULL,
  `role_desc` varchar(50) default NULL,
  `role_flag` int(11) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO role VALUES ('1', '人事经理', null, '1', '2015-01-21');
INSERT INTO role VALUES ('2', null, null, null, null);

-- ----------------------------
-- Table structure for `role_right`
-- ----------------------------
DROP TABLE IF EXISTS `role_right`;
CREATE TABLE `role_right` (
  `rf_id` smallint(6) NOT NULL auto_increment,
  `rf_role_id` smallint(6) NOT NULL,
  `rf_right_code` varchar(50) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`rf_id`),
  KEY `rf_role_id` (`rf_role_id`),
  KEY `rf_right_code` (`rf_right_code`),
  CONSTRAINT `role_right_ibfk_2` FOREIGN KEY (`rf_right_code`) REFERENCES `rright` (`right_code`),
  CONSTRAINT `role_right_ibfk_1` FOREIGN KEY (`rf_role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_right
-- ----------------------------

-- ----------------------------
-- Table structure for `rright`
-- ----------------------------
DROP TABLE IF EXISTS `rright`;
CREATE TABLE `rright` (
  `right_code` varchar(10) NOT NULL default '',
  `right_parent_code` varchar(50) default NULL,
  `right_text` varchar(50) default NULL,
  `right_type` varchar(50) default NULL,
  `right_url` varchar(50) default NULL,
  `right_tip` varchar(50) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`right_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rright
-- ----------------------------

-- ----------------------------
-- Table structure for `salary_grant`
-- ----------------------------
DROP TABLE IF EXISTS `salary_grant`;
CREATE TABLE `salary_grant` (
  `sgr_id` smallint(6) NOT NULL auto_increment,
  `salary_grant_id` varchar(30) default NULL,
  `salary_standard_id` varchar(30) default NULL,
  `first_kind_id` char(2) default NULL,
  `first_kind_name` varchar(60) default NULL,
  `second_kind_id` char(2) default NULL,
  `second_kind_name` varchar(60) default NULL,
  `third_kind_id` char(2) default NULL,
  `third_kind_name` varchar(60) default NULL,
  `human_amount` smallint(6) default NULL,
  `salary_standard_sum` float(8,2) default NULL,
  `salary_paid_sum` float(8,2) default NULL,
  `register` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `checker` varchar(60) default NULL,
  `check_time` datetime default NULL,
  `check_status` smallint(6) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`sgr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary_grant
-- ----------------------------
INSERT INTO salary_grant VALUES ('1', '1', 'xc11111414', '1', 'NULL', '1', '1', '1', 'NULL', '3', '22.00', '22.00', 'lucy', '2011-12-15 00:00:00', 'lucy', '2011-12-15 00:00:00', '1', null);

-- ----------------------------
-- Table structure for `salary_grant_details`
-- ----------------------------
DROP TABLE IF EXISTS `salary_grant_details`;
CREATE TABLE `salary_grant_details` (
  `grd_id` smallint(6) NOT NULL auto_increment,
  `salary_grant_id` varchar(30) default NULL,
  `human_id` varchar(30) default NULL,
  `human_name` varchar(60) default NULL,
  `bouns_sum` float(8,2) default NULL,
  `sale_sum` float(8,2) default NULL,
  `deduct_sum` float(8,2) default NULL,
  `salary_standard_sum` float(8,2) default NULL,
  `salary_paid_sum` float(8,2) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`grd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary_grant_details
-- ----------------------------
INSERT INTO salary_grant_details VALUES ('1', 'ff141726', 'HF1111115143012', 'NULL', '400.00', '33.00', '100.00', '22.00', '22.00', null);
INSERT INTO salary_grant_details VALUES ('2', 'ff141726', 'HF1111115145115', 'NULL', '1890.00', '3.00', '190.00', '22.00', '22.00', null);
INSERT INTO salary_grant_details VALUES ('3', 'ff141726', 'HF1111115144314', 'NULL', '200.00', '3.00', '20.00', '22.00', '22.00', null);

-- ----------------------------
-- Table structure for `salary_standard`
-- ----------------------------
DROP TABLE IF EXISTS `salary_standard`;
CREATE TABLE `salary_standard` (
  `ssd_id` smallint(6) NOT NULL auto_increment,
  `standard_id` varchar(30) default NULL,
  `standard_name` varchar(60) default NULL,
  `designer` varchar(60) default NULL,
  `register` varchar(60) default NULL,
  `checker` varchar(60) default NULL,
  `changer` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `check_time` datetime default NULL,
  `change_time` datetime default NULL,
  `salary_sum` float(8,2) default NULL,
  `check_status` smallint(6) default NULL,
  `change_status` smallint(6) default NULL,
  `check_comment` text,
  `remark` text,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`ssd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary_standard
-- ----------------------------
INSERT INTO salary_standard VALUES ('1', 'xc11111414', '22', '222222', 'better_admin', '人事经理', '人事经理', '2011-12-15 00:00:00', '2011-12-15 00:00:00', '2011-12-15 00:00:00', '22.00', '1', '1', 'erererer', '2222222222', null);

-- ----------------------------
-- Table structure for `salary_standard_details`
-- ----------------------------
DROP TABLE IF EXISTS `salary_standard_details`;
CREATE TABLE `salary_standard_details` (
  `sdt_id` smallint(6) NOT NULL auto_increment,
  `standard_id` varchar(30) default NULL,
  `standard_name` varchar(60) default NULL,
  `item_id` smallint(6) default NULL,
  `item_name` varchar(60) default NULL,
  `salary` float(8,2) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`sdt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary_standard_details
-- ----------------------------
INSERT INTO salary_standard_details VALUES ('1', 'xc11111420', 'w', '1', '基本工资', '2.00', null);
INSERT INTO salary_standard_details VALUES ('2', 'xc11111420', 'w', '1', '出差补助', '2.00', null);
INSERT INTO salary_standard_details VALUES ('3', 'xc11111420', 'ww', '1', '年终奖', '2.00', null);
INSERT INTO salary_standard_details VALUES ('4', 'xc11111414', 'www', '1', '基本工资', '2.00', null);

-- ----------------------------
-- Table structure for `training`
-- ----------------------------
DROP TABLE IF EXISTS `training`;
CREATE TABLE `training` (
  `tra_id` smallint(6) NOT NULL auto_increment,
  `major_kind_id` char(2) default NULL,
  `major_kind_name` varchar(60) default NULL,
  `major_id` char(2) default NULL,
  `major_name` varchar(60) default NULL,
  `human_id` varchar(30) default NULL,
  `human_name` varchar(60) default NULL,
  `training_item` varchar(60) default NULL,
  `training_time` datetime default NULL,
  `training_hour` int(11) default NULL,
  `training_degree` varchar(60) default NULL,
  `register` varchar(60) default NULL,
  `checker` varchar(60) default NULL,
  `regist_time` datetime default NULL,
  `check_time` datetime default NULL,
  `checkstatus` smallint(6) default NULL,
  `remark` text,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`tra_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of training
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `u_id` smallint(6) NOT NULL auto_increment,
  `u_name` varchar(60) default NULL,
  `u_true_name` varchar(60) default NULL,
  `u_password` varchar(60) default NULL,
  `u_role_id` smallint(6) default NULL,
  `update_dateTime` date default NULL,
  PRIMARY KEY  (`u_id`),
  KEY `u_role_id` (`u_role_id`),
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`u_role_id`) REFERENCES `role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO users VALUES ('1', 'ningsi', '宁思', 'ningsi', '1', '2015-01-21');
