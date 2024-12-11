package org.hbrs.se1.ws24.solutions.uebung7;

import java.util.ArrayList;

public class SkillConsumer implements  Consumer {

    private SkillReportPublisher publisher;

    private ArrayList<String> skillsArray = new ArrayList<>();

    SkillConsumer( SkillReportPublisher publisher ) {
        this.publisher = publisher;

        skillsArray.add("Java");
        skillsArray.add("C++");
    }

    @Override
    public void update(Integer reportID, String topic) {
        if (skillsArray.contains(topic)) {
            Report report = this.publisher.getReport();
            // Verarbeitung, z.B. Ausagbe oder Speicherung
        }
    }
}
