package com.javapuzzle.springbootkeycloakexample;

import lombok.Data;

import javax.persistence.*;



    @Entity
    @Data
    @Table(name = "webhook", schema = "webhook")
    public class WebHook {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "url")
        private String url;

        @Column(name = "company_name")
        private String companyName;

        @Column(name = "type")
        private String type;

        public WebHook() {
            super();
            // TODO Auto-generated constructor stub
        }

        public WebHook(Long id, String url, String companyName, String type) {
            super();
            this.id = id;
            this.url = url;
            this.companyName = companyName;
            this.type = type;
        }
    }


