package controller;

import java.io.IOException;

import utility.Input;

public class SwitchDemoKeyword {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		int yearLevel = Input.readInt("Enter your Level");
//		yearLevelStringConversion(yearLevel);
		
		String yearLevel = Input.readString("Enter your Level");
		yearLevelIntConversion(yearLevel);
	}
	
	public static void yearLevelStringConversion(int levelYear) {
		switch (levelYear) {
		case 1:
			System.out.println(levelYear + " - Freshman");
			break;
		case 2:
			System.out.println(levelYear + " - Sophomore");
			break;
		case 3:
			System.out.println(levelYear + " - Junior");
			break;
		case 4:
			System.out.println(levelYear + " - Senior");
			break;
		default:
			System.err.println(levelYear + " - Invalid Year Level");
			break;
		}
	}
	
	public static void yearLevelIntConversion(String levelYear) {
		levelYear = levelYear.toLowerCase();
//		levelYear = levelYear.toUpperCase();
		switch (levelYear) {
		case "freshman":
			System.out.println(levelYear + " 1");
			break;
		case "sophomore":
			System.out.println(levelYear + " 2");
			break;
		case "junior":
			System.out.println(levelYear + " 3");
			break;
		case "senior":
			System.out.println(levelYear + " 4");
			break;
		default:
			System.err.println(levelYear + " - Invalid Year Level");
			break;
		}
	}
}
