use buyathome;
START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO brand VALUES(null, 'DELL',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO brand VALUES(null, 'HP',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO brand VALUES(null, 'ASUS',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO brand VALUES(null, 'APPLE',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO brand VALUES(null, 'MSI',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

################

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO tag VALUES(null, 'Computadoras',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO tag VALUES(null, 'Laptops',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO tag VALUES(null, 'Impresoras',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO tag VALUES(null, 'Piezas para computadoras',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null, "127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO tag VALUES(null, 'Perifericos',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;