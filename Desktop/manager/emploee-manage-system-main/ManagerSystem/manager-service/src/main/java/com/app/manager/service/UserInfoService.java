package com.app.manager.service;

import com.app.manager.dao.entity.UserInfo;

public interface UserInfoService {
    public UserInfo findByUsername(String username);
}
