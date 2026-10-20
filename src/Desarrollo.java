public class Desarrollo {

    private String nombre;
    private double precio;
    private boolean activo;
    private static int contador = 0;

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }
    public boolean getActivo(){
        return this.activo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public Desarrollo (String nombre , double precio, boolean activo){

        this.nombre = nombre;
        this.precio = precio;
        this.activo = activo;

    }

    public static int getContador(){
        return contador;
    }
}

