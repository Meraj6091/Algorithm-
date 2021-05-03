package com.algo.cw;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MaxFlow {
    private Scanner sc=new Scanner(System.in);

    public void display() {
        for (;;) {
            System.out.println("Enter 1 to vegetable :");
            System.out.println("Enter 2 chicken:");
            System.out.println("Enter 3 fish:");
            Integer choice = Integer.valueOf(sc.next());

            switch (choice) {
                case 1:
                    vegi();
                    break;
                case 2:
                    chick();
                    break;
                case 3:
                    fish();
                    break;
                case -1:
                    System.out.println("");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input.. Please try Again\n");
            }

        }

    }
    private void fish() {
        System.out.println("price = rs.1400");
        System.out.println(" if you buy more than 3 pizza dis= 15%");
        System.out.println("enter the quantity");
        int count=sc.nextInt();

        if(count>=3){
            System.out.println("10% discount is added");
            int dis=(((1400*count)/100)*15);
            System.out.println("total :" + ((1400*count)-dis));
        }
        else
            System.out.println("total is:" + 1400*count);

    }

    private void chick() {
        System.out.println("price = rs.1600");
        System.out.println(" if you buy more than 3 pizza dis= 12%");
        System.out.println("enter the quantity");
        int count=sc.nextInt();

        if(count>=3){
            System.out.println("10% discount is added");
            int dis=(((1600*count)/100)*12);
            System.out.println("total :" + ((1600*count)-dis));
        }
        else
            System.out.println("total is:" + 1600*count);
    }

    private void vegi() {
        System.out.println("price = rs.1000");
        System.out.println(" if you buy more than 3 pizza dis= 10%");
        System.out.println("enter the quantity");
        int count=sc.nextInt();

        if(count>=3){
            System.out.println("10% discount is added");
            int dis=(((1000*count)/100)*10);
            System.out.println("total :" + ((1000*count)-dis));
        }
        else
            System.out.println("total is:" + 1000*count);

    }
//    private void bridge1() {
//
//        try {
//            sc = new Scanner(new File(path));// have to change file path
//        } catch (Exception e) { //
//            System.out.println("Error no file to find");
//        }
//
//            int nodes = sc.nextInt();
//            nodeCount = nodes;
//            System.out.println("No of vertices in graph " + nodeCount+"\n");
//            while(sc.hasNext()) {
//                int [] arr = new int[3];
//
//                int s = sc.nextInt();
//                int t = sc.nextInt();
//                int c = sc.nextInt();
//
//                arr[0] = s;
//                arr[1] = t;
//                arr[2] = c;
//
//                Arraylist.add(arr);
//
//                System.out.printf("%s %s %s\n", "u -> "+s,"v -> " +t,"capacity -> "+c);
//
//            }
//
////            for (int [] element : Arraylist){
////                System.out.println(element);
////            }
//            sc.close();
//
//
//        makingMatrix();
//        System.out.println("The maximum possible flow is " + fordFulkerson(matrix, 0, nodeCount -1 ));
//        System.out.println();
//        System.out.println("            GRAPH             ");
//        for(int i=0; i<nodes;i++){
//            for(int x=0;x<nodes;x++){
//                System.out.print("\t"+matrix[i][x]);
//            }
//            System.out.println(i+"\t"); // vertically print
//        }
//    }
//
//    public void makingMatrix(){
//        matrix = new int[nodeCount][nodeCount]; // this is used to create matrix
//        for (int [] element : Arraylist){
//            matrix[element[0]][element[1]] = element[2]; //
//        }
//    }
//
//    boolean bfs(int rGraph[][], int s, int t, int parent[])
//    {
//
//        boolean visited[] = new boolean[nodeCount];
//        for (int i = 0; i < nodeCount; ++i)
//            visited[i] = false;
//
//
//        LinkedList<Integer> queue = new LinkedList<Integer>();
//        queue.add(s);
//        visited[s] = true;
//        parent[s] = -1;
//
//        // Standard BFS Loop
//        while (queue.size() != 0) {
//            int u = queue.poll(); //returns and remove the element at the front container
//
//            for (int v = 0; v < nodeCount; v++) {   // we are checking is the exsisting vertex is visited or not
//                if (visited[v] == false && rGraph[u][v] > 0) {
//
//                    if (v == t) {
//                        parent[v] = u;
//                        return true;
//                    }
//                    queue.add(v);
//                    parent[v] = u;
//                    visited[v] = true;
//                }
//            }
//        }
//
//        return false;
//
//    }
//
//    // reference - https://www.geeksforgeeks.org/ford-fulkerson-algorithm-for-maximum-flow-problem/
//    // graph
//    int fordFulkerson(int graph[][], int s, int t)
//    {
//        int u, v;
//
//        int rGraph[][] = new int[nodeCount][nodeCount];
//
//        for (u = 0; u < nodeCount; u++)
//            for (v = 0; v < nodeCount; v++)
//                rGraph[u][v] = graph[u][v];
//
//        // This array is filled by BFS and to store path
//        int parent[] = new int[nodeCount];
//
//        int max_flow = 0; // There is no flow initially
//
//        while (bfs(rGraph, s, t, parent)) {
//
//            int path_flow = Integer.MAX_VALUE;
//            for (v = t; v != s; v = parent[v]) {
//                u = parent[v];
//                path_flow= Math.min(path_flow, rGraph[u][v]);
//            }
//
//
//            for (v = t; v != s; v = parent[v]) {
//                u = parent[v];
//                rGraph[u][v] -= path_flow;
//                rGraph[v][u] += path_flow;
//            }
//
//
//            max_flow += path_flow;
//        }
//
//
//        return max_flow;
//    }


}
