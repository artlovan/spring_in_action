package org.springinaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringinactionApplicationTests {

	@Autowired
	Performance performance;

	@Test
	public void contextLoads() {
	}

	@Test
	public void aspectPerformanceCounterCountedCalledJoinPoint() {
		performance.bestScene(5);
		assertTrue(AspectPerformanceCounter.getCount() == 1);
	}

}
