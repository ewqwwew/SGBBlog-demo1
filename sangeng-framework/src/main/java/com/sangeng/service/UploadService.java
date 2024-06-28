package com.sangeng.service;

import com.sangeng.domain.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: UploadService
 * Package: com.sangeng.service
 * Description:
 *
 * @Author java开发师 徐文俊
 * @Create 2024/6/28 19:46
 */
public interface UploadService {
    ResponseResult uploadImg(MultipartFile img);
}
