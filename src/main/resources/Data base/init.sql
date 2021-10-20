drop table IF EXISTS product;
drop table IF EXISTS category;
drop table IF EXISTS users;
drop table IF EXISTS basket;

create table Category(
                         Id int primary key AUTO_INCREMENT,
                         Name varchar(50)
);

create table Product(
                        Id int primary key AUTO_INCREMENT,
                        CategoryId int,
                        Name varchar(50),
                        Description varchar(150),
                        Cost int,
                        FOREIGN KEY (CategoryId)  REFERENCES Category(Id)
);

create table Users (
                      Id int primary key AUTO_INCREMENT,
                      UserName varchar(50),
                      Password varchar(50),
                      Email varchar(50)
);


create table Basket(
                       Id int primary key AUTO_INCREMENT,
                       UserId int,
                       ProductId int,
                       FOREIGN KEY (UserId)  REFERENCES User(Id),
                       FOREIGN KEY (ProductId)  REFERENCES Product(Id)
);

create table transaction(
                            Id int primary key AUTO_INCREMENT,
                            UserId int,
                            summa int,
                            FOREIGN KEY (UserId)  REFERENCES User(Id)
);