import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Teaminformation {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		ArrayList<Team> taldeak = new ArrayList<Team>();

		File fitxategia = new File("C:\\Users\\ik013043z1\\eclipse-workspace\\1.25\\bin\\Teams.txt");
		Scanner sc = new Scanner(fitxategia);
		while (sc.hasNextLine()) {
			String team = sc.nextLine();
			String[] equipo = team.split("::");

			int championships = Integer.parseInt(equipo[3]);
			Team taldea = new Team();
			taldea.setName(equipo[0]);
			taldea.setNationality(equipo[1]);
			taldea.setLeague(equipo[2]);
			taldea.setChampionships(championships);
			taldeak.add(taldea);

		}

		File fitxategia2 = new File("C:\\Users\\ik013043z1\\eclipse-workspace\\1.25\\bin\\FootballMatches.txt");
		Scanner sc2 = new Scanner(fitxategia2);
		ArrayList<FootballMatch> partidua = new ArrayList<FootballMatch>();
		while (sc2.hasNextLine()) {

			String partidu = sc2.nextLine();
			String[] partido = partidu.split("::");

			int glocal = Integer.parseInt(partido[2]);
			int gvisitor = Integer.parseInt(partido[3]);
			FootballMatch partiduak = new FootballMatch();
			Team localteam = new Team();
			Team visitorteam = new Team();
			localteam.setName(partido[0]);
			visitorteam.setName(partido[1]);
			partiduak.setEquipoLocal(localteam);
			partiduak.setEquipoVisitante(visitorteam);
			partiduak.setGolesLocal(glocal);
			partiduak.setGolesVisitante(gvisitor);
			partidua.add(partiduak);

		}

		for (int e = 0; e < partidua.size(); e++) {

			for (int i = 0; i < taldeak.size(); i++) {

				if (partidua.get(e).getEquipoLocal().getName().equals(taldeak.get(i).getName())) {
					System.out.print(taldeak.get(i).getName() + " " + taldeak.get(i).league());

				}
			}
			System.out.print(" " + partidua.get(e).getGolesLocal() + " " + partidua.get(e).getGolesVisitante() + " ");
			for (int i = 0; i < taldeak.size(); i++) {

				if (partidua.get(e).getEquipoVisitante().getName().equals(taldeak.get(i).getName())) {
					System.out.print(taldeak.get(i).getName() + " " + taldeak.get(i).league());

				}
			}
			System.out.println();
		}

	}
}