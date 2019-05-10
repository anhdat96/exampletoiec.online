package vn.myclass.core.commom.utils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernatUtils {

    private  static final SessionFactory SessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory()
    {
        try{
            //create 1 sessiongffactory from hibernate.cfg.xml
            return new Configuration().configure().buildSessionFactory();

        }catch( Throwable e)
        {
            System.out.println("khong chay duoc");
            throw new ExceptionInInitializerError();

        }



    }
    public static SessionFactory getSessiongfactory()
    {
        return SessionFactory;
    }


}
