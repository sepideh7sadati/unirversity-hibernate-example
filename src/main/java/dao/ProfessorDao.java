package dao;

import entity.Professor;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.transaction.SystemException;
import javax.transaction.Transaction;
import java.util.List;

public class ProfessorDao {
    public void saveProfessor(Professor professor) throws SystemException {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = (Transaction) session.beginTransaction();
            session.save(professor);
            transaction.commit();
           session.close();

        } catch (Exception ex) {
            if (transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public List<Professor> getProfessor(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Professor", Professor.class).list();
        }
    }
}
