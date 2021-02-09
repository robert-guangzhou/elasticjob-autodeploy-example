# elasticjob-autodeploy 例子说明

在package com.radishgz.elasticjobautodeploy.example 下有2个job 类。

其中一个为spring bean模式，一个为非bean模式。

以mysql数据库为例，插入数据

```sql
INSERT INTO `job_settings` (`job_name`, `job_type`, `job_class`, `cron`, `sharding_total_count`, `sharding_item_parameters`, `job_parameter`, `monitor_execution`, `streaming_process`, `max_time_diff_seconds`, `monitor_port`, `failover`, `misfire`, `job_sharding_strategy_class`, `description`, `script_command_line`, `reconcile_interval_minutes`, `job_group`, `status`, `status_date`) VALUES
	('SimpleJob-exmaple', 'SIMPLE', 'com.radishgz.elasticjobautodeploy.example.JavaSimpleJob', '0/5 * * * * ?', 1, '', '', 1, 0, 10, -1, 0, 1, '', 'description', NULL, 10, 'default', 'ENABLED', NULL),
	('SpringBeanSimpleJob-example', 'SIMPLE', 'com.radishgz.elasticjobautodeploy.example.SpringBeanSimpleJob', '0/5 * * * * ?', 1, '', '', 1, 0, 10, -1, 0, 1, '', 'description', NULL, 10, 'default', 'ENABLED', NULL);
```

后以

 1.Junit模式运行ElasticjobAutodeployApplicationTests
 
 2.或者直接以application 模式运行

就能发现2个job都自动运行了。

## 实际生产部署
需要注意如果使用了spring bean，需要将相关packae加入到application.properties中的ComponentScan.basePackages中，整个项目可以 
 1. 以springboot uber jar模式直接部署。
 2. 如果有多个项目，可以将项目的非uber jar放到autodeploy 的./jars目录下
 