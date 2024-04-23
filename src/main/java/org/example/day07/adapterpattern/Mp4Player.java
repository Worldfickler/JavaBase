package org.example.day07.adapterpattern;

/**
 * @author Fickler
 * @date 2024/4/23 15:53
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("playVlc = " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playMp4 = " + fileName);
    }
}
