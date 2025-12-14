package com.instagram.controller;

import com.instagram.model.Post;
import com.instagram.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/create")
    public Post createPost(@RequestBody Post post) {
        return postRepository.save(post);
    }

    @GetMapping
    public Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
