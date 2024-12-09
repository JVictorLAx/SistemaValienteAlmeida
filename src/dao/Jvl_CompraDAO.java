/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.JvlCompra;
import java.util.ArrayList;
import org.hibernate.Criteria;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author u06296329105
 */
public class Jvl_CompraDAO extends DAO_Abstract {

    @Override
    public void insert(Object objeto) {
        session.beginTransaction();
        session.save(objeto);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(objeto);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(objeto);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JvlCompra.class);
        criteria.add( Restrictions.eq("idusuarios", id ));
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(JvlCompra.class);
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;

    }

}
