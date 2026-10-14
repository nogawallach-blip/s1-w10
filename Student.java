public class Student{
    private String myClub;
    private String myName;

    public Student(String myClub, String myName){
        this.myClub = myClub;
        this.myName = myName;
    }

    public String getClub(){
        return myClub;

    }

    public String getName(){
        return myName;
    }

    public boolean isSameClub(Student other){
        return this.myClub.equals(other.myClub);
    }


    
}