public class operators {
    public static void main(String[] args){
        double x=20.00d;
        double y=80.00d;
        double z=(double) (x+y)*100.00;
        double a=(double)z%40.00d;

        System.out.println(z);
        System.out.println(a);

        boolean c= (a==0)?true:false;


        System.out.println(c);

        if(!c)
            System.out.println("Got some Reminder"+a);
    }
}
