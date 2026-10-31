package com.hazlechache;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HazelcastCacheDemo {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("hazelcastPU");

        //First EntityManager
        System.out.println("====== First fecth ======");
        EntityManager em1 = emf.createEntityManager();
        Product p1= em1.find(Product.class,1);
        System.out.println("Product: " + p1);
        em1.close();

        //Second EntityManager
        System.out.println("===== Second Fecth ======");
        EntityManager em2 = emf.createEntityManager();
        Product p2 = em2.find(Product.class,1);
        System.out.println("Prduct:" +p2);
        em2.close();

    }
}