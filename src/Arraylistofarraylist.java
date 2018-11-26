import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Arraylistofarraylist {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<FootballMatch>> denak = new ArrayList<ArrayList<FootballMatch>>();
		
		for (int i=0;i<args.length;i++) {
			File fitxategia = new File(args[i]);
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
			denak.add(partidua);
		}
		
		for (int i=0;i<denak.size();i++) {
			ListIterator<FootballMatch> it = denak.get(i).listIterator();
			while (it.hasNext()) {
				System.out.println(it.next().getEquipoLocal() + "  " + it.previous().getEquipoVisitante() +  "  " + it.next().getGolesLocal() +  "  " + it.previous().getGolesVisitante());
				it.next();
			}
			System.out.println();
		}
		
			
	}
		

	}


