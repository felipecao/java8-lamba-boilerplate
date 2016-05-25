package boilerplate;

public class BusinessCodeThatWantsToAvoidBoilerplate
{
    AvoidBoilerplate boilerplate;
    Dependency dependency;

    public BusinessCodeThatWantsToAvoidBoilerplate(AvoidBoilerplate boilerplate, Dependency dependency)
    {
        this.boilerplate = boilerplate;
        this.dependency = dependency;
    }

    public void executeBusinessLogic() {
        boilerplate.executeBusinessLogic("Starting my business logic", () -> {
            System.out.println("This is my business logic");
            dependency.doSomething();
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