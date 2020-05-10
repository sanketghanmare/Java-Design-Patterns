package com.company;

public class Main {

  public static void main(String[] args) {

    Captain c1 = Captain.getInstance();

    c1.setTeamCaptain("Dhoni");

    System.out.println(c1);
    System.out.println("The captain of the Indian Cricket team is " + c1.getTeamCaptain());

    c1 = null;
    c2 = Captain.getInstance();

    System.out.println(c2);
    System.out.println("The captain of the Indian Cricket team is " + c2.getTeamCaptain());

    if()
  }
}
