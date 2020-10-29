package com.forum.store;

import com.forum.model.Authority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepo extends CrudRepository<Authority, Integer> {

    Authority findByAuthority(String authority);
}
