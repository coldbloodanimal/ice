package ice.spring.study.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.JdbcCorporateEventDao;

public class Application {

  public static void main(String[] args) {
	  String sql="select count(*) from ice_user";
      ApplicationContext context = 
    		  new ClassPathXmlApplicationContext("config/ice.spring.xml");
      MessageService service = context.getBean("hello",MessageService.class);
      JdbcCorporateEventDao dao = context.getBean("corporateEventDao",JdbcCorporateEventDao.class);
     // dao.queryForList("select * from ice_user where ", new Object)
      System.out.println(dao.getRowCount(sql));
      System.out.println(service.getMessage());
      
  }
}