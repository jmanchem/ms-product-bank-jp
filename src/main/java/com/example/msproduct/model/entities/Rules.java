package com.example.msproduct.model.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rules {

    private String customerType;

    private boolean commissionMaintenance;
    private double maximumCommissionMaintenance;

    private boolean maximumlimitMonthlyMovements;

    private Integer maximumMonthlyMovementsQuantityRetirement;
    private Integer maximumMonthlyMovementsQuantityDeposit;

    private Integer maximumLimitCreditPerson;
    private Integer maximumLimitCreditEnterprise;
}
