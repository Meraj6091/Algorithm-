package com.algo.cw;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxFlow {
    private Scanner sc1=new Scanner(System.in);
    private Scanner sc;
    public ArrayList<int []> Arraylist = new ArrayList<>();
    public int nodeCount = 0;

    int [][] matrix ;
    String path;
    public void display() {

            System.out.println("Enter 1 to open bridge 1 :");
            System.out.println("Enter 2 to open bridge 2 :");
            System.out.println("Enter 3 to open bridge 3 :");
            System.out.println("Enter 4 to open bridge 4 :");
            System.out.println("Enter 5 to open bridge 5 :");
            System.out.println("Enter 6 to open bridge 6 :");
            System.out.println("Enter 7 to open bridge 7 :");
            System.out.println("Enter 8 to open bridge 8 :");
            System.out.println("Enter 9 to open bridge 9 :");
            System.out.println("Enter 10 to open Ladder 1 :");
            System.out.println("Enter 11 to open ladder 2 :");
            System.out.println("Enter 12 to open ladder 3 :");
            System.out.println("Enter 13 to open ladder 4 :");
            System.out.println("Enter 14 to open ladder 5 :");
            System.out.println("Enter 15 to open ladder 6 :");
            System.out.println("Enter 16 to open ladder 7 :");
            System.out.println("Enter 17 to open ladder 8 :");
            System.out.println("Enter 18 to open ladder 9 :");
            System.out.println("Press Q : To Quit");
            String choice = sc1.next();

            switch (choice) {
                case "1":
                    path="./src/com/algo/cw/bridge_1.txt";
                    long starttime = System.nanoTime();
                    bridge1();
                    long endTime = System.nanoTime();
                    double elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "2":
                    path="./src/com/algo/cw/bridge_2.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "3":
                    path="./src/com/algo/cw/bridge_3.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "4":
                    path="./src/com/algo/cw/bridge_4.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "5":
                    path="./src/com/algo/cw/bridge_5.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "6":
                    path="./src/com/algo/cw/bridge_6.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "7":
                    path="./src/com/algo/cw/bridge_7.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "8":
                    path="./src/com/algo/cw/bridge_8.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "9":
                    path="./src/com/algo/cw/bridge_9.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "10":
                    path="./src/com/algo/cw/ladder_1.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "11":
                    path="./src/com/algo/cw/ladder_2.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "12":
                    path="./src/com/algo/cw/ladder_3.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.00000001 + " ms");
                    break;
                case "13":
                    path="./src/com/algo/cw/ladder_4.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.00000001 + " ms");
                    break;
                case "14":
                    path="./src/com/algo/cw/ladder_5.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "15":
                    path="./src/com/algo/cw/ladder_6.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "16":
                    path="./src/com/algo/cw/ladder_7.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "17":
                    path="./src/com/algo/cw/ladder_8.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "18":
                    path="./src/com/algo/cw/ladder_9.txt";
                    starttime = System.nanoTime();
                    bridge1();
                    endTime = System.nanoTime();
                    elapsedTime = (double) endTime - starttime;
                    System.out.println("");
                    System.out.println("elapsed time: "+ elapsedTime*0.000001 + " ms");
                    break;
                case "q":
                case "Q":
                    System.out.println("");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input.. Please try Again\n");
            }

        }


    private void bridge1() {

        try {
            sc = new Scanner(new File(path));// have to change file path
        } catch (Exception e) {
            System.out.println("Error no file to find");
        }

            int nodes = sc.nextInt();
            nodeCount = nodes;
            System.out.println("No of vertices in graph " + nodeCount+"\n");
            while(sc.hasNext()) {
                int [] arr = new int[3];

                int s = sc.nextInt();
                int t = sc.nextInt();
                int c = sc.nextInt();

                arr[0] = s;
                arr[1] = t;
                arr[2] = c;

                Arraylist.add(arr);

                System.out.printf("%s %s %s\n", "u -> "+s,"v -> " +t,"capacity -> "+c);

            }

//            for (int [] element : Arraylist){
//                System.out.println(element);
//            }
            sc.close();


        makingMatrix();
        System.out.println("The maximum possible flow is " + fordFulkerson(matrix, 0, nodeCount -1 ));
        System.out.println();
        System.out.println("            GRAPH             ");
        for(int i=0; i<nodes;i++){
            for(int x=0;x<nodes;x++){
                System.out.print("\t"+matrix[i][x]);
            }
            System.out.println(i+"\t");
        }
    }

    public void makingMatrix(){
        matrix = new int[nodeCount][nodeCount];
        for (int [] element : Arraylist){
            matrix[element[0]][element[1]] = element[2];
        }
    }

    boolean bfs(int rGraph[][], int s, int t, int parent[])
    {

        boolean visited[] = new boolean[nodeCount];
        for (int i = 0; i < nodeCount; ++i)
            visited[i] = false;


        LinkedList<Integer> queue
                = new LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;

        // Standard BFS Loop
        while (queue.size() != 0) {
            int u = queue.poll();

            for (int v = 0; v < nodeCount; v++) {
                if (visited[v] == false
                        && rGraph[u][v] > 0) {

                    if (v == t) {
                        parent[v] = u;
                        return true;
                    }
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }

        return false;
    }

    // reference - https://www.geeksforgeeks.org/ford-fulkerson-algorithm-for-maximum-flow-problem/
    // graph
    int fordFulkerson(int graph[][], int s, int t)
    {
        int u, v;

        int rGraph[][] = new int[nodeCount][nodeCount];

        for (u = 0; u < nodeCount; u++)
            for (v = 0; v < nodeCount; v++)
                rGraph[u][v] = graph[u][v];

        // This array is filled by BFS and to store path
        int parent[] = new int[nodeCount];

        int max_flow = 0; // There is no flow initially

        while (bfs(rGraph, s, t, parent)) {

            int path_flow = Integer.MAX_VALUE;
            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                path_flow
                        = Math.min(path_flow, rGraph[u][v]);
            }


            for (v = t; v != s; v = parent[v]) {
                u = parent[v];
                rGraph[u][v] -= path_flow;
                rGraph[v][u] += path_flow;
            }


            max_flow += path_flow;
        }


        return max_flow;
    }


}
