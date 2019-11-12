/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces3;

/**
 *
 * @author Usuario
 */
public class probar {
    public static void main(String[] args) {
        Producto celular = new Producto();
        celular.setNombre("Xperia Zz1");
        celular.setCantidad(1);
        celular.setPrecio(9999.99);
        celular.setProveedor("Movistar");
        celular.setNumero_documento("0001");
        System.out.println(celular.getNombre());
        
        Producto parlante = new Producto("Philiphs",1,100.00,"Tienda online de Interbank","0002");
    }
}
