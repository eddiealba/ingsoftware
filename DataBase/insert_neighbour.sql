START TRANSACTION;
INSERT INTO transaction VALUES(null,"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO neighbour VALUES(null, 'Miraflores',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null,"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO neighbour VALUES(null, 'Sopocachi',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO transaction VALUES(null,"127.0.0.1", 1, now());
COMMIT;

START TRANSACTION;
INSERT INTO neighbour VALUES(null, 'Obrajes',1,last_insert_id(),"127.0.0.1", 1, now());
COMMIT;