package task2;

/**
 * Created by Admin on 08.05.2017.
 */
public class Runner {
    public static void main(String[] args) {
        final Aviacompany.ConsoleView consoleView = new Aviacompany.ConsoleView();
        Aviacompany boeing = new Boeing(50, 200, "Boeing 747", 4);
        Aviacompany let = new Let(300, 100, "Let 1000", 6);
        Aviacompany mcdonnell = new McDonnell(0, 300, "McDonnell 2", 7);
        Aviacompany airbus = new Airbus(400, 0, "Airbuss 101", 6);
        Aviacompany antonov = new Antonov(10, 20, "Antonov 353", 2);
        System.out.println("Total overall quantity of all airoplanes of the Aviacompany is\n" + (boeing.overallQuantity + let.overallQuantity + mcdonnell.overallQuantity + airbus.overallQuantity + antonov.overallQuantity));
        IFlying choice = new Choice(antonov);

        try {
            final int plane = consoleView.getrangeOfFlight("Выберите самолет, если боинг - нажмите 1, если Лет- нажмите 2,если Антонов- нажмите 3 ");
            choice.makeChoiseOnPlane(plane);
        } catch (final IFlying.ChoiseException ex) {
            ex.printStackTrace();
        }
        consoleView.printMessage("Следующий вопрос");


        try {
            final int number = consoleView.getrangeOfFlight("Введите дальность полета,если 100 метров- нажмите 2: ");
            choice.makeChoise(number);
        } catch (final IFlying.ChoiseException ex) {
            ex.printStackTrace();

        }



}}