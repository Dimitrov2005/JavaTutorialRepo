package com.learningJavaLanguage.Interfaces;

import java.time.*;

public interface ClientInterfaceTime {
    LocalDate getDate();
    LocalTime getTime();
    LocalDateTime getDateTime();

    void setServerDateTime (LocalDateTime dateTime);
    void setServerDate(LocalDate date);
    void setServerTime(LocalTime time);
}
