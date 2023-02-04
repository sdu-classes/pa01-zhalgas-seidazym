public class Time {
    private int hour;
    private int minute;
    private int second;
  
  
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setSecond(int second){
        this.second = second;
    }
    public String toString(){
        String time = "";
        if(hour < 10) time += "0" + hour;
        else time += hour;
        if (minute < 10)time += ":0" + minute;
        else time += ":" + minute;
        if (second < 10)time += ":0" + second;
        else time += ":" + second;
        return time;
    }
    public Time nextSecond(){
        second++;
        if(second >= 60) {
            this.second = second % 60;
            minute++;
        }
        if(minute >= 60) {
            this.minute = minute % 60;
            hour++;
        }
        if(hour >= 24) {
            this.hour = hour % 24;
        }
        return this;
    }
    public Time previousSecond(){
        second--;
        if(second < 0) {
            this.second = 60 - 1;
            minute--;
        }
        if(minute < 0) {
            this.minute = 60 - 1;
            hour--;
        }
        if(hour < 0) {
            this.hour = 24 - 1;
        }
        return this;
    }
}
