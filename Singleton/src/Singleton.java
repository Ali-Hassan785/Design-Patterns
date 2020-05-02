 
import java.lang.reflect.Modifier;
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		Singleton obj=new Singleton();
		System.out.println();
		Class class1=obj.getClass();
		int in=class1.getModifiers();
        String rtvl = Modifier.toString(in);;  
	    System.out.println("Class Modifier = " + rtvl);   
	    
	    Student student = new Student();
	    Student student1 = new Student();
	    
	    student.getStudent();
	    student1.getStudent();
	 
	 
	    
	    
	}

}

class Student{
		 private static Student obj;  
		 Student() {
		 }
			// TODO Auto-generated constructor stub
		 
		   
		 public static Student getStudent(){  
		   if (obj == null){  
		      synchronized(Student.class){  
		        if (obj == null){  
		            obj = new Student();//instance will be created at request time  
		        System.out.println(obj);
		        }  
		        System.out.println(obj);
		    }              
		    }  
		  return obj;  
		 }  
}
