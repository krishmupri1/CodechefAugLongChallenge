import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Comparablitity {

    public static void main(String [] args){

        ArrayList<Students> arr=new ArrayList<>();
        Students s=new Students(1,"krish");
        Students s1=new Students(5,"arish");
        Students s3=new Students(4,"zrish");
        Students s4=new Students(9,"brish");
        Students s5=new Students(2,"krish");
        arr.add(s);
        arr.add(s1);arr.add(s3);arr.add(s4);arr.add(s5);
        arr.sort(new nameComparator());

System.out.println(arr);
    }


}


class Students implements Comparable<Students>{
    private int id;
    private String name;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && name.equals(students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

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



    @Override
    public int compareTo(Students o) {
        return this.id-o.getId();
    }
}
class nameComparator implements Comparator<Students> {



    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}