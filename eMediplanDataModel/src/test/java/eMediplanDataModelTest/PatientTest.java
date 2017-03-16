package eMediplanDataModelTest;

import CHMED16A.model.Patient;
import CHMED16A.model.PrivateField;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by kevin on 15.03.17.
 */
public class PatientTest {
    @Test
    public void testPatient() {
        Patient p = Patient.newBuilder()
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
                .build();
    }
}
