package com.clashbots.post.controller;

//import com.clashbots.comment.RabbitmqSender;
import com.clashbots.post.entity.Post;
import com.clashbots.post.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@Slf4j
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/")
    public Post saveComment(@RequestBody Post post){
        log.info("inside save post method of PostController");
        return postService.savePost(post);
    }

    @GetMapping("/{id}")
    public Post findCommentById(@PathVariable("id") Long postId){
        log.info("inside find post by id method of PostController");
        return postService.findPostById(postId);
    }

//    private RabbitmqSender rabbitMqSender;
//    @Autowired
//    public CommentController(RabbitmqSender rabbitMqSender) {
//        this.rabbitMqSender = rabbitMqSender;
//    }

//    @GetMapping("/rabbitmq/contract/{id}")
//    public String testRabbitmqContract(@PathVariable("id") Long userId) {
//        log.info("inside find user by id with contract method of UserController");
//        rabbitMqSender.send(userId);
//        return "Message has been sent Successfully: " + userId;
//    }
}
