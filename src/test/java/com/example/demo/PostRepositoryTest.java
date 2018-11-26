package com.example.demo;

import com.example.demo.entities.Post;
import com.example.demo.repositories.PostRepository;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {

  @Autowired
  PostRepository postRepository;

  @After
  public void cleanup() {
    /**
     이후 테스트 코드에 영향을 끼치지 않기 위해
     테스트 메소드가 끝날때 마다 respository 전체 비우는 코드
     **/
    postRepository.deleteAll();
  }

  @Test
  public void createPostAndLoad() {

    //given
    Post member = new Post();

    Post post = new Post("테스트 게시글","장윤정","테스트 본문");
    postRepository.save(post);

    //when
    List<Post> postsList = postRepository.findAll();

    //then
    Post selectedPost = postsList.get(0);

    assertThat(selectedPost.getTitle()).isEqualTo("테스트 게시글");

  }

}
