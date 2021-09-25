package Exercise7_11;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel; // 이전 채널(previous channel)

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
            return;
        }
        prevChannel = this.channel; // 현재 채널을 이전 채널에 저장한다.
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume < MIN_VOLUME || volume > MAX_VOLUME) {
            return;
        }
        this.volume = volume;
    }

    // 현재 채널을 이전 채널로 변경한다.
    void gotoPrevChannel() {
        setChannel(prevChannel); // 현재 채널을 이전 채널로 변경한다.
//        int temp = this.channel;
//        this.channel = prevChannel;
//        prevChannel = temp;
    }
}

class Exercise7_11 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
