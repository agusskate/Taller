import javax.swing.JOptionPane;

public class Tractor extends Vehiculo {
    // Atributos adicionales
    private boolean parabrisas;
    private boolean motor;
    private boolean piston;
    private boolean fusibles;
    private boolean radio;

    public Tractor(String matricula, String modelo, String color, boolean parabrisas, boolean motor, boolean piston, boolean fusibles, boolean radio) {
        super(matricula, modelo, color);
        this.parabrisas = false;
        this.motor = false;
        this.piston = false;
        this.fusibles = false;
        this.radio = false;
    }

    public static Tractor crearTractor(String matricula, String modelo, String color, boolean parabrisas, boolean motor, boolean piston, boolean fusibles, boolean radio) {
        return new Tractor(matricula, modelo, color, parabrisas, motor, piston, fusibles, radio);
    }

    //G
    public boolean isParabrisas() {
        return parabrisas;
    }

    public boolean isMotor() {
        return motor;
    }

    public boolean isPiston() {
        return piston;
    }

    public boolean isFusibles() {
        return fusibles;
    }

    public boolean isRadio() {
        return radio;
    }

    //P
    @Override
public void reparacion() {
    String seleccionado = JOptionPane.showInputDialog(null, "Qué pieza desea reparar?\n> Parabrisas\n> Motor\n> Pistón\n> Fusibles\n> Radio");
    if (seleccionado != null) {
        switch (seleccionado.toLowerCase()) {
            case "parabrisas":
                if (isParabrisas()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    parabrisas = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "motor":
                if (isMotor()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    motor = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "pistón":
                if (isPiston()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    piston = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "fusibles":
                if (isFusibles()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    fusibles = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "radio":
                if (isRadio()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    radio = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pieza no encontrada");
                break;
        }
    }
}
}