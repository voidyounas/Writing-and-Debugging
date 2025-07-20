public class PF{
    public static void main(String[] args) {
        sayHi("Good noon");
        personalInfo("pablo ", 35);

        
    }
    public static void sayHi(String str){
        System.out.println(str);

    }

    public static String personalInfo(String name , int age ){
        System.out.println("The name is " + name);
        System.out.println("The age is " + age);

        return  name  +  age ;
        
    }
}