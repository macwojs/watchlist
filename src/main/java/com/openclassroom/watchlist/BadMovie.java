package com.openclassroom.watchlist;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target ( ElementType.TYPE )
@Retention ( RetentionPolicy.RUNTIME )
@Constraint ( validatedBy = BadMovieValidator.class )
public @interface BadMovie {
	String message() default "If a movie is that bad then you need add at least 15 characters of comment";
	Class< ? >[] groups() default {};
	Class< ? extends Payload >[] payload() default {};
}
