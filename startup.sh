mongoimport -u root -p root --authenticationDatabase admin --host mongodb --db ecommerce --collection Customer --drop --type json --file /Customer.json --jsonArray
mongoimport -u root -p root --authenticationDatabase admin --host mongodb --db ecommerce --collection Address --drop --type json --file /Address.json --jsonArray
mongoimport -u root -p root --authenticationDatabase admin --host mongodb --db ecommerce --collection Product --drop --type json --file /Product.json --jsonArray
mongoimport -u root -p root --authenticationDatabase admin --host mongodb --db ecommerce --collection Order --drop --type json --file /Order.json --jsonArray
mongoimport -u root -p root --authenticationDatabase admin --host mongodb --db ecommerce --collection Order_Product --drop --type json --file /Order_Product.json --jsonArray