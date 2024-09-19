public class CoversorMetros {
    private double metros;
    final int CENTIMETROS = 100 ;
    final int MILIMETROS = 1000;
    final double PULGADA = 39.3700787;
    final double PIE = 3.2808399;
    final double YARDAS = 1.0936133;

    public CoversorMetros(double metros) {
        this.metros = metros;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public int getCENTIMETROS() {
        return CENTIMETROS;
    }

    public int getMILIMETROS() {
        return MILIMETROS;
    }

    public double getPULGADA() {
        return PULGADA;
    }

    public double getPIE() {
        return PIE;
    }

    public double getYARDAS() {
        return YARDAS;
    }

    public double metrosCm(){
        double resultado = metros*CENTIMETROS;
        return resultado;
    }

    public double metrosMm(){
        double resultado = metros*MILIMETROS;
        return resultado;
    }

    public double metrosPulgada(){
        double resultado = metros*PULGADA;
        return resultado;
    }

    public double metrosPIES(){
        double resultado = metros*PIE;
        return resultado;
    }

    public double metrosYardas(){
        double resultado = metros*YARDAS;
        return resultado;
    }
}
