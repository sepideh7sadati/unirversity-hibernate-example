package dao;

import entity.Course;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.transaction.SystemException;
import javax.transaction.Transaction;
import java.util.List;

public class CourseDao {
    public void saveCourse(Course course) throws SystemException {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = (Transaction) session.beginTransaction();
            session.save(course);
            transaction.commit();


        } catch (Exception ex) {
            if (transaction != null){
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public List<Course> getCourse(){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Course", Course.class).list();
        }
    }
}
