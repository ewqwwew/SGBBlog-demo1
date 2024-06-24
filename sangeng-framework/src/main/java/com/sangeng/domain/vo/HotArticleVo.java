package com.sangeng.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: HotArticleVo
 * Package: com.sangeng.domain.vo
 * Description:
 *
 * @Author java开发师 徐文俊
 * @Create 2024/6/24 1:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotArticleVo {
    private long id;
    //标题
    private String title;
    //访问量
    private Long viewCount;
}
