CREATE TABLE IF NOT EXISTS t_user
(
    id   BIGINT(20)  NOT NULL AUTO_INCREMENT,
    name VARCHAR(30) NULL DEFAULT NULL,
    age  INT(11)     NULL DEFAULT NULL,
    PRIMARY KEY (id)
);

INSERT INTO t_user (id, name, age) VALUES (0, 'DEVICE', 40);
