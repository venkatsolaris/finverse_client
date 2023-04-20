package com.javapuzzle.springbootkeycloakexample;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    void createUser() {
        Keycloak keycloak = KeycloakBuilder.builder().
                serverUrl("http://localhost:8180/auth/")
                        .realm("javapuzzle")
                                .username("admin_user").
                    password("admin").clientId("java-puzzle-client").
                resteasyClient(new ResteasyClientBuilder().connectionPoolSize(10).build()).
                build();

        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setUsername("venkat");
        userRepresentation.setEmail("venkatrao.c@solarissoftlabs.com");
        userRepresentation.setFirstName("venkat");
        userRepresentation.setEnabled(true);

        List<CredentialRepresentation> credentails = new ArrayList<>();

        CredentialRepresentation password= new CredentialRepresentation();

        password.setType(CredentialRepresentation.PASSWORD);
        password.setValue("admin");
        password.setTemporary(false);
        credentails.add(password);

        userRepresentation.setCredentials(credentails);

        keycloak.realm("javapuzzle").users().create(userRepresentation);


    }
}
