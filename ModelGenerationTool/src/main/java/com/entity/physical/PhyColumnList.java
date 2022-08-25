package com.entity.physical;

import com.alibaba.fastjson.annotation.JSONType;

import lombok.Data;

import java.util.List;

/**
 * @since 2022-08-01
 */
@Data
@JSONType(orders = {"phyColumnInfo","phyColumnExtInfoList"})
public class PhyColumnList {
    private PhyColumnInfo phyColumnInfo;
    private List<PhyColumnExtInfoList> phyColumnExtInfoList;

}
