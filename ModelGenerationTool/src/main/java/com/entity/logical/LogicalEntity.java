package com.entity.logical;

import lombok.Data;

@Data
public class LogicalEntity {
    private String tenantId;
    private String entityId;
    private String entityCode;
    private String entityName;
    private String entityNameEn;
    private String versionNo;
    private String catalogId;
    private String entityType;
    private String buziTypeId;
    private String buziDomainId;
    private String validStartTime;
    private String validEndTime;
    private String entityStatus;
    private String structType;
    private Boolean isShare;
    private Boolean isOpen;
    private Integer openFlag;
    private Boolean isInoperable;
    private String metadataSrcType;
    private String referenceEntityId;
    private String referenceEntityCode;
    private String appName;
    private String groupName;
    private String createOperator;
    private String createTime;
    private String lastModOperator;
    private String lastModTime;
    private String entityDesc;
    private String entityDescEn;
    private String entityKeyWords;
    private String accountAuthority;
    private Integer versionFlag;

}
