package com.entity.logical;

import lombok.Data;

@Data
public class LogicalAttribute {
    // 属性名称
    private String attributeCode;

    // 属性中文别名
    private String attributeName;

    // 属性英文别名
    private String attributeNameEn;

    //排序
    private Integer orderId;

    // 数据类型
    private String dataType;

    // 数据长度
    private Integer dataLength;

    // 精度
    private Integer dataPrecision;

    // 高级配置-是否必填
    private Boolean isNotNull;

    // 高级配置-是否主键
    private Boolean isPk;

    // 列类型
    private String attributeTypeId;

    // 基准时间
    private String referenceTime;

    // 偏移时间
    private String shiftTime;

    // 高级配置-属性标签
    private String attributeKeyWords;

    // 中文描述
    private String attributeDesc;

    // 英文描述
    private String attributeDescEn;

    // 敏感属性
    private String sensitiveType;

    private String tenantId = "1002";
    private String attributeId;
    private String entityId;
    private String entityCode;
    private String versionNo;
    private String defaultValue = null;
    private Boolean isVirtualAtt = false;
    private Boolean isOpen = true;
    private Integer showSeqNo = 0;
    private Boolean statusFlag = true;
    private String statusTime = null;
    private String createTime = null;
    private String lastModTime = null;
    private Integer openFlag = 1;
    private String columnFamily = null;
    private String tableId = null;
    private String virtualColumnId = null;
    private String mapPhyCol = null;
    private String mapPhyColSql = null;
    private String canModSensitiveType = null;
}
