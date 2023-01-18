package com.study.article.dao;

import com.study.article.mapper.ArticleMapper;
import com.study.article.vo.ArticleVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ArticleDao {

    private final ArticleMapper mapper;

    public String insertOne(ArticleVo articleVo) {
        int insertRows = mapper.insertOne(articleVo);
        if (insertRows == 0) {
            return "FAIL";
        } else {
            return "SUCCESS";
        }
    }

    public ArticleVo getReadArticle(Long articlePk) {

        return mapper.getReadArticle(articlePk);
    }
}
