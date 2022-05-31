package testing.test.suite;


import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testing.test.categorii.CategorieUtilizareBoundary;
import testing.test.categorii.CategorieUtilizareFake;
import testing.test.testare.TestAgentieDubluri;
import testing.test.testare.TestPachetTuristic;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestAgentieDubluri.class, TestPachetTuristic.class})
@Categories.IncludeCategory(CategorieUtilizareFake.class)
@Categories.ExcludeCategory(CategorieUtilizareBoundary.class)
public class SuitaTestCuFakeuri {

}