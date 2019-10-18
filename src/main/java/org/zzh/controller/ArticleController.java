package org.zzh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zzh.model.Article;
import org.zzh.service.ArticleService;

import java.util.List;

/**
 *2019-10-16 09点31分
 * 文章controller
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/")
    public String getArticle(Model model){
       List<Article> articleList =  articleService.getArticle();
       model.addAttribute("articleList",articleList);
       System.out.println(articleList);
       return "index";
    }
}
