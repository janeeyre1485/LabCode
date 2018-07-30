package psi.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import psi.model.Item;

public interface ItemRepository extends MongoRepository<Item, String> {
}
