package tp2_collection;
import java.util.*;
import java.util.Map.Entry;
public class DossierPharmacie {
		private String nom ;
		private HashMap <String , Patient > patients ;
		public DossierPharmacie ( String n){
		nom =n;
		patients = new HashMap <String , Patient >();
		}
		public void nouveauPatient ( String nom , String [] ord ){
			String minnom=nom.toLowerCase();
			Patient p=new Patient(minnom);
		    for (String med : ord) {
		        p.ajoutMedicament(med);
		    }
			patients.put(minnom, p);
			
}
		public boolean ajoutMedicament (String nom, String m){
		    String minnom = nom.toLowerCase();

		    if (patients.containsKey(minnom)) {
		        patients.get(minnom).ajoutMedicament(m);
		        return true;
		    }
		    return false;
		}
		public void affichePatient (String nom){
		    String minnom = nom.toLowerCase();

		    if (patients.containsKey(minnom)) {
		        patients.get(minnom).affichePatientOrdn();
		    } else {
		        System.out.println("Patient introuvable");
		    }
		}
		public void affiche (){
			System.out.println("===le nom de la pharmacie :"+nom);
			Set<String>s=patients.keySet();
			Iterator<String>it=s.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		public Collection <String > affichePatientAvecMedicament (String m){
			System.out.println("les patient ayant pris le medicament "+m+"sont :");
            Collection<String>resultat=new ArrayList<>();
            Set<Entry<String,Patient>>sethm=patients.entrySet();
			Iterator<Entry<String,Patient>>it=sethm.iterator();
			while(it.hasNext()) {
				Entry<String,Patient>e=it.next();
				if(e.getValue().contientMedicament(m)) {
					resultat.add(e.getValue().getNom());
 				}
			}
			return resultat;
		}
		public Patient getPatient(String nom) {
		    return patients.get(nom.toLowerCase());
		}
		}
