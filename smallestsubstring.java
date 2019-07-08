package com.service;

import java.util.*;

public class smallestsubstring
{
		static final int MAX_CHARS = 256;
	    public static void main(String args[]) 
	    { 
	    	Scanner ob=new Scanner(System.in);
	        String s = ob.next(); 
	        int len = s.length();
	        int dc = 0; 
	        boolean[]  r= new boolean[MAX_CHARS]; 
	        Arrays.fill(r, false); 
	        for (int i=0; i<len; i++) 
	        { 
	            if (r[s.charAt(i)] == false) 
	            { 
	                r[s.charAt(i)] = true; 
	                dc++; 
	            } 
	        }
	        int st = 0, si = -1; 
	        int ml = Integer.MAX_VALUE;
	        int count = 0; 
	        int[] cc =  new int[MAX_CHARS]; 
	        for (int j=0; j<len; j++) 
	        { 
	            cc[s.charAt(j)]++; 
	      
	            if (cc[s.charAt(j)] == 1 ) 
	                count++; 
	            if (count == dc) 
	            { 
	                while (cc[s.charAt(st)] > 1) 
	                { 
	                    if (cc[s.charAt(st)] > 1) 
	                        cc[s.charAt(st)]--; 
	                    st++; 
	                } 
	                int lw = j - st + 1; 
	                if (ml > lw) 
	                { 
	                    ml = lw; 
	                    si = st; 
	                } 
	            } 
	        }
	        System.out.println(s.substring(si, si+ml).length()); 
	    } 
	} 




