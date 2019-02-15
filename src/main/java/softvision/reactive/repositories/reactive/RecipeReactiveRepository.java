package softvision.reactive.repositories.reactive;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import softvision.reactive.domain.Recipe;

public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String>{
}
