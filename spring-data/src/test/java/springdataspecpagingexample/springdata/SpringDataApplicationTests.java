package springdataspecpagingexample.springdata;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataApplicationTests {

	@Test
	void contextLoads() {

		Assertions.assertTrue(StringUtils.isBlank(""));
	}

}
