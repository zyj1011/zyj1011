/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.entity.physical;

import com.alibaba.fastjson.annotation.JSONType;

import lombok.Data;

/**
 * @since 2022-08-01
 */
@Data
@JSONType(orders = {"tenantId","versionNo","columnId","tableId","tableName","columnType","columnCode","parentColumnCode","columnName","columnNameEn","dataType","dataLength","dataPrecision","columnFormat","columnDesc","columnDescEn","orderId","indexType","partitionSeq","fileWidth","isAgeing","isSplitTable","isSplitPartition","isBucket","isDictionaryCol","isNotInvertedCol","sortKeySeq","partitionType","familyTypeId","hbaseColFamily","hbaseZipType","fileNodePath","createTime","lastModTime","isOpen","openFlag","sensitiveType"})
public class PhyColumnInfo {
    private String tenantId;
    private String versionNo;
    private String columnId;
    private String tableId;
    private String tableName;
    private Integer columnType;
    private String columnCode;
    private String parentColumnCode;
    private String columnName;
    private String columnNameEn;
    private String dataType;
    private String dataLength;
    private String dataPrecision;
    private String columnFormat;
    private String columnDesc;
    private String columnDescEn;
    private Integer orderId;
    private String indexType;
    private String partitionSeq;
    private String fileWidth;
    private Boolean isAgeing;
    private Boolean isSplitTable;
    private Boolean isSplitPartition;
    private Boolean isBucket;
    private Boolean isDictionaryCol;
    private Boolean isNotInvertedCol;
    private Integer sortKeySeq;
    private String partitionType;
    private String familyTypeId;
    private String hbaseColFamily;
    private String hbaseZipType;
    private String fileNodePath;
    private String createTime;
    private String lastModTime;
    private Boolean isOpen;
    private Integer openFlag;
    private String sensitiveType;
}
