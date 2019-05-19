package com.karatek.deztoletter;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static Console console = System.console();
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
		if (console == null) {
			System.err.println("No Console avaliable!");
			System.exit(1);
		}

		System.out.println(
				"\n ____           _____     _         _   _            \n" +
						"|  _ \\  ___ ___|_   _|__ | |    ___| |_| |_ ___ _ __ \n" +
						"| | | |/ _ \\_  / | |/ _ \\| |   / _ \\ __| __/ _ \\ '__|\n" +
						"| |_| |  __// /  | | (_) | |__|  __/ |_| ||  __/ |   \n" +
						"|____/ \\___/___| |_|\\___/|_____\\___|\\__|\\__\\___|_|   \n");

		System.out.println("V.1.0 by " + ANSI_CYAN + "Karatek_HD" + ANSI_RESET);
		if (args[0].equalsIgnoreCase("file")) {
			System.out.println("You choosed to read the numbers from a file.");
			String file = console.readLine("Please insert the path to the file: ");
			try {
				InputStream is = new FileInputStream(file);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));
				String line = buf.readLine();
				StringBuilder sb = new StringBuilder();
				while (line != null) {
					sb.append(line).append("\n");
					line = buf.readLine();
				}

				String fileAsString = sb.toString();
				System.out.println("\nContents : \n\n" + fileAsString);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Spliting...\n");
			Scanner sc2 = null;
			try {
				sc2 = new Scanner(new File(file));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			while (sc2.hasNextLine()) {
				Scanner s2 = new Scanner(sc2.nextLine());
				while (s2.hasNext()) {
					String s = s2.next();
					boolean parsed = false;
					if (s.equalsIgnoreCase("01000001")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "A" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01000010")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "B" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01000011")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "C" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01000100")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "D" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01000101")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "E" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01000110")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "F" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01000111")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "G" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01001000")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "H" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01001001")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "I" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01001010")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "J" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01001011")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "K" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01001100")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "L" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01001101")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "M" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01001110")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "N" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01001111")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "O" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01010000")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "P" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01010001")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "Q" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01010010")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "R" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01010011")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "S" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01010100")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "T" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01010101")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "U" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01010110")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "V" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01010111")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "W" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01011000")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "X" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01011001")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "Y" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01011010")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "Z" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("quit")) {
						System.exit(0);
					}
					if (s.equalsIgnoreCase("01100001")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "a" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01100010")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "b" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01100011")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "c" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01100100")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "d" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01100101")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "e" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01100110")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "f" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01100111")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "g" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01101000")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "h" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01101001")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "i" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01101010")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "j" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01101011")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "k" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01101100")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "l" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01101101")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "m" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01101110")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "n" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01101111")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "o" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01110000")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "p" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01110001")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "q" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01110010")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "r" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01110011")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "s" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01110100")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "t" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01110101")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "u" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01110110")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "v" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01110111")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "w" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01111000")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "x" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01111001")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "y" + ANSI_RESET + ".");
					}
					if (s.equalsIgnoreCase("01111010")) {
						parsed = true;
						System.out.println(ANSI_GREEN + s + ANSI_RESET + " is " + ANSI_GREEN + "z" + ANSI_RESET + ".");
					}


				}


			}
			System.out.print("\n");
			//2tes Mal
			Scanner sc3 = null;
			try {
				sc3 = new Scanner(new File(file));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Text: \n");
			while (sc3.hasNextLine()) {
				Scanner s3 = new Scanner(sc3.nextLine());
				while (s3.hasNext()) {
					String s = s3.next();
					boolean parsed = false;
					if (s.equalsIgnoreCase("01000001")) {
						parsed = true;
						System.out.print("A");
					}
					if (s.equalsIgnoreCase("01000010")) {
						parsed = true;
						System.out.print("B");
					}
					if (s.equalsIgnoreCase("01000011")) {
						parsed = true;
						System.out.print("C");
					}
					if (s.equalsIgnoreCase("01000100")) {
						parsed = true;
						System.out.print("D");
					}
					if (s.equalsIgnoreCase("01000101")) {
						parsed = true;
						System.out.print("E");
					}
					if (s.equalsIgnoreCase("01000110")) {
						parsed = true;
						System.out.print("F");
					}
					if (s.equalsIgnoreCase("01000111")) {
						parsed = true;
						System.out.print("G");
					}
					if (s.equalsIgnoreCase("01001000")) {
						parsed = true;
						System.out.print("H");
					}
					if (s.equalsIgnoreCase("01001001")) {
						parsed = true;
						System.out.print("I");
					}
					if (s.equalsIgnoreCase("01001010")) {
						parsed = true;
						System.out.print("J");
					}
					if (s.equalsIgnoreCase("01001011")) {
						parsed = true;
						System.out.print("K");
					}
					if (s.equalsIgnoreCase("01001100")) {
						parsed = true;
						System.out.print("L");
					}
					if (s.equalsIgnoreCase("01001101")) {
						parsed = true;
						System.out.print("M");
					}
					if (s.equalsIgnoreCase("01001110")) {
						parsed = true;
						System.out.print("N");
					}
					if (s.equalsIgnoreCase("01001111")) {
						parsed = true;
						System.out.print("O");
					}
					if (s.equalsIgnoreCase("01010000")) {
						parsed = true;
						System.out.print("P");
					}
					if (s.equalsIgnoreCase("01010001")) {
						parsed = true;
						System.out.print("Q");
					}
					if (s.equalsIgnoreCase("01010010")) {
						parsed = true;
						System.out.print("R");
					}
					if (s.equalsIgnoreCase("01010011")) {
						parsed = true;
						System.out.print("S");
					}
					if (s.equalsIgnoreCase("01010100")) {
						parsed = true;
						System.out.print("T");
					}
					if (s.equalsIgnoreCase("01010101")) {
						parsed = true;
						System.out.print("U");
					}
					if (s.equalsIgnoreCase("01010110")) {
						parsed = true;
						System.out.print("V");
					}
					if (s.equalsIgnoreCase("01010111")) {
						parsed = true;
						System.out.print("W");
					}
					if (s.equalsIgnoreCase("01011000")) {
						parsed = true;
						System.out.print("X");
					}
					if (s.equalsIgnoreCase("01011001")) {
						parsed = true;
						System.out.print("Y");
					}
					if (s.equalsIgnoreCase("01011010")) {
						parsed = true;
						System.out.print("Z");
					}

					if (s.equalsIgnoreCase("01100001")) {
						parsed = true;
						System.out.print("a");
					}
					if (s.equalsIgnoreCase("01100010")) {
						parsed = true;
						System.out.print("b");
					}
					if (s.equalsIgnoreCase("01100011")) {
						parsed = true;
						System.out.print("c");
					}
					if (s.equalsIgnoreCase("01100100")) {
						parsed = true;
						System.out.print("d");
					}
					if (s.equalsIgnoreCase("01100101")) {
						parsed = true;
						System.out.print("e");
					}
					if (s.equalsIgnoreCase("01100110")) {
						parsed = true;
						System.out.print("f");
					}
					if (s.equalsIgnoreCase("01100111")) {
						parsed = true;
						System.out.print("g");
					}
					if (s.equalsIgnoreCase("01101000")) {
						parsed = true;
						System.out.print("h");
					}
					if (s.equalsIgnoreCase("01101001")) {
						parsed = true;
						System.out.print("i");
					}
					if (s.equalsIgnoreCase("01101010")) {
						parsed = true;
						System.out.print("j");
					}
					if (s.equalsIgnoreCase("01101011")) {
						parsed = true;
						System.out.print("k");
					}
					if (s.equalsIgnoreCase("01101100")) {
						parsed = true;
						System.out.print("l");
					}
					if (s.equalsIgnoreCase("01101101")) {
						parsed = true;
						System.out.print("m");
					}
					if (s.equalsIgnoreCase("01101110")) {
						parsed = true;
						System.out.print("n");
					}
					if (s.equalsIgnoreCase("01101111")) {
						parsed = true;
						System.out.print("o");
					}
					if (s.equalsIgnoreCase("01110000")) {
						parsed = true;
						System.out.print("p");
					}
					if (s.equalsIgnoreCase("01110001")) {
						parsed = true;
						System.out.print("q");
					}
					if (s.equalsIgnoreCase("01110010")) {
						parsed = true;
						System.out.print("r");
					}
					if (s.equalsIgnoreCase("01110011")) {
						parsed = true;
						System.out.print("s");
					}
					if (s.equalsIgnoreCase("01110100")) {
						parsed = true;
						System.out.print("t");
					}
					if (s.equalsIgnoreCase("01110101")) {
						parsed = true;
						System.out.print("u");
					}
					if (s.equalsIgnoreCase("01110110")) {
						parsed = true;
						System.out.print("v");
					}
					if (s.equalsIgnoreCase("01110111")) {
						parsed = true;
						System.out.print("w");
					}
					if (s.equalsIgnoreCase("01111000")) {
						parsed = true;
						System.out.print("x");
					}
					if (s.equalsIgnoreCase("01111001")) {
						parsed = true;
						System.out.print("y");
					}
					if (s.equalsIgnoreCase("01111010")) {
						parsed = true;
						System.out.print("z");
					}


				}
			}
			System.out.println("\n\nFile : " + ANSI_PURPLE + file + ANSI_RESET);
			System.out.print("\n");
			//Ende




		} else {
			con();
		}
	}


    public static void con() {
    	String input = console.readLine("Deziamlzahl >  ");
  		calc(input);
	}

	public static void calc(String input) {
    	boolean parsed = false;
		if(input.equalsIgnoreCase("01000001")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "A" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01000010")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "B" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01000011")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "C" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01000100")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "D" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01000101")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "E" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01000110")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "F" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01000111")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "G" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01001000")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "H" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01001001")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "I" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01001010")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "J" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01001011")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "K" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01001100")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "L" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01001101")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "M" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01001110")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "N" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01001111")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "O" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01010000")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "P" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01010001")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "Q" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01010010")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "R" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01010011")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "S" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01010100")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "T" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01010101")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "U" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01010110")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "V" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01010111")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "W" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01011000")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "X" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01011001")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "Y" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("01011010")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "Z" + ANSI_RESET + ".");
		} if(input.equalsIgnoreCase("quit")) {
			System.exit(0);
		} if(input.equalsIgnoreCase("01100001")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "a" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01100010")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "b" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01100011")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "c" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01100100")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "d" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01100101")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "e" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01100110")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "f" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01100111")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "g" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01101000")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "h" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01101001")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "i" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01101010")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "j" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01101011")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "k" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01101100")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "l" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01101101")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "m" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01101110")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "n" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01101111")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "o" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01110000")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "p" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01110001")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "q" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01110010")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "r" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01110011")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "s" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01110100")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "t" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01110101")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "u" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01110110")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "v" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01110111")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "w" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01111000")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "x" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01111001")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "y" + ANSI_RESET + ".");
		}
		if(input.equalsIgnoreCase("01111010")) {
			parsed = true;
			System.out.println(ANSI_GREEN + input + ANSI_RESET + " is " + ANSI_GREEN + "z" + ANSI_RESET + ".");
		}

		else {
			if(!parsed) {
				System.err.println("Cannot parse your input.");
			}
		}
		con();
	}
}
