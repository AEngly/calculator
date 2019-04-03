package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.operation.AdditionTest;
import test.operation.MultiplicationTest;
import test.operation.OperationTest;
import test.operation.SubtractionTest;

@RunWith(Suite.class)
@SuiteClasses({

		AdditionTest.class, SubtractionTest.class, MultiplicationTest.class, OperationTest.class,

})
public class AllTests {
}
