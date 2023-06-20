package main.org;

// Concrete Adaptee class
class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void playAvi(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
    @Override
    public void playMp4(String fileName) {
        // Do nothing
    }
    @Override
    public void playMov(String fileName) {
    }
}