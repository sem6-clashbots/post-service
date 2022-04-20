package com.clashbots.post.service;

import com.clashbots.post.entity.Post;
import com.clashbots.post.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post) {
        log.info("inside save post method of PostService");
        return postRepository.save(post);
    }

    public Post findPostById(Long postId) {
        log.info("inside find post by id method of PostService");
        return postRepository.findByPostId(postId);
    }
}
