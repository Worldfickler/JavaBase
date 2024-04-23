package org.example.day07.adapterpattern;

/**
 * @author Fickler
 * @date 2024/4/23 16:05
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "mp3mp3mp3mp3");
        audioPlayer.play("mp4", "mp4mp4mp4mp4");
        audioPlayer.play("vlc", "vlcvlcvlcvlc");
        audioPlayer.play("avi", "aviaviaviavi");
    }
}
