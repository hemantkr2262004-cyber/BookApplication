package BookApplication.demo.Controller;


import BookApplication.demo.Entity.Book;
import BookApplication.demo.Service.BookService;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
@RestController
@RequestMapping
public class BookController {

    private final BookService bookService;
    @Autowired // it is used to dependency inject book serive to controller class;
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
     Book saveBook = bookService.addBook(book);

        return ResponseEntity.ok(saveBook);
    }
}
