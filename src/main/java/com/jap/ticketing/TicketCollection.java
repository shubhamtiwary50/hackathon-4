package com.jap.ticketing;
import java.util.List;
@FunctionalInterface
public interface TicketCollection {
    public double totalAmountCollected(List<TicketingData> ticketingDataList);

}
