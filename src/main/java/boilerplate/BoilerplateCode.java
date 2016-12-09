package boilerplate;

import java.util.function.Supplier;

public interface BoilerplateCode
{
    void executeBusinessLogic(String somethingToLog, Supplier<Class<Void>> businessLogic);
}
