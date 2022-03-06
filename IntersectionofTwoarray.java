package assignment;

public class IntersectionofTwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,6,8,12,14,23,45,67};
int b[]= {4,6,8,45,53,68};
int n=a.length;
int m=b.length;
int i=0;
int j=0;
while(i<n&&j<m) {
	if(a[i]<b[j]) {
		i++;
	}
	else if(b[j]<a[i]) {
		j++;
	}
	else {
		System.out.print(a[i]+" ");;
		i++;
		j++;
	}
}
	}

}
