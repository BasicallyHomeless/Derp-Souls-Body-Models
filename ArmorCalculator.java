import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ArmorCalculator {
	public static void main(String[] args) {
		System.out.println("Enter the name of any chestplate in Dark Souls 2:");
		while(true){
			Scanner s = new Scanner(System.in);
			String ermer = s.nextLine();
			ChestArmor(ermer);
		}
	}
	public static void ChestArmor(String ermer) {
		String csvFile = "C:/Users/Phoenix02/workspace/Dark Souls Armor Calculator/chestinfo.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] cA = line.split(cvsSplitBy);
				if (cA[0].toUpperCase().contains(ermer.toUpperCase())) {
					System.out.println(" ");
					System.out.println("----------------------\n" + cA[0] + "\n----------------------");
					System.out.println("Maximum Physical: " + cA[1]);
					System.out.println("Maximum Magical: " + cA[2]);
					System.out.println("Fire Resist: " + cA[3]);
					System.out.println("Lightning Resist: " + cA[4]);
					System.out.println("Dark Resist: " + cA[5]);
					System.out.println("Poise Resist: " + cA[6]);
					System.out.println("Poison Resist: " + cA[7]);
					System.out.println("Bleed Resist: " + cA[8]);
					System.out.println("Petrify Resist: " + cA[9]);
					System.out.println("Curse Resist: " + cA[10]);
					//int[] resist = new int[8];
					//for(int i = 3; i <= 10; i++){
					//System.out.println(cA[i]); //convert to integer
					//int chest = Integer.parseInt(cA[i]);
					//resist[i-3] = chest;
					//}
					System.out.println("Durability: " + cA[11]);
					System.out.println("Weight: " + cA[12]);
					System.out.println(" ");
				} 
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
