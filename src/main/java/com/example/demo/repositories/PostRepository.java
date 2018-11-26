package com.example.demo.repositories;

import com.example.demo.entities.Post;
import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends JpaRepository<Post, Integer> { }
