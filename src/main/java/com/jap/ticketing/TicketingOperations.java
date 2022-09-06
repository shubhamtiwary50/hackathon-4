package com.jap.ticketing;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Float.parseFloat;

public class TicketingOperations {
    public List<TicketingData> readTicketingData(String fileName) {
        ArrayList<TicketingData> list1 = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            String str;
            int m = 0;
            while ((str = buffer.readLine()) != null) {
                if (m == 0) {
                    m++;
                    continue;
                }
                String[] arr = str.split(",");
                TicketingData obj = new TicketingData(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], Integer.parseInt(arr[8]), parseFloat(arr[9]));
                list1.add(obj);
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
        return list1;
    }

        public List<TicketingData> sortByKmsTravelled(List<TicketingData> ticketingDataList) {
        ArrayList<TicketingData> list = new ArrayList<>();
        Collections.sort(ticketingDataList, (o1, o2) -> Float.compare(o2.getTravelledKM(),o1.getTravelledKM()));
        return ticketingDataList;
    }
/*     public List<TicketingData> sortByTotalTicketAmount(List<TicketingData> ticketingDataList){
         ArrayList<TicketingData> list = new ArrayList<>();
         Collections.sort(ticketingDataList,(o1, o2) -> Float.compare(o2.getTotalTicketAmount(),o1.getTotalTicketAmount()));
         list.addAll(ticketingDataList);
         return list;
     } */
//    public double totalAmountCollected(List<TicketingData> ticketingDataList) {
//        ArrayList<TicketingData> al= new ArrayList<>(ticketingDataList);
//        double amount=0;
//        for (TicketingData i : ticketingDataList) {
//                amount = amount + i.getTotalTicketAmount();
//            }
//        return amount;

        //

//        TicketCollection ticketCollection = a1->{
//            int sum=0;
//            Iterator<TicketingData>ticketingDataIterator = ti
//        };
 //       }
 public double collectionOfAmount ( List<TicketingData> ticketRecords){
     TicketCollection ticketCollection = new TicketCollection() {

         @Override
         public double totalAmountCollected(List<TicketingData> ticketingDataList) {
             int sum = 0;

             for (int i = 0; i < ticketRecords.size(); i++) {
                 sum = sum + ticketRecords.get(i).getTotalTicketAmount();
             }

             return sum;
         }
     };

     return ticketCollection.totalAmountCollected(ticketRecords);
 }
//        int total=0;
//        TicketCollection tc = new TicketCollection() {
//            @Override
//            public double totalAmountCollected(List<TicketingData> ticketingDataList) {
//                ArrayList<TicketingData> al= new ArrayList<>(ticketingDataList);
//                double amount=0;
//                //    Collections.addAll(ticketingDataList.sort(ticketingDataList,);)
//                for (TicketingData k : ticketingDataList) {
//                    amount = amount + k.getTotalTicketAmount();
//                }
//                return amount;
//            }
//        };return total;

    }


