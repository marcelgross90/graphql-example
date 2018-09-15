INSERT INTO person_entity (id, name) VALUES
 ('qeii', 'Queen Elizabeth II');

 INSERT INTO person_entity (id, name) VALUES
 ('pp', 'Prince Philip');

 INSERT INTO person_entity (id, name) VALUES
 ('pc', 'Prince Charles');

 INSERT INTO person_entity (id, name) VALUES
 ('pw', 'Prince William');

 INSERT INTO relationship_entity (id, from_id, to_id, relationship) VALUES
  ('qps', 'qeii', 'pp', 'SPOUSE');

 INSERT INTO relationship_entity (id, from_id, to_id, relationship) VALUES
  ('pqs', 'pp', 'qeii', 'SPOUSE');

 INSERT INTO relationship_entity (id, from_id, to_id, relationship) VALUES
  ('qpp', 'qeii', 'pc', 'PARENTS');

 INSERT INTO relationship_entity (id, from_id, to_id, relationship) VALUES
  ('ppp', 'pp', 'pc', 'PARENTS');

 INSERT INTO relationship_entity (id, from_id, to_id, relationship) VALUES
  ('ppp1', 'pc', 'pw', 'PARENTS');


INSERT INTO book_entity (id, title, author) VALUES
  (1, 'Learn about graphql', 'Max Mustermann');

INSERT INTO book_entity (id, title, author) VALUES
  (2, 'Master Graphql', 'Hans Glück');