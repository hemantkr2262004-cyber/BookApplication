package BookApplication.demo.Service;

import BookApplication.demo.Entity.Book;
import BookApplication.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book) {
      return bookRepository.save(book);
    }
}
