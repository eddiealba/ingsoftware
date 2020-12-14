use buyathome;
delimiter //
CREATE TRIGGER tg_ins_product AFTER INSERT ON product
	FOR EACH ROW
    BEGIN
		INSERT INTO h_product VALUES(null, NEW.product_id, NEW.brand_id, NEW.product_name, NEW.tag_id, NEW.detail,
        NEW.model, NEW.price, NEW.stock, NEW.description, NEW.store_available, NEW.delivery_available, NEW.image,
        NEW.tx_status, NEW.tx_id,NEW.tx_host, NEW.tx_user_id, NEW.tx_date);
	END//
delimiter ;
delimiter //
CREATE TRIGGER tg_ins_user AFTER INSERT ON user
	FOR EACH ROW
    BEGIN
		INSERT INTO h_user VALUES(null, NEW.user_id, NEW.address_id, NEW.firstname, NEW.lastname, NEW.phone,
        NEW.email, NEW.password,
        NEW.tx_status,NEW.tx_date, NEW.tx_id,NEW.tx_host, NEW.tx_user_id);
	END//
delimiter ;
delimiter //
CREATE TRIGGER tg_ins_order AFTER INSERT ON `order`
	FOR EACH ROW
    BEGIN
		INSERT INTO h_order VALUES(null, NEW.order_id, NEW.address_id, NEW.user_id, NEW.cart_id, NEW.delivery_id,
        NEW.date, NEW.status, NEW.state,
        NEW.tx_status, NEW.tx_id,NEW.tx_host, NEW.tx_user_id, NEW.tx_date);
	END//
delimiter ;