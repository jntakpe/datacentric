package com.github.jntakpe.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.io.Serializable;

/**
 * Classe portant l'identifiant et la version du domain
 *
 * @author jntakpe
 */
public abstract class GenericDomain implements Serializable {

    @Id
    private String id;

    @Version
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
