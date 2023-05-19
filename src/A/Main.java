package A;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

  private static String callChatGPT(String prompt) {
    try {
      URL url = new URL("https://api.openai.com/v1/completions");
      HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
      httpURLConnection.setRequestMethod("POST");
      httpURLConnection.setRequestProperty("Content-Type", "application/json; utf-8");
      httpURLConnection.setRequestProperty("Authorization", "Bearer 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");

      httpURLConnection.setDoOutput(true);

      String input = "{\"model\": \"text-davinci-003\", \"prompt\": \"" + prompt + "\",\"max_tokens\" : 1024}";

      try (OutputStream os = httpURLConnection.getOutputStream()) {
        byte[] inputBytes = input.getBytes("utf-8");
        os.write(inputBytes, 0, inputBytes.length);
      }

      int resCode = httpURLConnection.getResponseCode();
      System.out.println("resCode:" + resCode);

      try (BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"))) {
        StringBuilder res = new StringBuilder();
        String resLine = null;

        while ((resLine = br.readLine()) != null) {
          res.append(resLine.trim());
        }

        return (res.toString());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return "";
  }

  public static void main(String[] args) {
    String prompt = "골든 리트리버의 역사에 대해 한 페이지 분량으로 설명해줘";

    String res = callChatGPT(prompt);

    JSONParser jsonParser = new JSONParser();

    try {
      if (!res.isEmpty()) {
        Object obj = jsonParser.parse(res);
        JSONObject jsonObject = (JSONObject) obj;
        JSONArray choices = (JSONArray) jsonObject.get("choices");
        JSONObject choice = (JSONObject) choices.get(0);
        String text = (String) choice.get("text");
        System.out.println(res);
        System.out.println(text);
      } else {
        System.out.println("Response is empty.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
