import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonFileToJsonObject {

    public static void main (String [] args) throws Exception {
        JSONParser parser = new JSONParser();

        JSONObject a = (JSONObject) parser.parse(new FileReader("C:\\Users\\dark1\\Desktop\\jsonFileExample.json"));
        JSONArray records = (JSONArray)a.get("bucket");

        for (int i = 0; i < records.size() ; i++) {
            JSONObject tempJsonObj = (JSONObject) records.get(i);
            String startTimeMillis = (String) tempJsonObj.get("startTimeMillis");
            System.out.println(startTimeMillis);

            String endTimeMillis = (String) tempJsonObj.get("endTimeMillis");
            System.out.println(endTimeMillis);

            JSONArray dataset = (JSONArray) tempJsonObj.get("dataset");
            JSONObject dataSourceObj = (JSONObject) dataset.get(0);
            JSONArray point = (JSONArray) dataSourceObj.get("point");
            JSONObject pointObj = (JSONObject) point.get(0);
            String originDataSourceId = (String) pointObj.get("originDataSourceId");
            System.out.println(originDataSourceId);
            JSONArray value = (JSONArray) pointObj.get("value");
            JSONObject valueObj = (JSONObject) value.get(0);
            Long intVal = (Long) valueObj.get("intVal");
            System.out.println(intVal);


        }

        }
}
