package Kirill.Localhost.StudyingJava.Repositories;

import Kirill.Localhost.StudyingJava.Entities.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<PostEntity, Long> {
}
