package org.LaunchCode.JTBLiftoff.Model;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.parser.*;

public class ParseData {

 public static void main(String[] args) {

  try {
   URL url = new URL("https://api.edamam.com/api/food-database/v2/parser");
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
   }

  } catch (Exception e) {
   e.printStackTrace();
  }

 }
}
