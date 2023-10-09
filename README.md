# Project Name
Student App

# Frameworks and Language Used
**Spring Boot** 3.1.4
**Java** 17
**Maven** 3.8.1

# Data Flow


_**Controller:**_ The controller has endpoints for create, read, update and delete operation for Student, Course, Book, Address and Laptop Entity. 

The @PostMapping annotation is used for the add/student or add/laptop or add/course or add/book or add/address endpoint to handle HTTP POST requests with a JSON request body containing an required object.
```
@PostMapping("student")
    public String AddStudent(@RequestBody Student student)
    {
        return studentService.AddStudent(student);
    }
```
```
@PostMapping("laptop")
    public String AddLaptop(@RequestBody Laptop laptop)
    {
        return laptopService.AddLaptop(laptop);
    }
```
```
@PostMapping("course")
    public String AddCourse(@RequestBody Course course)
    {
        return courseService.AddCourse(course);
    }
```
```
@PostMapping("book")
    public String AddBook(@RequestBody Book book)
    {
        return bookService.AddBook(book);
    }
```
```
@PostMapping("address")
    public String AddAddress(@RequestBody Address address)
    {
        return addressService.AddAddress(address);
    }
```

The @GetMapping annotation is used for the get/all/student, get/student/by/{id} or get/all/laptop, get/laptop/by/{id} or get/all/course, get/course/by/{id} or get/all/book, get/book/by/{id} or get/all/address, get/address/by/{id} endpoints to handle HTTP GET requests with and without a path variable for the student ID or laptop ID or course ID or book ID or address ID, respectively. The @PathVariable annotation is used to extract ID from the request URL and pass it to corresponding method.
```
@GetMapping("all/student")
    public List<Student> GetAllStudent()
    {
        return studentService.GetAllStudent();
    }

    @GetMapping("student/by/{Id}")
    public Student GetStudentById(@PathVariable long Id)
    {
        return studentService.GetStudentById(Id);
    }
```
```
@GetMapping("all/laptop")
    public List<Laptop> GetAllLaptop()
    {
        return laptopService.GetAllLaptop();
    }

    @GetMapping("laptop/by/{Id}")
    public Laptop GetLaptopById(@PathVariable long Id)
    {
        return laptopService.GetLaptopById(Id);
    }
```
```
@GetMapping("all/course")
    public List<Course> GetAllCourse()
    {
        return courseService.GetAllCourse();
    }

    @GetMapping("course/by/{Id}")
    public Course GetCourseById(@PathVariable long Id)
    {
        return courseService.GetCourseById(Id);
    }
```
```
@GetMapping("all/book")
    public List<Book> GetAllBook()
    {
        return bookService.GetAllBook();
    }

    @GetMapping("book/by/{Id}")
    public Book GetBookById(@PathVariable long Id)
    {
        return bookService.GetBookById(Id);
    }
```
```
@GetMapping("all/address")
    public List<Address> GetAllAddress()
    {
        return addressService.GetAllAddress();
    }

    @GetMapping("address/by/{Id}")
    public Address GetAddressById(@PathVariable long Id)
    {
        return addressService.GetAddressById(Id);
    }
```

The @PutMapping annotation is used for the update/student or update/laptop or update/course or update/book or update/address endpoint to handle HTTP UPDATE requests with a requestbody as required object.
```
 @PutMapping("student")
    public String UpdateStudent(@RequestBody Student student)
    {
        return studentService.UpdateStudent(student);
    }
```
```
@PutMapping("laptop")
    public String UpdateLaptop(@RequestBody Laptop laptop)
    {
        return laptopService.UpdateLaptop(laptop);
    }
```
```
 @PutMapping("course")
    public String UpdateCourse(@RequestBody Course course)
    {
        return courseService.UpdateCourse(course);
    }
```
```
 @PutMapping("book")
    public String UpdateBook(@RequestBody Book book)
    {
        return bookService.UpdateBook(book);
    }
```
```
 @PutMapping("address")
    public String UpdateAddress(@RequestBody Address address)
    {
        return addressService.UpdateAddress(address);
    }
```

The @DeleteMapping annotation is used for the delete/student/by/{Id} or delete/laptop/by/{Id} or delete/course/by/{Id} or delete/book/by/{Id} or delete/address/by/{Id} endpoint to handle HTTP DELETE requests with a path variable for the required object ID.
```
@DeleteMapping("Student/by/{Id}")
    public String DeleteStudentById(@PathVariable long Id)
    {
        return studentService.DeleteStudentById(Id);
    }
```
```
@DeleteMapping("laptop/by/{Id}")
    public String DeleteLaptopById(@PathVariable long Id)
    {
        return laptopService.DeleteLaptopById(Id);
    }
```
```
 @DeleteMapping("course/by/{Id}")
    public String DeleteCourse(@PathVariable List<Long> Id)
    {
        return courseService.DeleteCourse(Id);
    }
```
```
@DeleteMapping("book/by/{Id}")
    public String DeleteBookById(@PathVariable long Id)
    {
        return bookService.DeleteBookById(Id);
    }
```
```
@DeleteMapping("address/by/{Id}")
    public String DeleteAddressById(@PathVariable long Id)
    {
        return addressService.DeleteAddressById(Id);
    }
```

The controller class also has an autowired instance of the StudentService, LaptopService, CourseService, BookService and AddressService interface to handle business logic for the Student App.

This implementation demonstrates a basic setup for a REST API controller in Spring Boot, but it can be expanded upon and customized based on specific requirements for the Student App.


_**Services**:_ The services layer contains the business logic of the application. It receives requests from the controller, performs necessary computations or data manipulations, and interacts with the repository layer to access data.

_**Repository:**_ The repository layer is responsible for interacting with the database. It uses Spring Data JPA to perform CRUD (create, read, update, delete) operations on entities.

In the application.properties all the text required for connection with MySQL database are written.
```
spring.datasource.url=jdbc:mysql://localhost:3306/Student_DB
spring.datasource.username=root
spring.datasource.password=Ravi.067456
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true
```

# Database Structure Used
I have used MySQL as DataBase

# Project Summary
In this project i have created different endpoints, custom finders and @OneToOne, @OneToMany, @ManyToOne mapping between required model.
