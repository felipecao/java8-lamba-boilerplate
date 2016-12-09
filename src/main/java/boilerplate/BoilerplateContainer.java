package boilerplate;

import java.util.function.Supplier;

public class BoilerplateContainer implements BoilerplateCode
{
    public void executeBusinessLogic(String somethingToLog, Supplier<Class<Void>> businessLogic) {
        System.out.println("Logging the something: " + somethingToLog);

        businessLogic.get();
    }
}
