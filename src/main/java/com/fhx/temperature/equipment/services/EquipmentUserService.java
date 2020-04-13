package com.fhx.temperature.equipment.services;

import com.fhx.temperature.equipment.model.EquipmentUserModel;

import java.util.List;

public interface EquipmentUserService {
    List<EquipmentUserModel> findAll(EquipmentUserModel bean);

    EquipmentUserModel findOne(EquipmentUserModel bean);
}
