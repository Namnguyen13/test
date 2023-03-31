class RunPingPong implements Runnable {
    String word;
    int delay;
    RunPingPong(String word, int delay){
        this.word = word;
        this.delay = delay;
    }

    public void run(){
        try{
            for(;;){
            System.out.println(word+" ");
            Thread.sleep(delay);
        }
    }
    catch(InterruptedException e){
        return ;
    }
}
    public static void main(String args[]){
        Runnable ping = new RunPingPong("ping", 66);
        Runnable pong = new RunPingPong("pong", 500);
        new Thread(ping).start();
        new Thread(pong).start();
    }
}

//cách cài đặt này cho phép cài đặt tuyến đoạn nhưng van cho phép thừa kế lớp khác. Trong khi đó cách cài đặt số 1 không cho phép kế thừa một lớp khác
// cài đặt một đông hồ số hiển thị thời gian 