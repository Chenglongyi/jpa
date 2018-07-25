package com.example.service;

import com.example.dao.PostsRepository;
import com.example.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostsServiceImpl implements PostsService {
    @Autowired
    PostsRepository postsRepository;

    @Override
    public Posts getPostByTitle(String title) {
        return postsRepository.findPosts(title);
    }

    @Override
    public Page<Posts> getPagePosts(Pageable pageable) {
        return postsRepository.getPagePosts(pageable);

    }
}
