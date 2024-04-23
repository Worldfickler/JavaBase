package org.example.day07.adapterpattern;

/**
 * @author Fickler
 * @date 2024/4/23 16:03
 */
public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("mp3 = " + fileName);
        } else if (audioType.equals("vlc") || audioType.equals("mp4")) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("not find");
        }
    }
}
