package com.example.energyadvisors;

import java.util.ArrayList;

public class contactList {
    private ArrayList<Contacts> people = new ArrayList<Contacts>();

    public void setPeople() {
        Contacts kathy = new Contacts("Kathy", "Curry", "kcurry@sammamish.us", 1, 1, "(425) 295-0527", "Efficiency");
        people.add(kathy);
        Contacts ken =new Contacts("Ken", "Wong","kwong@redmond.gov", 1, 1, "(818)-928-9181", "Cost Optimization" );
        people.add(ken);
        Contacts Amy = new Contacts("Amy", "Walen", "awalen@kirklandwa.gov",1,1,"(425) 587-3532", "Energy Management" );
        people.add(Amy);
        Contacts cathy = new Contacts("Cathy", "Beam", "cbeam@redmond.gov", 0, 1, "(425) 556-2429", "Carbon Footprint Management" );
        people.add(cathy);
        Contacts carol = new Contacts("Caroline", "Chapman", "ckchapman@redmond.gov",1,0, "(425) 556-2442","Renewable");
        people.add(carol);
        Contacts gary = new Contacts("Gary","Schimek", "garysch@pse.gov", 0, 1,"(425) 556-2742", "Infrastructure Repair");
        people.add(gary);
        Contacts dave = new Contacts("Dave", "Asher", "dasher@kirklandwa.gov", 1,1,"(425) 587-3526", "Other" );
        people.add(dave);
        Contacts door = new Contacts("Doreen", "Marchione", "dmarchione@kirklandwa.gov",1,0, "(425) 587-3533", "Efficiency" );
        people.add(door);
        Contacts Amaree = new Contacts("Amaree","Vaughn", "Mrs.nett@gmail.com", 1,1,"(253) 486-8513", "Cost Optimization" );
        people.add(Amaree);
        Contacts Nisha = new Contacts("Nisha", "Chatwani", "amiribevam@gmail.com", 1,0, "(253) 457-3685", "Carbon Footprint Management" );
        people.add(Nisha);


    }

    public ArrayList<Contacts> getArrays() {
        return people;
    }
}
