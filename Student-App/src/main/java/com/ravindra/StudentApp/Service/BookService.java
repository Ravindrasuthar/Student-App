package com.ravindra.StudentApp.Service;

import com.ravindra.StudentApp.Model.Book;
import com.ravindra.StudentApp.Repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public String AddBook(Book book) {
        bookRepo.save(book);
        return "Book added";
    }

    public List<Book> GetAllBook() {
        return (List<Book>) bookRepo.findAll();
    }

    public Book GetBookById(long id) {
        return bookRepo.findById(id).orElseThrow();
    }

    public String UpdateBook(Book book) {
        List<Book> books = (List<Book>) bookRepo.findAll();
        for(Book b : books)
        {
            if(b.getBookId() == book.getBookId())
            {
                bookRepo.save(book);
                return "Book updated";
            }
        }
        return "Book can not be updated";
    }

    public String DeleteBookById(long id) {
        bookRepo.deleteById(id);
        return "Book deleted";
    }
}
