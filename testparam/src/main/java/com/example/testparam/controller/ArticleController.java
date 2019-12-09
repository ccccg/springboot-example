package com.example.testparam.controller;


import com.example.testparam.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("/add")
    public String addArticle(Article article,Model model){
        System.out.println(article.getTitle());
        System.out.println(article.getContent());
        model.addAttribute("article",article);
        return "articlelist";
    }

}
