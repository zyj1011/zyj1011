package com.entity.logical;

import lombok.Data;

@Data
public class AttributeColumnRel {
    private String tenantId = "1002";
    private String entityId;
    private String entityCode;
    private String attributeId;
    private String attributeCode;
    private String tableId;
    private String tableCode;
    private String columnId;
    private String createTime;
    private String columnCode;
    private String lastModTime;
    private String virtualColumnId = null;
    private String virtualColumnCode = null;
    private String mapPhyCol;
    private String mapPhyColSql = null;
    private String dataSourceId;
}
