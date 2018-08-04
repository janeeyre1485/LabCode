package psi.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;
import psi.model.Chapter;

public interface ChapterRepository extends MongoRepository<Chapter, String> {
}
