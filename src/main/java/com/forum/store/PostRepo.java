package com.forum.store;

import org.springframework.data.repository.CrudRepository;
import com.forum.model.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends CrudRepository<Post, Long> {
}
