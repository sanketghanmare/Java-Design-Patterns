package com.company;

public class AudioPlayer implements MediaPlayer {

  @Override
  public void play(final String audioType, final String fileName) {
    if (audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing " + "mp3" + " file. Name: " + fileName);
    } else {
      System.out.println("No " + audioType);
    }
  }
}
