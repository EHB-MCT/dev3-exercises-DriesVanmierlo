/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE TABLE `cities` (
  `name` varchar(255) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `passengers` (
  `passenger_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `rides` (
  `ride_id` int(11) DEFAULT NULL,
  `train` varchar(255) CHARACTER SET utf8 NOT NULL,
  `departure_time` datetime NOT NULL,
  `departure_city` varchar(255) CHARACTER SET utf8 NOT NULL,
  `destination_city` varchar(255) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `rides_passengers` (
  `id` int(11) DEFAULT NULL,
  `ride_id` int(11) DEFAULT NULL,
  `passenger_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `trains` (
  `type` varchar(255) CHARACTER SET utf8 NOT NULL,
  `max_speed` int(11) unsigned NOT NULL,
  `max_passengers` int(11) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `cities` (`name`) VALUES
('Leuven');
INSERT INTO `cities` (`name`) VALUES
('Brussel');
INSERT INTO `cities` (`name`) VALUES
('Neerpelt');

INSERT INTO `passengers` (`passenger_id`, `name`) VALUES
(1, 'Dries');
INSERT INTO `passengers` (`passenger_id`, `name`) VALUES
(2, 'Sam');
INSERT INTO `passengers` (`passenger_id`, `name`) VALUES
(3, 'Matthias');

INSERT INTO `rides` (`ride_id`, `train`, `departure_time`, `departure_city`, `destination_city`) VALUES
(1, 'Belgian', '2021-11-09 09:32:24', 'Leuven', 'Brussel-Zuid');
INSERT INTO `rides` (`ride_id`, `train`, `departure_time`, `departure_city`, `destination_city`) VALUES
(2, 'Belgian', '2021-11-09 09:32:24', 'Leuven', 'Neerpelt');
INSERT INTO `rides` (`ride_id`, `train`, `departure_time`, `departure_city`, `destination_city`) VALUES
(3, 'Belgian', '2021-11-09 09:32:24', 'Neerpelt', 'Leuven');

INSERT INTO `rides_passengers` (`id`, `ride_id`, `passenger_id`) VALUES
(1, 3, 1);
INSERT INTO `rides_passengers` (`id`, `ride_id`, `passenger_id`) VALUES
(2, 2, 2);


INSERT INTO `trains` (`type`, `max_speed`, `max_passengers`) VALUES
('Belgian', 150, 360);
INSERT INTO `trains` (`type`, `max_speed`, `max_passengers`) VALUES
('Dutch', 140, 500);



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;