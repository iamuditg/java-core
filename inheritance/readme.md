Inheritance in the Vehicle Hierarchy

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class (subclass) to inherit properties and behaviors from another class (superclass). In Java, inheritance is achieved using the extends keyword, where a subclass is declared with the superclass as its parent.

In this example, we have a vehicle hierarchy consisting of three classes: Vehicle, Car, and Motorcycle.

The Vehicle Class
The Vehicle class is the base class in the hierarchy, representing common properties shared by all vehicles. It has private member variables make, model, and year, along with a constructor to initialize them. The class provides getter methods for accessing these properties and a displayInfo() method to print vehicle details.

The Car Class
The Car class is a subclass of Vehicle, representing a specific type of vehicle. It has an additional private member variable numberOfDoors, along with a constructor to initialize it. The class extends the Vehicle class and overrides the displayInfo() method to include the number of doors specific to cars.

The Motorcycle Class
The Motorcycle class is another subclass of Vehicle, representing another specific type of vehicle. It has an additional private member variable hasSidecar, along with a constructor to initialize it. The class also extends the Vehicle class and overrides the displayInfo() method to include whether the motorcycle has a sidecar.

The VehicleApp Class
The VehicleApp class contains the main() method, where we create instances of Car and Motorcycle. Despite being subclasses of Vehicle, we can store them in the same superclass reference and call the displayInfo() method on each object. This demonstrates how inheritance allows treating objects uniformly through a common interface.

In summary, inheritance in the vehicle hierarchy example promotes code reusability, as both Car and Motorcycle classes inherit properties and methods from the Vehicle class. Additionally, it helps create a hierarchical class structure that reflects the relationship between different vehicle types, making the code more organized and maintainable.