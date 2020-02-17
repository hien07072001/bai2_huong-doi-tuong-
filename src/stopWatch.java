import java.time.LocalTime;
import java.util.Locale;

public class stopWatch {
    private double  startTime;
    private double endTime;
    long milireset,milistop;

    public double getStartTime() {
        return startTime;
    }
    public double getEndTime() {
        return endTime;
    }
    public stopWatch(){
       LocalTime startTime=LocalTime.now();

    }
    void start(){
        LocalTime reset=LocalTime.now();
        System.out.println("hien tai :" +reset);
        this.milireset=System.currentTimeMillis();

    }
    void stop(){
        LocalTime stop=LocalTime.now();
        System.out.println("kt:"+stop);
        this.milistop=System.currentTimeMillis();


    }
    void getElapsedTime(){
        long timePast=System.currentTimeMillis();
        System.out.println("thoi gian troi qua:"+timePast);
    }


}
