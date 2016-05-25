package boilerplate;

public class FakeAvoidBoilerplate implements AvoidBoilerplate
{
    @Override
    public void executeBusinessLogic(String somethingToLog, Runnable businessLogic)
    {
        System.out.println("Executing " + this.getClass().getSimpleName() + " instead of actual business implementation");

        businessLogic.run();
    }
}
