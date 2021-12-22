package com.logger.logger.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
    private static final Logger logger = LoggerFactory.getLogger(ArticleService.class);

    @Autowired
    private ArticleService articleService;

    @GetMapping("/Hello")
    public List<Article> getArticles(){
        logger.debug("inside ArticleController.getArticles() method");
        return articleService.getArticle();
    }

    @GetMapping("/saikiran")
    public List<Article> getArticle(){
        logger.error("this is not working");
        return articleService.getArticle();
    }

}
