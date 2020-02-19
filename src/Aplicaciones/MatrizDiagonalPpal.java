package Aplicaciones;
import java.util.Scanner;

public class MatrizDiagonalPpal 
{

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
       
	   //--Leemos el Tamano de la Matriz--//
	   System.out.print("Entre el Tamano de la Matriz :");
	   int n = sc.nextInt();
	   System.out.println("---------------------------"); 
	   
	   //--Define la matriz--//
	   int[][] mat = new int[n][n];
	   
	   //--Leemos todos los Valores--//
	   for(int i=0; i<mat.length; i++)
	   {
	      for(int j=0; j<mat[i].length; j++)
	      {
	         System.out.print("Valor de Pos "+i+","+j+" :");	
	         mat[i][j] = sc.nextInt();
	      }
	   }
	   
	   //--Imprime la Matriz--//
	   for(int i=0; i<mat.length; i++)
	   {
	      for(int j=0; j<mat[i].length; j++)
	      {
	    	 //--Primera Linia--// 
		     if(i==0 && j== 0) 
		     {	 
	    	    System.out.print("+"); 
		        for(int k=0; k<=n*2; k++)
		        {
		            System.out.print("-");
		    	} 	
		        System.out.print("+");
		        System.out.println();
		     }
  
	    	  
	    	 //--Cuerpo de la Matriz--//
	    	 if(j==n-1)
	    	 {
	    		 System.out.println("|"+mat[i][j]+"|");
	    	 }
	    	 else
	    	 {	 
	    		 System.out.print("|"+mat[i][j]); 
 	    	 }
	    	 
	      }
	   }
  	   //--Ultima Linia--//
	   System.out.print("+"); 
	   for(int k=0; k<=n*2; k++)
	   {
	      System.out.print("-");
	   } 	
	   System.out.print("+");
	   System.out.println();
	   
	   //--Diagonal Principal--//
	   System.out.println("--------Diagonal Principal-------------");
	   for(int i=0; i<mat.length; i++)
	   {
		   System.out.print("|"+mat[i][i]+"|"); 
	   }
	   System.out.println();
	   System.out.println("--------Diagonal Principal-------------");
	   
	   //--Numero Negativos--//
	   System.out.println("--------Cantidad Nros. Negativos-------------");
	   int cuenta = 0;
	   for(int i=0; i<mat.length; i++)
	   {
		   for(int j=0; j<mat[i].length; j++)
		   {
			  if(mat[i][j]<0)
			  {
				 cuenta ++;
		         System.out.print("|"+mat[i][j]+"|");
			  }
		   }
	   }
	   System.out.println("Total :"+cuenta);
	   System.out.println("--------Cantidad Nros. Negativos-------------");
	   
	   sc.close();
	   System.exit(0);
	}

}

