import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hellofzrefzfezfz Wordafezfzzdald ezfezfze");
		get("/coucou",(req, res) -> "Coucdodafezfzedau");
		get("/coucou1",(req, res) -> "Coucou1");
		get("/",(req, res) -> "Cyyyyyyyyyyyyyyyyyoucou1");
	}
}
