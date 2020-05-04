package com.company;

public abstract class AbstractFactory {
  abstract IBollywoodMovie getBollywoodMovieName( final String movieType);
  abstract IHollywoodMovie getHollywoodMovieName( final String movieType);
}

