package org.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsExample {

    public static final void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();

            KieContainer kc = ks.getKieClasspathContainer();

            KieSession kSession = kc.newKieSession("ksession-rules");

            Person Or = new Person("אור זינו", 29, "male");
            Person Tohar = new Person("טוהר קרסנובסקי", 24, "female");
            Person Gal = new Person("גל ג'וליה שלומאי", 24, "female");
            Person ShakedShira = new Person("שקד שירה אטדגי", 25, "female");



            System.out.println("----------------------------------");
            System.out.println("Initial state of Person 1: " + Or);
            System.out.println("Initial state of Person 2: " + Tohar);
            System.out.println("Initial state of Person 3: " + Gal);
            System.out.println("Initial state of Person 4: " + ShakedShira);
            System.out.println("----------------------------------");


            kSession.insert(Or);
            kSession.insert(Tohar);
            kSession.insert(Gal);
            kSession.insert(ShakedShira);

            kSession.fireAllRules();

            System.out.println("----------------------------------");
            System.out.println("Final state of Person 1: " + Or);
            System.out.println("Final state of Person 2: " + Tohar);
            System.out.println("Final state of Person 3: " + Gal);
            System.out.println("Final state of Person 4: " + ShakedShira);
            System.out.println("----------------------------------");

            kSession.dispose();

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}