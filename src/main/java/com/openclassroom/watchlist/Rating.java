package com.openclassroom.watchlist;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target ( ElementType.FIELD )
@Retention ( RetentionPolicy.RUNTIME )
@Constraint ( validatedBy = RatingValidator.class )
public @interface Rating {
	String message() default "Please enter value between 1 and 10";
	Class< ? >[] groups() default {};
	Class< ? extends Payload >[] payload() default {};
}
