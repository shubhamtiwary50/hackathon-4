package com.jap.ticketing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketingOperationsTest {
    TicketingOperations ticketingOperations;
    List<TicketingData> ticketingDataList;
    private  final String fileName = "sample.csv";
    @BeforeEach
    public void setUp(){
        ticketingOperations = new TicketingOperations();
        ticketingDataList = ticketingOperations.readTicketingData(fileName);
    }
    @AfterEach
    public void tearDown()
    {
        ticketingOperations = null;
        ticketingDataList = null;
    }
    @Test
    public void givenTicketingDataListReturnTotalAmountCollectedThroughTicket()
    {
        double actual = ticketingOperations.collectionOfAmount(ticketingDataList);
        assertEquals(10348.0,actual);
    }
    @Test
    public void givenfileDetailsFileReturnTheNUmberOfRecordObjects()
    {

        List<TicketingData> output = ticketingOperations.readTicketingData(fileName);
        assertEquals(49,output.size());

    }
    @Test
    public void givenTicketingDataListReturnSortedListCheckFirstValue()
    {
        List<TicketingData> data = ticketingOperations.sortByKmsTravelled(ticketingDataList);
        assertEquals(49.5,data.get(0).getTravelledKM());
    }
}
