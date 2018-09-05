package Modelo;


public class Colaborador {

    Long id_colab;
    String nome,
           placa,
           modelo,
           cor;
    
        public Long getId_colab() {
        return id_colab;
    }

    public void setId_colab(Long id_colab) {
        this.id_colab = id_colab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
}
