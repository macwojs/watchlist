package com.openclassroom.watchlist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RatingValidator implements ConstraintValidator< Rating, String > {
	@Override
	public boolean isValid( String s, ConstraintValidatorContext constraintValidatorContext ) {
		double number;
		try {
			number = Double.parseDouble( s );
		} catch ( NumberFormatException e ) {
			return false;
		}

		if ( number < 1 || number > 10 ) {
			return false;
		}

		return true;

	}
}

