package tp2_collection;

import java.util.Collection;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

    	 DossierPharmacie dp = new DossierPharmacie("Pharmacie Centrale");

         dp.nouveauPatient("Ahmed", new String[]{"Doliprane", "VitC"});
         dp.nouveauPatient("Sami", new String[]{"Doliprane"});
         dp.nouveauPatient("Nour", new String[]{"Aspirine"});

         dp.ajoutMedicament("Ahmed", "Paracetamol");

         System.out.println("\n=== Liste des patients ===");
         dp.affiche();

         System.out.println("\n=== Ordonnance de Ahmed ===");
         dp.affichePatient("ahmed");

         Collection<String> res = new TreeSet<>(
                 dp.affichePatientAvecMedicament("Doliprane"));
                 for (String nom : res) {
                     System.out.println(nom);
                 }
         

         System.out.println("\n=== Patients ayant pris Doliprane (triés) ===");
         for (String nom : res) {
             System.out.println(nom);
         }

         Patient p = dp.getPatient("ahmed");
         p.trieOrdonnace();
     }
 }