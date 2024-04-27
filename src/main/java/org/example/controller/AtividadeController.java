package org.example.controller;

import org.example.constant.Constant;
import org.example.model.Atividade;
import org.example.model.dto.AtividadeDTO;
import org.example.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @PostMapping(Constant.API_ATIVIDADE)
    public void save(@RequestBody AtividadeDTO atividadeDTO) {
        atividadeService.save(new Atividade(atividadeDTO));
    }

    @GetMapping(Constant.API_ATIVIDADE)
    public List<Atividade> findAll(){
        return atividadeService.findAll();
    }

    @PutMapping(Constant.API_ATIVIDADE)
    public void update(@RequestBody Atividade atividade){
        if (atividade.get_id() == "" || atividade.get_id() == null){

        }
        atividadeService.save(atividade);
    }

    @DeleteMapping(Constant.API_ATIVIDADE + "/{id}")
    public void deleteById(@PathVariable("id") String id){
        atividadeService.deleteById(id);
    }

    @GetMapping(Constant.API_ATIVIDADE + "/{id}")
    public Optional<Atividade> findById(@PathVariable String id){
        return atividadeService.findById(id);
    }
}
