START TRANSACTION;
INSERT INTO transaction VALUES(null,"127.0.0.1", 1, now());
COMMIT;

-- cart
START TRANSACTION;
INSERT INTO cart VALUES(null, true, 750.0, 1, last_insert_id(), "127.0.0.1", 1, now());
COMMIT;

-- cart_detail
START TRANSACTION;
INSERT INTO cart_detail VALUES(null, 1, 1, 2, 1, last_insert_id(), "127.0.0.1", 1, now());
COMMIT;