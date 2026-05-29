package com.bank.score.service.impl;

import com.bank.score.model.Score;
import com.bank.score.repository.ScoreRepository;
import com.bank.score.service.ScoreService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScoreServiceImpl implements ScoreService {

    private final ScoreRepository scoreRepository;

    public ScoreServiceImpl(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @Override
    public void createScore(Score score) {

        boolean existe = scoreRepository.findByCpf(score.getCpf()).isPresent();
        if(existe){
            throw new RuntimeException("Usuario ja existe.");
        }
        scoreRepository.save(score);
    }

    @Override
    public Score getByScore(String id) {
        return scoreRepository.findById(id).get();
    }

    @Override
    public Score getByCpf(String cpf) {
        Optional<Score> scoreGet = scoreRepository.findByCpf(cpf);
        if(scoreGet.isPresent()){
            return scoreGet.get();
        }
        Score score = new Score();
        score.setCpf(cpf);
        score.setPontuacao(500);
        score.setClassificacao("MEDIA");
        scoreRepository.save(score);
        return score;
    }
}
