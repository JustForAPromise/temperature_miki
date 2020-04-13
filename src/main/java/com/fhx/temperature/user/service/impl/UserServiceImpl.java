package com.fhx.temperature.user.service.impl;

import com.fhx.temperature.user.model.UserModel;
import com.fhx.temperature.user.repository.UserRepository;
import com.fhx.temperature.util.StringUtil;
import com.fhx.temperature.user.service.UserService;
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
