package collections.interfaces.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class implExl {

    public static void main(String[] args) {
        File psFile = new File("randomFile.txt");
        List<String> list = new ArrayList<>();
        Scanner psFileScan = null;

        try{
            psFileScan = new Scanner(psFile);
        }catch( IOException e){
            e.printStackTrace();
        }

        while(psFileScan.hasNextLine())
        {
            list.add(psFileScan.nextLine());
        }
        psFileScan.close();

        Random rnd = new Random();
        for(int i = 0; i < Integer.parseInt(args[1]); i++){
            System.out.println(list.get(rnd.nextInt(list.size())-1));
        }
    }
}