import javax.swing.JOptionPane;

public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String color;
    
    public Vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public void reparacion(){
        JOptionPane.showMessageDialog(null,"Error al indicar el tipo de vehículo");
    }
}
