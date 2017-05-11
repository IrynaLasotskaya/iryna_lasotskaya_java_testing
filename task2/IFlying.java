package task2;

/**
 * Created by Admin on 08.05.2017.
 */
public interface IFlying {
     void makeFly(final int rangeOfFlight);

     void makeChoise(final int numOfRose) throws ChoiseException;

     void makeChoiseOnPlane(final int choosePlane) throws ChoiseException;


     class ChoiseException extends Exception {
               public ChoiseException(String message) {
                    super(message);
               }
          }
     }
