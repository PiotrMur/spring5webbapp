package guru.springframework.spring5webbapp.repositories;

import guru.springframework.spring5webbapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
