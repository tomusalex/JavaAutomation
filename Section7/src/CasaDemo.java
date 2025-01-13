public class CasaDemo {
    public static void main (String[] args){
        Casa casaMea = new Casa();
        Casa casaTa = new Casa();

        casaMea.setCuloare("rosie");
        casaMea.setNrGeamuri(4);
        casaMea.setNrEtaje(3);

        casaTa.setCuloare("albastra");
        casaTa.setNrGeamuri(10);
        casaTa.setNrEtaje(5);

        printeazaCasa(casaMea);
        printeazaCasa(casaTa);




    }
    // Print House details
    public static void printeazaCasa(Casa casa) {
        System.out.println("Casa are culoarea " + casa.getCuloare()
                + " , detine un numar de " + casa.getNrEtaje() + " etaje si are " + casa.getNrGeamuri()
                + " geamuri.");
    }
}