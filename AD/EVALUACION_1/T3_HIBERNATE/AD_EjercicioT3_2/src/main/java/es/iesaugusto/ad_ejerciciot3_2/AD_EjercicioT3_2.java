/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package es.iesaugusto.ad_ejerciciot3_2;

import entities.Cliente;
import entities.Producto;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author damt210
 */
public class AD_EjercicioT3_2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Creo la conexion
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("es.iesAugusto_AD_EjercicioT3_2_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        System.out.println("\n EMPEZAMOS:");
        
        productos(em);
        productos2(em);
        productos3(em);
        insercion(em);
        

        //Cierro la conexion
        em.close();
        emf.close();
    }

    //Busquedas
    public static void productos(EntityManager em) {
        System.out.println("\n Busqueda 1\n");
        Query c1 = em.createNamedQuery("Producto.findAll");
        ArrayList<Producto> listaProductos = (ArrayList<Producto>) c1.getResultList();
        for (Producto c : listaProductos) {
            System.out.println(c.getPkproducto() + " " + c.getNombre() + " " + c.getPvp() + " " + c.getFkcategoria().getNombre());
        }
    }

    public static void productos2(EntityManager em) {
        System.out.println("\n Busqueda 2\n");
        Query c2 = em.createNamedQuery("Producto.findByPkproducto");
        c2.setParameter("pkproducto", 1);
        ArrayList<Producto> ProductoParametro = (ArrayList<Producto>) c2.getResultList();
        for (Producto c : ProductoParametro) {
            System.out.println(c.getPkproducto() + " " + c.getNombre() + " " + c.getPvp() + " " + c.getFkcategoria().getNombre());
        }
    }

    public static void productos3(EntityManager em) {
        System.out.println("\n Busqueda 3\n");
        Query c3 = em.createNamedQuery("Producto.findByStockPvp");
        BigDecimal bd = new BigDecimal(10);
        c3.setParameter("stock", 5);
        c3.setParameter("pvp", bd);
        ArrayList<Producto> listaProductosPvp = (ArrayList<Producto>) c3.getResultList();
        for (Producto c : listaProductosPvp) {
            System.out.println(c.getPkproducto() + " " + c.getNombre() + " " + c.getPvp() + " " + c.getFkcategoria().getNombre());
        }
    }

    public static void insercion(EntityManager em) {
        //insercion
        Query insercion = em.createNativeQuery("INSERT INTO Cliente (nombre, password) VALUES (:nombre , :password);");
        em.getTransaction().begin();
        insercion.setParameter("nombre", "Ramiro");
        insercion.setParameter("password", "1234");
        insercion.executeUpdate();
        em.getTransaction().commit();
    }
}
