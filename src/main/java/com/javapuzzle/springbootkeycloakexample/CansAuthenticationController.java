package com.javapuzzle.springbootkeycloakexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;



public class CansAuthenticationController {

    @Value("authentication_url")
    String authUrl;


    public  void sendPostRequest() {
        RestTemplate restTemplate = new RestTemplate();

        String requestBody = "fiuID=Findynamics_UAT&redirection_key=xKLOnRvtCUifEm&userId=Findynamics_UAT";

        // Set the headers for the request
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        // Create a request entity with the headers and request body
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // Send the POST request and get the response
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(authUrl, requestEntity, String.class);

        // Check the response status code
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("Response status code: " + statusCode);

        // Get the response body
        String responseBody = responseEntity.getBody();
        System.out.println("Response body: " + responseBody);
    }

}
