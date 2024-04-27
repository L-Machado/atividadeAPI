package org.example.model;

import org.example.model.dto.AtividadeDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Atividade {

    @Id
    private String _id;
    private String descricao;

    public Atividade() {}

    public Atividade(AtividadeDTO atividadeDTO){
        this.descricao = atividadeDTO.getDescricao();
    }

    public Atividade(String descricao) {
        this.descricao = descricao;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
