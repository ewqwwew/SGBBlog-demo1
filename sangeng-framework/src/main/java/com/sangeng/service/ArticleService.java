package com.sangeng.service;

import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 周杰伦
* @description 针对表【sg_article(文章表)】的数据库操作Service
* @createDate 2024-06-23 21:37:18
*/
public interface ArticleService extends IService<Article> {

    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}
