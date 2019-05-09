package JsonReaderWithGson;

import com.google.gson.Gson;
import java.io.*;

public class JsonReaderWithGson {

    public static void main(String[] args) throws IOException {

        StringBuilder builder = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("C:\\Users\\dark1\\Desktop\\jsonFileExample.json")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        StepCount steps = gson.fromJson(builder.toString(), StepCount.class);
        System.out.println(steps.toString());
    }




}
