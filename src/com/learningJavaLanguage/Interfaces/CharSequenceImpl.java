package com.learningJavaLanguage.Interfaces;

public class CharSequenceImpl implements java.lang.CharSequence {
    //1. Take a look at documentation
    //2. Take a look at what implements it, to know what to return in subSequence or create a nested class

     String sequence;

     public CharSequenceImpl (String sequence){
         this.sequence = sequence;
     }

    public int length(){
        return sequence.length();
    }
    public char charAt(int index){
         if (index > sequence.length() || index < 0)
             throw new IndexOutOfBoundsException();
        return sequence.charAt(index);
    }

    public CharSequence subSequence(int start, int end){
        if(start < 0 || end <0)
            throw new IndexOutOfBoundsException();
        if (end > length() || start > end)
            throw new IndexOutOfBoundsException();
        return sequence.subSequence(start,end);
    }

    public String toString(){
        return sequence;
    }

    public static void main(String[] args) {
         CharSequence sequence = new CharSequenceImpl("Hasan");
         System.out.println(sequence.length());
         System.out.println(sequence.subSequence(1,4));
         System.out.println(sequence.charAt(1));

    }
}

