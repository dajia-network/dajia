CREATE DATABASE IF NOT EXISTS dajia DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

DROP TABLE dajia.user;
CREATE TABLE dajia.user (
	user_id BIGINT(25) NOT NULL AUTO_INCREMENT,
	username VARCHAR(100) NOT NULL,
	email VARCHAR(255) NULL,
	mobile VARCHAR(20) NOT NULL,
	password VARCHAR(32) NOT NULL,
	wechat VARCHAR(100) NOT NULL,
	last_visit_date TIMESTAMP NULL,
	last_visit_ip VARCHAR(20) NULL,
	create_date TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	modified_date TIMESTAMP NULL,
    is_active VARCHAR(5) NOT NULL DEFAULT 'Y',
	PRIMARY KEY(user_id),
    UNIQUE KEY (username),
    UNIQUE KEY (email),
    UNIQUE KEY (mobile)
  );

DROP TABLE dajia.product;
CREATE TABLE dajia.product (
	product_id BIGINT(25) NOT NULL AUTO_INCREMENT,
    short_name VARCHAR(100) NULL,
    name VARCHAR(500) NOT NULL,
    brief VARCHAR(4000) NULL,
    description TEXT NULL,
    spec TEXT NULL,
    order_num INT,
    max_order INT,
    original_price NUMERIC(10,2),
    current_price NUMERIC(10,2),
    target_price NUMERIC(10,2),
	start_date TIMESTAMP NULL,
	expired_date TIMESTAMP NULL,
	create_date TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	modified_date TIMESTAMP NULL,
    is_active VARCHAR(5) NOT NULL DEFAULT 'Y',
	PRIMARY KEY(product_id)
);

DROP TABLE dajia.product_img;
CREATE TABLE dajia.product_img (
	img_id BIGINT(25) NOT NULL AUTO_INCREMENT,
	product_id BIGINT(25) NOT NULL,
    sort INT NULL,
    location VARCHAR(500) NULL,
    img_type INT NULL,
	create_date TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	modified_date TIMESTAMP NULL,
    is_active VARCHAR(5) NOT NULL DEFAULT 'Y',
	PRIMARY KEY(img_id)
);