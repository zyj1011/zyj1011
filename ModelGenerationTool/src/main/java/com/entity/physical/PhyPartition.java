package com.entity.physical;

import com.alibaba.fastjson.annotation.JSONType;

import lombok.Data;

/**
 * @since 2022-08-01
 */
@Data
@JSONType(orders = {"phyTablePartition","phyColumnPartitionList"})
public class PhyPartition {
    private String phyTablePartition;
    private String phyColumnPartitionList;
}
