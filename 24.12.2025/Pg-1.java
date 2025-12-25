import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
@Retention(RetentionPolicy.RUNTIME)
@interface AutoWired {}
class DatabaseService {
    public void connect() {
        System.out.println("Connected to Database.");
    }
}

class UserController {
    @AutoWired
    private DatabaseService dbService;

    public void login() {
        System.out.println("User logging in...");
        dbService.connect(); 
    }
}

class DependencyInjector {
    public static void inject(Object target) throws Exception {
        Class<?> clazz = target.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(AutoWired.class)) {
                field.setAccessible(true);
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.set(target, dependency);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        UserController controller = new UserController();
        
        DependencyInjector.inject(controller);
        
        controller.login(); 
    }
}
