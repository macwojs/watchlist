package com.openclassroom.watchlist;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target( ElementType.FIELD )
@Retention( RetentionPolicy.RUNTIME )
@Constraint( validatedBy = PriorityValidator.class )
public @interface Priority {
	String message() default "Please enter L, M of H to the priority";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};

}
