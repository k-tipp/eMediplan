package eMediplanDataModelTest;

import CHMED16A.model.Medication;
import CHMED16A.model.PrivateField;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by kevin on 15.03.17.
 */
public class MedicationTest {

    @Test
    public void testMedication() throws IOException {
        Medication m = Medication.newBuilder()
                .withPatient()
                    .withBirthdate("01.11.1991")
                    .withCity("Lthal")
                    .withFirstName("Kevin")
                    .withLastName("Tippenhauer")
                    .withLanguage("DE")
                .done()
                .addMedicaments()
                    .addMedicament()
                        .id("1")
                        .autoMedication(0)
                        .isSubstituable(0)
                        .posologies()
                            .addPosology()
                                .addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1)
                                .withCycleDuration(1)
                                .withDateFrom("01.01.2001")
                                .withDateTo("10.01.2001")
                                .addTakingTimes()
                                    .addTakingTime().withDuration(1).withDoseFrom(1).withDoseTo(3).withMaxAmountPerCycle(3).addTakingTimeToList()
                                    .addTakingTime().withDuration(1).withDoseFrom(1).withDoseTo(3).withMaxAmountPerCycle(3).addTakingTimeToList()
                                .done()
                            .addPosologyToList()
                            .addPosology()
                                .addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1)
                                .withCycleDuration(1)
                                .withDateFrom("01.01.2001")
                                .withDateTo("10.01.2001")
                                .addTakingTimes()
                                    .addTakingTime().withDuration(1).withDoseFrom(1).withDoseTo(3).withMaxAmountPerCycle(3).addTakingTimeToList()
                                    .addTakingTime().withDuration(1).withDoseFrom(1).withDoseTo(3).withMaxAmountPerCycle(3).addTakingTimeToList()
                                .done()
                            .addPosologyToList()
                        .done()
                    .addMedicamentToList()
                    .addMedicament()
                        .id("1")
                        .autoMedication(0)
                        .isSubstituable(0)
                        .posologies()
                            .addPosology()
                                .addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1)
                                .withCycleDuration(1)
                                .withDateFrom("01.01.2001")
                                .withDateTo("10.01.2001")
                                .addTakingTimes()
                                    .addTakingTime().withDuration(1).withDoseFrom(1).withDoseTo(3).withMaxAmountPerCycle(3).addTakingTimeToList()
                                    .addTakingTime().withDuration(1).withDoseFrom(1).withDoseTo(3).withMaxAmountPerCycle(3).addTakingTimeToList()
                                .done()
                            .addPosologyToList()
                            .addPosology()
                                .addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1).addSimplifiedTakingTimeDose(1)
                                .withCycleDuration(1)
                                .withDateFrom("01.01.2001")
                                .withDateTo("10.01.2001")
                                .addTakingTimes()
                                    .addTakingTime().withDuration(1).withDoseFrom(1).withDoseTo(3).withMaxAmountPerCycle(3).addTakingTimeToList()
                                    .addTakingTime().withDuration(1).withDoseFrom(1).withDoseTo(3).withMaxAmountPerCycle(3).addTakingTimeToList()
                                .done()
                            .addPosologyToList()
                        .done()
                    .addMedicamentToList()
                .done()
                .addRecommendations()
                    .addRecommendation().withId("1").withPatientAgreement(1).withRemark("Patient loves this API").addRecommendationToList()
                    .addRecommendation().withId("1").withPatientAgreement(1).withRemark("Patient loves this API").addRecommendationToList()
                .done()
                .addPrivateFields(new ArrayList<PrivateField>() {{
                    add(PrivateField.newBuilder().withName("child3").withValue("val3").addPrivateFields(new ArrayList<PrivateField>()).build());
                }})
                .setDate("01.01.2001")
                .setRemark("asdfasdf")
                .setZSR("12356")
                .validatedBy("a.t")
                .validationDate("01.01.2001")
                .withAuth("adsf")
                .withId("1")
                .withMedType(1)
                .build();


        System.out.println(m.serialize());



    }
}
