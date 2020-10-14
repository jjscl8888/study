package com.app.manager.dao;

import com.app.manager.dao.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserInfoDao extends JpaRepository<UserInfo, Long> {
    public UserInfo findByUsername(String username);
}
