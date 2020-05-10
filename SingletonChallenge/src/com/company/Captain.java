package com.company;

public class Captain {

  private String teamCaptain = null;

  private Captain() {

  }

  private static class CaptainSelector {
    private static final Captain captain = new Captain();
  }

  public static Captain getInstance() {
    return CaptainSelector.captain;
  }


  public String getTeamCaptain() {
    return teamCaptain;
  }

  public void setTeamCaptain(String tc) {
    teamCaptain = tc;
  }

}
