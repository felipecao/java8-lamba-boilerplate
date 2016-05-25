package boilerplate;

public class BoilerplateContainer implements BoilerplateCode
{
    public void executeBusinessLogic(String somethingToLog, Runnable businessLogic) {
        System.out.println("Logging the something: " + somethingToLog);

        businessLogic.run();
    }
}
