CREATE TABLE user_entity (
  id            BIGINT NOT NULL AUTO_INCREMENT,
  first_name     VARCHAR(255),
  last_name      VARCHAR(255),
  email         VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE address_entity (
  id        BIGINT NOT NULL  AUTO_INCREMENT,
  street    VARCHAR(255),
  house_nr  VARCHAR(255),
  zip_code  INT,
  city      VARCHAR(255),
  user_id   BIGINT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES user_entity (id)
);

CREATE TABLE todo_entity (
  id            BIGINT NOT NULL AUTO_INCREMENT,
  title     VARCHAR(255),
  content      VARCHAR(255),
  PRIMARY KEY (id)
)
