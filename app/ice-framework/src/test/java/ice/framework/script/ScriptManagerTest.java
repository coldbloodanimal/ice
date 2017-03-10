package ice.framework.script;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import javax.script.ScriptException;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ice.spring.study.beans.MessageService;

public class ScriptManagerTest {
	ApplicationContext context;
	ScriptManager engine;
	
	@Before
	public void setup(){
	      context = new ClassPathXmlApplicationContext("config/ice.spring.xml");
	      MessageService service = context.getBean("hello",MessageService.class);
	      engine = context.getBean("scriptEngine",ScriptManager.class);
	}
	@Test
	public void test() throws IOException, ScriptException {
		
		InputStream resourceAsStream = ScriptManager.class.getResourceAsStream("/test.js");
		String script = IOUtils.toString(resourceAsStream);
		IOUtils.closeQuietly(resourceAsStream);
		engine.eval(script);
		resourceAsStream = ScriptManager.class.getResourceAsStream("/test2.js");
		script = IOUtils.toString(resourceAsStream);
		IOUtils.closeQuietly(resourceAsStream);
		engine.eval(script);
	}

}
