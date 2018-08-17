package psi.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import psi.model.User;

public interface UserRepository extends MongoRepository<User,String> {

    User findFirstByUsername(String email);
   
}
