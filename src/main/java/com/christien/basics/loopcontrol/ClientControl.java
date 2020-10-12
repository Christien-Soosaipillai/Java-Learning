package com.christien.basics.loopcontrol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientControl {

    public static void main(String[] args){

        String csvFile = "/home/christien/Desktop/Data-Structures/src/sampledata/csv/MOCK_DATA.csv";
        String line = "";
        List<Client> clients = new ArrayList<>();


        //The following implementation is that of a while loop
        //we use while loops to loop through data to which we do not kno when it ends
        //while loops shall continue looping based on the condition that is specified
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
            System.out.println(bufferedReader.readLine());
            while((line = bufferedReader.readLine()) != null){
                String[] fileData = line.split(",");

                int id = Integer.parseInt(fileData[0]);
                String firstName = fileData[1];
                String lastName = fileData[2];
                String email = fileData[3];
                String gender = fileData[4];
                String ipv4 = fileData[5];

                clients.add(new Client(id, firstName, lastName, email, gender, ipv4));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(clients.size());

        //Now that we have data to which we know the size of we can use a for loop
        //A for loop loops through data to which we know the size of
        //there are 3 parts to the for loop statement
        //for(statement 1 ; statement 2; statement 3){ ... }
        //statement 1: is executed first, and only once
        //statement 2: condition upon which the code block executes, if condition isn't satisfied code block doesn't execute and jumps to next line of code after 'for' block
        //statement 3: is executed(every time) IFF the code block is executed, this statement can be left blank
        List<Client> c_FirstNames = new ArrayList<>();
        for(int i = 0; i < clients.size(); i++){
            String firstName = clients.get(i).getFirstName();
            if(firstName.matches("\\b([cC][a-z])\\w+")){
                c_FirstNames.add(clients.get(i));
            }
        }

        c_FirstNames.forEach(client -> System.out.println(client.getFirstName()));

        //the do while loop should be used in all scenarios where the loop body needs to be executed at least once.
        int nameCounter = 0;
        do{
            Client client = c_FirstNames.get(nameCounter);
            client.setFirstName("");
            nameCounter++;
        }while(nameCounter < c_FirstNames.size());

        //because lists are mutable(liable to change) it is not creating another List instance on add() or remove() or property changes
        //therefore all the firstnames will be changed in the list as well
        System.out.println("after change");
        c_FirstNames.forEach(client -> System.out.println(client.getFirstName()));

    }
}
