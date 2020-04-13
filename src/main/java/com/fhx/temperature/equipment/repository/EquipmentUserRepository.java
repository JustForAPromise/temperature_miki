package com.fhx.temperature.equipment.repository;

import com.fhx.temperature.equipment.model.EquipmentUserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface EquipmentUserRepository {
    List<EquipmentUserModel> findAll(EquipmentUserModel bean);

    EquipmentUserModel findOne(EquipmentUserModel bean);
}
