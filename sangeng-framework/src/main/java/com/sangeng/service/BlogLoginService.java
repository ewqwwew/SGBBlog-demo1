package com.sangeng.service;

import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.User;

/**
 * ClassName: BlogLoginService
 * Package: com.sangeng.service
 * Description:
 *
 * @Author java开发师 徐文俊
 * @Create 2024/6/26 17:24
 */
public interface BlogLoginService {

    ResponseResult login(User user);

    ResponseResult logout();
}
