# mongodb-order-service
A very basic service created using springboot. The purpose was to learn to use mongodb as database in springboot. 
This was done by using MongoRepository interface which is similar to CrudRepository used for RDBMS databases. 
There are two collections namely account and inventory. Account contains user info and orders list. A user can only place
an order if the inventory item with same name has stock greater than 0. 

Good for learning the minimal setup required for a service written using springboot with mongodb.
