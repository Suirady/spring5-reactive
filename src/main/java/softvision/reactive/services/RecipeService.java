package softvision.reactive.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import softvision.reactive.commands.RecipeCommand;
import softvision.reactive.domain.Recipe;

public interface RecipeService {

    Flux<Recipe> getRecipes();

    Mono<Recipe> findById(String id);

    Mono<RecipeCommand> findCommandById(String id);

    Mono<RecipeCommand>  saveRecipeCommand(RecipeCommand command);

    Mono<Void> deleteById(String idToDelete);
}
