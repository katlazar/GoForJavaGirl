package SDA.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MojaAdnotacja {
    String wartosc() default "xyz";
    int wartoscZDomyslnym() default 5;
    String value();
}
