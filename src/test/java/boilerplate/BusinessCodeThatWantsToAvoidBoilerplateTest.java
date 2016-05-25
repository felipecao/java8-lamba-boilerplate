package boilerplate;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BusinessCodeThatWantsToAvoidBoilerplateTest
{
    BusinessCodeThatWantsToAvoidBoilerplate businessCode;
    BoilerplateCode boilerplateContainerSpy;
    Dependency dependencyMock;

    @Before
    public void setup() {
        boilerplateContainerSpy = spy(new FakeBoilerplateCode());
        dependencyMock = mock(Dependency.class);

        businessCode = new BusinessCodeThatWantsToAvoidBoilerplate(boilerplateContainerSpy, dependencyMock);
    }

    @Test
    public void testIt() {
        businessCode.executeBusinessLogic();

        verify(boilerplateContainerSpy, times(1)).executeBusinessLogic(eq("Starting my business logic"), any(Runnable.class));
        verify(dependencyMock, times(1)).doSomething();
    }

}