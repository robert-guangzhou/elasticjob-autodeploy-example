package com.radishgz.elasticjobautodeploy.example;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elasticjob.operation.simplejob.JobChangeListenerMain;
 
@SpringBootTest(classes = JobChangeListenerMain.class)
class ElasticjobAutodeployApplicationTests {

	@Test
	void testAutoStartJobs() {
		try {
			Thread.sleep(1000*60);
		} catch (InterruptedException e) {
			fail(e.getLocalizedMessage());
 			e.printStackTrace();
		}
	}

}
