/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author u06296329105
 */

    public abstract class DAO_Abstract {
        Session session;

    public DAO_Abstract() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }
        
 public abstract void insert(Object objeto);
 public abstract void update(Object objeto);
 public abstract void delete(Object objeto);

 public abstract Object list(int codigo);

 public abstract ArrayList listAll();

}
