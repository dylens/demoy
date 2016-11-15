package fory.httpmock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.junit.Before;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;


public class DyeHttpClientTest {

    WireMockServer wireMockServer;

    @Before
    public void before() {
        wireMockServer = new WireMockServer(wireMockConfig().port(8090));
        WireMock.configureFor("localhost", 8090);
        wireMockServer.start();

        stubFor(get(urlEqualTo("/dye"))
                .withHeader("Accept", equalTo("text/xml"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "text/xml")
                        .withBody("Hello world!")));
    }

    @Test
    public void testStart() throws Exception {
        DyeHttpClient client = new DyeHttpClient();
        client.start();

        wireMockServer.stop();
    }
}