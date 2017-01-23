CREATE TABLE `users` (
  `id`          INT (11)        NOT NULL AUTO_INCREMENT,
  `version`     INT (11)        NOT NULL,
  `name`        VARCHAR (255)   NOT NULL,
  `balance`     DOUBLE (15,2)   NOT NULL DEFAULT '0.00',
  `created`     TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified`    TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `won`         INT (11)        NOT NULL DEFAULT '0',
  `lost`        INT (11)        NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
);
