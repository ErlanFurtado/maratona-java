package furtado.erlan.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP =1;
        short shortP = 1;
        int intP =1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D; //boxing
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW =1;
        Short shortW = 1;
        Integer intW =1; //unboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        Short num7 = new Short((short)  1);
        Byte num8 = new Byte((byte)10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(10000l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');
        
    }
}
