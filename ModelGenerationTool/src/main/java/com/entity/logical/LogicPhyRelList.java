package com.entity.logical;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;

import java.util.List;

@Data
@JSONType(orders = {"logicPhyRel", "attributeColumnRelList"})
public class LogicPhyRelList {
    private LogicPhyRel logicPhyRel;
    private List<AttributeColumnRel> attributeColumnRelList;
}
