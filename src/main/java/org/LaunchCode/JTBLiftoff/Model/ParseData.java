package org.LaunchCode.JTBLiftoff.Model;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

public class ParseData {

 public static void main(String[] args) {

  try {
   URL url = new URL("https://api.edamam.com/api/food-database/v2/parser?ingr=hulled%20barley&app_id=6558ef1a&app_key=076610da98e992b84c57d7740a258a0d \t");
   HttpURLConnection conn = (HttpURLConnection) url.openConnection();
   conn.setRequestMethod("GET");
   conn.connect();

   int responseCode = conn.getResponseCode();

   if (responseCode != 200) {
    throw new RuntimeException("HttpResponseCode: " + responseCode);
   } else {

    String inline = "";
    Scanner sc = new Scanner(url.openStream());
    while (sc.hasNext()) {
     inline += sc.nextLine();
    }
    System.out.println("\nJSON data in a string format");
    System.out.println(inline);
    sc.close();


//    JSONParser parse = new JSONParser();
//    JSONObject data_obj = (JSONObject) parse.parse(inline);
//
//    JSONObject obj = (JSONObject) data_obj.get("hulled barley");
//    System.out.println(obj.get("nutrients"));

    }
   } catch(Exception e){
    e.printStackTrace();
   }

 }
}
