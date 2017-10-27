package example;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    @Test
    public void sayHello() {

        Hello greeter = new Hello();
        String greetings = greeter.sayHello();

        Assert.assertEquals("example.Hello Algorithms Dojo!", greetings);
    }

}
