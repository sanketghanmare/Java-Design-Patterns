package com.company;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
  AdvancedMediaPlayer advancedMediaPlayer;

  public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer a) {
    advancedMediaPlayer = a;
  }

  @Override
  public void play(String audioType, String fileName) {
    advancedMediaPlayer.loadFileName(fileName);
    advancedMediaPlayer.listen();
  }
}
