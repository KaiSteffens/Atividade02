package com.example.atividade03.Controller;

import com.example.atividade03.Entity.Tarefa;
import com.example.atividade03.Service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/biblioteca/")
@RestController
public class TarefaController {


        @Autowired
        private TarefaService tarefaService;

        @GetMapping("/tarefa/{id}")
        public Tarefa buscarTarefa (@PathVariable long id){
            return tarefaService.buscarTarefaPorID(id);
        }

        @PostMapping("tarefa")
        public Tarefa cadastrarTarefa (@RequestBody Tarefa tarefa){
            return tarefaService.adicionarTarefa(tarefa);

        }
        @GetMapping("tarefas")
        public List<Tarefa> buscarTarefa(){
            return tarefaService.buscarTarefa();
        }

        @PutMapping("atualizar/{id}")
        public Tarefa  atualizarTarefa(@PathVariable Long id,@RequestBody Tarefa tarefa){
            return tarefaService.atualizarTarefa(id,tarefa);
        }
    }


