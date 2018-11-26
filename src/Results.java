import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Results {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File fitxategia = new File("C:\\Users\\ik013043z1\\eclipse-workspace\\1.25\\bin\\FootballMatches.txt");
		Scanner sc = new Scanner(fitxategia);
		ArrayList<FootballMatch> partidua = new ArrayList<FootballMatch>();
		while (sc.hasNextLine()) {
			String match = sc.nextLine();
			String[] partido = match.split("::");
			int glocal = Integer.parseInt(partido[2]);
			int gvisitor = Integer.parseInt(partido[3]);
			FootballMatch partiduak = new FootballMatch();
			partiduak.setEquipoLocal(partido[0]);
			partiduak.setEquipoVisitante(partido[1]);
			partiduak.setGolesLocal(glocal);
			partiduak.setGolesVisitante(gvisitor);
			partidua.add(partiduak);			
		}
		for (int i=0;i<partidua.size();i++) {

		System.out.println(partidua.get(i).getEquipoLocal() + " " + partidua.get(i).getEquipoVisitante()+" "+partidua.get(i).getGolesLocal()+" "+partidua.get(i).getGolesVisitante());
		}
		System.out.println();
		System.out.println("Total matches: "+partidua.size());

	
}
}