
<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Contributing](#contributing)
* [License](#license)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project
 <img src="">
Employee-Crud-Rest is, as the name implies, a CRUD application that allows users to manage employees entirely through REST operations (get, post,put and delete)


* [Java](https://www.java.com/en/download/)
* [MySql](https://www.mysql.com)
* [Spring Framework](https://start.spring.io/)
* [Postman](https://getpostman.com)


<!-- GETTING STARTED -->
## Getting Started

To get a local copy of Employee-Crud-Rest up and running follow these simple example steps.

1) Open your terminal

2) Go to the directory where you want your copy of this repository to be copied to

3) Type ```git clone https://github.com/JulianoCamarra/CustomerCRM.git``` and it will copy

### Prerequisites

* JDK 1.8 or higher
* Apache Tomcat Server 9 (if running locally)
* MySQL JDBC Driver
* API Development Environment (such as Postman)


### Installation

#### Create a new database
1. Setup a new database schema with whatever name you choose

2. create the table  ```employee ``` in your database and the indicated name annotated by  ```name ``` in entity class  ```Employee ``` as the column names
 
 #### Setup database configuration properties
 
 3. Go to the ```application.properties``` file, located under ```src/main/resources```
 4. type in the username of your database connection in ```spring.datasource.username={your_database_connection_username}```
 
 5. type in the password of your database connection in ```spring.datasource.password={your_database_connection_password}```
 6. for ```spring.datasource.driverClassName```, you can specify the driver name of your database, or simply delete the configuration,
 as Spring Boot can determine the driver used for you.
 7.type in the url of your datasource in ```spring.datasource.url={your_database_connection_url}```. 
 
     Remember, the pattern of a datasource
 url is ```jdbc:{your_sql_dialect}://{host_name}:{port_number}/{your_database_name}```


<!-- USAGE EXAMPLES -->
## Usage

This application provides your basic CRUD features through REST methods. All responses are in JSON format.

#####
* To get all employees, use GET on  ```/employees ```

* To get an employee, use GET on  ```/employee/{employeeId} ```

* To add a new employee to the database, use POST on  ```/employees ```, click on Body in Postman and make sure data type is set to  ```JSON(application/json) ```
  
* To update an employee, use PUT on  ```/employees ``` update the entity in body

* To delete an employee, use DELETE on  ```/employees/{employeeId}



<!-- CONTRIBUTING -->
## Contributing

Any contributions made to this project would be **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch
3. Commit your Changes
4. Push to the Branch
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [Othneildrew -for the readme template](https://github.com/othneildrew/Best-README-Template)
* [Stackoverflow- for answering any of my questions](https://stackoverflow.com/) 


<!-- MARKDOWN LINKS & IMAGES -->
[build-shield]: https://img.shields.io/badge/build-passing-brightgreen.svg?style=flat-square
[contributors-shield]: https://img.shields.io/badge/contributors-1-orange.svg?style=flat-square
[license-shield]: https://img.shields.io/badge/license-MIT-blue.svg?style=flat-square
[license-url]: https://choosealicense.com/licenses/mit
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: https://raw.githubusercontent.com/othneildrew/Best-README-Template/master/screenshot.png
