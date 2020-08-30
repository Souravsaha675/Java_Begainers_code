public class Float_Double {
    public static void main(String[] args){
        float myMinFloatValue= Float.MIN_VALUE;
        float myMaxFloatValue= Float.MAX_VALUE;
        //System.out.println(myMinFloatValue);
        //System.out.println(myMaxFloatValue);

        double myMinDoubleValue= Double.MIN_VALUE;
        double myMaxDoubleValue= Double.MAX_VALUE;
        //System.out.println(myMinDoubleValue);
        //System.out.println(myMaxDoubleValue);

        int myIntValue=5/3;
        float myFloatValue=5f/3f;
        double muDoubleValue=5d/3d;

        //System.out.println(myIntValue);
        //System.out.println(myFloatValue);
        //System.out.println(muDoubleValue);

        int pounds=200;
        double kilogram=0.45359237d;
        double poundToKilo=(double)(pounds*kilogram);

        //System.out.println(poundToKilo);

        double pi=3.1415927d;
        double anotherNumber=3_000_000.4_751_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
