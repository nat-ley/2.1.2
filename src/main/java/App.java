import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = applicationContext.getBean(HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean == bean2);

        Cat beanCat = applicationContext.getBean(Cat.class);
        Cat bean2Cat = applicationContext.getBean(Cat.class);
        System.out.println(beanCat == bean2Cat);

    }
}