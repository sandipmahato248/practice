package com.sandip.practice;

import java.util.ArrayList;
import java.util.List;

public class TestDXC {

	    public static void main(String args[] ) throws Exception {
	        List<Integer> list = generateSequence( 20 );
	         System.out.println(list);
	    }

	    public static List<Integer> generateSequence( int n ) {
	        List< Integer > list = new ArrayList<>();
	        System.out.println(list);
	        list.add(n);
	        if(n==1) return list;
	        if(n%2 == 0){
	            list.addAll(generateSequence(n/2));
	        }else{
	            list.addAll(generateSequence( (n * 3)+1));
	        }
	        return list;
	    }
	

}
