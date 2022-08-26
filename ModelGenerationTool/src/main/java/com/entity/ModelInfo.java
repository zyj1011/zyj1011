package com.entity;

import lombok.Data;

/**
 * 功能描述
 *
 * @since 2022-08-01
 */
@Data
public class ModelInfo {
    /**
     * 中文描述
     */
    private String tableDesc;

    /**
     * 是否建Topic
     */
    private Boolean isCreateTable;

    /**
     * 主题
     */
    private String topic;

    /**
     * 逻辑模型
     */
    private String logicalModel;

    /**
     * 物理模型
     */
    private String physicalModel;

    /**
     * 是否发布
     */
    private String tableStatus;

    /**
     * 数据源
     */
    private String dataSourceId;

    /**
     * 数据粒度单位
     */
    private String timeIntervalFormat;

    /**
     * 数据粒度
     */
    private Integer timeInterval;

    /**
     * 文本类型
     */
    private String fileType;

    /**
     * 文件编码
     */
    private String encodingType;

    /**
     * 压缩方式
     */
    private String compressionFormat;

    /**
     * 表作用范围
     */
    private Integer versionFlag;

    /**
     * 表英文描述
     */
    private String tableDescEn;

    /**
     * 老化策略
     */
    private String ageingPolicy;

    /**
     * 老化周期
     */
    private Integer dataCycle;

    /**
     * 老化周期单位
     */
    private String dataCycleFormat;

    /**
     * 分区列
     */
    private String splitTableColumn;

    /**
     * 分区数
     */
    private int eventPartitions;

    /**
     * 副本数
     */
    private int eventReplications;

    /**
     * 字段分割符
     */
    private String columnDelimiter;

    /**
     * 行分割符
     */
    private String lineDelimiter;

    /**
     * 存储规则
     */
    private String saveType;

    /**
     * 表引擎(分表必填)
     */
    private String extendValue;

    /**
     * 是否老化
     */
    private Boolean isAgeing;

    /**
     * 数据源schema
     */
    private String dataSourceSchema;

    /**
     * 是否分区
     */
    private Boolean isSelfPartition;

    /**
     * 查询队列
     */
    private String queryQueue;

    /**
     * 存储队列
     */
    private String storeQueue;

    /**
     * 存储起始周期
     */
    private Integer startDataCycle;

    /**
     * 存储结束周期
     */
    private  Integer endDataCycle;

    /**
     * 存储类型
     */
    private String storeTypeId;

    /**
     * 存储表后缀
     */
    private String tableRule;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件路径
     */
    private String filePath;

    /**
     * 文件格式
     */
    private String fileFormat;

    /**
     * 解析方式
     */
    private String quotes;

    /**
     * 文件头行数
     */
    private Integer fileHeaderCount;

    /**
     * 文件尾行数
     */
    private Integer fileTailCount;

    /**
     * 是否主表
     */
    private Boolean isDefault;

    /**
     * 中文别名
     */
    private String tableName;

    /**
     * 英文别名
     */
    private String tableNameEn;
}
