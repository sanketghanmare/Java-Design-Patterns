package com.company;

public class HollywoodMovieFactory extends AbstractFactory{
  @Override
  IBollywoodMovie getBollywoodMovieName(String movieType) {
   return null;
  }

  @Override
  IHollywoodMovie getHollywoodMovieName(String movieType) {
    if (movieType == null) {
      return null;
    } else if (movieType.equalsIgnoreCase("ACTION")) {
      return new HollywoodActionMovie();
    } else if (movieType.equalsIgnoreCase("COMEDY")) {
      return new HollywoodComedyMovie();
    } else {
      return null;
    }
  }
}
