package com.entity.physical;

import com.alibaba.fastjson.annotation.JSONType;

import lombok.Data;

/**
 * @since 2022-08-01
 */
@Data
@JSONType(orders = {"tenantId","versionNo","tableId","rowKey","dataSourceType","dataSourceId","dataSourceSchema","saveType","storeTypeId","storeTypeId","tableSuffix","tableRule","isCreateTable","isUseCustomParam","isSelfPartition","selfPartition","hadoopClusterId","hadoopFiUser","timeIntervalFormat","timeInterval","dataCycleFormat","dataCycle","startDataCycle","endDataCycle","isAgeing","ageingPolicy","isHistoryCycle","historyCycles","fileType","filePath","fileFormat","fileHeaderCount","fileTailCount","columnDelimiter","lineDelimiter","kvDelimiter","quotes","compressionFormat","encodingType","fileName","hiveSaveType","bucketsNum","tableBlockSize","queueName","storeQueue","queryQueue","selfParam","fileNameList","eventPartitions","eventReplications","kafkaUser","bucketName","storageClass","readWritePolicy","accessPolicy","fileLength","fileLengthUnit","fileMd5","fileLifePrefix","isInfrequentAccessTime","isArchiveTime","isExpirationTime","moduleID","partTableID","splitTableColumn","partitionKey","businessArea","additionAging"})
public class PhyStoreInfo {
        private String tenantId;  // 租户ID，客户无需填写
		private String versionNo;  // 版本编号，作用存疑，可为null。
        private String tableId;  // 必须字段，固定格式：前缀+ tableCode  （clickhouse--919984092, kafka--24126672） 
        private String rowKey;  // Hbase数据库row key信息, 暂不涉及验证
		private String dataSourceType;  // 存储类型, 必须字段。
        private String dataSourceId;  // 存储信息数据源，必须字段，与dataSourceType配合填写
		private String dataSourceSchema;  // 存储信息模式，若dataSourceId数据源为clickhouse数据源，则为必须字段，与dataSourceId配合填写
		private String saveType;  // 存储规则，"None_SaveType"合表，"PartitionTable_SaveType" 分表 必须字段
		private String storeTypeId;  // 可为null 作用存疑 
		private String tableSuffix;  // 存储表名称后缀格式, 前端限制更改，默认为UTC
		private String tableRule;  // 存储表名称，前端限制更改，saveType为分表时，默认为表名_${tableSuffix}，合表时存储表默认为表名。
        private Boolean isCreateTable;  // 存储信息是否建表， 必填字段
		private Boolean isUseCustomParam;  // 是否使用自定义参数, 非必填, 默认false
		private Boolean isSelfPartition;  // 是否使用自定义分区, 非必填, 默认false
		private Boolean selfPartition;  // 自定义分区语句, 非必填, 默认false
		private String hadoopClusterId;  // 作用存疑，可为null,
        private String hadoopFiUser;  // 作用存疑，可为null,
        private String timeIntervalFormat;  // 数据粒度单位, 必填字段
		private Integer timeInterval;  // 数据粒度, 数据粒度单位为“无”时 不能填写，否则必填。
        private String dataCycleFormat;  // 老化周期单位,"isAgeing"为true时必填
		private Integer dataCycle;  // 老化周期, "isAgeing"为true时必填
		private Integer startDataCycle;  // 存储起始周期，默认null 是否提供选择填写存疑,
		private Integer endDataCycle;  // 存储结束周期, 默认null 是否提供选择填写存疑
		private Boolean isAgeing;  // 是否老化, 非必填，默认为false.
		private String ageingPolicy;  // 老化策略, 必填字段。 删除,压缩,无
		private Boolean isHistoryCycle;  // 首次发布时是否创建历史周期, 默认false 是否提供选择填写存疑
		private String historyCycles;  // 首次发布时创建的历史周期数, 默认为null 是否提供选择填写存疑
		private String fileType;  // 文件类型, 创建KAFKA模型 客户必填，创建ClickHouse模型默认为TXT
		private String filePath;  // 文件路径, 非必填，作用存疑
		private String fileFormat;  // 文件格式, 非必填, 作用存疑，默认为"None"
        private Integer fileHeaderCount;  // 文件头行数, 非必填, 作用存疑， 默认为null
		private Integer fileTailCount;  // 文件尾行数, 非必填, 作用存疑， 默认为null
		private String columnDelimiter;  // 列分割符, CLickHouse 默认为null， KAFKA非必填，默认为"|";
		private String lineDelimiter;  // 行分割符,CLickHouse 默认为null， KAFKA必填，默认为"/n"
        private String kvDelimiter;  // 键值分割符,CLickHouse,kafka 默认为null
		private String quotes;  // 解析方式, CLickHouse,kafka 默认为null 
		private String compressionFormat;  // "None",
        private String encodingType;  // "UTF-8",
        private String fileName;  // null,
        private String hiveSaveType;  // null,
        private String bucketsNum;  // null,
        private String tableBlockSize;  // null,
        private String queueName;  // null,
        private String storeQueue;  // null,
        private String queryQueue;  // null,
        private String selfParam;  // null,
        private String fileNameList;  // null,
        private Integer eventPartitions;  // null,
        private Integer eventReplications;  // null,
        private String kafkaUser;  // null,
        private String bucketName;  // null,
        private String storageClass;  // null,
        private String readWritePolicy;  // null,
        private String accessPolicy;  // null,
        private String fileLength;  // null,
        private String fileLengthUnit;  // null,
        private String fileMd5;  // null,
        private String fileLifePrefix;  // null,
        private Boolean isInfrequentAccessTime;  // false,
        private Boolean isArchiveTime;  // false,
        private Boolean isExpirationTime;  // false,
        private Long moduleID;  // 919984092,
        private String partTableID;  // null,
        private String splitTableColumn;  // null,
        private String partitionKey;  // null,
        private String businessArea;  // null,
        private String additionAging;  // null
}
