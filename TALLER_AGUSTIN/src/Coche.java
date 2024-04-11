import javax.swing.JOptionPane;

public class Coche extends Vehiculo {

    // ATRIBUTOS ADICIONALES
    private boolean ruedas;
    private boolean aceite;
    private boolean gps;
    private boolean texturaPintura;
    private boolean carroceria;

    public Coche(String matricula, String modelo, String color, boolean ruedas, boolean aceite, boolean gps,
            boolean texturaPintura, boolean carroceria) {
        super(matricula, modelo, color);
        this.ruedas = false;
        this.aceite = false;
        this.gps = false;
        this.texturaPintura = false;
        this.carroceria = false;
    }

    public static Coche crearCoche(String matricula, String modelo, String color, boolean ruedas, boolean aceite,
            boolean gps, boolean texturaPintura, boolean carroceria) {
        return new Coche(matricula, modelo, color, ruedas, aceite, gps, texturaPintura, carroceria);
    }

    // G
    public boolean isRuedas() {
        return ruedas;
    }

    public boolean isAceite() {
        return aceite;
    }

    public boolean isGps() {
        return gps;
    }

    public boolean isTexturaPintura() {
        return texturaPintura;
    }

    public boolean isCarroceria() {
        return carroceria;
    }

    // P
    @Override
    public void reparacion() {
        String seleccionado = JOptionPane.showInputDialog(null,
                "Qué pieza desea reparar?\n- Ruedas\n> Aceite\n> Gps\n> Pintura\n> Carroceria");

        switch (seleccionado.toLowerCase()) {

            case "ruedas":
                if (isRuedas()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " +color + " no necesita ser reparado.");                
                } else 
                {
                    ruedas = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " +color + " ha sido reparado.");
                }
                break;

            case "pintura":
                if (isTexturaPintura()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " +color + " no necesita ser reparado.");                
                } else {
                    texturaPintura = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " +color + " ha sido reparado.");

                }
                break;
            
            case "aceite":
                if (isAceite()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");                
                } else {
                    aceite = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " ha sido reparado.");
                }
                break;
    
            case "gps":
                if (isGps()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");                
                } else {
                    gps = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " ha sido reparado.");
                }
                break;
    
            case "carroceria":
                if (isCarroceria()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");                
                } else {
                    carroceria = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " ha sido reparado.");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "No existe ese componente");
                break;

        }
    }
}
