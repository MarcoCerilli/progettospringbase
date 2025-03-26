package com.example.progettospringbase.Model;



public class contatto{

    private Long id;
    private String nome;                    
    private String cognome;
    private String email;
    private String telefono;
    private String note;
    
    public contatto(Long id, String nome, String cognome, String email, String telefono, String note) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }




    
}