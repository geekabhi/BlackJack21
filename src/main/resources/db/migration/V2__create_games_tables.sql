CREATE TABLE `games` (
  `id`        int(11)                   NOT NULL AUTO_INCREMENT,
  `version`   int(11)                   NOT NULL DEFAULT '0',
  `user_id`   int(11)                   NOT NULL,
  `action`    enum('BET','HIT','STAND') NOT NULL,
  `card`      VARCHAR(2)                NOT NULL,
  `bet_amount`double                    NOT NULL,
  `created`   timestamp                 NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified`  timestamp                 NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  CONSTRAINT `user_id` FOREIGN KEY (`id`) REFERENCES `users` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);