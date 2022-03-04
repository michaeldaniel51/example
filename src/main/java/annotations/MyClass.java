package annotations;

import java.lang.reflect.Method;

public class MyClass {

    @MyCustomAnnotation(value = 10)
    public void sayHello(){
        System.out.println("my custom annotation");
    }

    public static void main(String[] args) throws NoSuchMethodException {

        MyClass p = new MyClass();
        Method methodVal = p.getClass().getMethod("sayHello");

        MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is: "+ myCustomAnnotation.value());








    }
}