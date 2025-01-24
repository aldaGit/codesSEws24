package org.hbrs.se1.ws24.solutions.uebung11;

public class CRMAdapterImpl implements CRMAdapter {

    private CobraCRM crm = null;
    // Dependency Injection!!

    @Override
    public void addContact(Contact contact) {
        crm.addContact( this.transformIN( contact )  );
    }

    /**
     * Concat of two strings: https://stackoverflow.com/questions/47605/string-concatenation-concat-vs-operator
     * @param contact
     * @return
     */
    private Client transformIN( Contact contact ){
        Client newClient = new Client();
        String name = contact.getVorname() + " " + contact.getNachname();
        newClient.setName( name );
        return newClient;

    }
}
