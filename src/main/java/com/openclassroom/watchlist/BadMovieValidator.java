package com.openclassroom.watchlist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BadMovieValidator implements ConstraintValidator< BadMovie, WatchlistItem > {
	@Override
	public boolean isValid( WatchlistItem item, ConstraintValidatorContext constraintValidatorContext ) {
		return !(Double.parseDouble( item.getRating() )<6 && item.getComment().trim().length()<15);
	}
}

