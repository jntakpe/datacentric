package com.github.jntakpe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Bean représentant un utilisateur
 *
 * @author jntakpe
 */
@Document
public class Utilisateur {

    @Id
    private String id;

    private String login;

}
