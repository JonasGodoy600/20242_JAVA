

public class Musica{
    private String titulo;

    public Musica(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    
    public boolean equals(Object obj) {
        Musica outra = (Musica)obj;
        return this.titulo.equals(outra.titulo);
    }

    
}