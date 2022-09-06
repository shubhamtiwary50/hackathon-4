package com.jap.ticketing;

public class TicketingData {

    private String schedule_no;
    private String routeNo;
    private String ticketFromStopId;
    private String ticketFromStopSeqNo;
    private String ticketTillStopId;
    private String ticketTillStopSeqNo;
    private String ticketDate;
    private String ticketTime;
    private int totalTicketAmount;
    private float travelledKM;

    public String getSchedule_no() {
        return schedule_no;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public String getTicketFromStopId() {
        return ticketFromStopId;
    }

    public String getTicketFromStopSeqNo() {
        return ticketFromStopSeqNo;
    }

    public String getTicketTillStopId() {
        return ticketTillStopId;
    }

    public String getTicketTillStopSeqNo() {
        return ticketTillStopSeqNo;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public int getTotalTicketAmount() {
        return totalTicketAmount;
    }

    public float getTravelledKM() {
        return travelledKM;
    }

    public TicketingData(String schedule_no, String routeNo, String ticketFromStopId, String ticketFromStopSeqNo, String ticketTillStopId, String ticketTillStopSeqNo, String ticketDate, String ticketTime, int totalTicketAmount, float travelledKM) {

        this.schedule_no = schedule_no;
        this.routeNo = routeNo;
        this.ticketFromStopId = ticketFromStopId;
        this.ticketFromStopSeqNo = ticketFromStopSeqNo;
        this.ticketTillStopId = ticketTillStopId;
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.totalTicketAmount = totalTicketAmount;
        this.travelledKM = travelledKM;
    }

    @Override
    public String toString() {
        return "TicketingData{" +
                "schedule_no='" + schedule_no + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", ticketFromStopId='" + ticketFromStopId + '\'' +
                ", ticketFromStopSeqNo='" + ticketFromStopSeqNo + '\'' +
                ", ticketTillStopId='" + ticketTillStopId + '\'' +
                ", ticketTillStopSeqNo='" + ticketTillStopSeqNo + '\'' +
                ", ticketDate='" + ticketDate + '\'' +
                ", ticketTime='" + ticketTime + '\'' +
                ", totalTicketAmount=" + totalTicketAmount +
                ", travelledKM=" + travelledKM +
                '}';
    }

}