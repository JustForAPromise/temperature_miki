package com.miki.help.temperature.user.service;

import com.miki.help.temperature.user.model.UserModel;

public interface UserService {

    /**
     * 获取登录验证码
     * @param userPhone
     * @param userImsi
     * @return
     */
    UserModel getVerifyCode(String userPhone, String userImsi);
}
