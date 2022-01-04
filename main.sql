CREATE TABLE products (
  ProductID int PRIMARY KEY,
  product varchar(255) NOT NULL,
  category varchar(255) NOT NULL
);

CREATE TABLE productPriceHistory (
  ProductID int PRIMARY KEY,
  price DECIMAL(10,2) NOT NULL,
  startDate DATETIME NOT NULL,
  endDate DATETIME DEFAULT NULL
);

INSERT INTO products VALUES (1, 'apple', 'food');
INSERT INTO products VALUES (2, 'banana', 'food');
INSERT INTO products VALUES (3, 'doll', 'toy');
INSERT INTO products VALUES (4, 'Nintendo Switch', 'video game console');

INSERT INTO productPriceHistory VALUES (1, 6.99, "2020-01-01 00:00:00", "2020-12-31 23:59:59");
INSERT INTO productPriceHistory VALUES (2, 3.99, "2020-02-01 00:00:00", NULL);
INSERT INTO productPriceHistory VALUES (3, 10, "2020-02-01 00:00:00", NULL);
INSERT INTO productPriceHistory VALUES (4, 159.99, "2020-12-01 00:00:00", "2020-12-20 23:59:59");

SELECT * FROM products;
SELECT * FROM productPriceHistory;

SELECT * FROM products INNER JOIN productPriceHistory ON products.ProductID=productPriceHistory.ProductID;