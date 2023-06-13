package com.example.atividade03.Repository;

import com.example.atividade03.Entity.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class TarefasRepository {
     List<Tarefa> tarefas = new ArrayList<>();

@Autowired
    public List<Tarefa> buscarTarefa(){
        return tarefas;
    }

    public Tarefa adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
        return tarefa;
    }
    public Tarefa buscarTarefaPorId(Long id){
        for ( Tarefa t: tarefas){
            if (t.getId()==id){
                return t;
            }
        }
        return null;
    }

    public Tarefa deletarTarefa (Tarefa tarefa) {
        tarefas.remove(tarefa);
        return tarefa;
    }
}

