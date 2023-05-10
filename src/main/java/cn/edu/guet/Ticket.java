package cn.edu.guet;

/**
 * @Author liwei
 * @Date 2023/5/9 21:19
 * @Version 1.0
 */
public class Ticket {

    /**
     * 车次
     */
    private String trainNumber;
    /**
     * 起始站
     */
    private String startStation;
    /**
     * 到达站
     */
    private String endStation;
    /**
     * 出发日期
     */
    private String departureTime;
    /**
     * 到达日期
     */
    private String arrivalTime;
    /**
     * 历时
     */
    private String duration;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
