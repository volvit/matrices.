package com.company;
public class Matrix {
    int n ;
    int m ;
    double [][]arr ;

    public String toString(){

        System.out.println("Matrix{");
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        return "}";
    }
    Matrix(){
        this.n = 1;
        this.m = 1;
        this.arr = new double[1][1];
        arr[0][0] = 0;
    }
    Matrix(int n){
        this.m = n;
        this.n = n;
        this.arr = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
    }
    Matrix(int n,int m){
        this.n = n;
        this.m = m;
        this.arr = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = 0;
            }
        }
    }
    Matrix(double arr[][]){
        this.arr = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                this.arr[i][j] = arr[i][j];
            }
        }
    }
    Matrix sum (Matrix a) {

        if (arr.length != a.arr.length) {
            // System.out.println(" null ");
            return null;
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] += a.arr[i][j];
                }
            }
            return new Matrix(arr);
        }
    }

}
