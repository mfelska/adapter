package main.org;

class MovPlayer implements AdvancedMediaPlayer {
    @Override
    public void playAvi(String fileName) {
    }
    @Override
    public void playMp4(String fileName) {
    }
    @Override
    public void playMov(String fileName) {
        System.out.println("Playing MOV file: " + fileName);
    }
}