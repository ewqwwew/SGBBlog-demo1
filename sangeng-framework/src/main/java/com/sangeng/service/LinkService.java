package com.sangeng.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.Link;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2024-06-26 16:26:17
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}
