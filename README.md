## MOVIE RESERVATION SYSTEM

The Movie Ticket Reservation System is a Java-based application designed to streamline the process of booking movie tickets. The system allows users to browse movies, view showtimes, select seats, and securely reserve tickets from their devices. The project leverages Java's robust and scalable nature to provide a seamless user experience.

## Key Features

- **User Authentication**: Secure login and registration for users.
- **Movie Browsing**: Users can browse a list of available movies with details such as genre, duration, and rating.
- **Showtime Selection**: View and select from available showtimes for each movie.
- **Seat Selection**: Interactive seating arrangement for users to choose their preferred seats.
- **Secure Payment Gateway**: Integration with payment gateways for secure transactions.
- **Booking History**: Users can view their booking history and manage their reservations.

## Technology Stack

- **Programming Language**: Java
- **Integrated Development Environment (IDE)**: Visual Studio Code (VSCode)
- **Database Management System (DBMS)**: MySQL
- **Frameworks**: Spring Framework for backend development
- **User Interface**: JavaFX for developing the user interface
- **Payment Gateway**: Integration with popular payment gateways for handling transactions

## Installation and Setup

1. **Clone the repository**:
    ```sh
    git clone https://github.com/your-repository-url.git https://github.com/Abhivesh-Shukla/Movie-Reservation-System.git
    cd Movie-Reservation-System
    ```

2. **Setup Database**:
    - Install MySQL and create a database named `movie_ticket_system`.
    - Import the database schema from the `abc.sql`.

3. **Configure Database Connection**:
    - Update the database connection details in the `application.properties` file located in the `src/main/resources` directory.

4. **Build and Run the Application**:
    - Open the project in Visual Studio Code.
    - Build the project using the following command:
      ```sh
      mvn clean install
      ```
    - Run the application using:
      ```sh
      mvn spring-boot:run
      ```

## Usage

- **Register/Login**: Users need to register an account or log in if they already have an account.
- **Browse Movies**: Users can browse through the list of movies available for booking.
- **Select Showtime and Seats**: Choose a convenient showtime and select preferred seats from the interactive seat map.
- **Make Payment**: Proceed to the payment gateway to complete the transaction securely.
- **View Booking History**: Access and manage previous bookings from the user's profile section.

## Results

- **User Experience**: The system was tested for user experience and received positive feedback for its intuitive design and ease of use.
- **Performance**: The application performed efficiently under various test scenarios, handling multiple simultaneous bookings without any noticeable lag.
- **Security**: The integration with secure payment gateways ensured safe and secure transactions for users.
- **Scalability**: The system demonstrated good scalability, capable of handling increased load with minimal performance degradation.
