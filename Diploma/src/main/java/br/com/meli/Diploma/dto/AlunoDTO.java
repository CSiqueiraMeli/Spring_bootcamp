package br.com.meli.Diploma.dto;

public class AlunoDTO {
    private String nome;
    private String message;
    private double media;

    public AlunoDTO(String nome, double media) {
        this.nome = nome;
        this.media = media;
        if (media >= 9)
            message = "Parabens, voce passou";
        else
            message = " Repetiu";
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
