import java.io.*;
class City_Sort
{
public static void main (String args[]) throws IOException

{
int n,len,len1,c,i,j,k=0,m=0;
String str[]=new String[5] ;
String s1;
String s2,temp;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
for (i=0;i<5;i++)
{
System.out.println("Enter the string "+i+ "of the Array :=> ");
str[i]= br.readLine();
}

System.out.println("\n Sorted Strings are :-");
for(i=0;i<5;i++)
{

for(j=i+1;j<5;j++)
{
if(str[j].compareTo(str[i])<0)
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
System.out.println(str[i]);
}
}
}
/*
Enter the string 0of the Array :=> zz

Enter the string 1of the Array :=> aa

Enter the string 2of the Array :=> y

Enter the string 3of the Array :=> bb

Enter the string 4of the Array :=> u


Sorted Strings are :-
aa
bb
u
y
zz
*/
