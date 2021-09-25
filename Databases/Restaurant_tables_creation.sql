CREATE DATABASE IF NOT EXISTS `Restaurant_Guest_mini_app`;
USE `Restaurant_Guest_mini_app`;
--
-- Table structure for table 'counters'
-- 
drop table if exists `counters`;
create table `counters` (
	`id` int(11) NOT null,
    `max_capacity` int(2) not null,
    `occupency` boolean not null,
    `assign_guest` int(11) default null,
    primary key (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1;

--
-- Table structure for table 'Waiting_guest'
-- 
drop table if exists `entry_guests`;
create table `entry_guests`(
	`id` int(11) not null auto_increment,
	`name` varchar(45) default null,
	`head_count` int(2) not null,
    `assign_table` int(11) default null,
primary key(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- insert datas of 'counters'
--
insert into `counters` values
(0, 10, false, null),
(1, 8, false, null),
(2, 6, false, null),
(3, 6, false, null),
(4, 4, false, null),
(5, 4, false, null),
(6, 2, false, null),
(7, 2, false, null),
(8, 12, false, null)

--
-- insert datas of 'entry_guest'
-- 