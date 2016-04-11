/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spc.settings;

import jssc.SerialPort;

/**
 *
 * @author Vusman
 */
public class SerialPortSettings {

    private int baudRate;
    private int parity;
    private int bitSize;
    private int stopBits;
    public static int BAUDRATE_300 = 300;
    public static int BAUDRATE_1200 = 1200;
    public static int BAUDRATE_2400 = 2400;
    public static int BAUDRATE_4800 = 4800;
    public static int BAUDRATE_9600 = 9600;
    public static int BAUDRATE_19200 = 19200;
    public static int BAUDRATE_38400 = 38400;
    public static int PARITY_NONE = SerialPort.PARITY_NONE;
    public static int PARITY_MARK = SerialPort.PARITY_MARK;
    public static int PARITY_EVEN = SerialPort.PARITY_EVEN;
    public static int PARITY_ODD = SerialPort.PARITY_ODD;
    public static int BITSIZE_5 = 5;
    public static int BITSIZE_6 = 6;
    public static int BITSIZE_7 = 7;
    public static int BITSIZE_8 = 8;
    public static int STOPBITS_1 = 1;
    public static int STOPBITS_2 = 2;

    public SerialPortSettings(int baudRate, int parity, int bitLength, int stopBits) {
        this.baudRate = baudRate;
        this.parity = parity;
        this.bitSize = bitLength;
        this.stopBits = stopBits;
    }

    public SerialPortSettings() {
        
    }

    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(int parity) {
        this.parity = parity;
    }

    public int getBitSize() {
        return bitSize;
    }

    public void setBitSize(int bitSize) {
        this.bitSize = bitSize;
    }

    public int getStopBits() {
        return stopBits;
    }

    public void setStopBits(int stopBits) {
        this.stopBits = stopBits;
    }

    public void setDefaultSettings() {
        setBaudRate(9600);
        setParity(PARITY_NONE);
        setBitSize(8);
        setStopBits(1);
    }
}
