# Exercise # 3 - Spring Data JPA (Id generation and Finder Methods)


This exercise brings new requirements on the previous customerdata project.

### Id generation
1. Make id an auto-increment field both in the database and in the JPA entity.
	- You no longer should set the id field, when saving.
	- The id should be incremented automatically



### Spring Data Finder Methods

2. Accomplish without writing any sql statements. Just by using the finder methods with correct method naming conventions :  
	a. Find Customer By Email and Name  

	b. Find By partial email - that is you are going to use the like clause in your method name (whatever email a customer has if you simply type in a part of it, it should search and return all the customers whose email match with the provided string)  
	
	c. Given a set of IDs find all the customers -->	Use IN clause in your finderMethod name		
