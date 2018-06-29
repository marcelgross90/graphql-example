INSERT INTO user_entity (id, first_name, last_name, email) VALUES
  (1, 'Max', 'Mustermann', 'max.mustermann@web.de');

INSERT INTO user_entity (id, first_name, last_name, email) VALUES
  (2, 'Heike', 'Musterfrau', 'heike.musterfrau@web.de');

INSERT INTO address_entity (id, street, house_nr, zip_code, city, user_id) VALUES
  (1, 'Schwabacherstr', '106', 90482, 'Fuerth', 1);

INSERT INTO address_entity (id, street, house_nr, zip_code, city, user_id) VALUES
  (2, 'Buergweg', '10A', 90482, 'Nuernberg', 1);

INSERT INTO address_entity (id, street, house_nr, zip_code, city, user_id) VALUES
  (3, 'Hauptstr', '1', 80802, 'Dort', 2);

INSERT INTO book_entity (id, title, author) VALUES
  (1, 'Learn about graphql', 'Ich halt');

INSERT INTO book_entity (id, title, author) VALUES
  (2, 'Master Graphql', 'Du auch');