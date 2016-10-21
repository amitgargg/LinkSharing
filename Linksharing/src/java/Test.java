import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Created by amitgarg on 21/10/16.
 */
public class Test  {
    public static void main(String ...s) throws Exception{
        String json  = "{\"balance\": 1000.21, \"num\":100, \"is_vip\":true, \"name\":\"foo\"}";
        JSONParser parser = new JSONParser();
        JSONObject array = (JSONObject)parser.parse(json);
        System.out.println(array.size());
    }
}

