package com.example.service;

import com.example.model.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostsService {
    Posts getPostByTitle(String title);

    Page<Posts> getPagePosts(Pageable pageable);
}
