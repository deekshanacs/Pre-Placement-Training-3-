import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RunMe {}

public class AnnotationRunner {
    public static void main(String[] args) throws Exception {
        for (Method m : TestClass.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(RunMe.class)) {
                m.invoke(new TestClass());
            }
        }
    }
}

class TestClass {
    @RunMe void secret() { System.out.println("Executing marked method!"); }
}
