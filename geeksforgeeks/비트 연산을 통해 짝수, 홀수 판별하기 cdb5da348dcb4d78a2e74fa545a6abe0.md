# 비트 연산을 통해 짝수, 홀수 판별하기

정수 값 N이 주어지면, bitwise연산을 이용하여 홀수인지 짝수 인지 검사하시오.
Given a number N, the task is to check whether the number is even or odd using Bitwise Operators

비트 연산을 통해 짝수, 홀수 판별하기
Check if a Number is Odd or Even using Bitwise Operators

입력 Input: N = 11
출력 Output: Odd

입출력 예
입력 :  Input: N = 10
출력 : Output: Even

```
package code;

import java.io.*;
import java.util.Scanner;

public class Bit1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(isEven(n) == 1){
		    System.out.println("odd");
		}else{
		    System.out.println("Even");
		}
		if(isXorEven(n) == 1){
		    System.out.println("odd");
		}else{
		    System.out.println("Even");
		}
	}
	
	public static int isEven(int n){
	    return ( n & 1);
	}

	
	public static int isXorEven(int n){
	    if((n ^ 1) == (n + 1)){
	        return 0;
	    }else{
	        return 1;
	    }
	}

}
```