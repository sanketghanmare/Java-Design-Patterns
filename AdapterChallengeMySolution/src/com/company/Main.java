package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Demo***");

        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","alone.mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advanceMediaPlayer1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advanceMediaPlayer1.play("mp4","wind.mp4");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer advanceMediaPlayer2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advanceMediaPlayer2.play("vlc","gutts over fear.vlc");
    }
}
