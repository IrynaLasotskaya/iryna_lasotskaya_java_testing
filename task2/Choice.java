package task2;

class Choice implements IFlying {

    private final Aviacompany aviacompany;

    public Choice(Aviacompany aviacompany) {
        this.aviacompany = aviacompany;
    }




    @Override
public  void makeFly(int various){}


    @Override
    public void makeChoise(final int numOfPlanes) throws IFlying.ChoiseException {
        int actualNumberOfPlanes = this.aviacompany.getRangeOfFlight();
        final String planeName = this.aviacompany.getName();


        if (actualNumberOfPlanes >numOfPlanes) {
            throw new IFlying.ChoiseException("Извините, в компании нет таких самолетов:" + numOfPlanes
                    + " " + planeName);
        } else {
            this.aviacompany.setNumber(actualNumberOfPlanes= numOfPlanes);
            System.out.printf("Вы искали: %s\n", numOfPlanes, planeName);
        }
    }



    @Override
    public void makeChoiseOnPlane(final int choosePlane) throws IFlying.ChoiseException {
        final int plane = this.aviacompany.getRangeOfFlight();
        if (choosePlane > 3) {
            throw new IFlying.ChoiseException("Извините,компания не выпускает такие самолеты" + choosePlane
                    + "" + plane);

        }else {
            System.out.printf("Ваш выбор:  самолет:%d ", choosePlane, plane);

        }
    }


}
