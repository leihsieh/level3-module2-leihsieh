package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + (num1*num2);
    }
    
    public static boolean isPrime(int num) {
    	boolean prime = true;
    	for(int i = 2; i < num; i++) {
    		if(num % i == 0) {
    			prime = false;
    		}
    	}
    	return prime;
    }
    
    public static boolean isSquare(int num) {
    	double sq = Math.sqrt(num);
    	return (sq - Math.floor(sq)==0);
    }
    
    public static boolean isCube(int num) {
    	int cb = (int) Math.round(Math.pow(num, 1.0/3.0));
    	return (num == cb*cb*cb);
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	int index = 0;
    	for(int i = 0; i < eggs.size(); i++) {
    		if(eggs.get(i).equals("cracked")) {
    			index = i;
    			break;
    		}
    	}
        return index;
    }
    
    public static int countPearls(List<Boolean> oysters) {
    	int pearlCount = 0;
    	for(int i = 0; i < oysters.size(); i++) {
    		if(oysters.get(i) == true) {
    			pearlCount++;
    		}
    	}
    	return pearlCount;
    }
    
    public static double findTallest(List<Double> heights) {
    	double tallest = 0.0;
    	for(int i = 0; i < heights.size(); i++) {
    		if(heights.get(i)>tallest) {
    			tallest = heights.get(i);
    		}
    	}
    	return tallest;
    }
    
    public static String findLongestWord(List<String> words) {
    	String longest = "";
    	for(int i = 0; i < words.size(); i++) {
    		if(words.get(i).length() > longest.length()) {
    			longest = words.get(i);
    		}
    	}
    	return longest;
    }
    
    public static boolean containsSOS(List<String> message) {
    	String sos = "... --- ...";
    	boolean contains = false;
    	for(int i = 0; i < message.size(); i++) {
    		if(message.get(i).contains(sos)) {
    			contains = true;
    		}
    	}
    	return contains;
    }
    
    public static List<Double> sortScores(List<Double> scores) {
    	for (int i = 0; i < scores.size(); i++) {
			for (int k = 0; k < scores.size() - 1; k++) {
				if(scores.get(k)>scores.get(k+1)) {
					Double temp = scores.get(k);
					scores.set(k, scores.get(k+1));
					scores.set(k+1, temp);
				}
			}
		}
    	return scores;
    }
    
    public static List<String> sortDNA(List<String> seq){
    	for (int i = 0; i < seq.size(); i++) {
			for (int k = 0; k < seq.size() - 1; k++) {
				if(seq.get(k).length()>seq.get(k+1).length()) {
					String temp = seq.get(k);
					seq.set(k, seq.get(k+1));
					seq.set(k+1, temp);
				}
			}
		}
    	return seq;
    }
    
    public static List<String> sortWords(List<String> words){
    	for (int i = 0; i < words.size(); i++) {
			for (int k = 0; k < words.size() - 1; k++) {
				if(words.get(k).compareTo(words.get(k+1)) > 0) {
					String temp = words.get(k);
					words.set(k, words.get(k+1));
					words.set(k+1, temp);
				}
			}
		}
    	return words;
    }
}