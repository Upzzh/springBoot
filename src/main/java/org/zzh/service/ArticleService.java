package org.zzh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zzh.dao.ArticleMapper;
import org.zzh.model.Article;

import java.util.List;

/**
 * @ClassName ArticleService
 * @Description TODO
 * @Date2019/10/16 9:33
 **/

@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    public List<Article> getArticle() {
        return articleMapper.getArticle();
    }
}
