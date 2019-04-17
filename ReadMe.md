# CTS Weather App
Springboot application with RestFul endpoints having JPA one-to-many and many-to-one demo using H2

This project demonstrates One-To-Many and Many-To-One relation between two entities using spring boot and Spring Data JPA.

## Pre-requisites
1. SpringBoot
2. Spring STS/Eclipse/Intellij

## How to Run
1. Clean/Build in the IDE
2. Run as SpringBoot App
3. http://localhost:8080/weather should be up and running
4. Additional data can be populated in the SpringBootCtsWeatherApplication file.

## RestFul Endpoints
1. /weather would fetch weather result for all the states and cities under it
2. /weather/<id> would fetch weather result for a state given its id
3. /weather/state/<state> would fetch for a particular state. 

## Contributing
Pull requests are welcome. 
For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.
