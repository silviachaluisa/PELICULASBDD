public class Peliculas {
    int id, anio;
    String titulo, director, genero, sinopsis;

    public Peliculas(int id, int anio, String titulo, String director, String genero, String sinopsis) {
        this.id = id;
        this.anio = anio;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    public Peliculas(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
