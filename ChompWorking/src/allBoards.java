import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class allBoards {

    Map<String,ChunBoard> arrayHashMap =new HashMap<String,ChunBoard>(187556);
    Map<String,ChunBoard> winningMap =new HashMap<String,ChunBoard>(100000);
    public int[] col = new int[10];
    ArrayList<ChunBoard> winnerboards = new ArrayList<ChunBoard>();
    ArrayList<ChunBoard> boards = new ArrayList<ChunBoard>();
    int yesitsthesame = 0;


   public ArrayList<ChunBoard> printAllBoards() {
            int importantCounter = 0;
            while(col[0] < col.length) {
                col[0]++;
                col[1] = 0;
                col[2] = 0;
                col[3] = 0;
                col[4] = 0;
                col[5] = 0;
                col[6] = 0;
                col[7] = 0;
                col[8] = 0;
                col[9] = 0;
                ChunBoard c = new ChunBoard();
                //System.out.println(boards.size());
                for (int i = 0; i < c.col.length; i++){
                    c.col[i] = col[i];
                }
                boards.add(c);
                arrayHashMap.put("" + c.col[0] + "" + c.col[1] + "" + c.col[2] + "" + c.col[3] + "" + c.col[4] +  "" + c.col[5] + "" + c.col[6] + "" + c.col[7] + "" + c.col[8] + "" + c.col[9],boards.get(importantCounter));
                importantCounter++;

               while(col[0] > col[1]){
                    col[1]++;
                    col[2] = 0;
                    col[3] = 0;
                    col[4] = 0;
                    col[5] = 0;
                    col[6] = 0;
                    col[7] = 0;
                    col[8] = 0;
                    col[9] = 0;
                    ChunBoard c2 = new ChunBoard();
                   // System.out.println(boards.size());
                    for (int i = 0; i < c2.col.length; i++){
                        c2.col[i] = col[i];
                    }
                    boards.add(c2);
                    arrayHashMap.put("" + c2.col[0] + "" + c2.col[1] + "" + c2.col[2] + "" + c2.col[3] + "" + c2.col[4] +  "" + c2.col[5] + "" + c2.col[6] + "" + c2.col[7] + "" + c2.col[8] + "" + c2.col[9],boards.get(importantCounter));
                    importantCounter++;
                    while(col[1] > col[2]){
                        col[2]++;
                        col[3] = 0;
                        col[4] = 0;
                        col[5] = 0;
                        col[6] = 0;
                        col[7] = 0;
                        col[8] = 0;
                        col[9] = 0;
                        ChunBoard c3 = new ChunBoard();
                        //System.out.println(boards.size());

                        for (int i = 0; i < c3.col.length; i++){
                            c3.col[i] = col[i];
                        }
                        boards.add(c3);
                        arrayHashMap.put("" + c3.col[0] + "" + c3.col[1] + "" + c3.col[2] + "" + c3.col[3] + "" + c3.col[4] +  "" + c3.col[5] + "" + c3.col[6] + "" + c3.col[7] + "" + c3.col[8] + "" + c3.col[9],boards.get(importantCounter));
                        importantCounter++;
                         while(col[2]>col[3]){
                            col[3]++;
                            col[4] = 0;
                            col[5] = 0;
                            col[6] = 0;
                            col[7] = 0;
                            col[8] = 0;
                            col[9] = 0;
                          //  System.out.println(boards.size());
                            ChunBoard c4 = new ChunBoard();
                            for (int i = 0; i < c4.col.length; i++){
                                c4.col[i] = col[i];
                            }
                            boards.add(c4);
                            arrayHashMap.put("" + c4.col[0] + "" + c4.col[1] + "" + c4.col[2] + "" + c4.col[3] + "" + c4.col[4] +  "" + c4.col[5] + "" + c4.col[6] + "" + c4.col[7] + "" + c4.col[8] + "" + c4.col[9],boards.get(importantCounter));
                            importantCounter++;
                            while(col[3]>col[4]){
                                col[4]++;
                                col[5] = 0;
                                col[6] = 0;
                                col[7] = 0;
                                col[8] = 0;
                                col[9] = 0;
                                ChunBoard c5 = new ChunBoard();
                                //System.out.println(boards.size());
                                for (int i = 0; i < c5.col.length; i++){
                                    c5.col[i] = col[i];
                                }
                                boards.add(c5);
                                arrayHashMap.put("" + c5.col[0] + "" + c5.col[1] + "" + c5.col[2] + "" + c5.col[3] + "" + c5.col[4] +  "" + c5.col[5] + "" + c5.col[6] + "" + c5.col[7] + "" + c5.col[8] + "" + c5.col[9],boards.get(importantCounter));
                                importantCounter++;
                                while(col[4]>col[5]){
                                    col[5]++;
                                    col[6] = 0;
                                    col[7] = 0;
                                    col[8] = 0;
                                    col[9] = 0;
                                    ChunBoard c6 = new ChunBoard();
                                    //System.out.println(boards.size());
                                    for (int i = 0; i < c6.col.length; i++){
                                        c6.col[i] = col[i];
                                    }
                                    boards.add(c6);
                                    arrayHashMap.put("" + c6.col[0] + "" + c6.col[1] + "" + c6.col[2] + "" + c6.col[3] + "" + c6.col[4] +  "" + c6.col[5] + "" + c6.col[6] + "" + c6.col[7] + "" + c6.col[8] + "" + c6.col[9],boards.get(importantCounter));
                                    importantCounter++;
                                    while(col[5]>col[6]){
                                        col[6]++;
                                        col[7] = 0;
                                        col[8] = 0;
                                        col[9] = 0;
                                        ChunBoard c7 = new ChunBoard();
                                       // System.out.println(boards.size());
                                        for (int i = 0; i < c7.col.length; i++){
                                            c7.col[i] = col[i];
                                        }
                                        boards.add(c7);
                                        arrayHashMap.put("" + c7.col[0] + "" + c7.col[1] + "" + c7.col[2] + "" + c7.col[3] + "" + c7.col[4] +  "" + c7.col[5] + "" + c7.col[6] + "" + c7.col[7] + "" + c7.col[8] + "" + c7.col[9],boards.get(importantCounter));
                                        importantCounter++;
                                        while(col[6]>col[7]){
                                            col[7]++;
                                            col[8] = 0;
                                            col[9] = 0;
                                            ChunBoard c8 = new ChunBoard();
                                           // System.out.println(boards.size());
                                            for (int i = 0; i < c8.col.length; i++){
                                                c8.col[i] = col[i];
                                            }
                                            boards.add(c8);
                                            arrayHashMap.put("" + c8.col[0] + "" + c8.col[1] + "" + c8.col[2] + "" + c8.col[3] + "" + c8.col[4] +  "" + c8.col[5] + "" + c8.col[6] + "" + c8.col[7] + "" + c8.col[8] + "" + c8.col[9], boards.get(importantCounter));
                                            importantCounter++;
                                            while(col[7]>col[8]){
                                                col[8]++;
                                                col[9] = 0;
                                              //  System.out.println(boards.size());
                                                ChunBoard c9 = new ChunBoard();
                                                for (int i = 0; i < c9.col.length; i++){
                                                    c9.col[i] = col[i];
                                                }
                                                boards.add(c9);
                                                arrayHashMap.put("" + c9.col[0] + "" + c9.col[1] + "" + c9.col[2] + "" + c9.col[3] + "" + c9.col[4] +  "" + c9.col[5] + "" + c9.col[6] + "" + c9.col[7] + "" + c9.col[8] + "" + c9.col[9],boards.get(importantCounter));
                                                importantCounter++;
                                                while(col[8]>col[9]){
                                                    col[9]++;
                                                    ChunBoard c10 = new ChunBoard();
                                                 //   System.out.println(boards.size());
                                                    for (int i = 0; i < c10.col.length; i++){
                                                        c10.col[i] = col[i];
                                                    }
                                                    boards.add(c10);
                                                    arrayHashMap.put("" + c10.col[0] + "" + c10.col[1] + "" + c10.col[2] + "" + c10.col[3] + "" + c10.col[4] +  "" + c10.col[5] + "" + c10.col[6] + "" + c10.col[7] + "" + c10.col[8] + "" + c10.col[9],boards.get(importantCounter));
                                                    importantCounter++;
                                                    //System.out.println("" + col[0] + "" + col[1] + "" + col[2]+""+col[3]+ "" + col[4] + "" + col[5] + "" + col[6] + "" + col[7] + "" + col[8] + "" + col[9] );
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }



            }
        int boardslength = boards.size();
        int i = 0;
        for ( ChunBoard counter : boards) {
            i++;
            //System.out.println(Arrays.toString(counter.col)+""+i);

        }
        return boards;

        }

    //false = lose
    //true = winner
    public void playbookGenerator(int pBoard) {
        int boardNumber;
        boardNumber = pBoard;
        ChunBoard c = new ChunBoard();
        c.col = boards.get(boardNumber).col.clone();
        String boardString = ("" + c.col[0] + "" + c.col[1] + "" + c.col[2] + "" + c.col[3] + "" + c.col[4] +  "" + c.col[5] + "" + c.col[6] + "" + c.col[7] + "" + c.col[8] + "" + c.col[9]);

        for (int i = 9; i >= 0; i--) {
            c.col = boards.get(boardNumber).col.clone();
            for (int rowcounter = c.col[i]; rowcounter >= 0; rowcounter--) {
                c.col[i] = rowcounter;
                for(int boardfixer = 9; boardfixer > 0; boardfixer--){
                    if(boardfixer > i){
                        if(c.col[boardfixer] > c.col[i]){
                            c.col[boardfixer] = c.col[i];
                        }
                    }
                }
                boardString = ("" + c.col[0] + "" + c.col[1] + "" + c.col[2] + "" + c.col[3] + "" + c.col[4] +  "" + c.col[5] + "" + c.col[6] + "" + c.col[7] + "" + c.col[8] + "" + c.col[9]);
                if(winningMap.containsKey(boardString)) {
                    boards.get(boardNumber).move = (i * 10) + (9 - rowcounter);
                    boardString = ("" + boards.get(boardNumber).col[0] + "" + boards.get(boardNumber).col[1] + "" + boards.get(boardNumber).col[2] + "" + boards.get(boardNumber).col[3] + "" + boards.get(boardNumber).col[4] +  "" + boards.get(boardNumber).col[5] + "" + boards.get(boardNumber).col[6] + "" + boards.get(boardNumber).col[7] + "" + boards.get(boardNumber).col[8] + "" + boards.get(boardNumber).col[9]);
                    arrayHashMap.put(boardString,boards.get(boardNumber));
                    return;
                }
                }
        }

        boards.get(boardNumber).move = 27;
        boardString = ("" + boards.get(boardNumber).col[0] + "" + boards.get(boardNumber).col[1] + "" + boards.get(boardNumber).col[2] + "" + boards.get(boardNumber).col[3] + "" + boards.get(boardNumber).col[4] +  "" + boards.get(boardNumber).col[5] + "" + boards.get(boardNumber).col[6] + "" + boards.get(boardNumber).col[7] + "" + boards.get(boardNumber).col[8] + "" + boards.get(boardNumber).col[9]);
        winningMap.put(boardString,boards.get(boardNumber));
    }

    public void learnToWin(){
        boards.get(0).move = 9;
        winningMap.put(("" + 1 + "" + 0 + "" + 0 + "" + 0 + "" + 0 +  "" +  0 + "" + 0 + "" + 0 + "" + 0 + "" + 0),boards.get(0));

        for (int j = 1; j < boards.size();j++){
            playbookGenerator(j);

        }
    }

    public void algorithm() {

        int b = 11;
        int c = 11;
        int total = 0;
        for (int a = 11; a > 1; a--){
            b=a;
            while(b>=0){
                c = b;
                if(c >= 0){
                    int trianglenumber = ((c^2 + c)/2);
                    total = total + trianglenumber;
                    c--;
                }
                b--;
            }
        }
    }
}



