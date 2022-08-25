package com.entity.logical;

import lombok.Data;

@Data
public class LogicPhyRel {
    private String tenantId = null;
    private String entityId;
    private String entityCode = null;
    private String tableId;
    private String tableCode;
    private String createOperator = null;
    private String createTime = null;
    private String lastModOperator = null;
    private String lastModTime;
    private String isDefault;
    private String dataSourceId = null;
}
