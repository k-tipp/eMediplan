package eMediplanDataModelTest;

import org.junit.Test;

import CHMED16A.model.MedicalData;

public class MedicalDataTest {
	@Test
	public void testMedicalData() {
		MedicalData md = MedicalData.newBuilder()
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
						.addPrivateFields()
							.addPrivateField().withName("child1").withValue("val1").addPrivateFieldToList()
							.addPrivateField().withName("child2").withValue("val2").addPrivateFieldToList()
						.done()
					.done()
				.build();
	}

}
