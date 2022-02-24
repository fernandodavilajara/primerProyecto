package cl.com.ventas;



/**
 *
 * @author Fernando Davila
 */
public class Orden {
    private final int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private final static int MAX_PRODUCTOS = 10 ;
    
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; 
    }

    public void agregarProducto(Producto prod){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS ) {
            productos[this.contadorProductos++] = prod;
        }else{
            System.out.println("se ha superado la cantidad maxima de productos"+Orden.MAX_PRODUCTOS);
        } 
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
            
        }
        return total;
    }
    
    public void separador(){
        System.out.println("-----------------------------------------------------");
    }
    
    public void mostrarOrden(){
        System.out.println("||  id orden: "+this.idOrden+ " ||  ");
        this.separador();
        System.out.println("||Nombre Producto \t\t || Precio\t||");
        this.separador();
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("||" + i + ":) " +this.productos[i].getNombre() + "\t\t\t || "+ this.productos[i].getPrecio() +"\t|| ");    //terminar metodo
        }
        this.separador();
        this.separador();
        double total = this.calcularTotal();
        System.out.println("TOTAL VENTA: "+total);
        //System.out.println("");
    }
}

