CREATE TABLE person_entity (
  id    VARCHAR(255) NOT NULL,
  name  VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE relationship_entity (
  id           VARCHAR(255) NOT NULL,
  from_id         VARCHAR(255) NOT NULL,
  to_id           VARCHAR(255) NOT NULL,
  relationship VARCHAR(255) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (from_id) REFERENCES person_entity (id),
  FOREIGN KEY (to_id) REFERENCES person_entity (id)
);

CREATE TABLE book_entity (
  id        BIGINT NOT NULL AUTO_INCREMENT,
  title     VARCHAR(255),
  author    VARCHAR(255),
  PRIMARY KEY (id)
)
