package com.ProgrammingConcepts.glasses.impl;

import com.ProgrammingConcepts.glasses.api.GlassesIf;

public class Glasses implements GlassesIf {
    float dioptre;
    String frameMaterial;
    boolean isDirty;
    boolean isInUse;
    boolean isInCase;

    public void putOnHead(){
        //Put glasses on head
        this.isInUse = true;
        this.isDirty = true;
    }

    public void putInsideCase(){
        this.isInCase = true;
        this.isInUse = false;
    }

    public void putOutOfCase(){
        this.isInCase = false;
        this.isInUse = true;
    }

    public void breakGlasses(){
        this.isInUse = false;
        this.dioptre = 0.0f;
    }

    public void clearGlasses(){
        this.isInUse = true;
        if(isDirty == true) {
            this.isDirty = false;
        }
    }
}
