package guru.springframework.spring5webbapp.repositories;

import guru.springframework.spring5webbapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
