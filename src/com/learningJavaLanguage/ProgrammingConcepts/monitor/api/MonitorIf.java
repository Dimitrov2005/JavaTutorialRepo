package com.ProgrammingConcepts.monitor.api;

public interface MonitorIf {
    void configureSlotsAndButtons(boolean hasVgaSlot, boolean hasHdmiSlot, String btOpts);
    void connectHdmiCable();
    void connectVGACable();
    void turnOnMonitor();
}
