import java.util.List;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class Program {
	public static void main(String[] args){
        System.out.println("java.version: " + System.getProperty("java.version"));

        // 対応している ScriptEngine の情報を出力
        ScriptEngineManager manager = new ScriptEngineManager();
        List<ScriptEngineFactory> engineFactories = manager.getEngineFactories();
        for (ScriptEngineFactory factory : engineFactories) {
            System.out.println("Engine: " + factory.getEngineName()
                    + ", Version: " + factory.getEngineVersion());
            System.out.println("Language: " + factory.getLanguageName()
                    + ", Version: " + factory.getLanguageVersion());
            System.out.println("Extensions: " + factory.getExtensions());
            System.out.println("MimeTypes: " + factory.getMimeTypes());
            System.out.println("Names: " + factory.getNames());
            System.out.println();
        }
	}
}
