package softvision.reactive.repositories;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import softvision.reactive.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, String> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
