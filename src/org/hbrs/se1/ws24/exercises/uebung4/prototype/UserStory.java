package org.hbrs.se1.ws24.exercises.uebung4.prototype;
    public class UserStory {
        // ToDo: Sind die Attribute der Klasse UserStory vollständig? Wie sieht es mit den
        //  Sichtbarkeiten aus? (F4)

        String titel;
        int id = 0;
        double prio = 0.0;
        String project;

        public String getProject() {
            return project;
        }

        public void setProject(String project) {
            this.project = project;
        }

        public UserStory(int id, String titel, double prio) {
            this.id = id;
            this.titel = titel;
            this.prio = prio;
        }

        public UserStory() {
        }

        public double getPrio() {
            return prio;
        }

        public void setPrio(double prio) {
            this.prio = prio;
        }

        public String getTitel() {
            return titel;
        }

        public void setTitel(String titel) {
            this.titel = titel;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }




