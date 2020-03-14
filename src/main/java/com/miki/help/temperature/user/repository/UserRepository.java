package com.miki.help.temperature.user.repository;

import com.miki.help.temperature.base.BaseRepository;
import com.miki.help.temperature.user.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserRepository extends BaseRepository<UserModel> {

    @Override
    UserModel findOne(UserModel var);

    @Override
    int save(UserModel var1);
}
