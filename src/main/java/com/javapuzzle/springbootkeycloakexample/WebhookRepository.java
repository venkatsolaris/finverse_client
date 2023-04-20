package com.javapuzzle.springbootkeycloakexample;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WebhookRepository  extends CrudRepository<WebHook, Long> {

    public List<WebHook> findByCompanyNameAndType(String companyName, String type);

    public List<WebHook> findByCompanyName(String companyName);
}