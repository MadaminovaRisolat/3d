


--- Project Description

This Java project demonstrates the concept of polymorphism by creating an interface for 3D shapes and implementing it in three classes: Sphere, Cylinder, and Cube. 
Each class calculates the surface area and volume of its respective shape based on its unique mathematical formulas.

The program generates random objects of these shapes, calculates their surface area and volume, and displays the results. 
By using polymorphism, the program treats all shapes uniformly while allowing each shape to define its own behavior for surface area and volume calculation.


--- How Polymorphism is Used

Polymorphism is achieved in this project through the following:

Interface Implementation:
The Shape3DInterface defines two methods: surfaceArea() and volume().
Each shape class (Sphere, Cylinder, Cube) implements these methods with its specific formulas.
Uniform Handling of Objects:
A list of Shape3DInterface references is used to store different shape objects.
Despite being different types (e.g., Sphere, Cylinder, Cube), all objects are treated uniformly through the interface.
Dynamic Behavior:
At runtime, the appropriate surfaceArea() and volume() methods are invoked for each object, demonstrating dynamic method dispatch.
This allows the program to handle various shapes interchangeably without knowing their specific types in advance.
