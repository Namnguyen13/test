class PingPong extends Thread {
    String word;
    int delay;
    PingPong(String word, int delay){
        this.word = word;
        this.delay = delay;
    }

    public void run(){
        try{
            for(;;){
            System.out.println(word+ " ");
            Thread.sleep(delay);
        }
    }
    catch(InterruptedException e){
        return ;
    }
}
    public static void main(String args[]){
        new PingPong("Ping", 33).start();
        new PingPong("Pong", 100).start();
    }
}