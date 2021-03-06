package softvision.reactive.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import softvision.reactive.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, String> {

    Optional<Category> findByDescription(String description);
}
