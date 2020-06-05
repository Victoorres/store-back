package br.com.store.domain.masculino;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "masculino")
public class Masculino implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "masculino_id_seq")
    @SequenceGenerator(name = "masculino_id_seq", sequenceName = "masculino_id_seq", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @NotEmpty
    @Size(max = 10)
    @Column(name = "nome")
    private String nome;

    @NotEmpty
    @Size(max = 10)
    @Column(name = "tamanho")
    private String tamanho;

    @NotNull
    @Column(name = "preco")
    private float preco;
}