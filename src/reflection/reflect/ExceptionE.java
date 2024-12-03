package reflection.reflect;

import reflection.anot.NotBlank;
import runtimeException.error.BlankException;

import java.lang.reflect.Field;

public class ExceptionE extends RuntimeException {


    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields){
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null){
                try {
                    String value = (String) field.get(object);
                    if (value == null || value.isBlank()){
                        throw new BlankException("field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException exception){
                    System.out.println("tidak bisa mengakses field" + field.getName());
                }
            }
        }
    }



}
