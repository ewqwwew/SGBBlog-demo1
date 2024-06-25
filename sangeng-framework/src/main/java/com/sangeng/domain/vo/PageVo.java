package com.sangeng.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ClassName: PageVo
 * Package: com.sangeng.domain.vo
 * Description:
 *
 * @Author java开发师 徐文俊
 * @Create 2024/6/25 22:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageVo {
    private List rows;
    private Long total;
}
