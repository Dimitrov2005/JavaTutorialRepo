package com.ProgrammingConcepts.debugging.impl;

import com.ProgrammingConcepts.debugging.api.*;

public class RubberDebugDuck implements RubberDuckIf {
    String name = "Rubby The Duck";
    String color = "Yellow";
    static final String breed = "RubberDuckForDebugging";
    boolean hasEyes;
    StringBuffer codeExplanations;

    public void setDuckOptions(String name, String color, boolean hasEyes){
        this.name = name;
        this.color = color;
        this.hasEyes = hasEyes;
    }

    public void stayAndListenCodeExplanations(String newLineOfSpeech){
        codeExplanations = new StringBuffer();
        codeExplanations.append(newLineOfSpeech);
        //Do nothing else
    };

    public void swimInBow(){
        //Float above the water
    };
}
