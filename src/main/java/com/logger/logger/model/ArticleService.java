package com.logger.logger.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {
    private static final Logger logger = LoggerFactory.getLogger(ArticleService.class);
    public List<Article> getArticle(){
        logger.debug("inside getArticles");
        return Arrays.asList(new Article(100,"saikiran","vijayawada"),new Article(121,"reddy","vizag"));
    }
}
