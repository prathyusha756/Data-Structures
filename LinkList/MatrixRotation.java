package DataStructures.LinkList;
//You are given an n x n 2D matrix representing an image.Rotate the image by 90 degrees (clockwise)//

public class MatrixRotation {

    int[][] temp;
    int rows;
    int[][] arr;

    public MatrixRotation(int[][] arr){
        this.arr=arr;
        rows=arr.length;
        temp=new int[rows][rows];
    }

    public void matrix(){

        //by default gives number of rows.To find number of coloumns int n=arr[0].length//

        int i=rows-1;

             temp[i-(rows-1)][i-(rows-1)]= arr[i][i-(rows-1)];
             temp[i-(rows-1)+1][i-(rows-1)]=arr[i][i-(rows-1)+1];


        }

    public void display(){
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args){
        int[][] arr= {{1,2},{4,5}};
        MatrixRotation obj= new MatrixRotation(arr);
        obj.matrix();
        obj.display();


    }
}
//temp[i-(rows-1)][j]= arr[i][j];
//        temp[i-(rows-1)+1][j]=arr[i][j+1];