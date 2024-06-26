package com.sangeng.domain.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * ClassName: LinkVo
 * Package: com.sangeng.domain.vo
 * Description:
 *
 * @Author java开发师 徐文俊
 * @Create 2024/6/26 16:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkVo {
    private Long id;

    private String name;

    private String logo;

    private String description;
    //网站地址
    private String address;

}
