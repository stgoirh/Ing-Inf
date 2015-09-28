/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.util.Scanner;

/**
 *
 * @author stgoirh
 */
public class Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		int dec, i, bin;
                i=1;
		bin=0;
		Scanner sc= new Scanner(System.in);
		
		do	{
			System.out.println("ingrese numero menor que 257");
			dec = sc.nextInt();
		}
		while(dec>257 & dec<0);
                
                while (1!=dec){                    
                        bin=bin+(dec%2)*i;
                        dec=dec/2;
                        i=i*10;
                }
		bin=bin+(dec%2)*i;
		System.out.println(bin);
	}
    }
    

