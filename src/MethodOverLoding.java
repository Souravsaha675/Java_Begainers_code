public class MethodOverLoding {
    public static void main(String[] args) {
        double cm= calcFeetAndInchesToCentimeters(1,12);
        if(cm<0.0){
            System.out.println("Invalid transmition");
        }
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet ,double inches){
        if(!(feet>=0) ||!( inches>=0 && inches<=12)){
            System.out.println("invalid");
            return -1;
        }
        double centimeter =(feet*12)*2.54;
        centimeter+=inches*2.54;
        System.out.println(feet+"feet "+inches+"inches ="+centimeter+" cm");
        return centimeter;
    }

    public  static double calcFeetAndInchesToCentimeters(double inches){
        if(!(inches>=0)){
            return -1;
        }

        double feet= (int) inches / 12;
        double remainInches= (int) inches%12;
        System.out.println(inches+"inches ="+feet+"feet and "+remainInches+"inches");
        return calcFeetAndInchesToCentimeters(feet,remainInches);
    }


}
