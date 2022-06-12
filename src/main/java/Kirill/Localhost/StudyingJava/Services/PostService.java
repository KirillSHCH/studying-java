package Kirill.Localhost.StudyingJava.Services;

import Kirill.Localhost.StudyingJava.Entities.PostEntity;
import Kirill.Localhost.StudyingJava.Models.Post;
import Kirill.Localhost.StudyingJava.Repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public Iterable<PostEntity> findAll() {
        return postRepo.findAll();
    }
}
