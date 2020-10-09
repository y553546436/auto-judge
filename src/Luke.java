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
        main(cn, tn, null);
    }
    static public void main(String cn, String tn, String en) throws Exception {
        main(cn, tn, en, null, null);
    }
    static public void main(String cn, String tn, String en, String[] bn, String[] an) throws Exception {
        System.out.println(cn+"#"+tn);
        Class c = Class.forName(cn);
        Object o = c.newInstance();
        if (bn != null) {
            for (String b : bn) {
                java.lang.reflect.Method bm = c.getMethod(b); 
                bm.invoke(o);
            }
        }
        boolean caught = false;
        try {
            java.lang.reflect.Method m = c.getMethod(tn);
            m.invoke(o);
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (en == null) throw e;
          //  assert(en != null);
            Throwable t = e.getCause();
            if (t == null) throw e;
            //assert(e.getCause() != null);
            //System.out.println("t.getClass() = " + t.getClass());
            if (!t.getClass().getName().endsWith(en)) throw e;
            else caught = true;
            //assert(e.getCause().getClass().getName().endsWith(en));
        } catch (Throwable t) {
            if (en == null || !t.getClass().getName().endsWith(en)) throw t;
            else caught = true;
        } finally {
            //TODO handle the case where there is not expected assertion
            if(en != null && !caught) throw new RuntimeException();
            if (an != null) {
                for (String a : an) {
                    java.lang.reflect.Method am = c.getMethod(a); 
                    am.invoke(o);
                }
            }
            //TODO run @after method even when the test failed
        }
    }

    static public void main0() throws Exception {
        //if(true) throw new RuntimeException("Hello");
	    Driver_akela.main1();
    }
}

class Driver_android_rss {
    static public void main1() throws Exception { Driver.main("org.mcsoxford.rss.RSSBaseTest", "equalsNull", null, new String[]{"setup"}, null); }
static public void main2() throws Exception { Driver.main("org.mcsoxford.rss.RSSBaseTest", "equalsOtherType", null, new String[]{"setup"}, null); }
static public void main3() throws Exception { Driver.main("org.mcsoxford.rss.RSSBaseTest", "equalsSame", null, new String[]{"setup"}, null); }
static public void main4() throws Exception { Driver.main("org.mcsoxford.rss.RSSBaseTest", "equalsOtherNullLink", null, new String[]{"setup"}, null); }
static public void main5() throws Exception { Driver.main("org.mcsoxford.rss.RSSBaseTest", "equalsOtherLink", null, new String[]{"setup"}, null); }
static public void main6() throws Exception { Driver.main("org.mcsoxford.rss.RSSBaseTest", "equalsLink", null, new String[]{"setup"}, null); }
static public void main7() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingChannel", null, new String[]{"setup"}, null); }
static public void main8() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingItem", null, new String[]{"setup"}, null); }
static public void main9() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingTitle", null, new String[]{"setup"}, null); }
static public void main10() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingDescription", null, new String[]{"setup"}, null); }
static public void main11() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingContent", null, new String[]{"setup"}, null); }
static public void main12() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingCategory", null, new String[]{"setup"}, null); }
static public void main13() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingLink", null, new String[]{"setup"}, null); }
static public void main14() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingPubDate", null, new String[]{"setup"}, null); }
static public void main15() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "isBufferingThumbnail", null, new String[]{"setup"}, null); }
static public void main16() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "parseChannelWithThumbnail", null, new String[]{"setup"}, null); }
static public void main17() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "parseThumbnailWithoutUrl", null, new String[]{"setup"}, null); }
static public void main18() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "channelTitle", null, new String[]{"setup"}, null); }
static public void main19() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "itemTitle", null, new String[]{"setup"}, null); }
static public void main20() throws Exception { Driver.main("org.mcsoxford.rss.RSSHandlerTest", "items", null, new String[]{"setup"}, null); }
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
static public void main28() throws Exception { Driver.main("org.bukkit.ArtTest", "getByNullName", "IllegalArgumentException"); }
static public void main29() throws Exception { Driver.main("org.bukkit.ArtTest", "getById"); }
static public void main30() throws Exception { Driver.main("org.bukkit.ArtTest", "getByName"); }
static public void main31() throws Exception { Driver.main("org.bukkit.ArtTest", "dimensionSanityCheck"); }
static public void main32() throws Exception { Driver.main("org.bukkit.ArtTest", "getByNameWithMixedCase"); }
static public void main33() throws Exception { Driver.main("org.bukkit.configuration.MemoryConfigurationTest", "testAddDefault"); }
static public void main34() throws Exception { Driver.main("org.bukkit.configuration.MemoryConfigurationTest", "testAddDefaults_Map"); }
static public void main35() throws Exception { Driver.main("org.bukkit.configuration.MemoryConfigurationTest", "testAddDefaults_Configuration"); }
static public void main36() throws Exception { Driver.main("org.bukkit.configuration.MemoryConfigurationTest", "testSetDefaults"); }
static public void main37() throws Exception { Driver.main("org.bukkit.configuration.MemoryConfigurationTest", "testCreateSection"); }
static public void main38() throws Exception { Driver.main("org.bukkit.configuration.MemoryConfigurationTest", "testGetDefaults"); }
static public void main39() throws Exception { Driver.main("org.bukkit.util.StringUtilTest", "nullPrefixTest", "NullPointerException"); }
static public void main40() throws Exception { Driver.main("org.bukkit.util.StringUtilTest", "nullStringTest", "IllegalArgumentException"); }
static public void main41() throws Exception { Driver.main("org.bukkit.util.StringUtilTest", "nullCollectionTest", "IllegalArgumentException"); }
static public void main42() throws Exception { Driver.main("org.bukkit.util.StringUtilTest", "nullIterableTest", "IllegalArgumentException"); }
static public void main43() throws Exception { Driver.main("org.bukkit.util.StringUtilTest", "nullTokenTest", "IllegalArgumentException"); }
static public void main44() throws Exception { Driver.main("org.bukkit.util.StringUtilTest", "copyTokenTest"); }
static public void main45() throws Exception { Driver.main("org.bukkit.util.StringUtilTest", "copyUnsupportedTest", "UnsupportedOperationException"); }
static public void main46() throws Exception { Driver.main("org.bukkit.util.StringUtilTest", "copyNullTest", "IllegalArgumentException"); }
static public void main47() throws Exception { Driver.main("org.bukkit.metadata.LazyMetadataValueTest", "testLazyInt"); }
static public void main48() throws Exception { Driver.main("org.bukkit.metadata.LazyMetadataValueTest", "testLazyDouble"); }
static public void main49() throws Exception { Driver.main("org.bukkit.metadata.LazyMetadataValueTest", "testLazyString"); }
static public void main50() throws Exception { Driver.main("org.bukkit.metadata.LazyMetadataValueTest", "testLazyBoolean"); }
static public void main51() throws Exception { Driver.main("org.bukkit.metadata.LazyMetadataValueTest", "testEvalException", "MetadataEvaluationException"); }
static public void main52() throws Exception { Driver.main("org.bukkit.metadata.LazyMetadataValueTest", "testCacheStrategyCacheAfterFirstEval"); }
static public void main53() throws Exception { Driver.main("org.bukkit.metadata.LazyMetadataValueTest", "testCacheStrategyNeverCache"); }
static public void main54() throws Exception { Driver.main("org.bukkit.metadata.LazyMetadataValueTest", "testCacheStrategyEternally"); }
static public void main55() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testMetadataStore"); }
static public void main56() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testMetadataNotPresent"); }
static public void main57() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testInvalidateAll"); }
static public void main58() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testInvalidateAllButActuallyNothing"); }
static public void main59() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testMetadataReplace"); }
static public void main60() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testMetadataRemove"); }
static public void main61() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testMetadataRemoveLast"); }
static public void main62() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testMetadataRemoveForNonExistingPlugin"); }
static public void main63() throws Exception { Driver.main("org.bukkit.metadata.MetadataStoreTest", "testHasMetadata"); }
}

class Driver_commafeed {
    static public void main1() throws Exception { Driver.main("com.commafeed.backend.feed.EstimateDirectionTest", "testEstimateDirection"); }
    static public void main2() throws Exception { Driver.main("com.commafeed.backend.FixedSizeSortedSetTest", "testSimpleAdd", null, new String[]{"init"}, null); } 
static public void main3() throws Exception { Driver.main("com.commafeed.backend.FixedSizeSortedSetTest", "testIsFull", null, new String[]{"init"}, null); }
static public void main4() throws Exception { Driver.main("com.commafeed.backend.FixedSizeSortedSetTest", "testOrder", null, new String[]{"init"}, null); }                             
static public void main5() throws Exception { Driver.main("com.commafeed.backend.FixedSizeSortedSetTest", "testEviction", null, new String[]{"init"}, null); } 
static public void main6() throws Exception { Driver.main("com.commafeed.backend.FixedSizeSortedSetTest", "testCapacity", null, new String[]{"init"}, null); }  
static public void main7() throws Exception { Driver.main("com.commafeed.backend.FixedSizeSortedSetTest", "testLast", null, new String[]{"init"}, null); }
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
    static public void main3() throws Exception { Driver.main("joptsimple.PunctuationInShortOptionTest", "disallowsHyphenAsShortOption", "IllegalOptionSpecificationException"); }
    static public void main4() throws Exception { Driver.main("joptsimple.PunctuationInShortOptionTest", "allowsQuestionMarkAsShortOption"); }
    static public void main5() throws Exception { Driver.main("joptsimple.PunctuationInShortOptionTest", "allowsDotAsShortOption"); }
    static public void main6() throws Exception { Driver.main("joptsimple.PunctuationInShortOptionTest", "allowsUnderscoreAsShortOption"); }
    static public void main7() throws Exception { Driver.main("joptsimple.examples.LongOptionsWithArgumentPositioningTest", "allowsDifferentFormsOfPairingArgumentWithOption"); }
    static public void main8() throws Exception { Driver.main("joptsimple.examples.ShortOptionsWithArgumentPositioningTest", "allowsDifferentFormsOfPairingArgumentWithOption"); }
    static public void main9() throws Exception { Driver.main("joptsimple.examples.TypesafeOptionArgumentRetrievalTest", "allowsTypesafeRetrievalOfOptionArguments"); }
    static public void main10() throws Exception { Driver.main("joptsimple.examples.ShortOptionsClusteringTest", "allowsClusteringShortOptions"); }
    static public void main11() throws Exception { Driver.main("joptsimple.examples.LongOptionsTest", "acceptsLongOptions"); }
    static public void main12() throws Exception { Driver.main("joptsimple.examples.ExportOptionsTest", "allowsExportOfOptions"); }
    static public void main13() throws Exception { Driver.main("joptsimple.examples.RequiredOptionsTest", "allowsSpecificationOfRequiredOptions", "OptionException"); }
    static public void main14() throws Exception { Driver.main("joptsimple.examples.RequiredOptionsTest", "aHelpOptionMeansRequiredOptionsNeedNotBePresent"); }
    static public void main15() throws Exception { Driver.main("joptsimple.examples.RequiredOptionsTest", "missingHelpOptionMeansRequiredOptionsMustBePresent", "OptionException"); }
    static public void main16() throws Exception { Driver.main("joptsimple.examples.OptionSynonymTest", "supportsOptionSynonyms"); }
    static public void main17() throws Exception { Driver.main("joptsimple.ArgumentListHasNoMoreArgsTest", "peek", "IndexOutOfBoundsException", new String[]{"setUp"}, null); }
static public void main18() throws Exception { Driver.main("joptsimple.ArgumentListHasNoMoreArgsTest", "next", "IndexOutOfBoundsException", new String[]{"setUp"}, null); }
static public void main19() throws Exception { Driver.main("joptsimple.ArgumentListHasNoMoreArgsTest", "treatNextAsLongOption", "IndexOutOfBoundsException", new String[]{"setUp"}, null); }
static public void main20() throws Exception { Driver.main("joptsimple.ArgumentListTest", "nextAndPeek", null, new String[]{"setUp"}, null); }
static public void main21() throws Exception { Driver.main("joptsimple.ArgumentListTest", "treatNextAsLongOption", null, new String[]{"setUp"}, null); }
static public void main22() throws Exception { Driver.main("joptsimple.examples.LongOptionsWithArgumentsTest", "supportsLongOptionsWithArgumentsAndAbbreviations"); }
static public void main23() throws Exception { Driver.main("joptsimple.examples.LongOptionsWithArgumentsTest", "supportsLongOptionsWithEmptyArguments"); }
static public void main24() throws Exception { Driver.main("joptsimple.internal.RowsTest", "optionsAndDescriptionsWithinOverallWidth"); }
static public void main25() throws Exception { Driver.main("joptsimple.internal.RowsTest", "someOptionsExceedOverallWidth"); }
static public void main26() throws Exception { Driver.main("joptsimple.internal.RowsTest", "someDescriptionsExceedOverallWidth"); }
static public void main27() throws Exception { Driver.main("joptsimple.internal.SimpleOptionNameMapTest", "putAndContains"); }
static public void main28() throws Exception { Driver.main("joptsimple.internal.SimpleOptionNameMapTest", "get"); }
static public void main29() throws Exception { Driver.main("joptsimple.internal.SimpleOptionNameMapTest", "putAll"); }
static public void main30() throws Exception { Driver.main("joptsimple.internal.SimpleOptionNameMapTest", "remove"); }
static public void main31() throws Exception { Driver.main("joptsimple.internal.SimpleOptionNameMapTest", "toJavaUtilMap"); }
static public void main32() throws Exception { Driver.main("joptsimple.util.KeyValuePairTest", "nullArg", "NullPointerException"); }
static public void main33() throws Exception { Driver.main("joptsimple.util.KeyValuePairTest", "empty"); }
static public void main34() throws Exception { Driver.main("joptsimple.util.KeyValuePairTest", "noEqualsSign"); }
static public void main35() throws Exception { Driver.main("joptsimple.util.KeyValuePairTest", "signAtEnd"); }
static public void main36() throws Exception { Driver.main("joptsimple.util.KeyValuePairTest", "signAtStart"); }
static public void main37() throws Exception { Driver.main("joptsimple.util.KeyValuePairTest", "typical"); }
static public void main38() throws Exception { Driver.main("joptsimple.util.KeyValuePairTest", "multipleEqualsSignsDoNotMatter"); }
static public void main39() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "nullValuesAreIllegal", "NullPointerException", new String[]{"setUp"}, null); }
static public void main40() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "nullKeysAreIllegalToAdd", "NullPointerException", new String[]{"setUp"}, null); }
static public void main41() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "nullKeysAreIllegalToCheckForContains", "NullPointerException", new String[]{"setUp"}, null); }
static public void main42() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "zeroLengthKeysAreIllegalToAdd", "IllegalArgumentException", new String[]{"setUp"}, null); }
static public void main43() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "nullKeysAreIllegalToRemove", "NullPointerException", new String[]{"setUp"}, null); }
static public void main44() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "zeroLengthKeysAreIllegalToRemove", "IllegalArgumentException", new String[]{"setUp"}, null); }
static public void main45() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "empty", null, new String[]{"setUp"}, null); }
static public void main46() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addingOne", null, new String[]{"setUp"}, null); }
static public void main47() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addingManyWithNoCommonPrefix", null, new String[]{"setUp"}, null); }
static public void main48() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addingTwoWithCommonPrefix", null, new String[]{"setUp"}, null); }
static public void main49() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addingThreeWithSuccessivelySmallerPrefixes", null, new String[]{"setUp"}, null); }
static public void main50() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addingThreeWithSuccessivelyLargerPrefixes", null, new String[]{"setUp"}, null); }
static public void main51() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addingThreeWithMixOfPrefixSize", null, new String[]{"setUp"}, null); }
static public void main52() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addingOneThenReplacing", null, new String[]{"setUp"}, null); }
static public void main53() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "removingNonExistentKeyHasNoEffect", null, new String[]{"setUp"}, null); }
static public void main54() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "removingSingleKey", null, new String[]{"setUp"}, null); }
static public void main55() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "cannotRemoveByUniqueAbbreviation", null, new String[]{"setUp"}, null); }
static public void main56() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "removeKeyWithCommonPrefix", null, new String[]{"setUp"}, null); }
static public void main57() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addKeysWithCommonPrefixThenRemoveNonExistentKeyWithCommonPrefix", null, new String[]{"setUp"}, null); }
static public void main58() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addKeysWithCommonPrefixesStairstepStyle", null, new String[]{"setUp"}, null); }
static public void main59() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "addKeysWithCommonPrefixesStairstepStyleJumbled", null, new String[]{"setUp"}, null); }
static public void main60() throws Exception { Driver.main("joptsimple.internal.AbbreviationMapTest", "multipleKeysWithCommonPrefix", null, new String[]{"setUp"}, null); }
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
static public void main22() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "singleMessage", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main23() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "oneParameter", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main24() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "messageTwoParameters", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main25() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "traceMessageThreeParameters", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main26() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "testMessageThrowable", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main27() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "traceMessageOneParameterThrowable", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main28() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "traceMessageTwoParametersThrowable", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main29() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "testMessageThreeParametersThrowable", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main30() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "markerMessage", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main31() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "markerMessageOneParameter", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main32() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "traceMarkerMessageTwoParameters", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main33() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "traceMarkerMessageThreeParameters", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main34() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "markerMessageThrowable", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main35() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "markerMessageOneParameterThrowable", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main36() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "traceMarkerMessageTwoParametersThrowable", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
static public void main37() throws Exception { Driver.main("org.slf4j.event.EventRecodingLoggerTest", "traceMarkerMessageThreeParametersThrowable", null, new String[]{"setUp"}, new String[]{"tearDown"}); }
}

class Driver_spring_test_mvc {
static public void main1() throws Exception { Driver.main("org.springframework.test.web.server.samples.standalone.resulthandlers.PrintingResultHandlerTests", "testPrint"); }
static public void main2() throws Exception { Driver.main("org.springframework.test.web.server.result.FlashAttributeResultMatchersTests", "attributeExists"); }
static public void main3() throws Exception { Driver.main("org.springframework.test.web.server.result.FlashAttributeResultMatchersTests", "attributeExists_doesntExist", "AssertionError"); }
static public void main4() throws Exception { Driver.main("org.springframework.test.web.server.result.FlashAttributeResultMatchersTests", "attribute"); }
static public void main5() throws Exception { Driver.main("org.springframework.test.web.server.result.FlashAttributeResultMatchersTests", "attribute_incorrectValue", "AssertionError"); }
static public void main6() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "success"); }
static public void main7() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "successWithContent"); }
static public void main8() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "successWithContentWithoutContentType"); }
static public void main9() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "created"); }
static public void main10() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "noContent"); }
static public void main11() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "badRequest"); }
static public void main12() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "unauthorized"); }
static public void main13() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "serverError"); }
static public void main14() throws Exception { Driver.main("org.springframework.test.web.client.response.ResponseCreatorsTests", "withStatus"); }
static public void main15() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testNodeMatcher", null, new String[]{"setUp"}, null); }
static public void main16() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testNodeMatcherNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main17() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testExists", null, new String[]{"setUp"}, null); }
static public void main18() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testExistsNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main19() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testDoesNotExist", null, new String[]{"setUp"}, null); }
static public void main20() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testDoesNotExistNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main21() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testNodeCount", null, new String[]{"setUp"}, null); }
static public void main22() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testNodeCountNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main23() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testString", null, new String[]{"setUp"}, null); }
static public void main24() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testStringNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main25() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testNumber", null, new String[]{"setUp"}, null); }
static public void main26() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testNumberNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main27() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testBoolean", null, new String[]{"setUp"}, null); }
static public void main28() throws Exception { Driver.main("org.springframework.test.web.client.match.XpathRequestMatchersTests", "testBooleanNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main29() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testContentType", null, new String[]{"setUp"}, null); }
static public void main30() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testContentTypeNoMatch1", "AssertionError", new String[]{"setUp"}, null); }
static public void main31() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testContentTypeNoMatch2", "AssertionError", new String[]{"setUp"}, null); }
static public void main32() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testString", null, new String[]{"setUp"}, null); }
static public void main33() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testStringNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main34() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testBytes", null, new String[]{"setUp"}, null); }
static public void main35() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testBytesNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main36() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testXml", null, new String[]{"setUp"}, null); }
static public void main37() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testXmlNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main38() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testNodeMatcher", null, new String[]{"setUp"}, null); }
static public void main39() throws Exception { Driver.main("org.springframework.test.web.client.match.ContentRequestMatchersTests", "testNodeMatcherNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main40() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "requestTo", null, new String[]{"setUp"}, null); }
static public void main41() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "requestToNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main42() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "requestToContains", null, new String[]{"setUp"}, null); }
static public void main43() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "method", null, new String[]{"setUp"}, null); }
static public void main44() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "methodNoMatch", "AssertionError", new String[]{"setUp"}, null); }
static public void main45() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "header", null, new String[]{"setUp"}, null); }
static public void main46() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "headerMissing", "AssertionError", new String[]{"setUp"}, null); }
static public void main47() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "headerMissingValue", "AssertionError", new String[]{"setUp"}, null); }
static public void main48() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "headerContains", null, new String[]{"setUp"}, null); }
static public void main49() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "headerContainsWithMissingHeader", "AssertionError", new String[]{"setUp"}, null); }
static public void main50() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "headerContainsWithMissingValue", "AssertionError", new String[]{"setUp"}, null); }
static public void main51() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "headers", null, new String[]{"setUp"}, null); }
static public void main52() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "headersWithMissingHeader", "AssertionError", new String[]{"setUp"}, null); }
static public void main53() throws Exception { Driver.main("org.springframework.test.web.client.match.RequestMatchersTests", "headersWithMissingValue", "AssertionError", new String[]{"setUp"}, null); }

}

class Driver_httpcomponents_client {
static public void main1() throws Exception { Driver.main("org.apache.hc.client5.http.utils.TesDnsUtils", "testNormalize"); }
static public void main2() throws Exception { Driver.main("org.apache.hc.client5.http.classic.methods.TestHttpOptions", "testMultipleAllows"); }
static public void main3() throws Exception { Driver.main("org.apache.hc.client5.http.classic.methods.TestHttpTrace", "testHttpTraceSetEntity", "IllegalStateException"); }
static public void main4() throws Exception { Driver.main("org.apache.hc.client5.http.protocol.TestRedirectLocation", "testBasics"); }
static public void main5() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthChallenge", "testAuthChallengeWithValue"); }
static public void main6() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthChallenge", "testAuthChallengeWithParams"); }
static public void main7() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookieOrigin", "testConstructor"); }
static public void main8() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookieOrigin", "testNullHost", "NullPointerException"); }
static public void main9() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookieOrigin", "testEmptyHost", "IllegalArgumentException"); }
static public void main10() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookieOrigin", "testNegativePort", "IllegalArgumentException"); }
static public void main11() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookieOrigin", "testNullPath", "NullPointerException"); }
static public void main12() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookieOrigin", "testEmptyPath"); }
static public void main13() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePathComparator", "testUnequality1"); }
static public void main14() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePathComparator", "testUnequality2"); }
static public void main15() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePathComparator", "testEquality1"); }
static public void main16() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePathComparator", "testEquality2"); }
static public void main17() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePathComparator", "testEquality3"); }
static public void main18() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePathComparator", "testEquality4"); }
static public void main19() throws Exception { Driver.main("org.apache.hc.client5.http.classic.methods.TestHttpRequestBase", "testBasicProperties"); }
static public void main20() throws Exception { Driver.main("org.apache.hc.client5.http.classic.methods.TestHttpRequestBase", "testEmptyURI"); }
static public void main21() throws Exception { Driver.main("org.apache.hc.client5.http.impl.classic.TestNullBackoffStrategy", "doesNotBackoffForThrowables", null, new String[]{"setUp"}, null); }
static public void main22() throws Exception { Driver.main("org.apache.hc.client5.http.impl.classic.TestNullBackoffStrategy", "doesNotBackoffForResponses", null, new String[]{"setUp"}, null); }
static public void main23() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePriorityComparator", "testUnequality", null, new String[]{"setup"}, null); }
static public void main24() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePriorityComparator", "testEquality", null, new String[]{"setup"}, null); }
static public void main25() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePriorityComparator", "testUnequalityTrailingSlash", null, new String[]{"setup"}, null); }
static public void main26() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePriorityComparator", "testEqualityNullPath", null, new String[]{"setup"}, null); }
static public void main27() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePriorityComparator", "testEqualitySameLength", null, new String[]{"setup"}, null); }
static public void main28() throws Exception { Driver.main("org.apache.hc.client5.http.cookie.TestCookiePriorityComparator", "testUnequalityCreationDate", null, new String[]{"setup"}, null); }
static public void main29() throws Exception { Driver.main("org.apache.hc.client5.http.entity.mime.TestMultipartContentBody", "testStringBody"); }
static public void main30() throws Exception { Driver.main("org.apache.hc.client5.http.entity.mime.TestMultipartContentBody", "testInputStreamBody"); }
static public void main31() throws Exception { Driver.main("org.apache.hc.client5.http.entity.mime.TestFormBodyPartBuilder", "testBuildBodyPartBasics"); }
static public void main32() throws Exception { Driver.main("org.apache.hc.client5.http.entity.mime.TestFormBodyPartBuilder", "testBuildBodyPartMultipleBuilds"); }
static public void main33() throws Exception { Driver.main("org.apache.hc.client5.http.entity.mime.TestFormBodyPartBuilder", "testBuildBodyPartCustomHeaders"); }
static public void main34() throws Exception { Driver.main("org.apache.hc.client5.http.impl.TestDefaultConnKeepAliveStrategy", "testIllegalResponseArg", "NullPointerException"); }
static public void main35() throws Exception { Driver.main("org.apache.hc.client5.http.impl.TestDefaultConnKeepAliveStrategy", "testNoKeepAliveHeader"); }
static public void main36() throws Exception { Driver.main("org.apache.hc.client5.http.impl.TestDefaultConnKeepAliveStrategy", "testEmptyKeepAliveHeader"); }
static public void main37() throws Exception { Driver.main("org.apache.hc.client5.http.impl.TestDefaultConnKeepAliveStrategy", "testInvalidKeepAliveHeader"); }
static public void main38() throws Exception { Driver.main("org.apache.hc.client5.http.impl.TestDefaultConnKeepAliveStrategy", "testKeepAliveHeader"); }
static public void main39() throws Exception { Driver.main("org.apache.hc.client5.http.impl.classic.TestDefaultBackoffStrategy", "backsOffForSocketTimeouts", null, new String[]{"setUp"}, null); }
static public void main40() throws Exception { Driver.main("org.apache.hc.client5.http.impl.classic.TestDefaultBackoffStrategy", "backsOffForConnectionTimeouts", null, new String[]{"setUp"}, null); }
static public void main41() throws Exception { Driver.main("org.apache.hc.client5.http.impl.classic.TestDefaultBackoffStrategy", "doesNotBackOffForConnectionManagerTimeout", null, new String[]{"setUp"}, null); }
static public void main42() throws Exception { Driver.main("org.apache.hc.client5.http.impl.classic.TestDefaultBackoffStrategy", "backsOffForServiceUnavailable", null, new String[]{"setUp"}, null); }
static public void main43() throws Exception { Driver.main("org.apache.hc.client5.http.impl.classic.TestDefaultBackoffStrategy", "backsOffForTooManyRequests", null, new String[]{"setUp"}, null); }
static public void main44() throws Exception { Driver.main("org.apache.hc.client5.http.impl.classic.TestDefaultBackoffStrategy", "doesNotBackOffForNon429And503StatusCodes", null, new String[]{"setUp"}, null); }
static public void main45() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthScope", "testBasics"); }
static public void main46() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthScope", "testByOrigin"); }
static public void main47() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthScope", "testMixedCaseHostname"); }
static public void main48() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthScope", "testByOriginMixedCaseHostname"); }
static public void main49() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthScope", "testBasicsAllOptional"); }
static public void main50() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthScope", "testScopeMatching"); }
static public void main51() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthScope", "testEquals"); }
static public void main52() throws Exception { Driver.main("org.apache.hc.client5.http.auth.TestAuthScope", "testHash"); }
}

class Driver_vraptor4 {
static public void main1() throws Exception { Driver.main("br.com.caelum.vraptor.validator.I18nMessageTest", "shouldBeEqualAccordingToMessageCategoryParamsAndSeverity"); }
static public void main2() throws Exception { Driver.main("br.com.caelum.vraptor.interceptor.AcceptsNeedReturnBooleanValidationRuleTest", "shouldVerifyIfAcceptsMethodReturnsVoid", null, new String[]{"setUp"}, null); }
static public void main3() throws Exception { Driver.main("br.com.caelum.vraptor.interceptor.AcceptsNeedReturnBooleanValidationRuleTest", "shouldVerifyIfAcceptsMethodReturnsNonBooleanType", null, new String[]{"setUp"}, null); }
static public void main4() throws Exception { Driver.main("br.com.caelum.vraptor.interceptor.CustomAndInternalAcceptsValidationRuleTest", "mustNotUseInternalAcceptsAndCustomAccepts", null, new String[]{"setUp"}, null); }
static public void main5() throws Exception { Driver.main("br.com.caelum.vraptor.interceptor.CustomAndInternalAcceptsValidationRuleTest", "shouldValidateIfConstainsOnlyInternalAccepts", null, new String[]{"setUp"}, null); }
static public void main6() throws Exception { Driver.main("br.com.caelum.vraptor.interceptor.CustomAndInternalAcceptsValidationRuleTest", "shouldValidateIfConstainsOnlyCustomAccepts", null, new String[]{"setUp"}, null); }
static public void main7() throws Exception { Driver.main("br.com.caelum.vraptor.util.test.MockHttpResultTest", "test", null, new String[]{"setUp"}, null); }
static public void main8() throws Exception { Driver.main("br.com.caelum.vraptor.util.test.MockHttpServletResponseTest", "shouldBeAbleToReturnContentIntoWriteAsString", null, new String[]{"setUp"}, null); }
static public void main9() throws Exception { Driver.main("br.com.caelum.vraptor.util.test.MockHttpServletResponseTest", "shouldBeAbleToReturnResponseStatusCode", null, new String[]{"setUp"}, null); }
static public void main10() throws Exception { Driver.main("br.com.caelum.vraptor.converter.LongConverterTest", "shouldBeAbleToConvertNumbers", null, new String[]{"setup"}, null); }
static public void main11() throws Exception { Driver.main("br.com.caelum.vraptor.converter.LongConverterTest", "shouldComplainAboutInvalidNumber", null, new String[]{"setup"}, null); }
static public void main12() throws Exception { Driver.main("br.com.caelum.vraptor.converter.LongConverterTest", "shouldNotComplainAboutNull", null, new String[]{"setup"}, null); }
static public void main13() throws Exception { Driver.main("br.com.caelum.vraptor.converter.LongConverterTest", "shouldNotComplainAboutEmpty", null, new String[]{"setup"}, null); }
static public void main14() throws Exception { Driver.main("br.com.caelum.vraptor.converter.CharacterConverterTest", "shouldBeAbleToConvertCharacters", null, new String[]{"setup"}, null); }
static public void main15() throws Exception { Driver.main("br.com.caelum.vraptor.converter.CharacterConverterTest", "shouldComplainAboutStringTooBig", null, new String[]{"setup"}, null); }
static public void main16() throws Exception { Driver.main("br.com.caelum.vraptor.converter.CharacterConverterTest", "shouldNotComplainAboutNullAndEmpty", null, new String[]{"setup"}, null); }
static public void main17() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveByteConverterTest", "shouldBeAbleToConvertNumbers", null, new String[]{"setup"}, null); }
static public void main18() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveByteConverterTest", "shouldComplainAboutInvalidNumber", null, new String[]{"setup"}, null); }
static public void main19() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveByteConverterTest", "shouldConvertToZeroWhenNull", null, new String[]{"setup"}, null); }
static public void main20() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveByteConverterTest", "shouldConvertToZeroWhenEmpty", null, new String[]{"setup"}, null); }
static public void main21() throws Exception { Driver.main("br.com.caelum.vraptor.converter.IntegerConverterTest", "shouldBeAbleToConvertNumbers", null, new String[]{"setup"}, null); }
static public void main22() throws Exception { Driver.main("br.com.caelum.vraptor.converter.IntegerConverterTest", "shouldComplainAboutInvalidNumber", null, new String[]{"setup"}, null); }
static public void main23() throws Exception { Driver.main("br.com.caelum.vraptor.converter.IntegerConverterTest", "shouldNotComplainAboutNull", null, new String[]{"setup"}, null); }
static public void main24() throws Exception { Driver.main("br.com.caelum.vraptor.converter.IntegerConverterTest", "shouldNotComplainAboutEmpty", null, new String[]{"setup"}, null); }
static public void main25() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveIntConverterTest", "shouldBeAbleToConvertNumbers", null, new String[]{"setup"}, null); }
static public void main26() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveIntConverterTest", "shouldComplainAboutInvalidNumber", null, new String[]{"setup"}, null); }
static public void main27() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveIntConverterTest", "shouldConvertToZeroWhenNull", null, new String[]{"setup"}, null); }
static public void main28() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveIntConverterTest", "shouldConvertToZeroWhenEmpty", null, new String[]{"setup"}, null); }
static public void main29() throws Exception { Driver.main("br.com.caelum.vraptor.converter.BooleanConverterTest", "shouldBeAbleToConvertTrueAndFalse", null, new String[]{"setup"}, null); }
static public void main30() throws Exception { Driver.main("br.com.caelum.vraptor.converter.BooleanConverterTest", "shouldConvertEmptyToNull", null, new String[]{"setup"}, null); }
static public void main31() throws Exception { Driver.main("br.com.caelum.vraptor.converter.BooleanConverterTest", "shouldNotComplainAboutNull", null, new String[]{"setup"}, null); }
static public void main32() throws Exception { Driver.main("br.com.caelum.vraptor.converter.BooleanConverterTest", "shouldConvertYesNo", null, new String[]{"setup"}, null); }
static public void main33() throws Exception { Driver.main("br.com.caelum.vraptor.converter.BooleanConverterTest", "shouldConvertYN", null, new String[]{"setup"}, null); }
static public void main34() throws Exception { Driver.main("br.com.caelum.vraptor.converter.BooleanConverterTest", "shouldConvertOnOff", null, new String[]{"setup"}, null); }
static public void main35() throws Exception { Driver.main("br.com.caelum.vraptor.converter.BooleanConverterTest", "shouldConvertIgnoringCase", null, new String[]{"setup"}, null); }
static public void main36() throws Exception { Driver.main("br.com.caelum.vraptor.converter.BooleanConverterTest", "shouldThrowExceptionForInvalidString", null, new String[]{"setup"}, null); }
static public void main37() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveLongConverterTest", "shouldBeAbleToConvertNumbers", null, new String[]{"setup"}, null); }
static public void main38() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveLongConverterTest", "shouldComplainAboutInvalidNumber", null, new String[]{"setup"}, null); }
static public void main39() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveLongConverterTest", "shouldConvertToZeroWhenNull", null, new String[]{"setup"}, null); }
static public void main40() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveLongConverterTest", "shouldConvertToZeroWhenEmpty", null, new String[]{"setup"}, null); }
static public void main41() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveCharConverterTest", "shouldBeAbleToConvertNumbers", null, new String[]{"setup"}, null); }
static public void main42() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveCharConverterTest", "shouldComplainAboutInvalidNumber", null, new String[]{"setup"}, null); }
static public void main43() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveCharConverterTest", "shouldConvertToZeroWhenNull", null, new String[]{"setup"}, null); }
static public void main44() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveCharConverterTest", "shouldConvertToZeroWhenEmpty", null, new String[]{"setup"}, null); }
static public void main45() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest", "shouldBeAbleToConvertNumbers", null, new String[]{"setup"}, null); }
static public void main46() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest", "shouldConvertToZeroWhenNull", null, new String[]{"setup"}, null); }
static public void main47() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest", "shouldConvertToZeroWhenEmpty", null, new String[]{"setup"}, null); }
static public void main48() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest", "shouldConvertYesNo", null, new String[]{"setup"}, null); }
static public void main49() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest", "shouldConvertYN", null, new String[]{"setup"}, null); }
static public void main50() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest", "shouldConvertOnOff", null, new String[]{"setup"}, null); }
static public void main51() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest", "shouldConvertIgnoringCase", null, new String[]{"setup"}, null); }
static public void main52() throws Exception { Driver.main("br.com.caelum.vraptor.converter.PrimitiveBooleanConverterTest", "shouldThrowExceptionForInvalidString", null, new String[]{"setup"}, null); }
static public void main53() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "shouldComplainIfThereIsNothingRegistered", null, new String[]{"setup"}, null); }
static public void main54() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "shouldReturnHtmlWhenRequestingAnyContentType", null, new String[]{"setup"}, null); }
static public void main55() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "shouldReturnHtmlWhenAcceptsIsBlankContentType", null, new String[]{"setup"}, null); }
static public void main56() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "shouldReturnHtmlWhenRequestingUnknownAsFirstAndAnyContentType", null, new String[]{"setup"}, null); }
static public void main57() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testHtml", null, new String[]{"setup"}, null); }
static public void main58() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testJson", null, new String[]{"setup"}, null); }
static public void main59() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testJsonWithQualifier", null, new String[]{"setup"}, null); }
static public void main60() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testNull", null, new String[]{"setup"}, null); }
static public void main61() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testJsonInAComplexAcceptHeader", null, new String[]{"setup"}, null); }
static public void main62() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testPrecendenceInAComplexAcceptHeaderHtmlShouldPrevailWhenTied", null, new String[]{"setup"}, null); }
static public void main63() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testPrecendenceInABizzarreMSIE8AcceptHeader", null, new String[]{"setup"}, null); }
static public void main64() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testPrecendenceInABizzarreMSIE8AcceptHeaderWithHtml", null, new String[]{"setup"}, null); }
static public void main65() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testPrecendenceInAComplexAcceptHeaderHtmlShouldPrevailWhenTied2", null, new String[]{"setup"}, null); }
static public void main66() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testJsonInAComplexAcceptHeaderWithParameters", null, new String[]{"setup"}, null); }
static public void main67() throws Exception { Driver.main("br.com.caelum.vraptor.view.DefaultAcceptHeaderToFormatTest", "testXMLInAComplexAcceptHeaderWithParametersNotOrdered", null, new String[]{"setup"}, null); }
static public void main68() throws Exception { Driver.main("br.com.caelum.vraptor.interceptor.NoInterceptMethodsValidationRuleTest", "shoulThrowExceptionIfInterceptorDontHaveAnyCallableMethod", null, new String[]{"setUp"}, null); }
static public void main69() throws Exception { Driver.main("br.com.caelum.vraptor.interceptor.NoInterceptMethodsValidationRuleTest", "shoulWorksFineIfInterceptorHaveAtLeastOneCallableMethod", null, new String[]{"setUp"}, null); }
}

class Driver_spark {
static public void main1() throws Exception { Driver.main("spark.utils.MimeParseTest", "testBestMatch"); }
static public void main2() throws Exception { Driver.main("spark.utils.MimeParseTest", "testBestMatch_whenSupportedIsLowQualityFactor"); }
static public void main3() throws Exception { Driver.main("spark.utils.ObjectUtilsTest", "testIsEmpty_whenArrayIsEmpty"); }
static public void main4() throws Exception { Driver.main("spark.utils.ObjectUtilsTest", "testIsEmpty_whenArrayIsNotEmpty"); }
static public void main5() throws Exception { Driver.main("spark.utils.CollectionUtilsTest", "testIsEmpty_whenCollectionIsEmpty_thenReturnTrue"); }
static public void main6() throws Exception { Driver.main("spark.utils.CollectionUtilsTest", "testIsEmpty_whenCollectionIsNotEmpty_thenReturnFalse"); }
static public void main7() throws Exception { Driver.main("spark.utils.CollectionUtilsTest", "testIsEmpty_whenCollectionIsNull_thenReturnTrue"); }
static public void main8() throws Exception { Driver.main("spark.utils.CollectionUtilsTest", "testIsNotEmpty_whenCollectionIsEmpty_thenReturnFalse"); }
static public void main9() throws Exception { Driver.main("spark.utils.CollectionUtilsTest", "testIsNotEmpty_whenCollectionIsNotEmpty_thenReturnTrue"); }
static public void main10() throws Exception { Driver.main("spark.utils.CollectionUtilsTest", "testIsNotEmpty_whenCollectionIsNull_thenReturnFalse"); }
static public void main11() throws Exception { Driver.main("spark.utils.SparkUtilsTest", "testConvertRouteToList"); }
static public void main12() throws Exception { Driver.main("spark.utils.SparkUtilsTest", "testIsParam_whenParameterFormattedAsParm"); }
static public void main13() throws Exception { Driver.main("spark.utils.SparkUtilsTest", "testIsParam_whenParameterNotFormattedAsParm"); }
static public void main14() throws Exception { Driver.main("spark.utils.SparkUtilsTest", "testIsSplat_whenParameterIsASplat"); }
static public void main15() throws Exception { Driver.main("spark.utils.SparkUtilsTest", "testIsSplat_whenParameterIsNotASplat"); }
static public void main16() throws Exception { Driver.main("spark.ExceptionMapperTest", "testGetInstance_whenDefaultInstanceIsNull"); }
static public void main17() throws Exception { Driver.main("spark.ExceptionMapperTest", "testGetInstance_whenDefaultInstanceIsNotNull"); }
static public void main18() throws Exception { Driver.main("spark.util.ResourceUtilsTest", "testGetFile_whenURLProtocolIsNotFile_thenThrowFileNotFoundException"); }
static public void main19() throws Exception { Driver.main("spark.util.ResourceUtilsTest", "testGetFile_whenURLProtocolIsFile_thenReturnFileObject"); }
static public void main20() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_BeforeAndAllPaths"); }
static public void main21() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_AfterAndAllPaths"); }
static public void main22() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_NotAllPathsAndDidNotMatchHttpMethod"); }
static public void main23() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_RouteDoesNotEndWithSlash"); }
static public void main24() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_PathDoesNotEndInSlash"); }
static public void main25() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_MatchingPaths"); }
static public void main26() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_WithWildcardOnEntryPath"); }
static public void main27() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_PathsDoNotMatch"); }
static public void main28() throws Exception { Driver.main("spark.route.RouteEntryTest", "testMatches_longRoutePathWildcard"); }
static public void main29() throws Exception { Driver.main("spark.route.HttpMethodTest", "testSupportedHttpMethod"); }
static public void main30() throws Exception { Driver.main("spark.route.HttpMethodTest", "testNotSupportedHttpMethod"); }
static public void main31() throws Exception { Driver.main("spark.RouteImplTest", "testConstructor"); }
static public void main32() throws Exception { Driver.main("spark.RouteImplTest", "testGets_thenReturnGetPathAndGetAcceptTypeSuccessfully"); }
static public void main33() throws Exception { Driver.main("spark.RouteImplTest", "testCreate_whenOutAssignAcceptTypeInTheParameters_thenReturnPathAndAcceptTypeSuccessfully"); }
static public void main34() throws Exception { Driver.main("spark.RouteImplTest", "testCreate_whenAcceptTypeNullValueInTheParameters_thenReturnPathAndAcceptTypeSuccessfully"); }
static public void main35() throws Exception { Driver.main("spark.RouteImplTest", "testRender_whenElementParameterValid_thenReturnValidObject"); }
static public void main36() throws Exception { Driver.main("spark.RouteImplTest", "testRender_whenElementParameterIsNull_thenReturnNull"); }
static public void main37() throws Exception { Driver.main("spark.QueryParamsMapTest", "constructorWithParametersMap"); }
static public void main38() throws Exception { Driver.main("spark.QueryParamsMapTest", "keyToMap"); }
static public void main39() throws Exception { Driver.main("spark.QueryParamsMapTest", "testDifferentTypesForValue"); }
static public void main40() throws Exception { Driver.main("spark.QueryParamsMapTest", "parseKeyShouldParseRootKey"); }
static public void main41() throws Exception { Driver.main("spark.QueryParamsMapTest", "parseKeyShouldParseSubkeys"); }
static public void main42() throws Exception { Driver.main("spark.QueryParamsMapTest", "itShouldbeNullSafe"); }
static public void main43() throws Exception { Driver.main("spark.QueryParamsMapTest", "testConstructor"); }
static public void main44() throws Exception { Driver.main("spark.QueryParamsMapTest", "testToMap"); }
static public void main45() throws Exception { Driver.main("spark.resource.UriPathTest", "canonical"); }
static public void main46() throws Exception { Driver.main("spark.Base64Test", "test_encode"); }
static public void main47() throws Exception { Driver.main("spark.Base64Test", "test_decode"); }
static public void main48() throws Exception { Driver.main("spark.serialization.InputStreamSerializerTest", "testProcess_copiesData"); }
static public void main49() throws Exception { Driver.main("spark.serialization.InputStreamSerializerTest", "testProcess_closesStream"); }
static public void main50() throws Exception { Driver.main("spark.FilterImplTest", "testConstructor", null, new String[]{"setup"}, null); }
static public void main51() throws Exception { Driver.main("spark.FilterImplTest", "testGets_thenReturnGetPathAndGetAcceptTypeSuccessfully", null, new String[]{"setup"}, null); }
static public void main52() throws Exception { Driver.main("spark.FilterImplTest", "testCreate_whenOutAssignAcceptTypeInTheParameters_thenReturnPathAndAcceptTypeSuccessfully", null, new String[]{"setup"}, null); }
static public void main53() throws Exception { Driver.main("spark.FilterImplTest", "testCreate_whenAcceptTypeNullValueInTheParameters_thenReturnPathAndAcceptTypeSuccessfully", null, new String[]{"setup"}, null); }
}

class Driver_hbc {
static public void main1() throws Exception { Driver.main("com.twitter.hbc.ReconnectionManagerTest", "testLinearBackoff"); }
static public void main2() throws Exception { Driver.main("com.twitter.hbc.ReconnectionManagerTest", "testExponentialBackoff"); }
static public void main3() throws Exception { Driver.main("com.twitter.hbc.ReconnectionManagerTest", "testBackoffSwitching"); }
static public void main4() throws Exception { Driver.main("com.twitter.hbc.ReconnectionManagerTest", "testEstimateBackfill"); }
static public void main5() throws Exception { Driver.main("com.twitter.hbc.ReconnectionManagerTest", "testRetries"); }
static public void main6() throws Exception { Driver.main("com.twitter.hbc.StatsReporterTest", "testStatsReporter"); }
static public void main7() throws Exception { Driver.main("com.twitter.hbc.HttpHostsTest", "testExceptionIfBadScheme"); }
static public void main8() throws Exception { Driver.main("com.twitter.hbc.HttpHostsTest", "testIsScrambled"); }
static public void main9() throws Exception { Driver.main("com.twitter.hbc.HttpHostsTest", "testContainsAll"); }
static public void main10() throws Exception { Driver.main("com.twitter.hbc.HttpHostsTest", "testInfiniteIteration"); }
static public void main11() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testDefaultToCurrentApiVersion"); }
static public void main12() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testCanSetApiVersion"); }
static public void main13() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testDefaultParams"); }
static public void main14() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testChangeDefaultParamValues"); }
static public void main15() throws Exception {
    Driver.main("com.twitter.hbc.EndpointTest", "testStatusesFilterEndpointTest"); }
static public void main16() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testEnterpriseStreamingEndpoint"); }
static public void main17() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testEnterpriseStreamingEndpointProduct"); }
static public void main18() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testEnterpriseReplayStreamingEndpointFormatsDateParamsAndIncludesThem"); }
static public void main19() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testBackfillParamOnEnterpriseStreamEndpoint"); }
static public void main20() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testLanguages"); }
static public void main21() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testFilterLevel"); }
static public void main22() throws Exception { Driver.main("com.twitter.hbc.EndpointTest", "testSiteStreamEndpoint"); }
}

class Driver_fongo {
static public void main1() throws Exception { Driver.main("com.github.fakemongo.impl.index.IndexedListTest", "testAdd", null, new String[]{"setUp"}, null); }
static public void main2() throws Exception { Driver.main("com.github.fakemongo.impl.index.IndexedListTest", "testSizeWithDuplicates", null, new String[]{"setUp"}, null); }
static public void main3() throws Exception { Driver.main("com.github.fakemongo.impl.index.IndexedListTest", "testContains", null, new String[]{"setUp"}, null); }
static public void main4() throws Exception { Driver.main("com.github.fakemongo.impl.index.IndexedListTest", "testContainsWithoutSecondElement", null, new String[]{"setUp"}, null); }
static public void main5() throws Exception { Driver.main("com.github.fakemongo.impl.index.IndexedListTest", "testContainsSame", null, new String[]{"setUp"}, null); }
static public void main6() throws Exception { Driver.main("com.github.fakemongo.impl.index.IndexedListTest", "testRemove", null, new String[]{"setUp"}, null); }
static public void main7() throws Exception { Driver.main("com.github.fakemongo.impl.index.IndexedListTest", "testRemoveSame", null, new String[]{"setUp"}, null); }
static public void main8() throws Exception { Driver.main("com.github.fakemongo.impl.index.IndexedListTest", "testRemoveNotExistedElement", null, new String[]{"setUp"}, null); }
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
        p.setStepShowMode(RunParameters.StepShowMode.NONE);
    }
}
