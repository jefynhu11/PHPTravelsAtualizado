package suites;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import tasks.EntrarLoginTasks;
import testCases.TestCase;

@RunWith(Suite.class)
@SuiteClasses({
	TestCase.class
})

public class AllTests {

}
