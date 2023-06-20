# adapter
W tym projekcie mamy interfejs MediaPlayer reprezentujący docelowy interfejs, którego klienci używają do odtwarzania plików audio. Interfejs AdvancedMediaPlayer reprezentuje istniejący interfejs Adaptee, który może odtwarzać pliki VLC i MP4.
Konkretne klasy Adaptee (VlcPlayer i Mp4Player) implementują interfejs AdvancedMediaPlayer.
Klasa MediaAdapter implementuje interfejs MediaPlayer i opakowuje obiekty AdvancedMediaPlayer. Działa jako adapter między interfejsem MediaPlayer a interfejsem AdvancedMediaPlayer.
Klasa AudioPlayer jest klientem, który używa interfejsu MediaPlayer do odtwarzania plików audio. Jeśli typem audio jest MP3, odtwarza plik bezpośrednio. Jeśli typem dźwięku jest VLC lub MP4, do odtwarzania pliku używany jest MediaAdapter.
