# Inventory Alert System

This project is a simple Spring Boot-based Inventory Alert System that checks the stock level of inventory items and alerts when the stock level is low.

## Features:
- The system provides an endpoint `/check-stock` where you can check the stock level of an item.
- It returns an alert if the stock of an item is below a certain threshold (10 in this case).

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- Spring Boot

### Installation

1. Clone the repository or download the project files.
2. Navigate to the root folder of the project.
3. Run the application with the following command:

   ```bash
   mvn spring-boot:run
   ```

4. Once the application is running, you can use the following endpoint:

   ```
   GET /check-stock?itemName=<item-name>
   ```

   Example:
   ```
   GET /check-stock?itemName=item1
   ```

   This will check if `item1` has sufficient stock and return an alert if it's low on stock.

## License
This project is open-source and available under the MIT License.
