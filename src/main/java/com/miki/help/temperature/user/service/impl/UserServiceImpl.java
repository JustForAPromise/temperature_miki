package com.miki.help.temperature.user.service.impl;

import com.miki.help.temperature.user.model.UserModel;
import com.miki.help.temperature.user.repository.UserRepository;
import com.miki.help.temperature.user.service.UserService;
import com.miki.help.temperature.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserModel getVerifyCode(String userPhone, String userImsi) {
        UserModel sendModel = new UserModel();
        sendModel.setUserPhone(userPhone);
        sendModel.setUserImsi(userImsi);

        UserModel model = userRepository.findOne(sendModel);
        if (model == null){
            userRepository.save(sendModel);
            model = userRepository.findOne(sendModel);
        }

        String verifyCode = StringUtil.getVerifyCode(6);
        model.setVerifyCode(verifyCode);
        return model;
    }
}
