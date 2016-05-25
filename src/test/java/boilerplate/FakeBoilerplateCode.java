package boilerplate;

public class FakeBoilerplateCode implements BoilerplateCode
{
    @Override
    public void executeBusinessLogic(String somethingToLog, Runnable businessLogic)
    {
        System.out.println("Executing " + this.getClass().getSimpleName() + " instead of actual business implementation");

        businessLogic.run();
    }
}
