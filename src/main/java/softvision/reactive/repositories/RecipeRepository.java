package softvision.reactive.repositories;

import org.springframework.data.repository.CrudRepository;
import softvision.reactive.domain.Recipe;


public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
