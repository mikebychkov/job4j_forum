package com.forum.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.forum.model.Post;
import com.forum.service.PostService;

@Controller
public class PostControl {

    private final PostService posts;

    @Autowired
    public PostControl(PostService posts) {
        this.posts = posts;
    }

    @RequestMapping(value="/post/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id, Model model) {
        model.addAttribute("post", posts.findById(id));
        return "post";
    }

    @RequestMapping(value="/post/create", method = RequestMethod.POST)
    public String create(@ModelAttribute Post post) {
        posts.save(post);
        return "redirect:/post/" + post.getId();
    }
}
