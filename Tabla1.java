import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Tabla1 {
    JPanel Tabla1;
    private JTable table1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Genero");



        table1 = new JTable(modelo);
    }
}
