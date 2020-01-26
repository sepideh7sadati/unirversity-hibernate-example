package dao;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class StudentDao {

    public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();


        } catch (Exception ex) {
            if (transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public List <Student> getStudent(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }

    public void editStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "update Student set first_name =: firstName, last_name =:lastName" +
                    "number_code =: numberCode , address=: address";
            Query query = session.createQuery(hql);
         //   query.setParameter("firstName", firstName);

            transaction.commit();


        } catch (Exception ex) {
            if (transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }




/*    String hql = "UPDATE Userreg SET uname = :uname, uemail = :uemail, uphone = :uphone WHERE uemail = :uemail";

    Query query = session.createQuery(hql);
query.setParameter("uname", uname);
query.setParameter("uemail", uemail);
query.setParameter("uphone", uphone);
    int rr = query.executeUpdate();

t.commit();

if (rr != 0) {
        return true;
    } else {
        return true;
    }*/


/*
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        long id = 2;

        try {
            session.beginTransaction();

            Employee employee = (Employee) session.get(Employee.class, id);

            session.delete(employee);

            session.getTransaction().commit();
        }
        catch (HibernateException e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }

    }*/

}
