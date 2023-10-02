import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;


public class APICall {


    public static void main(String[] args) {
        try{
            System.out.println(APICall.getTest());
        }catch(Exception e){
            System.out.println("error");
        }

    }



    public static String getTest() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("http://router.project-osrm.org/route/v1/driving/13.388860,52.517037;13.397634,52.529407;13.428555,52.523219")
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            JSONObject responseBody = new JSONObject(response.body().string());


            if (responseBody.getString("code").equals("Ok")) {
                return responseBody.toString();
            } else {
                throw new RuntimeException(responseBody.getString("message"));
            }
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
