![Screen Shot 2024-12-07 at 19 21 19](https://github.com/user-attachments/assets/f1f75279-cb4c-48b3-bd5d-305fe1970ecd)


![Screen Shot 2024-12-07 at 19 21 34](https://github.com/user-attachments/assets/52871917-5c46-4180-b717-697ce8e2b7f9)


![Screen Shot 2024-12-07 at 19 22 02](https://github.com/user-attachments/assets/fd024fd7-f163-4997-874d-7d20fe28c3de)


![Screen Shot 2024-12-07 at 19 22 11](https://github.com/user-attachments/assets/e9750eba-a803-4ab4-a563-2969301328c1)



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
