package com.example.controller;

import com.example.model.Posts;
import com.example.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PostsController {
    @Autowired
    private PostsService postsService;

    @RequestMapping(value = "/getPosts.do",method = RequestMethod.GET)
    public Posts getPosts(@Param("title")String title){
        return postsService.getPostByTitle(title);
    }

    @RequestMapping(value = "/PagePosts.do",method = RequestMethod.GET)
    public List<Posts> getPosts(){
        Pageable pageable = new PageRequest(0,3);
        return postsService.getPagePosts(pageable).getContent();
    }
}
