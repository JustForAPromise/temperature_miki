package com.fhx.temperature.equipment.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class EquipmentUserModel {
    private int Id;

    private String equipmentSn;

    private int userRole;

    private String userId;
}
