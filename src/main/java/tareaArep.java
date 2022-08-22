
import static spark.Spark.*;
public class tareaArep {

    public static void main(String[] args){
        port(getPort());
        staticFiles.location("/public");
        get("/hello",(req, res) -> {
            String name = req.queryParams("name");
            return "Hello Heroku" + name;
        });
        get("/intraday", (req,res)-> {
            res.type("application/json");
            return HttpConnectionExample.getAPIAdvantageIntraDay();
        });
        path("/find", ()->{
            get("/:value",(req,res) ->{
                res.type("application/json");
                return HttpConnectionExample.getAPIData(req.params(":value"));
            });
        });

    }
    static int getPort(){
        if(System.getenv("PORT")!= null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
