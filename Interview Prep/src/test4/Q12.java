package test4;
/*12. Write a Java program to find the common elements
 *  between two arrays (int values) Means. arr1[] = [4, 23, 10, 8 ,12, 32, 9] and 
 *  arr2[] = [9, 25, 14, 23, 55, 43, 12, 22], so common
between two arrays are 23 and 12. [1m]*/

public class Q12 {

public static void main(String[] args) {
	int arr1[] = {4, 23, 10, 8 ,12, 32, 9};
	int arr2 [] = {9, 25, 14, 23, 55, 43, 12, 22};
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr2.length;j++){
			if (arr1[i]==arr2[j]){
				System.out.println(arr2[j]);
			}
			}
	}
}

	
}
