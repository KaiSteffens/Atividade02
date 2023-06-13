package com.example.atividade03.Entity;

import com.example.atividade03.Entity.Enum.Prioridade;
import com.example.atividade03.Entity.Enum.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Tarefa {
    private long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataDeVencimento;
    private Status status;
    private Prioridade prioridade;
    private String responsavel;
    private LocalDateTime dataDaCriacao;
    private LocalDateTime dataDaConclusao;
}
