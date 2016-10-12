import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.taylor.validation.entity.TestBean;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = { "classpath:config/spring-config-bean-validator.xml" })

public class BeanValidatorTest {
	@Autowired
	TestBean testBean;

	@Test
	public void test() {
		System.out.println(testBean.getName());
	}
}
