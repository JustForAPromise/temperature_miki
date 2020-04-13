package com.fhx.temperature.user.repository;

import com.fhx.temperature.base.BaseRepository;
import com.fhx.temperature.user.model.UserModel;
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
