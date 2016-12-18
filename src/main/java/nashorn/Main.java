package nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		/**
		 * Run JavaScript from Java
		 */
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("nashorn");
		String script = 
				"var welcome = 'Hello'; "
				+ "welcome += ', David'; "
				+ "welcome";
		String result;
		try {
			result = (String)engine.eval(script);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("There was a JavaScript error");
			e.printStackTrace();
		}

		/**
		 * Run JavaScript from file
		 */
		ScriptEngineManager mgr1 = new ScriptEngineManager();
		ScriptEngine engine1 = mgr.getEngineByName("nashorn");

		File f = new File("src/main/resources/scripts/readurl.js");
		Reader reader = new FileReader(f);

		String result1;
		try {
			result1 = (String) engine.eval(reader);
			System.out.println(result1);
		} catch (ScriptException e) {
			e.printStackTrace();
		}

	}

}
