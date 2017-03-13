package com.polytech.repository;

import com.polytech.business.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepositoryImpl implements PostRepository {
    private List<Post> db = new ArrayList<Post>();

    public void save(Post post) {
        db.add(post);
    }

    public List<Post> findAll() {
        return db;
    }
}
