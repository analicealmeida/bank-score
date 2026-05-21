package com.bank.score.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "scores")
public class Score {

    @Id
    private String id;
    private String cpf;
    private Integer pontuacao;
    private String classificacao; // BAIXO, MEDIO, ALTO
}

