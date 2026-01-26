package currenttime;



public class CurrentTime {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        long totalSeconds = time / 1000;
        long hours = (((totalSeconds / 3600) % 24) + 6) % 24;
        long remainigSeconds = totalSeconds % 3600;
        long minutes = remainigSeconds / 60;
        long seconds = remainigSeconds % 60;
        System.out.println("Current time is: " + hours + ":" + minutes + ":" + seconds + "GTM+6");
    }

}
