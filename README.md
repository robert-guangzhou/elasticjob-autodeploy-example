# elasticjob-autodeploy ����˵��

��package com.radishgz.elasticjobautodeploy.example ����2��job �ࡣ

����һ��Ϊspring beanģʽ��һ��Ϊ��beanģʽ��

��mysql���ݿ�Ϊ������������

```sql
INSERT INTO `job_settings` (`job_name`, `job_type`, `job_class`, `cron`, `sharding_total_count`, `sharding_item_parameters`, `job_parameter`, `monitor_execution`, `streaming_process`, `max_time_diff_seconds`, `monitor_port`, `failover`, `misfire`, `job_sharding_strategy_class`, `description`, `script_command_line`, `reconcile_interval_minutes`, `job_group`, `status`, `status_date`) VALUES
	('SimpleJob-exmaple', 'SIMPLE', 'com.radishgz.elasticjobautodeploy.example.JavaSimpleJob', '0/5 * * * * ?', 1, '', '', 1, 0, 10, -1, 0, 1, '', 'description', NULL, 10, 'default', 'ENABLED', NULL),
	('SpringBeanSimpleJob-example', 'SIMPLE', 'com.radishgz.elasticjobautodeploy.example.SpringBeanSimpleJob', '0/5 * * * * ?', 1, '', '', 1, 0, 10, -1, 0, 1, '', 'description', NULL, 10, 'default', 'ENABLED', NULL);
```

����

 1.Junitģʽ����ElasticjobAutodeployApplicationTests
 
 2.����ֱ����application ģʽ����

���ܷ���2��job���Զ������ˡ�

## ʵ����������
��Ҫע�����ʹ����spring bean����Ҫ�����packae���뵽application.properties�е�ComponentScan.basePackages�У�������Ŀ���� 
 1. ��springboot uber jarģʽֱ�Ӳ���
 2. ����ж����Ŀ�����Խ���Ŀ�ķ�uber jar�ŵ�autodeploy ��./jarsĿ¼��
 