public class App {
    public static void main(String[] args) throws Exception {
        CoversorMetros metros = new CoversorMetros(3.5);
        System.out.println(metros.getMetros() + " metros son " + metros.metrosCm() + " cm");
        System.out.println(metros.getMetros() + " metros son " + metros.metrosMm() + " mm");
        System.out.println(metros.getMetros() + " metros son " + metros.metrosPIES() + " pies");
        System.out.println(metros.getMetros() + " metros son " + metros.metrosPulgada() + " pulgadas");
        System.out.println(metros.getMetros() + " metros son " + metros.metrosYardas() + " yardas");
    }
}
