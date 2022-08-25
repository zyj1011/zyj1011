package com.cube.entity;

import lombok.Data;

/**
 * 列基本信息
 *
 * @since 2022-08-01
 */
@Data
public class ColumnInfo {
    /**
     * 模型名称
     */
    private String modelCode;

    /**
     * 编号
     */
    private Integer number;

    /**
     * 列名称
     */
    private String columnCode;

    /**
     * 列中文别名
     */
    private String columnName;

    /**
     * 列英文别名
     */
    private String columnNameEn;

    /**
     * 列类型
     */
    private Integer columnType;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 长度
     */
    private String dataLength;

    /**
     * 精度
     */
    private String dataPrecision;

    /**
     * 格式
     */
    private String columnFormat;

    /**
     * 敏感属性
     */
    private String sensitiveAttribute;

    /**
     * 中文描述
     */
    private String columnDesc;

    /**
     * 英文描述
     */
    private String columnDescEn;

    /**
     * 高级
     */
    private String highLevel;

    /**
     * 是否分区
     */
    private Boolean isSplitPartition;

    /**
     * 字典列
     */
    private Boolean isDictionaryCol;

    /**
     * 非倒排序
     */
    private Boolean isNotInvertedCol;

    /**
     * 分区列顺序
     */
    private String partitionSeq;

    /**
     * 分表列
     */
    private Boolean isSplitTable;

    /**
     * 排序列顺序
     */
    private Integer sortKeySeq;

    /**
     * 列宽
     */
    private String fileWidth;

    /**
     * 索引
     */
    private String indexType;
}
