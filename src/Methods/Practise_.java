package Methods;

public class Practise_ {

// muj zpusob
    static void timeConvert(int seconds){
        if (seconds < 3600){
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            int hours = seconds/3600;
            System.out.println(hours + ":" + minutes + ":" + remainingSeconds);
        } else if (seconds >= 3600) {
            int hours = seconds / 3600;
            int minutes = (seconds - hours*3600) / 60;
            int remainingSeconds = seconds % 60;
            System.out.println(hours + ":" + minutes + ":" + remainingSeconds);

        }
    }

    //bohyho zpusob
    static void timeConverter(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds - hours*3600) / 60;
        int remainingSeconds = (seconds - hours * 3600 - minutes * 60) % 60;
        System.out.println(hours + ":" + minutes + ":" + remainingSeconds);
    }

    public static void main(String[] args) {
        timeConvert(4005);
        timeConvert(255);

        timeConverter(4005);
        timeConverter(255);

    }
}
