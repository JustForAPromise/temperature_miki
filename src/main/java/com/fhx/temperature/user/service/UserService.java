package com.fhx.temperature.user.service;

import com.fhx.temperature.user.model.UserModel;

public interface UserService {


    /**
     * 用户注册
     * @param userModel
     * @return
     */
    UserModel registerUser(UserModel userModel);
}
