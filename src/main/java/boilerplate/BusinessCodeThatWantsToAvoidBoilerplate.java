package boilerplate;

public class BusinessCodeThatWantsToAvoidBoilerplate
{
    BoilerplateCode boilerplate;
    Dependency dependency;

    public BusinessCodeThatWantsToAvoidBoilerplate(BoilerplateCode boilerplate, Dependency dependency)
    {
        this.boilerplate = boilerplate;
        this.dependency = dependency;
    }

    public void executeBusinessLogic() {
        boilerplate.executeBusinessLogic("Starting my business logic", () -> {
            System.out.println("This is my business logic");
            dependency.doSomething();
            return Void.TYPE;
        });
    }

    public static void main(String[] args)
    {
        BoilerplateContainer boilerplate = new BoilerplateContainer();
        Dependency dependency = new Dependency();
        BusinessCodeThatWantsToAvoidBoilerplate b = new BusinessCodeThatWantsToAvoidBoilerplate(boilerplate, dependency);

        b.executeBusinessLogic();

        System.exit(0);
    }
}
