import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

    public boolean insertarItemBDD(String titulo, String director, int año, String genero, String sinopsis){
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/peliculas",
                "root", "123456")) {
            //Crear consulta de insercion con parametros
            String sql = "INSERT INTO pelicula1(titulo, director, año, genero,sinpsis) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, titulo);
                preparedStatement.setString(2, director);
                preparedStatement.setDouble(3, año);
                preparedStatement.setString(4, genero);
                preparedStatement.setString(5, sinopsis);
                //Ejecutar la consulta de insercion
                int filasAfectadas = preparedStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    System.out.println("Inserción exitosa");
                } else {
                    System.out.println("Inserción fallida");
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
