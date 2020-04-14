package com.openclassroom.watchlist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PriorityValidator implements ConstraintValidator< Priority, String > {
	@Override
	public boolean isValid( String s, ConstraintValidatorContext constraintValidatorContext ) {
		return s.trim( ).length( ) == 1 && "LHM".contains( s.trim( ) );
	}
}

