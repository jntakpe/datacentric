package com.github.jntakpe.repository;

import com.github.jntakpe.domain.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository du bean {@link com.github.jntakpe.domain.Categorie}
 *
 * @author jntakpe
 */
public interface CategorieRepository extends MongoRepository<Categorie, String> {

}
