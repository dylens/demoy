package fory.httpmock;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DyeHttpClient {

    public void start() throws IOException {
        String url = "http://localhost:8090/dye";

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        request.setHeader(new BasicHeader("Accept","text/xml"));

        HttpResponse response = client.execute(request);
        System.out.println("Response Code: " +
                response.getStatusLine().getStatusCode());

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String line;
        while((line = rd.readLine()) != null) {
            System.out.println(line);
        }
    }

}
