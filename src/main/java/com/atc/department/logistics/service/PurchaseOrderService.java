package com.atc.department.logistics.service;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 03/04/2022
 */

import com.atc.department.logistics.persistence.entity.PurchaseOrderEntity;
import com.atc.department.logistics.persistence.repository.IPurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseOrderService {

    @Autowired
    private IPurchaseOrderRepository PURCHASE_ORDER_REPOSITORY;

    public List<PurchaseOrderEntity> getAll() {
        return PURCHASE_ORDER_REPOSITORY.findAll();
    }

    public
}
