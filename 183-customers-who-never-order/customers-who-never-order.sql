# Write your MySQL query statement below
SELECT name AS Customers
from Customers 
LEFT JOIN Orders
ON Customers.id = Orders.customerID
where Orders.CustomerId IS NULL