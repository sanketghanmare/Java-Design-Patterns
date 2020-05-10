package com.company;

public class Mp4Player implements AdvancedMediaPlayer {
  private String fileNameMp4;

  @Override
  public void loadFileName(final String fileName) {
    fileNameMp4 = fileName;
  }

  @Override
  public void listen() {
    System.out.println("Playing mp4 file." + "Name: " + fileNameMp4);
  }
}
