import javax.swing.JOptionPane;

public class Grua extends Vehiculo {
    // Atributos adicionales
    private boolean bola;
    private boolean rodamiento;
    private boolean cristales;
    private boolean chapa;
    private boolean deposito;

    public Grua(String matricula, String modelo, String color, boolean bola, boolean rodamiento, boolean cristales, boolean chapa, boolean deposito) {
        super(matricula, modelo, color);
        this.bola = false;
        this.rodamiento = false;
        this.cristales = false;
        this.chapa = false;
        this.deposito = false;
    }

    public static Grua crearGrua(String matricula, String modelo, String color, boolean bola, boolean rodamiento, boolean cristales, boolean chapa, boolean deposito) {
        return new Grua(matricula, modelo, color, bola, rodamiento, cristales, chapa, deposito);
    }

    //G
    public boolean isBola() {
        return bola;
    }

    public boolean isRodamiento() {
        return rodamiento;
    }

    public boolean isCristales() {
        return cristales;
    }

    public boolean isChapa() {
        return chapa;
    }

    public boolean isDeposito() {
        return deposito;
    }

    //P
    @Override
    public void reparacion() {
        String seleccionado = JOptionPane.showInputDialog(null, "Qué pieza desea reparar?\n> Bola\n> Rodamiento\n> Cristales\n> Chapa\n> Depósito");
        if (seleccionado != null) {
            switch (seleccionado.toLowerCase()) {
                case "bola":
                    if (isBola()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        bola = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "rodamiento":
                    if (isRodamiento()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        rodamiento = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "cristales":
                    if (isCristales()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        cristales = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "chapa":
                    if (isChapa()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        chapa = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "depósito":
                    if (isDeposito()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        deposito = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pieza no encontrada");
                    break;
            }
        }

    }
}
