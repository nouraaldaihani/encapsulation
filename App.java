public class App{
    public static void main(String[] args) throws Exception {
        Student StudentStat = new student( "noura", 20, 3.3);
       
        System.out.println(StudentStat.setGpa());
        System.out.println(StudentStat.getAge());
        System.out.println(StudentStat.getName());

    }
}
