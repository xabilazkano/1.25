import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File fitxategia = new File(args[0]);
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
		
		ListIterator<FootballMatch> it = partidua.listIterator();
		
		
			
while (it.hasNext()) {
		
				if (it.next().getGolesLocal()==it.previous().getGolesVisitante()) {
					System.out.println(it.next().getEquipoLocal() + "  " + it.previous().getEquipoVisitante() +  "  " + it.next().getGolesLocal() +  "  " + it.previous().getGolesVisitante());
					it.remove();
				}
				else {
					it.next();
				}
				
				
			}
 System.out.println();
		
	for (int i=0;i<partidua.size();i++) {

		System.out.println(partidua.get(i).getEquipoLocal() + " " + partidua.get(i).getEquipoVisitante()+" "+partidua.get(i).getGolesLocal()+" "+partidua.get(i).getGolesVisitante());
		}
	}
}

