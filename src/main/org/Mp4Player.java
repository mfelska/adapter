package main.org;
// Concrete Adaptee class

class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playAvi(String fileName) {
    }
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
    @Override
    public void playMov(String fileName) {
    }
}