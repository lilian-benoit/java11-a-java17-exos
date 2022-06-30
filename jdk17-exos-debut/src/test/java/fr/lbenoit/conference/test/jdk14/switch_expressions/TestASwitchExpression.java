package fr.lbenoit.conference.test.jdk14.switch_expressions;

import org.junit.Assert;
import org.junit.Test;

import fr.lbenoit.conference.jdk14.switch_expressions.Jour;
import fr.lbenoit.conference.jdk14.switch_expressions.JourUtils;

public class TestASwitchExpression {

	@Test
	public void TestSwitchClassique( ) {
		Assert.assertEquals(JourUtils.nbCaractere(Jour.LUNDI), 5);
		Assert.assertEquals(JourUtils.nbCaractere(Jour.SAMEDI), 6);
		Assert.assertEquals(JourUtils.nbCaractere(Jour.DIMANCHE), 8);
	}
}
