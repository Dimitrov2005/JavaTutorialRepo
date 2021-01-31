package com.ProgrammingConcepts.monitor.impl;
import com.ProgrammingConcepts.monitor.api.MonitorIf;

public class Monitor implements MonitorIf{

    boolean isWorking;
    boolean isShowingWhiteScreen;
    boolean isShowingBlueScreen;
    String make;

    private boolean hasHdmiSlot;
    private boolean hasVgaSlot;
    private boolean signalCableConnected;
    private boolean connectedHdmiCable;
    private boolean connectedVgaCable;
    private StringBuffer buttonsAndOptions = new StringBuffer("");
    private String isShowingSignalFromCable;
    private int hResolution;
    private int vResolution;
    private int frequency;
    private int voltage;

    public Monitor (String make, int hRes, int vRes, int freq, int volt){
        this.make = make;
        this.hResolution = hRes;
        this.vResolution = vRes;
        this.frequency = freq;
        this.voltage = volt;
    };

    public void configureSlotsAndButtons(boolean hasVgaSlot, boolean hasHdmiSlot, String btOpts){
        this.hasHdmiSlot = hasHdmiSlot;
        this.hasVgaSlot = hasVgaSlot;
        this.buttonsAndOptions.append(btOpts);
    }

    public void connectHdmiCable(){
        signalCableConnected = true;
        connectedHdmiCable = true;
    }
    public void connectVGACable(){
        signalCableConnected = true;
        connectedVgaCable = true;
    }

    public void turnOnMonitor() {
        this.isWorking = true;
        this.isShowingBlueScreen = true;

        if(signalCableConnected) {
            this.isShowingBlueScreen = false;
            this.isShowingSignalFromCable = connectedHdmiCable ? "HDMI" : connectedVgaCable ? "VGA" : " ";
        }
    }
}
