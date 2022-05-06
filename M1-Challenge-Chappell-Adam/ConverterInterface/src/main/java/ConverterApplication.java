
public class ConverterApplication {

    private static ConverterIf conIf;
    private static ConverterSwitch conSwitch;

    public static void main(String[] args) {
        conIf = new ConverterIf();
        conSwitch = new ConverterSwitch();

        System.out.println("If Converter for Day 1: " + conIf.convertDay(1));
        System.out.println("If Converter for Day 6: " + conIf.convertDay(6));
        System.out.println("If Converter for Month 4: " + conIf.convertMonth(4));
        System.out.println("If Converter for Month 6: " + conIf.convertMonth(6));
        System.out.println("Switch Converter for Day 4: " + conSwitch.convertDay(4));
        System.out.println("Switch Converter for Day 7: " + conSwitch.convertDay(7));
        System.out.println("Switch Converter for Month 6: " + conSwitch.convertMonth(6));
        System.out.println("Switch Converter for Month 11: " + conSwitch.convertMonth(11));
    }
}