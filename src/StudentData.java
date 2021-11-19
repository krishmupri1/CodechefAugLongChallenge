import java.util.*;

public class StudentData {

    public static void main (String ...args){
        Scanner sc = new Scanner(System.in);
                List<Marks> list1 = new ArrayList<Marks>();
                for(int i=0;i<5;i++){
                    Marks m=new Marks();
                    m.setName(sc.nextLine());
                    m.setReg_no(Integer.parseInt(sc.nextLine()));
                    m.setMarks_in_eng(Integer.parseInt(sc.nextLine()));
                    m.setMarks_in_maths(Integer.parseInt(sc.nextLine()));
                    m.setMarks_in_science(Integer.parseInt(sc.nextLine()));
                    list1.add(m);
                }
                Standard st = new Standard(list1);
                st.ascending_reg_no();
                st.highestPercentage();
                st.secondHIghestInMathematics();
                st.mathsAndScienceAlone();
                st.rank();
            }
        }

class Marks{

    int reg_no;
    String name;
    int marks_in_maths;
    int marks_in_science;
    int marks_in_eng;



    public int getReg_no() {
        return reg_no;
    }

    public void setReg_no(int reg_no) {
        this.reg_no = reg_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks_in_maths() {
        return marks_in_maths;
    }

    public void setMarks_in_maths(int marks_in_maths) {
        this.marks_in_maths = marks_in_maths;
    }

    public int getMarks_in_science() {
        return marks_in_science;
    }

    public void setMarks_in_science(int marks_in_science) {
        this.marks_in_science = marks_in_science;
    }

    public int getMarks_in_eng() {
        return marks_in_eng;
    }

    public void setMarks_in_eng(int marks_in_eng) {
        this.marks_in_eng = marks_in_eng;
    }



}
class Standard{
  List<Marks> m1;
    Standard(List<Marks> m1){
        this.m1=m1;
    }
        void ascending_reg_no(){
        Collections.sort(m1,(a,b)->(a.reg_no-b.reg_no));
        for(int i=0;i<5;i++) {
            System.out.println(m1.get(i).getReg_no()+" "+m1.get(i).getName());
        }
        }
        void highestPercentage(){
            Collections.sort(m1,(a,b)->(a.getMarks_in_science()+a.getMarks_in_maths()+a.marks_in_eng-b.getMarks_in_science()+b.getMarks_in_maths()+b.marks_in_eng));
        System.out.println(m1.get(4).getReg_no()+" "+m1.get(4).getName());
        }
       void secondHIghestInMathematics(){
           Collections.sort(m1,(a,b)->(a.getMarks_in_maths()-b.getMarks_in_maths()));
           System.out.println(m1.get(3).getReg_no()+" "+m1.get(3).getName());
       }

    void mathsAndScienceAlone(){
        Collections.sort(m1,(a,b)->(a.getMarks_in_maths()+a.getMarks_in_science()-b.getMarks_in_maths()+b.getMarks_in_science()));

            System.out.println(m1.get(4).getReg_no() + " " + m1.get(4).getName());
    }
    void rank(){
        Collections.sort(m1,(a,b)->((a.getMarks_in_science()+a.getMarks_in_maths()+a.getMarks_in_eng())-(b.getMarks_in_science()+b.getMarks_in_maths()+b.getMarks_in_eng())));

        for(int i=0;i<5;i++) {

            int total_marks=m1.get(i).getMarks_in_science()+m1.get(i).getMarks_in_maths()+m1.get(i).marks_in_eng;
            float percent=total_marks/3;
            System.out.println(m1.get(i).getReg_no() + " " + m1.get(i).getName()+" "+total_marks+" "+percent+" "+(i+1));

        }

    }


    }

