DROP TABLE IF EXISTS account;
CREATE TABLE account
(
    id               INT(11) NOT NULL AUTO_INCREMENT,
    balance          DOUBLE   DEFAULT NULL,
    last_update_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
)
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;
insert into account (id, balance)
VALUES (1, 50);