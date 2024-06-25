package com.sangeng.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: ArticleDetailVo
 * Package: com.sangeng.domain.vo
 * Description:
 *
 * @Author java开发师 徐文俊
 * @Create 2024/6/26 1:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDetailVo {

    private Long id;
    //标题
    private String title;
    //文章摘要
    private String summary;

    //所属分类id
    private Long categoryId;

    //所属分类名
    private String categoryName;
    //缩略图
    private String thumbnail;

    //文章内容
    private String content;

    //访问量
    private Long viewCount;


    private Date createTime;

}
