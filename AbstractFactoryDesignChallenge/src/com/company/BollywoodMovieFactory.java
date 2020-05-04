package com.company;

public class BollywoodMovieFactory extends AbstractFactory{
  @Override
  IBollywoodMovie getBollywoodMovieName(final String movieType) {
    if (movieType == null) {
      return null;
    } else if (movieType.equalsIgnoreCase("ACTION")) {
      return new BollywoodActionMovie();
    } else if (movieType.equalsIgnoreCase("COMEDY")) {
      return new BollywoodComedyMovie();
    } else {
      return null;
    }
  }

  @Override
  IHollywoodMovie getHollywoodMovieName(final String movieType) {
    return null;
  }
}
