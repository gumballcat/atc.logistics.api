package com.atc.department.logistics.controller;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 08/03/2022
 */

import com.atc.department.logistics.persistence.entity.PurchaseOrderEntity;
import com.atc.department.logistics.persistence.repository.IPurchaseOrderRepository;
import com.atc.shared.http.HPageableResponse;
import com.atc.shared.http.HResponse;
import com.atc.shared.persistence.OffsetBasedPageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/purchase-order")
public class PurchaseOrderController {

    @Autowired
    private IPurchaseOrderRepository PURCHASE_ORDER_REPOSITORY;

    @GetMapping("/test")
    public String test() {
        return PURCHASE_ORDER_REPOSITORY.getById(1).toString();
    }

    @GetMapping("/purchase-orders")
    public HResponse getPurchaseOrders(@RequestParam("lastIndex") int lastIndex, @RequestParam("length") int length) {
        Page<PurchaseOrderEntity> page = PURCHASE_ORDER_REPOSITORY.findAll(new OffsetBasedPageRequest(lastIndex, length));
        return new HPageableResponse(page.getContent(), page.nextPageable().getOffset(), page.getTotalElements());
    }
}
