package Day4;

public class Object3 extends Object2{
    private String school;

    public Object3(String school,String username,int age, String password){
        super(username,age,password);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
