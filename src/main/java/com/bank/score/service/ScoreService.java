package com.bank.score.service;

import com.bank.score.model.Score;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ScoreService {

     void createScore(Score score);

     Score getByScore(String id);

      Score getByCpf(String cpf);
}
