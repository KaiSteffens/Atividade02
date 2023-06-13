package com.example.atividade03.Service;

import com.example.atividade03.Entity.Tarefa;
import com.example.atividade03.Repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TarefaService {
    List<Tarefa> tarefas = new ArrayList<>();

    @Autowired
    private TarefasRepository tarefasRepository;
    public Tarefa adicionarTarefa(Tarefa tarefa){
        for(Tarefa t:tarefasRepository.buscarTarefa()){
            if (t.getTitulo().equals(tarefa.getTitulo())){
                return null;
            }
        }
        return tarefasRepository.adicionarTarefa(tarefa);

    }
    public Tarefa buscarTarefaPorID(long id){
        return tarefasRepository.buscarTarefaPorId(id);
    }
    public List<Tarefa> buscarTarefa() {
        return tarefasRepository.buscarTarefa();
    }

    public Tarefa atualizarTarefa(Long id, Tarefa tarefa) {
        Tarefa tarefa01 =tarefasRepository.buscarTarefaPorId(id);
        if (tarefa01==null){
            return null;
        }else{
            tarefa.setId(id);
            tarefasRepository.deletarTarefa(tarefa01);
            tarefasRepository.adicionarTarefa(tarefa);
            return tarefa;
        }
    }
}

