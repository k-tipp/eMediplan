package eMediplanDataModelTest;

import static org.junit.Assert.*;

import org.junit.Test;

import CHMED16A.model.TakingTime;

public class TakingTimeTest {

	@Test
	public void testTakingTime() {
		TakingTime tt = TakingTime.newBuilder()
				.withOffset(1)
				.withDuration(3600)
				.withAmount(2.00)
				.withMaxAmountPerCycle(3.00)
				.withDoseFrom(1.00)
				.withDoseTo(3.00)
				.build();
		
		assertTrue(tt.getAmount() == 2.00);
		assertTrue(tt.getDoseFrom() == 1.00);
		assertTrue(tt.getDoseTo() == 1.00);
		assertTrue(tt.getDuration() == 3600);
		assertTrue(tt.getMaxAmountPerCycle() == 3.00);
		assertTrue(tt.getOffset() == 1);
	}
}
