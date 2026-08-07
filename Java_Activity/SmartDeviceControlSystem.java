// Interface 1
interface WiFiEnabled {
    void connectWiFi();
}

// Interface 2
interface VoiceControlled {
    void voiceCommand();
}

// Interface 3
interface MusicPlayer {
    void playMusic();
}

// Interface 4
interface VideoStreaming {
    void streamVideo();
}

// Interface 5
interface TemperatureMonitor {
    void showTemperature();
}

// Smart TV
class SmartTV implements WiFiEnabled, VoiceControlled, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Smart TV Connected to WiFi");
    }

    public void voiceCommand() {
        System.out.println("Smart TV Voice Control Enabled");
    }

    public void streamVideo() {
        System.out.println("Playing Netflix");
    }
}

// Smart Speaker
class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {

    public void connectWiFi() {
        System.out.println("Smart Speaker Connected to WiFi");
    }

    public void voiceCommand() {
        System.out.println("Listening for Voice Command");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

// Smart AC
class SmartAC implements WiFiEnabled, TemperatureMonitor {

    public void connectWiFi() {
        System.out.println("Smart AC Connected to WiFi");
    }

    public void showTemperature() {
        System.out.println("Current Temperature : 24°C");
    }
}

// Smart Phone
class SmartPhone implements WiFiEnabled, VoiceControlled,
        MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Smart Phone Connected to WiFi");
    }

    public void voiceCommand() {
        System.out.println("Google Assistant Activated");
    }

    public void playMusic() {
        System.out.println("Playing Songs");
    }

    public void streamVideo() {
        System.out.println("Streaming YouTube");
    }
}

// New Device (Added without modifying interfaces)
class SmartCar implements WiFiEnabled, VoiceControlled,
        MusicPlayer, VideoStreaming {

    public void connectWiFi() {
        System.out.println("Smart Car Connected to WiFi");
    }

    public void voiceCommand() {
        System.out.println("Voice Navigation Started");
    }

    public void playMusic() {
        System.out.println("Playing Car Music");
    }

    public void streamVideo() {
        System.out.println("Streaming Rear Seat Entertainment");
    }
}

// Main Class
public class SmartDeviceControlSystem {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();
        SmartSpeaker speaker = new SmartSpeaker();
        SmartAC ac = new SmartAC();
        SmartPhone phone = new SmartPhone();
        SmartCar car = new SmartCar();

        System.out.println("----- Smart TV -----");
        tv.connectWiFi();
        tv.voiceCommand();
        tv.streamVideo();

        System.out.println("\n----- Smart Speaker -----");
        speaker.connectWiFi();
        speaker.voiceCommand();
        speaker.playMusic();

        System.out.println("\n----- Smart AC -----");
        ac.connectWiFi();
        ac.showTemperature();

        System.out.println("\n----- Smart Phone -----");
        phone.connectWiFi();
        phone.voiceCommand();
        phone.playMusic();
        phone.streamVideo();

        System.out.println("\n----- Smart Car -----");
        car.connectWiFi();
        car.voiceCommand();
        car.playMusic();
        car.streamVideo();
    }
}