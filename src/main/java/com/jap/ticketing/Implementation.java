package com.jap.ticketing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Implementation {
    public static void main(String args[]) {
        String filename = "sample.csv";
        try {
            FileReader f1 = new FileReader("sample.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        TicketingOperations ti = new TicketingOperations();
        List<TicketingData> list = ti.readTicketingData("sample.csv");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\n");
        System.out.println("-------------------------------------------");
        System.out.println("Sorted in Descending order in accordance to Distance");
        System.out.println("\n");
        ti.sortByKmsTravelled(list);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("\n");
        System.out.println("-------------------------------------------");
        TicketCollection tc = new TicketCollection() {
            @Override
            public double totalAmountCollected(List<TicketingData> ticketingDataList) {
                ArrayList<TicketingData> al= new ArrayList<>(ticketingDataList);
                double amount=0;
                for (TicketingData k : ticketingDataList) {
                    amount = amount + k.getTotalTicketAmount();
                }
                return amount;
            }
        };
        System.out.println("tc.totalAmountCollected(list) = " + tc.totalAmountCollected(list));
    }
}
