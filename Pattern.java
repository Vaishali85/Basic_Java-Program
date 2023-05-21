import java.io.*;

class Pattern
{
    public static void main(String args[])throws Exception
    {
        int i,j,row;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of rows: ");
        row = Integer.parseInt(br.readLine());
      

		//*
		//**
		//***
		//****
		//*****

	  for(i=0;i<row;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
			
			
			
			//*****
			//****
			//***
			//**
			//*
		/*	for(i=1;i<row;i++)
			{
            for(j=row;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();*/
        }
    }
}