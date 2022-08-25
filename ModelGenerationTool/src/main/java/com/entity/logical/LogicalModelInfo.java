package com.entity.logical;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JSONType(orders = {"logicalEntity", "logicalEntityExes", "logicalAttributeList", "logicalEntityRelList", "logicalEntityRelExInfoList", "logicPhyRelList", "logicTranslations", "tableId", "oldEntityId", "referenceModelCount"})
public class LogicalModelInfo {
    private LogicalEntity logicalEntity;

    private String logicalEntityExes = null;

    private List<LogicalAttributeInfo> logicalAttributeList;

    private List<String> logicalEntityRelList = new ArrayList<>();

    private List<String> logicalEntityRelExInfoList = null;

    private List<LogicPhyRelList> logicPhyRelList;

    private List<String> logicTranslations = new ArrayList<>();

    private String tableId = null;

    private String oldEntityId = null;

    private String referenceModelCount = null;
}
