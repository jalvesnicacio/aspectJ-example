package exemple2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public aspect LogAspectJ {
	pointcut callCreate() :  call(* *DAO.create(..));
	pointcut callUpdate() :  call(* *DAO.update(..));
	pointcut callDelete() :  call(* *DAO.delete(..));
 
		
		after() returning(Object o): callCreate(){		      
			System.out.println(formatDateTime(LocalDateTime.now()) + " - New record in the database: " + o);
		}
		
		after() returning(Object o): callUpdate(){
			System.out.println(formatDateTime(LocalDateTime.now()) + " - A record has been updated in the database: " + o);
		}
		
		after() returning(Object o): callDelete(){
			System.out.println(formatDateTime(LocalDateTime.now()) + " - A record has been deleted in the database: " + o);
		}
		
		private String formatDateTime(LocalDateTime now) {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		    return now.format(format);
		}

}
