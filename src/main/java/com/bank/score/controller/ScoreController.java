package com.bank.score.controller;

import com.bank.score.model.Score;
import com.bank.score.service.ScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/score")
public class ScoreController {

    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PostMapping //criar
    public ResponseEntity<Score> createScore(@RequestBody Score score) {
        scoreService.createScore(score);
        return ResponseEntity.ok(score);
    }

    @GetMapping("/findById/{id}") //buscar
    public ResponseEntity<Score> getByScore(@PathVariable String id) {
        Score score = scoreService.getByScore(id);
        return ResponseEntity.ok(score);
    }

    @GetMapping ("/findByCpf/{cpf}")//buscar
    public ResponseEntity<Score> getByCpf(@PathVariable String cpf) {
        Score response = scoreService.getByCpf(cpf);
        return ResponseEntity.ok(response);
    }
}
