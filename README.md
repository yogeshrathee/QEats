# QEats

## Project Overview

"QEats" is a high-performance food delivery application that allows users to browse nearby restaurants, view menus, manage their cart, and place orders. The backend is built using Java and Spring Boot, with MongoDB as the database. The application leverages RESTful APIs for seamless client-server communication and follows a structured architecture with controllers, services, and repositories.

## Technologies Used

- **Java**: Primary programming language for backend development.
- **Spring Boot**: Framework for building the backend application and simplifying RESTful web services creation.
- **MongoDB**: NoSQL database for storing restaurant, menu, and order data.
- **Gradle**: Build automation tool for managing project dependencies and building the application.
- **RESTful APIs**: Facilitates efficient client-server communication.
- **JUnit**: Used for writing and running tests to ensure functionality and reliability.
- **Shell Scripts**: Scripts for setting up MongoDB (`setup_mongo.sh`).

## Setup Instructions

1. **Clone the repository**:
    ```sh
    git clone <repository-url>
    ```

2. **Build the project using Gradle**:
    ```sh
    ./gradlew build
    ```

3. **Set up MongoDB**:
    - Make sure MongoDB is installed and running on your machine.
    - Run the setup script to initialize the database:
    ```sh
    ./setup_mongo.sh
    ```

4. **Run the application**:
    ```sh
    ./gradlew bootRun
    ```

5. **Access the application**:
    - The application should now be running on `http://localhost:8080`.

## Project Structure

- **`src/main/java/com/crio/qeats`**: Contains the main application code.
  - **`QEatsApplication.java`**: Main class to run the Spring Boot application.
  - **`controller/RestaurantController.java`**: Handles HTTP requests related to restaurants.
  - **`dto/Restaurant.java`**: Data Transfer Object for restaurant data.
  - **`services`**: Contains business logic for handling restaurant data.
  - **`repositories`**: Interacts with MongoDB for data operations.

- **`src/test`**: Contains unit and integration tests.
  - **Fixtures**: Sample data for testing different scenarios.

- **`setup_mongo.sh`**: Script to set up MongoDB for the project.

## What We Did Inside This Project

1. **Implemented RESTful Endpoints**: Developed endpoints to handle various functionalities such as fetching nearby restaurants, viewing menus, and managing the cart.

2. **Geospatial Queries**: Utilized MongoDB's geospatial capabilities to find nearby restaurants based on the user's location.

3. **Restaurant Search**: Created a search functionality that allows users to search for restaurants by name or cuisine.

4. **Cart Management**: Implemented features to add items to the cart, update item quantities, and remove items from the cart.

5. **Order Placement**: Developed the order placement process, including order creation, updating order status, and fetching order history.

6. **Optimized Database Queries**: Ensured efficient data retrieval by optimizing MongoDB queries and using proper indexing.

7. **Testing**: Wrote comprehensive unit and integration tests using JUnit to ensure the application's functionality and reliability.

8. **Performance Optimization**: Conducted load testing and performance tuning to handle high traffic and ensure quick response times.

## Potential

1. **"QEats" project and its main features**
   - "QEats" is a food delivery application that allows users to browse nearby restaurants, view menus, manage their cart, and place orders. The backend is built using Java and Spring Boot, with MongoDB as the database. It leverages RESTful APIs for client-server communication and follows a structured architecture with controllers, services, and repositories.

2. **Technologies use in this project**
   - We used Java for the primary development language and Spring Boot to simplify the creation of RESTful web services. MongoDB was chosen for its flexibility and scalability in handling data. Gradle was used for build automation and dependency management. RESTful APIs facilitated efficient client-server communication, and JUnit was used for testing to ensure reliability and functionality.

3. **Handle data storage and management in the "QEats"**
   - We used MongoDB as the NoSQL database for storing data related to restaurants, menus, and orders. The repository layer in Spring Boot interacted with MongoDB to perform CRUD operations. This setup provided flexibility and scalability in managing the application's data.

4. **Challenges faced during the development of "QEats" and how did overcome them**
   - One challenge was ensuring efficient database queries for quick response times. We optimized queries and utilized proper indexing in MongoDB. Another challenge was handling high traffic during peak hours, which we addressed by implementing efficient RESTful endpoints and optimizing the application's performance.

5. **Architecture of the "QEats" backend**
   - The backend follows a layered architecture. The controller layer handles HTTP requests and responses. The service layer contains business logic, processing data received from controllers. The repository layer interacts with MongoDB for data operations. This separation of concerns ensures modularity and maintainability.

6. **Reliability and functionality of the application**
   - We wrote comprehensive unit and integration tests using JUnit. These tests covered various scenarios to ensure the application's reliability and functionality. Additionally, we used sample data (fixtures) for testing different use cases and validating the application's behavior.

7. **Specific feature or functionality implemented in the "QEats"**
   - One specific feature I implemented was the restaurant search functionality. It allows users to search for nearby restaurants based on their location. This involved developing RESTful endpoints in the controller, implementing business logic in the service layer, and performing geospatial queries in MongoDB to fetch the relevant restaurant data.

8. **Handle performance optimization in the "QEats"**
   - Performance optimization was handled by writing efficient database queries, using proper indexing in MongoDB, and optimizing the RESTful endpoints for quick response times. Additionally, we conducted load testing to identify and resolve potential bottlenecks, ensuring the application performed well under high traffic conditions.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
