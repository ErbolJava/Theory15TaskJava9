public class Main {
    public static void main(String[] args) {
Xbox xbox1 = new Xbox(2001,"Controller S");
Xbox xbox2 = new Xbox(2005,"Xbox 360");
Xbox xboxThird = new Xbox(2013,"Xbox One");

Microsoft microsoft1 = new Microsoft("Bill Gates",1975);
Microsoft microsoft2 = new Microsoft("Paul Allen",1972);
        System.out.println(microsoft1);
        System.out.println(xbox1);
        System.out.println(xbox2);
        System.out.println(microsoft2.returnDirectorsFriend()+" - with him Bill Gates created Microsoft");
        System.out.println(xboxThird.thirdGeneration()+" is third Generation");
        System.out.println("Created in "+xbox1.createdLocation());
    }
}