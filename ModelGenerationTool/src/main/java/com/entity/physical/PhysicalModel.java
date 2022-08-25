package com.entity.physical;

import com.alibaba.fastjson.annotation.JSONType;

import lombok.Data;

import java.util.List;

/**
 * @since 2022-08-01
 */
@Data
@JSONType(orders = {"phyTableInfo","phyTableExtInfoList","phyStoreInfo","phyStoreExtInfoList","phyStoreRulePath","phyPartition","phyTableIndex","phyColumnList","phyTablesRel"})
public class PhysicalModel {

    private PhyTableInfo phyTableInfo;

    private List<PhyTableExtInfoList> phyTableExtInfoList;

    private PhyStoreInfo phyStoreInfo;

    private List<PhyStoreExtInfoList> phyStoreExtInfoList;

    private List<PhyStoreRulePath> phyStoreRulePath;

    private PhyPartition phyPartition;

    private String phyTableIndex;

    private List<PhyColumnList> phyColumnList;

    private String phyTablesRel;
}
