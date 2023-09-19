insert into category(categoryid, categoryname) values(1,'Fashion'),(2,'Electronics'),(3,'Books'),(4,'Groceries'),(5,'Medicines');
insert into role(roleid, role) values(1,'CONSUMER'),(2,'SELLER');
insert into app_User(userid, username, password) values(1,'jack', 'pass_word'),(2,'bob', 'pass_word'),(3,'apple', 'pass_word'),(4,'glaxo', 'pass_word');
insert into cart(cartid, totalAmount, userid) values(1,20,1),(2,0,2);
insert into userrole(userid,roleid) values(1,1),(2,1),(3,2),(4,2);
insert into product(productid,price,productname,categoryid,sellerid) values(1,29190,'ipad',2,3),(2,10,'Crocin',5,4);
insert into cart_product(cpid,cartid,productid,quantity) values(1,1,2,2);