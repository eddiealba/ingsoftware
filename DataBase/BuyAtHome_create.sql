-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2020-11-23 16:17:06.408

-- tables
-- Table: address
CREATE TABLE address (
    address_id int NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla address, tipo de dato: INT, NOT NULL.',
    neighbour_id int NOT NULL,
    street varchar(100) NOT NULL,
    number varchar(20) NOT NULL,
    reference varchar(400) NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT address_pk PRIMARY KEY (address_id)
);

-- Table: branch_office
CREATE TABLE branch_office (
    branh_office_id int NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla branch office, tipo de dato: INT, NOT NULL.',
    address_id int NOT NULL COMMENT 'Llave foranea de address, tipo de dato: INT. Se  obtiene la informacion de la tabla address.',
    store_name varchar(50) NOT NULL,
    description varchar(200) NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT branch_office_pk PRIMARY KEY (branh_office_id)
);

-- Table: brand
CREATE TABLE brand (
    brand_id int NOT NULL AUTO_INCREMENT,
    name varchar(50) NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT brand_pk PRIMARY KEY (brand_id)
);

-- Table: cart
CREATE TABLE cart (
    cart_id int NOT NULL AUTO_INCREMENT,
    is_active bool NOT NULL,
    total decimal(12,6) NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT cart_pk PRIMARY KEY (cart_id)
);

-- Table: cart_detail
CREATE TABLE cart_detail (
    cart_detail_id int NOT NULL AUTO_INCREMENT,
    cart_id int NOT NULL,
    product_id int NOT NULL,
    qtty int NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT cart_detail_pk PRIMARY KEY (cart_detail_id)
);

-- Table: delivery
CREATE TABLE delivery (
    delivery_id int NOT NULL AUTO_INCREMENT,
    neighbour_id int NOT NULL,
    price numeric(12,6) NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT delivery_pk PRIMARY KEY (delivery_id)
);

-- Table: h_order
CREATE TABLE h_order (
    h_order_id int NOT NULL AUTO_INCREMENT,
    order_id int NOT NULL COMMENT 'Llave primaria de la tabla order, tipo de dato: INT, NOT NULL.',
    address_id int NOT NULL COMMENT 'Llave foranea de address, tipo de dato: INT. Se  obtiene la informacion de la tabla address.',
    user_id int NOT NULL COMMENT 'Llave foranea de la tabla user, tipo de dato: INT. Se  obtiene la informacion de la tabla user.',
    cart_id int NOT NULL,
    delivery_id int NOT NULL,
    date date NOT NULL,
    status int NOT NULL,
    state int NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT h_order_pk PRIMARY KEY (h_order_id)
);

-- Table: h_product
CREATE TABLE h_product (
    h_product_id int NOT NULL AUTO_INCREMENT,
    product_id int NOT NULL,
    brand_id int NOT NULL,
    product_name varchar(100) NOT NULL,
    tag_id int NOT NULL,
    detail text NOT NULL,
    model varchar(100) NOT NULL,
    price numeric(12,6) NOT NULL,
    stock int NOT NULL,
    description text NOT NULL,
    store_available bool NOT NULL,
    delivery_available bool NOT NULL,
    image text NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT h_product_pk PRIMARY KEY (h_product_id)
);

-- Table: h_user
CREATE TABLE h_user (
    h_user_id int NOT NULL AUTO_INCREMENT,
    user_id int NOT NULL,
    address_id int NOT NULL COMMENT 'Llave foranea de address, tipo de dato: INT. Se  obtiene la informacion de la tabla address.',
    firstname varchar(50) NOT NULL,
    lastname varchar(50) NOT NULL,
    phone varchar(20) NOT NULL,
    email varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    tx_status int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    CONSTRAINT h_user_pk PRIMARY KEY (h_user_id)
);

-- Table: neighbour
CREATE TABLE neighbour (
    neighbour_id int NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT neighbour_pk PRIMARY KEY (neighbour_id)
);

-- Table: order
CREATE TABLE `order` (
    order_id int NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla order, tipo de dato: INT, NOT NULL.',
    address_id int NOT NULL COMMENT 'Llave foranea de address, tipo de dato: INT. Se  obtiene la informacion de la tabla address.',
    user_id int NOT NULL COMMENT 'Llave foranea de la tabla user, tipo de dato: INT. Se  obtiene la informacion de la tabla user.',
    cart_id int NOT NULL,
    delivery_id int NOT NULL,
    date date NOT NULL,
    status int NOT NULL,
    state int NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT order_pk PRIMARY KEY (order_id)
);

-- Table: payment
CREATE TABLE payment (
    payment_id int NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla payment, tipo de dato: INT, NOT NULL.',
    firstname varchar(50) NOT NULL,
    lastname varchar(50) NOT NULL,
    card_number int NOT NULL,
    security_code int NOT NULL,
    date_expire time NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT payment_pk PRIMARY KEY (payment_id)
);

-- Table: product
CREATE TABLE product (
    product_id int NOT NULL AUTO_INCREMENT,
    brand_id int NOT NULL,
    product_name varchar(100) NOT NULL,
    tag_id int NOT NULL,
    detail text NOT NULL,
    model varchar(100) NOT NULL,
    price numeric(12,6) NOT NULL,
    stock int NOT NULL,
    description text NOT NULL,
    store_available bool NOT NULL,
    delivery_available bool NOT NULL,
    image text NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT product_pk PRIMARY KEY (product_id)
);

-- Table: role
CREATE TABLE role (
    role_id int NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla role, tipo de dato: INT, NOT NULL.',
    role_name int NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (role_id)
);

-- Table: tag
CREATE TABLE tag (
    tag_id int NOT NULL AUTO_INCREMENT,
    category varchar(50) NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT tag_pk PRIMARY KEY (tag_id)
);

-- Table: transaction
CREATE TABLE transaction (
    tx_id int NOT NULL AUTO_INCREMENT,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT transaction_pk PRIMARY KEY (tx_id)
);

-- Table: user
CREATE TABLE user (
    user_id int NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla user, tipo de dato: INT, NOT NULL.',
    address_id int NOT NULL COMMENT 'Llave foranea de address, tipo de dato: INT. Se  obtiene la informacion de la tabla address.',
    firstname varchar(50) NOT NULL,
    lastname varchar(50) NOT NULL,
    phone varchar(20) NOT NULL,
    email varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    tx_status int NOT NULL,
    tx_date timestamp NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (user_id)
);

-- Table: user_role
CREATE TABLE user_role (
    user_role_id int NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla user role, tipo de dato: INT, NOT NULL.',
    user_id int NOT NULL COMMENT 'Llave foranea de la tabla user, tipo de dato: INT. Se  obtiene la informacion de la tabla user.',
    role_id int NOT NULL COMMENT 'Llave foranea de la tabla role, tipo de dato: INT. Se  obtiene la informacion de la tabla role.',
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT user_role_pk PRIMARY KEY (user_role_id)
);

-- Table: voucher
CREATE TABLE voucher (
    voucher_id int NOT NULL AUTO_INCREMENT COMMENT 'Llave primaria de la tabla voucher. Tipo de dato: INT, NOT NULL.',
    order_id int NOT NULL COMMENT 'Llave foranea de order, tipo de dato: INT. Se  obtiene la informacion de la tabla order.',
    payment_id int NOT NULL COMMENT 'Llave foranea de la tabla payment, tipo de dato: INT. Se  obtiene la informacion de la tabla payment.',
    date date NOT NULL,
    total numeric(12,6) NOT NULL,
    tx_status int NOT NULL,
    tx_id int NOT NULL,
    tx_host varchar(50) NOT NULL,
    tx_user_id int NOT NULL,
    tx_date timestamp NOT NULL,
    CONSTRAINT voucher_pk PRIMARY KEY (voucher_id)
);

-- foreign keys
-- Reference: address_neighbour (table: address)
ALTER TABLE address ADD CONSTRAINT address_neighbour FOREIGN KEY address_neighbour (neighbour_id)
    REFERENCES neighbour (neighbour_id);

-- Reference: branch_office_Address (table: branch_office)
ALTER TABLE branch_office ADD CONSTRAINT branch_office_Address FOREIGN KEY branch_office_Address (address_id)
    REFERENCES address (address_id);

-- Reference: cart_detail_cart (table: cart_detail)
ALTER TABLE cart_detail ADD CONSTRAINT cart_detail_cart FOREIGN KEY cart_detail_cart (cart_id)
    REFERENCES cart (cart_id);

-- Reference: cart_detail_product (table: cart_detail)
ALTER TABLE cart_detail ADD CONSTRAINT cart_detail_product FOREIGN KEY cart_detail_product (product_id)
    REFERENCES product (product_id);

-- Reference: delivery_neighbour (table: delivery)
ALTER TABLE delivery ADD CONSTRAINT delivery_neighbour FOREIGN KEY delivery_neighbour (neighbour_id)
    REFERENCES neighbour (neighbour_id);

-- Reference: order_Address (table: order)
ALTER TABLE `order` ADD CONSTRAINT order_Address FOREIGN KEY order_Address (address_id)
    REFERENCES address (address_id);

-- Reference: order_cart (table: order)
ALTER TABLE `order` ADD CONSTRAINT order_cart FOREIGN KEY order_cart (cart_id)
    REFERENCES cart (cart_id);

-- Reference: order_delivery (table: order)
ALTER TABLE `order` ADD CONSTRAINT order_delivery FOREIGN KEY order_delivery (delivery_id)
    REFERENCES delivery (delivery_id);

-- Reference: order_user (table: order)
ALTER TABLE `order` ADD CONSTRAINT order_user FOREIGN KEY order_user (user_id)
    REFERENCES user (user_id);

-- Reference: product_brand (table: product)
ALTER TABLE product ADD CONSTRAINT product_brand FOREIGN KEY product_brand (brand_id)
    REFERENCES brand (brand_id);

-- Reference: product_tag (table: product)
ALTER TABLE product ADD CONSTRAINT product_tag FOREIGN KEY product_tag (tag_id)
    REFERENCES tag (tag_id);

-- Reference: user_Address (table: user)
ALTER TABLE user ADD CONSTRAINT user_Address FOREIGN KEY user_Address (address_id)
    REFERENCES address (address_id);

-- Reference: user_role_role (table: user_role)
ALTER TABLE user_role ADD CONSTRAINT user_role_role FOREIGN KEY user_role_role (role_id)
    REFERENCES role (role_id);

-- Reference: user_role_user (table: user_role)
ALTER TABLE user_role ADD CONSTRAINT user_role_user FOREIGN KEY user_role_user (user_id)
    REFERENCES user (user_id);

-- Reference: voucher_order (table: voucher)
ALTER TABLE voucher ADD CONSTRAINT voucher_order FOREIGN KEY voucher_order (order_id)
    REFERENCES `order` (order_id);

-- Reference: voucher_payment (table: voucher)
ALTER TABLE voucher ADD CONSTRAINT voucher_payment FOREIGN KEY voucher_payment (payment_id)
    REFERENCES payment (payment_id);

-- End of file.

