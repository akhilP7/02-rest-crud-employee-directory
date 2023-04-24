# Spring_REST_CRUD_Employee_Directory

1. Create a db and a table with required fields
2. Create a spring boot project using spring initializer
    - add web,
    - JPA,
    - mySQL connector,
    - devtools dependencies
3. Update application.properties file for the jdbc connection with the url, username, password
4. Create an Employee entity with the all the fields annotated with matching column names from the table.
5. Create an EmployeeDAO and its implementation(annotate with @Repository) and implement all the methods from the interface.
6. Use a service layer(EmployeeService) to delegates the calls to EmployeeDAO
7. Create an EmployeeRestController with rest annotation and inject the EmployeeService and implement all the http mappings.