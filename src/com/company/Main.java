package com.company;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

public class Main extends ComportConnection{

    public static void main(String[] args) throws SerialPortException, InterruptedException {
        // write your code here
       // String[] portNames = SerialPortList.getPortNames();
        char[] sy = new char[10];



        for (int i = 48; i <= 57; i++){

            for (int j = 0; j <sy.length ; j++) {

                sy[j] = (char)i;
                System.out.println(sy[j]);

            }

        }

//
//        for (int i = 65; i <= 90; i++)
//            System.out.println((char)i);
//
//        for (int i = 97; i <= 122; i++)
//            System.out.println((char)i);


    }

       // ComportConnection connection = new ComportConnection();
       // connection.ConnectionToPort("/dev/ttyUSB0");


    }





