CREATE TABLE `table_user` (
`userid` int NOT NULL AUTO_INCREMENT COMMENT '用户编号（自增）',
`username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '登录时使用的用户名（非空）',
`nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '昵称',
`password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '密码（非空）',
`rank` int UNSIGNED ZEROFILL NOT NULL COMMENT '用户等级（0-普通用户，1-管理员）',
PRIMARY KEY (`userid`) 
);
CREATE TABLE `table_book` (
`bookid` int NOT NULL AUTO_INCREMENT COMMENT '图书id（自增）',
`bookname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书名称（非空）',
`booknum` int NOT NULL COMMENT '图书库存（非空）',
`author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '图书作者',
`publisher` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '出版社',
`pagenumber` int NULL COMMENT '图书页数',
`status` int ZEROFILL NOT NULL COMMENT '借阅状态（0-在馆，1-出借）',
PRIMARY KEY (`bookid`) 
);
CREATE TABLE `table_recorddetail` (
`recordDetailid` int NOT NULL AUTO_INCREMENT COMMENT '借阅详情id（自增）',
`userid` int NOT NULL COMMENT '借阅者id（外键）',
`bookid` int NOT NULL COMMENT '借阅图书id（外键）',
`borrowstatus` int NOT NULL COMMENT '(0-未还，1-已还）',
PRIMARY KEY (`recordDetailid`) 
);
CREATE TABLE `table_record` (
`recordid` int NOT NULL AUTO_INCREMENT COMMENT '借阅记录id（自增）',
`recordDetialid` int NOT NULL COMMENT '借阅详情id（非空）',
`userid` int NOT NULL COMMENT '借阅者id（非空）',
`time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '借阅时间（非空）',
PRIMARY KEY (`recordid`) 
);

ALTER TABLE `table_recorddetail` ADD CONSTRAINT `borrowBookID` FOREIGN KEY (`bookid`) REFERENCES `table_book` (`bookid`);
ALTER TABLE `table_record` ADD CONSTRAINT `recordDetail` FOREIGN KEY (`recordDetialid`) REFERENCES `table_recorddetail` (`recordDetailid`);
ALTER TABLE `table_record` ADD CONSTRAINT `recordUserID` FOREIGN KEY (`userid`) REFERENCES `table_user` (`userid`);
ALTER TABLE `table_recorddetail` ADD CONSTRAINT `borrowUserID` FOREIGN KEY (`userid`) REFERENCES `table_user` (`userid`);

