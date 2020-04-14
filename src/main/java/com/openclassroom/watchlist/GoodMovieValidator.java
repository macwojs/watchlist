package com.openclassroom.watchlist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GoodMovieValidator implements ConstraintValidator< GoodMovie, WatchlistItem > {
	@Override
	public boolean isValid( WatchlistItem item, ConstraintValidatorContext constraintValidatorContext ) {
		return !(Double.parseDouble( item.getRating() )>=8 && "L".equals( item.getPriority() ));
	}
}

