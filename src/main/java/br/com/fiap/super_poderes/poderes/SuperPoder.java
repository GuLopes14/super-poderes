package br.com.fiap.super_poderes.poderes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "superpoder")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SuperPoder {
    
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     private String nome;

     private String descricao;

     private int nivelInutilidade;

}
