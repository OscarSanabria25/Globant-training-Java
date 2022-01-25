import Herencia.Hija;

public class carros {

    public static void main(String[] args) {

        Hija hija =new Hija("toyota","1993","n1j5","campero","si");
        hija.getNombre();
        hija.getModelo();
        hija.getMarca();
        hija.toString();
      System.out.println(hija);
      saludo();


    }
    public  static void saludo(){
        System.out.println("hola");
    }


    //public  static String[] carros= new String[]{"toyota","renolt", "w"};
    //public  static String[] carros= new String[2];

   // public static void main(String[] args) {
//        System.out.println(carros[0]);
//        System.out.println(carros[1]);
//
//       // System.out.println(Arrays.toString(carros));
//
//        carros[0]= "toyota";
//        carros[1]= "renolt";
//        for (int i = 0; i < carros.length; i++) {
//            System.out.println(carros[i]);
        //}
   // }
}
