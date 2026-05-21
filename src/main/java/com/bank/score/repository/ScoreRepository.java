package com.bank.score.repository;

import com.bank.score.model.Score;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ScoreRepository extends MongoRepository<Score, String> {
    Optional<Score> findByCpf(String cpf);


}
