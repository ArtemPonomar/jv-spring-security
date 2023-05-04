package mate.academy.spring.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = RepeatPasswordValidator.class)
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordRepeated {
    String message() default "Password and repeat password do not match!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
