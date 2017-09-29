package com.company;

import jssc.SerialPort;
import jssc.SerialPortException;

public class ComportConnection {

    public void ConnectionToPort (String portname) throws InterruptedException {

        SerialPort serialPort = new SerialPort(portname);
        try {
            serialPort.openPort();
            serialPort.setParams(SerialPort.BAUDRATE_9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

            serialPort.writeString("u0" + "\n");
            Thread.sleep(10000);

//            for (int i = 0; i <= 400; i+=100) {
//
//                serialPort.writeString("u"+Integer.toString(i) + "\n");
//                Thread.sleep(1000);
//            }

            serialPort.writeString("u?" + "\n");
            Thread.sleep(100);
            String s = serialPort.readString();

            System.out.println(s);

            serialPort.closePort();

        } catch (SerialPortException e) {
            e.printStackTrace();
        }
    }

}
