package ice.framework.script;

import javax.script.*;

import org.springframework.beans.factory.InitializingBean;

public class ScriptManager implements InitializingBean{

	private ScriptEngine engine;
//	public static void main(String[] args) throws Exception {
//		// create a script engine manager
//		ScriptEngineManager factory = new ScriptEngineManager();
//		// create a Nashorn script engine
//		ScriptEngine engine = factory.getEngineByName("nashorn");
//		// evaluate JavaScript statement
//		try {
//			engine.eval("var a=8;");
//			engine.eval("print(a);");
//			engine.eval("print('Hello, World!');");
//		} catch (final ScriptException se) {
//			se.printStackTrace();
//		}
//	}

	public Object eval(String script) throws ScriptException {
		return engine.eval(script);
	}

	public void afterPropertiesSet() throws Exception {
		ScriptEngineManager factory = new ScriptEngineManager();
		// create a Nashorn script engine
		engine = factory.getEngineByName("nashorn");
		
	}


}
