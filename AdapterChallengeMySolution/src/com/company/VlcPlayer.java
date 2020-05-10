package com.company;

public class VlcPlayer implements AdvancedMediaPlayer {

  private String fileNameVlc;

  @Override
  public void loadFileName(final String fileName) {
    fileNameVlc = fileName;
  }

  @Override
  public void listen() {
    System.out.println("Playing vlc file." + "Name: " + fileNameVlc);
  }
}
