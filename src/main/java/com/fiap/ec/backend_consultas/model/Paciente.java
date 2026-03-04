package com.fiap.ec.backend_consultas.model;
import jakarta.persistence.*;
@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private Boolean ativo;

    public Paciente() {}
    public Paciente(String nome, String cpf, String email, String telefone, LocalDate dataNascimento, Boolean ativo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
    }
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(String Cpf) { this.Cpf = Cpf; }
}