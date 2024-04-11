import javax.swing.JOptionPane;

public class Camion extends Vehiculo {
    // Atributos adicionales
    private boolean ruedas;
    private boolean cambios;
    private boolean llantas;
    private boolean suspension;
    private boolean cadena;

    public Camion(String matricula, String modelo, String color, boolean ruedas, boolean cambios, boolean llantas, boolean suspension, boolean cadena) {
        super(matricula, modelo, color);
        this.ruedas = false;
        this.cambios = false;
        this.llantas = false;
        this.suspension = false;
        this.cadena = false;
    }

    public static Camion crearCamion(String matricula, String modelo, String color, boolean ruedas, boolean cambios, boolean llantas, boolean suspension, boolean cadena) {
        return new Camion(matricula, modelo, color, ruedas, cambios, llantas, suspension, cadena);
    }

    //G
    public boolean isRuedas() {
        return ruedas;
    }

    public boolean isCambios() {
        return cambios;
    }

    public boolean isLlantas() {
        return llantas;
    }

    public boolean isSuspension() {
        return suspension;
    }

    public boolean isCadena() {
        return cadena;
    }

    //P
    @Override
    public void reparacion() {
        String seleccionado = JOptionPane.showInputDialog(null, "Qué pieza desea reparar?\n> Ruedas\n> Cambios\n> Llantas\n> Suspensión\n> Cadena");
        if (seleccionado != null) {
            switch (seleccionado.toLowerCase()) {
                case "ruedas":
                    if (isRuedas()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        ruedas = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "cambios":
                    if (isCambios()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        cambios = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "llantas":
                    if (isLlantas()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        llantas = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "suspensión":
                    if (isSuspension()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        suspension = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "cadena":
                    if (isCadena()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        cadena = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pieza no encontrada");
                    break;
            }
        }
    }
}
