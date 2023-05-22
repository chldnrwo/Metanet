package GPT;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class turbo3dot5 {

    private static final String API_URL = "https://api.openai.com/v1/chat/completions";
    private static final String API_KEY = "";

    public static void main(String[] args) throws Exception {
        // Create message content
        JSONObject messageContent = new JSONObject();
        messageContent.put("role", "system");
        messageContent.put("content", "You are a helpful assistant.");

        JSONObject messageUser = new JSONObject();
        messageUser.put("role", "user");
        messageUser.put("content", "\"강아지가 먹으면 위험한 음식에 대해 설명해줘\""+"라는 질문에 효과적으로 답변하기 위해 거쳐야 할 단계를 알려줘. 제시할 수 있는 단계는 최대 5단계고 그 이하도 허용해.");

        JSONArray messages = new JSONArray();
        messages.add(messageContent);
        messages.add(messageUser);

        JSONObject body = new JSONObject();
        body.put("model", "gpt-3.5-turbo");
        body.put("messages", messages);

        // Create connection
        URL url = new URL(API_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + API_KEY);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        // Send request
        OutputStream os = conn.getOutputStream();
        os.write(body.toJSONString().getBytes());
        os.flush();
        os.close();

        // Get response
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();

        System.out.println("Response: " + response.toString());
        
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(response.toString());
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray choices = (JSONArray) jsonObject.get("choices");
        JSONObject choice = (JSONObject) choices.get(0);
        JSONObject message = (JSONObject) choice.get("message");
        String text = (String) message.get("content");
        System.out.println(text);

    }
}
