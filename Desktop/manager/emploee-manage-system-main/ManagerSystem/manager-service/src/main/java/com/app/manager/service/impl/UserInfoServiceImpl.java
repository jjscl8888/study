package com.app.manager.service.impl;

import com.app.manager.dao.UserInfoDao;
import com.app.manager.dao.entity.UserInfo;
import com.app.manager.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }
}
