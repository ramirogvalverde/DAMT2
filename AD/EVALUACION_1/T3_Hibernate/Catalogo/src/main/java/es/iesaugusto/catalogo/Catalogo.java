/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.iesaugusto.catalogo;

import es.iesaugusto.catalogo1.Categoria;
import es.iesaugusto.catalogo1.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author damt210
 */
public class Catalogo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("es.iesAugusto_Catalogo_jar_1.0-SNAPSHOTPU");
        EntityManager em = emfactory.createEntityManager();
        
        /*Query c1 = em.createNamedQuery("Categoria.findAll");//el string viene de categoría, que ya tiene ese creado
        List<Categoria> lista= c1.getResultList();
        for (Categoria c : lista) {
            System.out.println(c.getNombre());            
        }*/
        
        Query c2= em.createNamedQuery("Producto.findAll");
        List<Producto> lista= c2.getResultList();
        for (Producto p : lista) {
            System.out.println(p.getNombre()+ " y su categoría es "+ p.getFkcategoria().getNombre());            
        }
        
        em.close();
        emfactory.close();
        
    }
}
