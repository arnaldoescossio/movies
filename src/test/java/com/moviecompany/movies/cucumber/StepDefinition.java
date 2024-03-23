package com.moviecompany.movies.cucumber;


import com.moviecompany.movies.model.Movie;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class StepDefinition {

//    private final InputStream jsonInputStream = this.getClass().getClassLoader().getResourceAsStream("cucumber.json");
//    private final String jsonString = new Scanner(jsonInputStream, StandardCharsets.UTF_8).useDelimiter("\\Z").next();
//    private final WireMockServer wireMockServer = new WireMockServer(options().dynamicPort());
//    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    //    @When("users want to get information on the {string} project")
    public void usersGetInformationOnAProject(String projectName) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        var response = restTemplate.getForEntity("http://127.0.0.1:8080/api/v1/movies/tt1630029", Movie.class);

//        wireMockServer.start();
//        configureFor("localhost", wireMockServer.port());
//        stubFor(get(urlEqualTo("/projects/cucumber")).withHeader("accept", equalTo(APPLICATION_JSON_VALUE))
//                .willReturn(aResponse().withBody(jsonString)));
//
//        HttpGet request = new HttpGet("http://localhost:" + wireMockServer.port() + "/projects/" + projectName.toLowerCase());
//        request.addHeader("accept", APPLICATION_JSON_VALUE);
//        HttpResponse httpResponse = httpClient.execute(request);
//        String responseString = convertResponseToString(httpResponse);
//
//        assertThat(responseString, containsString("\"testing-framework\": \"cucumber\""));
//        assertThat(responseString, containsString("\"website\": \"cucumber.io\""));
//        verify(getRequestedFor(urlEqualTo("/projects/cucumber")).withHeader("accept", equalTo(APPLICATION_JSON_VALUE)));
//
//        wireMockServer.stop();
    }

//    private String convertResponseToString(HttpResponse response) throws IOException {
//        InputStream responseStream = response.getEntity().getContent();
//        Scanner scanner = new Scanner(responseStream, "UTF-8");
//        String responseString = scanner.useDelimiter("\\Z").next();
//        scanner.close();
//        return responseString;
//    }

}
