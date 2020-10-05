import static jbse.meta.Analysis.ass3rt;
import jbse.apps.run.Run;
import jbse.apps.run.RunParameters;

class Driver {                                                                                                                                        
    static public void main(String[] args) throws Exception {
        Class c = Driver.class;
        java.lang.reflect.Method m = c.getDeclaredMethod(args[0]);
        m.invoke(null);
    }
    static public void main(String cn, String tn) throws Exception {
        Class c = Class.forName(cn);
        Object o = c.newInstance();
        java.lang.reflect.Method m = c.getDeclaredMethod(tn);
        m.invoke(o);
    }
    

    static public void main0() throws Exception {
	    Driver_jopt_simple.main5();
    }
}

class Driver_Bukkit {
    static public void main1() throws Exception { Driver.main("org.bukkit.CoalTypeTest", "getByData"); }
    static public void main2() throws Exception { Driver.main("org.bukkit.CropStateTest", "getByData"); }
    static public void main3() throws Exception { Driver.main("org.bukkit.InstrumentTest", "getByType"); }
    static public void main4() throws Exception { Driver.main("org.bukkit.conversations.ConversationTest", "testBaseConversationFlow"); }
    static public void main5() throws Exception { Driver.main("org.bukkit.conversations.ConversationTest", "testConversationFactory"); }
    static public void main6() throws Exception { Driver.main("org.bukkit.conversations.ConversationTest", "testEscapeSequence"); }
    static public void main7() throws Exception { Driver.main("org.bukkit.conversations.ConversationTest", "testNotPlayer"); }
    static public void main8() throws Exception { Driver.main("org.bukkit.conversations.ConversationContextTest", "TestFromWhom"); }
    static public void main9() throws Exception { Driver.main("org.bukkit.conversations.ConversationContextTest", "TestPlugin"); }
    static public void main10() throws Exception { Driver.main("org.bukkit.conversations.ConversationContextTest", "TestSessionData"); }
    static public void main11() throws Exception { Driver.main("org.bukkit.conversations.ValidatingPromptTest", "TestBooleanPrompt"); }
    static public void main12() throws Exception { Driver.main("org.bukkit.conversations.ValidatingPromptTest", "TestFixedSetPrompt"); }
    static public void main13() throws Exception { Driver.main("org.bukkit.conversations.ValidatingPromptTest", "TestNumericPrompt"); }
    static public void main14() throws Exception { Driver.main("org.bukkit.conversations.ValidatingPromptTest", "TestRegexPrompt"); }
    static public void main15() throws Exception { Driver.main("org.bukkit.metadata.MetadataConversionTest", "testFromInt"); }
    static public void main16() throws Exception { Driver.main("org.bukkit.metadata.MetadataConversionTest", "testFromFloat"); }
    static public void main17() throws Exception { Driver.main("org.bukkit.metadata.MetadataConversionTest", "testFromNumericString"); }
    static public void main18() throws Exception { Driver.main("org.bukkit.metadata.MetadataConversionTest", "testFromNonNumericString"); }
    static public void main19() throws Exception { Driver.main("org.bukkit.metadata.MetadataConversionTest", "testFromNull"); }
    static public void main20() throws Exception { Driver.main("org.bukkit.metadata.FixedMetadataValueTest", "testBasic"); }
    static public void main21() throws Exception { Driver.main("org.bukkit.metadata.FixedMetadataValueTest", "testNumberTypes"); }
    static public void main22() throws Exception { Driver.main("org.bukkit.metadata.FixedMetadataValueTest", "testInvalidateDoesNothing"); }
    static public void main23() throws Exception { Driver.main("org.bukkit.metadata.MetadataValueAdapterTest", "testAdapterBasics"); }
    static public void main24() throws Exception { Driver.main("org.bukkit.metadata.MetadataValueAdapterTest", "testAdapterConversions"); }
    static public void main25() throws Exception { Driver.main("org.bukkit.metadata.MetadataValueAdapterTest", "testBooleanConversion"); }
    static public void main26() throws Exception { Driver.main("org.bukkit.metadata.MetadataValueAdapterTest", "testStringConversionNull"); }
    static public void main27() throws Exception { Driver.main("org.bukkit.EntityEffectTest", "getByData"); }
}

class Driver_commafeed {
    static public void main1() throws Exception { Driver.main("com.commafeed.backend.feed.EstimateDirectionTest", "testEstimateDirection"); }

}

class Driver_maven_plugins {
    static public void main1() throws Exception { Driver.main("com.github.maven.plugins.core.StringUtilsTest", "isEmpty"); }
    static public void main2() throws Exception { Driver.main("com.github.maven.plugins.core.StringUtilsTest", "removeEmpties"); }
    static public void main3() throws Exception { Driver.main("com.github.maven.plugins.core.CustomHostnameTest", "validHostname"); }
    static public void main4() throws Exception { Driver.main("com.github.maven.plugins.core.CustomHostnameTest", "nullHostname"); }
    static public void main5() throws Exception { Driver.main("com.github.maven.plugins.core.CustomHostnameTest", "emptyHost"); }
}

class Driver_akela {
    static public void main1() throws Exception { Driver.main("com.mozilla.util.StringUtilTest", "testJoin"); }
    static public void main2() throws Exception { Driver.main("com.mozilla.util.DateUtilTest", "testTimeAtResolution"); }
    static public void main3() throws Exception { Driver.main("com.mozilla.util.DateUtilTest", "testEndTimeAtResolution"); }
    static public void main4() throws Exception { Driver.main("com.mozilla.util.DateUtilTest", "testTimeDelta"); }
    static public void main5() throws Exception { Driver.main("com.mozilla.util.DateUtilTest", "testIterateByDay"); }
    static public void main6() throws Exception { Driver.main("com.mozilla.util.DateUtilTest", "testIterateByHour"); }
}

class Driver_spring_data_jdbc_repository {
    static public void main1() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForSelectByIdsWhenSingleIdColumnAndNoId"); }
    static public void main2() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForSelectByIdsWhenSingleIdColumnAndOneId"); }
    static public void main3() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForSelectByIdsWhenSingleIdColumnAndTwoIds"); }
    static public void main4() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForSelectByIdsWhenSingleIdColumnAndSeveralIds"); }
    static public void main5() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForSelectByIdsWhenMultipleIdColumnsAndNoId"); }
    static public void main6() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForSelectByIdsWhenMultipleIdColumnsAndOneId"); }
    static public void main7() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForSelectByIdsWhenMultipleIdColumnsAndTwoIds"); }
    static public void main8() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForSelectByIdsWhenMultipleIdColumnsAndSeveralIds"); }
    static public void main9() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForDeleteBySingleIdColumn"); }
    static public void main10() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForDeleteByTwoIdColumns"); }
    static public void main11() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForDeleteByMultipleIdColumns"); }
    static public void main12() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForUpdateWithSingleIdColumn"); }
    static public void main13() throws Exception { Driver.main("com.nurkiewicz.jdbcrepository.sql.SqlGeneratorTest", "buildSqlForUpdateWithMultipleIdColumns"); }
}

class Driver_jopt_simple {
    static public void main1() throws Exception { Driver.main("joptsimple.ValueConverterAdmitsSubclassesOfValueTypeTest", "subclassOfValueType"); }
    static public void main2() throws Exception { Driver.main("joptsimple.OptionSpecsReportTheirOptionsSortedSpeciallyTest", "shortOptionsComeFirstFollowedByLongOptionsLexicographically"); }
    static public void main3() throws Exception { Driver.main("joptsimple.PunctuationInShortOptionTest", "disallowsHyphenAsShortOption"); }
    static public void main4() throws Exception { Driver.main("joptsimple.PunctuationInShortOptionTest", "allowsQuestionMarkAsShortOption"); }
    static public void main5() throws Exception { Driver.main("joptsimple.PunctuationInShortOptionTest", "allowsDotAsShortOption"); }
    static public void main6() throws Exception { Driver.main("joptsimple.PunctuationInShortOptionTest", "allowsUnderscoreAsShortOption"); }
    static public void main7() throws Exception { Driver.main("joptsimple.examples.LongOptionsWithArgumentPositioningTest", "allowsDifferentFormsOfPairingArgumentWithOption"); }
    static public void main8() throws Exception { Driver.main("joptsimple.examples.ShortOptionsWithArgumentPositioningTest", "allowsDifferentFormsOfPairingArgumentWithOption"); }
    static public void main9() throws Exception { Driver.main("joptsimple.examples.TypesafeOptionArgumentRetrievalTest", "allowsTypesafeRetrievalOfOptionArguments"); }
    static public void main10() throws Exception { Driver.main("joptsimple.examples.ShortOptionsClusteringTest", "allowsClusteringShortOptions"); }
    static public void main11() throws Exception { Driver.main("joptsimple.examples.LongOptionsTest", "acceptsLongOptions"); }
    static public void main12() throws Exception { Driver.main("joptsimple.examples.ExportOptionsTest", "allowsExportOfOptions"); }
    static public void main13() throws Exception { Driver.main("joptsimple.examples.RequiredOptionsTest", "allowsSpecificationOfRequiredOptions"); }
    static public void main14() throws Exception { Driver.main("joptsimple.examples.RequiredOptionsTest", "aHelpOptionMeansRequiredOptionsNeedNotBePresent"); }
    static public void main15() throws Exception { Driver.main("joptsimple.examples.RequiredOptionsTest", "missingHelpOptionMeansRequiredOptionsMustBePresent"); }
    static public void main16() throws Exception { Driver.main("joptsimple.examples.OptionSynonymTest", "supportsOptionSynonyms"); }
    
}

class Driver_slf4j {
    static public void main1() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testPrimitive"); }
    static public void main2() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testPrimitiveByName"); }
    static public void main3() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testComposite"); }
    static public void main4() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testCompositeByName"); }
    static public void main5() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testMultiComposite"); }
    static public void main6() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testMultiCompositeByName"); }
    static public void main7() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testMultiAdd"); }
    static public void main8() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testAddRemove"); }
    static public void main9() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testSelfRecursion"); }
    static public void main10() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testIndirectRecursion"); }
    static public void main11() throws Exception { Driver.main("org.slf4j.BasicMarkerTest", "testHomonyms"); }
    static public void main12() throws Exception { Driver.main("org.slf4j.helpers.SubstituteLoggerFactoryTest", "testFactory"); }
    static public void main13() throws Exception { Driver.main("org.slf4j.helpers.SubstituteLoggerFactoryTest", "testLoggerNameList"); }
    static public void main14() throws Exception { Driver.main("org.slf4j.helpers.SubstituteLoggerFactoryTest", "testLoggers"); }
    static public void main15() throws Exception { Driver.main("org.slf4j.helpers.SubstitutableLoggerTest", "testDelegate"); }
    static public void main16() throws Exception { Driver.main("org.slf4j.helpers.BubbleSortTest", "testSmoke"); }
    static public void main17() throws Exception { Driver.main("org.slf4j.helpers.BubbleSortTest", "testEmpty"); }
    static public void main18() throws Exception { Driver.main("org.slf4j.helpers.BubbleSortTest", "testSorted"); }
    static public void main19() throws Exception { Driver.main("org.slf4j.helpers.BubbleSortTest", "testInverted"); }
    static public void main20() throws Exception { Driver.main("org.slf4j.helpers.BubbleSortTest", "testWithSameEntry"); }
    static public void main21() throws Exception { Driver.main("org.slf4j.helpers.BubbleSortTest", "testRandom"); }
    
}



public class Luke {
    public static void main(String[] args) {
        final RunParameters p = new RunParameters();
	// Driver_Bukkit, main1, $CP
        set(p, args[0], args[1], args[2]);
        final Run r = new Run(p);
        r.run();
    }
    
    private static void set(RunParameters p, String drivername, String methodName, String classpath) {
	String ns = "/home/lukeyi/auto-judge/classes:" + classpath + ":/home/lukeyi/auto-judge/jbse-0.10.0-SNAPSHOT-shaded.jar";
	String[] a = ns.split(":");
	p.addUserClasspath(a);
        p.setMethodSignature(drivername, "()V", methodName);
        p.setDecisionProcedureType(RunParameters.DecisionProcedureType.Z3);
        p.setExternalDecisionProcedurePath("/usr/bin/z3");
        p.setOutputFileName("/home/lukeyi/auto-judge/report.txt");
        p.setStateFormatMode(RunParameters.StateFormatMode.TEXT);
        p.setStepShowMode(RunParameters.StepShowMode.LEAVES);
    }
}
