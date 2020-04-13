package com.fhx.temperature.equipment.services.impl;

import com.fhx.temperature.equipment.repository.EquipmentUserRepository;
import com.fhx.temperature.equipment.model.EquipmentUserModel;
import com.fhx.temperature.equipment.services.EquipmentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentUserServiceImpl implements EquipmentUserService {

    @Autowired
    private EquipmentUserRepository equipmentUserRepository;

    @Override
    public  List<EquipmentUserModel> findAll(EquipmentUserModel bean) {
        List<EquipmentUserModel> equipmentUserModelList = equipmentUserRepository.findAll(bean);
        return equipmentUserModelList;
    }

    @Override
    public EquipmentUserModel findOne(EquipmentUserModel bean) {
        EquipmentUserModel equipmentUserModel = equipmentUserRepository.findOne(bean);
        return equipmentUserModel;
    }
}
