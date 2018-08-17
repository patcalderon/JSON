package com.company;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://demo.edument.se/api/customers/1");

        String jsonStr = IOUtils.toString(url, Charset.forName("UTF-8"));
        System.out.println(jsonStr);

        JSONObject json = new JSONObject(jsonStr);

        String firstName=json.getString("FirstName");
        String lastName=json.getString("LastName");
        System.out.println(firstName);
        System.out.println(lastName);

        JSONObject json2 = new JSONObject();

        json2.put("Age", 25);
        json2.put("FirsName", "Pat");
        json2.put("LastName", "Calderon");
        json2.put("City", "Stockholm");

        System.out.println(json2.toString());

        URL url2 = new URL("www.edument.se");

        System.out.println("getHost=" + url.getHost());
        System.out.println("getPath=" + url.getPath());
        System.out.println("getPort=" + url.getPort());
        System.out.println("getProtocol=" + url.getProtocol());
        System.out.println("getQuery=" + url.getQuery());
        System.out.println("getUserInfo=" + url.getUserInfo());

    }
}
