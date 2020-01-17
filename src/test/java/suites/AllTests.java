package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testCases.TestCase;


@RunWith(Suite.class)
@SuiteClasses({
	TestCase.class,
	TestCase.class
})
public class AllTests {

}
