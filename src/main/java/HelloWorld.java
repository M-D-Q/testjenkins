import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello World ezfezfze");
		get("/coucou",(req, res) -> "Coucou");
		get("/coucou1",(req, res) -> "Coucou1");
		get("/coucou2",(req, res) -> "Cyyyyyyyyyyyyyyyyyoucou1")
	}
}
