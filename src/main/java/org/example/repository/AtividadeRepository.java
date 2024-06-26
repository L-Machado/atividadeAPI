package org.example.repository;

import org.example.model.Atividade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtividadeRepository extends MongoRepository<Atividade, String> {
}
