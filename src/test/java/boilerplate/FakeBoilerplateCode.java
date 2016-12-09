package boilerplate;

import java.util.function.Supplier;

public class FakeBoilerplateCode implements BoilerplateCode
{
    @Override
    public void executeBusinessLogic(String somethingToLog, Supplier<Class<Void>> businessLogic)
    {
        System.out.println("Executing " + this.getClass().getSimpleName() + " instead of actual business implementation");

        businessLogic.get();
    }
}
