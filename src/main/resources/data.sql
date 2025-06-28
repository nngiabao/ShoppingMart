
-- 20 Products
INSERT INTO product (name, description, price) VALUES
('Laptop', '14 inch business laptop', 799.99),
('Headphones', 'Noise cancelling wireless headphones', 199.99),
('Smartphone', 'Latest Android smartphone', 699.99),
('Monitor', '27 inch 4K monitor', 299.99),
('Keyboard', 'Mechanical keyboard with RGB', 89.99),
('Mouse', 'Wireless ergonomic mouse', 49.99),
('Printer', 'All-in-one wireless printer', 129.99),
('Camera', 'DSLR camera for professionals', 999.99),
('Tablet', '10 inch Android tablet', 249.99),
('Smartwatch', 'Fitness and health tracker', 149.99),
('Desk', 'Wooden office desk', 199.99),
('Chair', 'Ergonomic office chair', 229.99),
('Speaker', 'Bluetooth portable speaker', 59.99),
('Router', 'Wi-Fi 6 router', 139.99),
('SSD', '1TB solid state drive', 119.99),
('USB Drive', '128GB USB 3.0', 24.99),
('Webcam', '1080p streaming webcam', 69.99),
('Power Bank', '10000mAh portable charger', 39.99),
('Microphone', 'Podcasting microphone', 89.99),
('Lamp', 'LED desk lamp with USB port', 29.99);

-- 20 Users
INSERT INTO users (name, email, password) VALUES
('Alice Johnson', 'alice@example.com', 'pass1'),
('Bob Smith', 'bob@example.com', 'pass2'),
('Charlie Doe', 'charlie@example.com', 'pass3'),
('Diana Prince', 'diana@example.com', 'pass4'),
('Ethan Hunt', 'ethan@example.com', 'pass5'),
('Fiona Glen', 'fiona@example.com', 'pass6'),
('George Wayne', 'george@example.com', 'pass7'),
('Hannah Brown', 'hannah@example.com', 'pass8'),
('Ian Carter', 'ian@example.com', 'pass9'),
('Julia King', 'julia@example.com', 'pass10'),
('Kevin Black', 'kevin@example.com', 'pass11'),
('Lily Rose', 'lily@example.com', 'pass12'),
('Mike Long', 'mike@example.com', 'pass13'),
('Nina White', 'nina@example.com', 'pass14'),
('Oscar Green', 'oscar@example.com', 'pass15'),
('Paula Moore', 'paula@example.com', 'pass16'),
('Quinn West', 'quinn@example.com', 'pass17'),
('Rachel Zane', 'rachel@example.com', 'pass18'),
('Steve Park', 'steve@example.com', 'pass19'),
('Tina Fey', 'tina@example.com', 'pass20');

-- 20 CartItems (user 1–5, product 1–5)
INSERT INTO cart_item (user_id, product_id, quantity) VALUES
(1, 1, 2),
(2, 2, 1),
(3, 3, 4),
(4, 4, 1),
(5, 5, 2),
(1, 6, 1),
(2, 7, 3),
(3, 8, 1),
(4, 9, 2),
(5, 10, 1),
(1, 11, 1),
(2, 12, 2),
(3, 13, 3),
(4, 14, 2),
(5, 15, 1),
(1, 16, 1),
(2, 17, 2),
(3, 18, 1),
(4, 19, 2),
(5, 20, 1);

-- 5 Orders (1 per user)
INSERT INTO orders (user_id, order_date, total) VALUES
(1, CURRENT_TIMESTAMP, 500.00),
(2, CURRENT_TIMESTAMP, 700.00),
(3, CURRENT_TIMESTAMP, 450.00),
(4, CURRENT_TIMESTAMP, 820.00),
(5, CURRENT_TIMESTAMP, 360.00);

-- 20 OrderItems (4 per order)
INSERT INTO order_item (order_id, product_id, quantity, price) VALUES
(1, 1, 1, 799.99),
(1, 2, 1, 199.99),
(1, 5, 1, 89.99),
(1, 10, 1, 149.99),

(2, 3, 1, 699.99),
(2, 6, 2, 49.99),
(2, 12, 1, 229.99),
(2, 17, 1, 39.99),

(3, 4, 1, 299.99),
(3, 7, 1, 129.99),
(3, 13, 1, 59.99),
(3, 14, 1, 139.99),

(4, 8, 1, 999.99),
(4, 9, 2, 249.99),
(4, 16, 1, 24.99),
(4, 20, 1, 29.99),

(5, 11, 1, 199.99),
(5, 15, 1, 119.99),
(5, 18, 1, 89.99),
(5, 19, 1, 89.99);
