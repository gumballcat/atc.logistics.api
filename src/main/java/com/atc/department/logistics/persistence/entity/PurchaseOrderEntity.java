package com.atc.department.logistics.persistence.entity;

/*
 * Copyright (c) 2012-2016 by Zalo Group.
 * All Rights Reserved.
 *
 * @author namnh16 on 04/03/2022
 */

import com.atc.shared.persistence.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "purchase_order")
public class PurchaseOrderEntity extends AbstractEntity {

    @Id
    private int id;
    @Column(name = "customer_id")
    private int customerID;
    @Column(name = "merchandise_id")
    private int merchandiseID;
    @Column(name = "created_at")
    private long createdAt;
    @Column(name = "created_by")
    private int createdBy;
    @Column(name = "modified_at")
    private long modifiedAt;
    @Column(name = "modified_by")
    private long modifiedBy;
}
