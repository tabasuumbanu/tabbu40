/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int start = -3;
int end = 6;

for (int val = start; val < end; val++)
{
    // Condition to Check Even, Not condition (!) will give Odd number
    if (val % 2 == 0) 
    {
        System.out.println("Even" + val);
    }
    else
    {
        System.out.println("Odd" + val);
    }
}
	}
}
