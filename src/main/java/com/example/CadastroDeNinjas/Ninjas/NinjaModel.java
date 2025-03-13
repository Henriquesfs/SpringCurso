package com.example.CadastroDeNinjas.Ninjas;
import com.example.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;


    // @ManyToOne um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Chave estrangeira
    private MissoesModel missoes;

}