package com.example.dao;

import com.example.model.Posts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Posts,Integer> {

    @Query("select  p from Posts p where p.title=:title")
    Posts findPosts(@Param("title")String title);

    @Query("select p from Posts p")
    Page<Posts> getPagePosts(Pageable pageable);
}
