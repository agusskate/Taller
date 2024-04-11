import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        Coche coche1 = new Coche("1234A", "Fiat", "Amarillo", true, false, false, false, false);
        listaVehiculos.add(coche1);
        Moto moto1 = new Moto("1654B", "Honda", "Gris", true, false, false, false, false);
        listaVehiculos.add(moto1);
        Tractor tractor1 = new Tractor("54321F", "Seat", "Rosa", false, false, false, false, false);
        listaVehiculos.add(tractor1);
        Grua grua1 = new Grua("9583R", "Jaguar", "Marron", false, false, false, false, false);
        listaVehiculos.add(grua1);
        Camion camion1 = new Camion("9874Y", "Leon", "Morado", true, false, false, false, false);
        listaVehiculos.add(camion1);

        int panel = 0;
        while (panel != 2) {
            try {
                panel = Integer.parseInt(JOptionPane.showInputDialog(
                        "Estas son las opciones\n 1.Seleccione vehiculo para entrar\n 2.Salir\n"));
            } catch (Exception e) {
                panel = -1;
                JOptionPane.showMessageDialog(null, "Valor invalido, 1 a 2");
            }

            switch (panel) {
                case 1:
                    String vehiculoSeleccionado = JOptionPane.showInputDialog(
                            "Ingrese el tipo de vehiculo\n> Coche\n> Moto\n> Tractor\n> Grua\n> Camion");
                    if (!vehiculoSeleccionado.equalsIgnoreCase("Coche")
                            && !vehiculoSeleccionado.equalsIgnoreCase("Moto")
                            && !vehiculoSeleccionado.equalsIgnoreCase("Camion")
                            && !vehiculoSeleccionado.equalsIgnoreCase("Tractor")
                            && !vehiculoSeleccionado.equalsIgnoreCase("Grua")) {
                        JOptionPane.showMessageDialog(null, "Vehículo no reconocido");
                        break; // Agregamos esta línea para salir del switch
                    }

                    // Solo si la entrada es válida, se ejecutará esta parte
                    switch (vehiculoSeleccionado.toLowerCase()) {
                        case "coche":
                            coche1.reparacion();
                            break;
                        case "moto":
                            moto1.reparacion();
                            break;
                        case "camion":
                            camion1.reparacion();
                            break;
                        case "tractor":
                            tractor1.reparacion();
                            break;
                        case "grua":
                            grua1.reparacion();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No se encuentra ese vehiculo");
                            break;
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Gracias, hasta la proxima");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }
    }
}
