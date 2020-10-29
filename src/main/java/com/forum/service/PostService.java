package com.forum.service;

import com.forum.store.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.forum.model.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private final PostRepo posts;

    @Autowired
    public PostService(PostRepo posts) {
        this.posts = posts;
    }

    public List<Post> getAll() {
        List<Post> rsl = new ArrayList<>();
        posts.findAll().forEach(rsl::add);
        return rsl;
    }

    public Post findById(long id) {
        return posts.findById(id).get();
    }

    public Post save(Post post) {
        posts.save(post);
        return post;
    }
}
