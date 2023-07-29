Encapsulation in Java 

This Java program demonstrates the concept of encapsulation using a simple banking system as an example. Encapsulation is one of the four fundamental OOP concepts, which helps in hiding the internal implementation details of a class and protecting its data from direct access.

The program consists of three classes: Customer, Account, and BankingApp.

The Customer class represents a bank customer and has private member variables for the customer's name, address, and phone number. The class provides public getter methods to access this information.

The Account class represents a bank account and has private member variables for the account number, balance, and the account holder (a Customer object). The class provides public getter methods for the account number, balance, and the account holder, and also methods for depositing and withdrawing funds from the account. The deposit() and withdraw() methods ensure that the operations are valid before modifying the account balance.

In the BankingApp class, we create a new Customer object and a new Account object for the customer. We then perform some operations on the account, such as depositing and withdrawing funds, and display the updated account balance.

The output of the program will show the details of the account and the balance after performing the operations.

This example illustrates how encapsulation allows us to protect the internal data of the classes and provide controlled access through public methods, ensuring data integrity and security in a banking application.