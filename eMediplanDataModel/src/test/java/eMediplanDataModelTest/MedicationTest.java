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
		                .setMedicalData()
		                .withFirstDayOfLastMenstruation("1999-10-10")
		                .withPremature(1)
		                .withTimeOfGestation("10-3")
		                .addRiskCategories()
		                    .addRiskCategory().withId(0).addRisk(1).addRisk(2).addRiskCategoryToList()
		                    .addRiskCategory().withId(1).addRisk(3).addRisk(4).addRiskCategoryToList()
		                .done()
		                .addMeasurements()
		                    .addMeasurement().withType(1).withValue("96.3").withUnit(2).addMeasurementToList()
		                    .addMeasurement().withType(2).withValue("1.90").withUnit(1).addMeasurementToList()
		                .done()
		                .addPrivateFields()
		                    .addPrivateField().withName("test").withValue("value").addPrivateFieldToList()
		                    .addPrivateField().withName("test2")
		                        .addPrivateFields(new ArrayList<PrivateField>() {{
		                            add(PrivateField.newBuilder().withName("child3").withValue("val3").addPrivateFields(new ArrayList<PrivateField>()).build());
		                        }}).addPrivateFieldToList()
		                .done()
		            .done()
		            .addPatientIds()
		                .addPatientId().withType(1).withValue("adsf").addPatientIdToList()
		                .addPatientId().withType(2).withValue("1-2-3-4-5-6").addPatientIdToList()
		            .done()
		            .withFirstName("test")
		            .withBirthdate("01.01.2001")
		            .withGender(1)
		            .withCity("sdfgg")
		            .withLanguage("de")
		            .withLastName("qwer")
		            .withReceiver("asdfafd")
		            .withPhone("+41 66 666 66 66")
		            .withStreet("gghjkgjk")
		            .withZipCode("4900")
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
