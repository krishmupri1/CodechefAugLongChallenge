import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String [] args){

       List<Employee>p=new ArrayList<>();

       Map<String,Employee> mp=new HashMap<>();

       Employee y1=new Employee();
        y1.setName("krish");
        y1.setId(1);
        mp.put("ONE",y1);

        Employee y2=new Employee();
        y2.setName("murari");
        y2.setId(2);
        mp.put("ONE",y2);

        mp.values().add(new Employee());

        for(Map.Entry x: mp.entrySet()){

            System.out.println(x.getKey()+"   "+x.getValue());

        }



       Employee y=new Employee();//1
        y=null;
        System.gc();
       y.setId(4);
       y.setName("rahul");
       p.add(y);
       Company sb=new Company(p);//2
        List<Employee>p1=new ArrayList<>();
       Company sb1=new Company();
       sb1=sb;

       System.out.println( sb.getTemp().get(0).getName());



    }


}
class Company{
   private List<Employee> temp;

   Company(){

   }
   Company(List<Employee> temp){
       this.temp=temp;
   }

   public List<Employee> getTemp() {
        return temp;
    }

    public void setTemp(List<Employee> temp) {
        this.temp = temp;
    }
}
class Employee{
    //10permanet 20 temporary

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}