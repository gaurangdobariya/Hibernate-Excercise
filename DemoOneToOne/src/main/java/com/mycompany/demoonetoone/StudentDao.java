package com.mycompany.demoonetoone;

import com.mycompany.demoonetoone.model.Address;
import com.mycompany.demoonetoone.model.Education;
import com.mycompany.demoonetoone.model.Student;
import org.hibernate.Session;

/**
 *
 * @author gaurang
 */
public class StudentDao {

    public void save() {
        Session session = HibernetUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Education edu = new Education("Bachlor", "IT", "description", 2019, "school");
        Student st = new Student("firstName", "middleName", "lastName", "Mr.", "Bhai", "a@email.com",
                 "12234567890");
        Address adress = new Address("street1", "street2", "Surat", "Gujarat", "India");
        st.setAddress(adress);
        session.saveOrUpdate(edu);
        st.setEducation(edu);
        session.saveOrUpdate(st);
        session.getTransaction().commit();
        HibernetUtil.shutdown();
    }

}
