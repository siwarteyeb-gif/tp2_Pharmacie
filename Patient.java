package tp2_collection;
import java.util.*;
public class Patient {
	private String nom ;
	private Set <String > ordonnance ;
	public Patient ( String n){
	nom = n ;
	ordonnance = new HashSet <String >();
	}

	public String getNom () { return nom ;}
	public Set<String> getOrdonnance() {
		return ordonnance;
	}
	public void setOrdonnance(Set<String> ordonnance) {
		this.ordonnance = ordonnance;
	}
	public boolean OrdonnanceVide() {
		return ordonnance.isEmpty();
	}
	public void ajoutMedicament ( String m) {
		ordonnance.add(m);
	}
	public void affichePatientOrdn() {
		 System.out.println("le nom de patient : "+nom);
		 System.out.println("=====l ordonnance de patient :======");
		 Iterator<String>it=ordonnance.iterator();
		 while(it.hasNext()) {
			 
			 System.out.println(it.next());
		 }
		 }
	public boolean contientMedicament (String m) {
		return ordonnance.contains(m);
	}
	public void trieOrdonnace() {
		TreeSet<String>ordtri=new TreeSet<String>(ordonnance);
		System.out.println("====ordonnance triee====");
		for(String s:ordtri) {
			System.out.println(s);
			
		}
		
	}
	public void nouveauPatient ( String nom , String [] ord ){
		String minnom=nom.toLowerCase();
		
}}
