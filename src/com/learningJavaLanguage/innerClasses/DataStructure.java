package com.learningJavaLanguage.innerClasses;
import java.util.function.Function;

public class DataStructure {
    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    //TODO: Invoke with anonymous class as method's argument to print Odd numbers
    //TODO: Define a method named print(java.util.Function<Integer, Boolean> iterator) that performs the same
    // function as print(DataStructureIterator iterator).
    // Invoke this method with a lambda expression to print elements that have an even index value.
    // Invoke this method again with a lambda expression to print elements that have an odd index value.
    // TODO: Define two methods so that the following two statements print elements that have an even index
    // value and elements that have an odd index value:
    /*
        DataStructure ds = new DataStructure()
    // ...
    ds.print(DataStructure::isEvenIndex);
    ds.print(DataStructure::isOddIndex);
    */
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void print(DataStructureIterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(Function<Integer, Boolean> function){
        for (int i = 0; i<SIZE; i++){
            if(function.apply(i)){
                System.out.println(arrayOfInts[i] + " ");
            }
        }
        System.out.println();
    }

    public EvenIterator getEventIterator(){
        return new EvenIterator();
    }
    public int[] getArray(){
        return arrayOfInts;
    }

    public void printEven() {
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    private class EvenIterator implements DataStructureIterator {
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        public boolean hasNext() {
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }
        public Integer next() {
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public DataStructureIterator getOddIterator(){
        class OddIterator implements DataStructureIterator {
            private int nextIndex = 1;

            public boolean hasNext() {
                // Check if the current element is the last in the array
                return (nextIndex <= SIZE - 1);
            }

            public Integer next() {
                Integer retValue = arrayOfInts[nextIndex];
                nextIndex += 2;
                return retValue;
            }
        }
        OddIterator od = new OddIterator();
        return od;
    }

    public static boolean isEvenIndex(Integer index){
        return index % 2 == 0 ? true : false;
    }

    public static boolean isOddIndex(Integer index) {
        return index % 2 != 0 ? true : false;
    }

    public static void main(String s[]) {
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
        ds.print(ds.getEventIterator()); // Create new method since eventIterator is not acessible from static context
        ds.print(ds.getOddIterator()); //inner class in DS

        //Anonymous class usage
        ds.print(new DataStructureIterator() {
            private int nextIndex = 1;
            @Override
            public boolean hasNext() {
                return (nextIndex <= SIZE - 1);
            }

            @Override
            public Integer next() {
                int[] arrayOfInts = ds.getArray();
                Integer retValue = arrayOfInts[nextIndex];
                nextIndex += 2;
                return retValue;
            }
        });

        //Invoke with lambdas
        System.out.println("Lambdas:");
        ds.print(a -> (a % 2 !=0) );
        ds.print(a -> a % 2 == 0);

        //Invoke by method reference ( method should be static)
        ds.print(DataStructure::isEvenIndex);
        ds.print(DataStructure::isOddIndex);
    }



}

