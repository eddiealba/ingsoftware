START TRANSACTION;
INSERT INTO transaction VALUES(null,"127.0.0.1", 1, now());
COMMIT;

-- order
START TRANSACTION;
INSERT INTO `order` VALUES(null, 1, 1, 1, 1, CURDATE(), 1, 4, 1, last_insert_id(), "127.0.0.1", 1, now());
COMMIT;