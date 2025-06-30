-- Insert Categories first
INSERT INTO category (name) VALUES
('Electronics'),
('Office Supplies'),
('Furniture'),
('Accessories'),
('Storage');

-- 20 Products with complete data matching the schema
INSERT INTO product (name, description, price, image_url, category_id, stock_quantity, is_active) VALUES
('Laptop', '14 inch business laptop with high performance', 799.99, '/images/product-thumb-1.png', 1, 15, true),
('Headphones', 'Noise cancelling wireless headphones for immersive audio', 199.99, '/images/product-thumb-2.png', 1, 25, true),
('Smartphone', 'Latest Android smartphone with advanced features', 699.99, '/images/product-thumb-11.jpg', 1, 30, true),
('Monitor', '27 inch 4K monitor for professional work', 299.99, '/images/product-thumb-12.jpg', 1, 12, true),
('Keyboard', 'Mechanical keyboard with RGB lighting', 89.99, '/images/product-thumb-13.jpg', 4, 40, true),
('Mouse', 'Wireless ergonomic mouse for comfortable use', 49.99, '/images/product-thumb-14.jpg', 4, 50, true),
('Printer', 'All-in-one wireless printer for home and office', 129.99, '/images/product-thumb-1.png', 2, 8, true),
('Camera', 'DSLR camera for professional photography', 999.99, '/images/product-thumb-2.png', 1, 5, true),
('Tablet', '10 inch Android tablet for entertainment', 249.99, '/images/product-thumb-11.jpg', 1, 20, true),
('Smartwatch', 'Fitness and health tracker with smart features', 149.99, '/images/product-thumb-12.jpg', 4, 35, true),
('Desk', 'Wooden office desk with spacious surface', 199.99, '/images/product-thumb-13.jpg', 3, 10, true),
('Chair', 'Ergonomic office chair for long hours', 229.99, '/images/product-thumb-14.jpg', 3, 15, true),
('Speaker', 'Bluetooth portable speaker with excellent sound', 59.99, '/images/product-thumb-1.png', 1, 45, true),
('Router', 'Wi-Fi 6 router for fast internet connection', 139.99, '/images/product-thumb-2.png', 1, 18, true),
('SSD', '1TB solid state drive for fast storage', 119.99, '/images/product-thumb-11.jpg', 5, 25, true),
('USB Drive', '128GB USB 3.0 flash drive', 24.99, '/images/product-thumb-12.jpg', 5, 60, true),
('Webcam', '1080p streaming webcam for video calls', 69.99, '/images/product-thumb-13.jpg', 1, 22, true),
('Power Bank', '10000mAh portable charger for devices', 39.99, '/images/product-thumb-14.jpg', 4, 40, true),
('Microphone', 'Professional podcasting microphone', 89.99, '/images/product-thumb-1.png', 1, 12, true),
('Lamp', 'LED desk lamp with USB charging port', 29.99, '/images/product-thumb-2.png', 2, 30, true);

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
