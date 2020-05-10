package academy.learnprogramming;

class Calculator implements CalculatorInterface
{
  Rectangle rectangle;

  public double getArea(Rectangle r) {
    rectangle = r;
    return rectangle.length * rectangle.width;
  }
}
