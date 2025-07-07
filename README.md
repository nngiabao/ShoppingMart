
# E-commerce Project: **Shopping Mart** Diagrams & Notes
---

## 1. Use Case Diagram

**Actors:**
- User
- Admin

**User Use Cases:**
- Register/Login
- View Products
- Search Products
- Add to Cart
- Place Order
- View Order History
- Write Blog Comment

**Admin Use Cases:**
- Add/Edit/Delete Products
- Manage Categories
- Manage Orders
- Create Promotions
- View Reports

---

## 2. E-R Diagram

**Entities:**
- `Users` (id, name, email, password)
- `Product` (id, name, description, price, image_url, category_id, stock_quantity, timestamps)
- `Category` (id, name)
- `Cart_Item` (id, user_id, product_id, quantity)
- `Orders` (id, user_id, order_date, total)
- `Order_Item` (id, order_id, product_id, quantity, price)
- `Promotion` (id, title, description, discount_percent, start_date, end_date)
- `Blog_Comment` (id, blog_id, user_id, content, created_at)

**Relationships:**
- One `User` can have many `Cart_Item`s and `Orders`
- One `Order` can have many `Order_Item`s
- Each `Order_Item` is linked to a `Product`
- Each `Product` belongs to a `Category`
- One `User` can write many `Blog_Comment`s

---

## 3. Data Flow Diagram (DFD)

**Level 0:**
- User interacts with Web Application
- Web App interacts with:
  - Product Catalog
  - Cart System
  - Order Processor
  - Blog System
  - Database

**Level 1 Examples:**
- Cart System: Add to cart → Update cart_item table
- Order Processor: Checkout → Write to orders & order_item tables
- Admin: CRUD operations on product, category, promotion

---

## 4. Activity Diagrams

### For **User**:
- Login/Register → Browse Products → Add to Cart → Checkout → Place Order → Logout

(images/user_activity_diagram.png)


### For **Admin**:
- Login → Manage Products/Categories → View Orders → Create Promotion → Logout
  
(images/admin_activity_diagram.png)

---

## 5. Sequence Diagram

**User Purchase Flow:**
- User → Web App: Select Product
- Web App → Product Service: Get Product Details
- User → Web App: Add to Cart
- Web App → Cart Service: Update Cart
- User → Web App: Place Order
- Web App → Order Service: Create Order
- Order Service → DB: Save Order & Order Items
- Web App → User: Order Confirmation

---

*This markdown file summarizes the system analysis of your e-commerce project.*

---

## 6. Data Flow Diagram (DFD)

### Level 0 - Context Diagram
- **External Entities**:
  - User
  - Admin

- **Processes**:
  - Product Management
  - Cart Management
  - Order Management
  - Blog Interaction

- **Data Stores**:
  - User DB
  - Product DB
  - Orders DB
  - Blog DB

### Level 1 Example - Order Process
1. User selects product
2. Product data is fetched from DB
3. User places order
4. System stores order & order items into DB
5. Order confirmation sent back

---

## 7. Activity Diagram

### User:
```
Start
 ↓
Login/Register
 ↓
Browse Products
 ↓
Add to Cart
 ↓
View Cart
 ↓
Place Order
 ↓
Logout
End
```

### Admin:
```
Start
 ↓
Login
 ↓
Manage Products (Add/Edit/Delete)
 ↓
Manage Categories
 ↓
View Orders
 ↓
Create Promotions
 ↓
Logout
End
```

---

## 8. Sequence Diagram

### User Purchase Flow:
```
User → Web: View Products
Web → ProductService: getAllProducts()
ProductService → DB: SELECT * FROM product
Web → User: Show Product List

User → Web: Add Product to Cart
Web → CartService: addToCart(productId, userId)

User → Web: Checkout
Web → OrderService: createOrder(userId, cartItems)
OrderService → DB: INSERT INTO orders...
OrderService → DB: INSERT INTO order_items...

Web → User: Order Confirmation
```

---
