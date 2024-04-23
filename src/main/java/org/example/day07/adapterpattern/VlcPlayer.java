package org.example.day07.adapterpattern;

/**
 * @author Fickler
 * @date 2024/4/23 15:44
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("playVlc = " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playMp4 = " + fileName);
    }
}
