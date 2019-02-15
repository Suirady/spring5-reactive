package softvision.reactive.services;

import reactor.core.publisher.Flux;
import softvision.reactive.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
