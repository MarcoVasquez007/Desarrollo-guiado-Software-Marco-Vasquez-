public class Main{

    public static void main(String[] args){

        Desarrollo objeto1 = new Desarrollo("Marco", 13.2, false);

        System.out.println(objeto1.getNombre());
        System.out.println(objeto1.getPrecio());
        System.out.println(objeto1.getActivo());

        System.out.println(Desarrollo.getContador());
    }
}
