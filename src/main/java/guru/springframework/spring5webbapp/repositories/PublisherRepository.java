package guru.springframework.spring5webbapp.repositories;

import guru.springframework.spring5webbapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
