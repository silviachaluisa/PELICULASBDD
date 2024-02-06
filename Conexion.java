import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    private int id, anio;
    private String titulo, director, genero, sinopsis;
    Peliculas pelicula;
    public Conexion (Peliculas peli)
    {
        this.pelicula = peli;
        this.id = peli.getId();
        this.anio = peli.getAnio();
        this.titulo = peli.getTitulo();
        this.director = peli.getDirector();
        this.genero = peli.getGenero();
        this.sinopsis = peli.getSinopsis();
    }
    public boolean insertarItemBDD(){
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/peliculas",
                "root", "123456")) {
            //Crear consulta de insercion con parametros
            String sql = "INSERT INTO pelicula1(titulo, director, año, genero,sinpsis) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, this.titulo);
                preparedStatement.setString(2, this.director);
                preparedStatement.setDouble(3, this.anio);
                preparedStatement.setString(4, this.genero);
                preparedStatement.setString(5, this.sinopsis);
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
