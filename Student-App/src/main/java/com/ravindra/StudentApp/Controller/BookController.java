package com.ravindra.StudentApp.Controller;


import com.ravindra.StudentApp.Model.Book;
import com.ravindra.StudentApp.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("book")
    public String AddBook(@RequestBody Book book)
    {
        return bookService.AddBook(book);
    }

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

    @PutMapping("book")
    public String UpdateBook(@RequestBody Book book)
    {
        return bookService.UpdateBook(book);
    }

    @DeleteMapping("book/by/{Id}")
    public String DeleteBookById(@PathVariable long Id)
    {
        return bookService.DeleteBookById(Id);
    }
}
