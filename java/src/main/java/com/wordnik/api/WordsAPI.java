package com.wordnik.api;


import com.wordnik.common.*;
import com.wordnik.common.ext.*;
import com.wordnik.exception.WordnikExceptionCodes;
import com.wordnik.exception.WordnikAPIException;
import com.wordnik.model.*;
import java.util.*;
import com.wordnik.annotations.MethodArgumentNames;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import java.io.IOException;

/**
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class WordsAPI extends WordnikAPI {

	/**
	 * Returns a single random WordObject, in the format specified by the URL
 
	 * @param wordsRandomWordInput  
 

	 * 
	 * @return WordObject {@link WordObject}
	 * @throws WordnikAPIException 404 - No word found.  
	 */
	 @MethodArgumentNames(value="wordsRandomWordInput") 
	public static WordObject getRandomWord(WordsRandomWordInput wordsRandomWordInput) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/randomWord";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		
		if( wordsRandomWordInput != null && wordsRandomWordInput.getHasDictionaryDef() != null) {
		 	queryParams.put("hasDictionaryDef", wordsRandomWordInput.getHasDictionaryDef());
		}
		if( wordsRandomWordInput != null && wordsRandomWordInput.getIncludePartOfSpeech() != null) {
		 	queryParams.put("includePartOfSpeech", wordsRandomWordInput.getIncludePartOfSpeech());
		}
		if( wordsRandomWordInput != null && wordsRandomWordInput.getExcludePartOfSpeech() != null) {
		 	queryParams.put("excludePartOfSpeech", wordsRandomWordInput.getExcludePartOfSpeech());
		}
		if( wordsRandomWordInput != null && wordsRandomWordInput.getMinCorpusCount() != null) {
		 	queryParams.put("minCorpusCount", wordsRandomWordInput.getMinCorpusCount());
		}
		if( wordsRandomWordInput != null && wordsRandomWordInput.getMaxCorpusCount() != null) {
		 	queryParams.put("maxCorpusCount", wordsRandomWordInput.getMaxCorpusCount());
		}
		if( wordsRandomWordInput != null && wordsRandomWordInput.getMinDictionaryCount() != null) {
		 	queryParams.put("minDictionaryCount", wordsRandomWordInput.getMinDictionaryCount());
		}
		if( wordsRandomWordInput != null && wordsRandomWordInput.getMaxDictionaryCount() != null) {
		 	queryParams.put("maxDictionaryCount", wordsRandomWordInput.getMaxDictionaryCount());
		}
		if( wordsRandomWordInput != null && wordsRandomWordInput.getMinLength() != null) {
		 	queryParams.put("minLength", wordsRandomWordInput.getMinLength());
		}
		if( wordsRandomWordInput != null && wordsRandomWordInput.getMaxLength() != null) {
		 	queryParams.put("maxLength", wordsRandomWordInput.getMaxLength());
		}

	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		WordObject responseObject = (WordObject)deserialize(response, WordObject.class);
		return responseObject;		
				
	}
	
	
	/**
	 * Returns an array of random WordObjects, in the format specified by the URL
 
	 * @param wordsRandomWordsInput  
 

	 * 
	 * @return List<WordObject> {@link WordObject}
	 * @throws WordnikAPIException 400 - Invalid term supplied. 404 - No results.  
	 */
	 @MethodArgumentNames(value="wordsRandomWordsInput") 
	public static List<WordObject> getRandomWords(WordsRandomWordsInput wordsRandomWordsInput) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/randomWords";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getHasDictionaryDef() != null) {
		 	queryParams.put("hasDictionaryDef", wordsRandomWordsInput.getHasDictionaryDef());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getIncludePartOfSpeech() != null) {
		 	queryParams.put("includePartOfSpeech", wordsRandomWordsInput.getIncludePartOfSpeech());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getExcludePartOfSpeech() != null) {
		 	queryParams.put("excludePartOfSpeech", wordsRandomWordsInput.getExcludePartOfSpeech());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getMinCorpusCount() != null) {
		 	queryParams.put("minCorpusCount", wordsRandomWordsInput.getMinCorpusCount());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getMaxCorpusCount() != null) {
		 	queryParams.put("maxCorpusCount", wordsRandomWordsInput.getMaxCorpusCount());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getMinDictionaryCount() != null) {
		 	queryParams.put("minDictionaryCount", wordsRandomWordsInput.getMinDictionaryCount());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getMaxDictionaryCount() != null) {
		 	queryParams.put("maxDictionaryCount", wordsRandomWordsInput.getMaxDictionaryCount());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getMinLength() != null) {
		 	queryParams.put("minLength", wordsRandomWordsInput.getMinLength());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getMaxLength() != null) {
		 	queryParams.put("maxLength", wordsRandomWordsInput.getMaxLength());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getSortBy() != null) {
		 	queryParams.put("sortBy", wordsRandomWordsInput.getSortBy());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getSortOrder() != null) {
		 	queryParams.put("sortOrder", wordsRandomWordsInput.getSortOrder());
		}
		if( wordsRandomWordsInput != null && wordsRandomWordsInput.getLimit() != null) {
		 	queryParams.put("limit", wordsRandomWordsInput.getLimit());
		}

	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		
        TypeReference<ArrayList<WordObject>> typeRef = new TypeReference<ArrayList<WordObject>>() {
		};
        try {
            List<WordObject> responseObject = (List<WordObject>) mapper.readValue(response, typeRef);
            return responseObject;
        } catch (IOException ioe) {
        	String[] args = new String[]{response, typeRef.toString()};
            throw new WordnikAPIException(WordnikExceptionCodes.ERROR_CONVERTING_JSON_TO_JAVA, args, "Error in converting response json value to java object : " + ioe.getMessage(), ioe);
        }						
	}
	
	
	/**
	 * Searches words.
 
	 * @param wordsSearchInput  
 

	 * 
	 * @return List<WordFrequency> {@link WordFrequency}
	 * @throws WordnikAPIException 400 - Invalid term supplied. 404 - No results.  
	 */
	 @MethodArgumentNames(value="wordsSearchInput") 
	public static List<WordFrequency> searchWords(WordsSearchInput wordsSearchInput) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/search";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		
		if( wordsSearchInput != null && wordsSearchInput.getQuery() != null) {
		 	queryParams.put("query", wordsSearchInput.getQuery());
		}
		if( wordsSearchInput != null && wordsSearchInput.getCaseSensitive() != null) {
		 	queryParams.put("caseSensitive", wordsSearchInput.getCaseSensitive());
		}
		if( wordsSearchInput != null && wordsSearchInput.getIncludePartOfSpeech() != null) {
		 	queryParams.put("includePartOfSpeech", wordsSearchInput.getIncludePartOfSpeech());
		}
		if( wordsSearchInput != null && wordsSearchInput.getExcludePartOfSpeech() != null) {
		 	queryParams.put("excludePartOfSpeech", wordsSearchInput.getExcludePartOfSpeech());
		}
		if( wordsSearchInput != null && wordsSearchInput.getMinCorpusCount() != null) {
		 	queryParams.put("minCorpusCount", wordsSearchInput.getMinCorpusCount());
		}
		if( wordsSearchInput != null && wordsSearchInput.getMaxCorpusCount() != null) {
		 	queryParams.put("maxCorpusCount", wordsSearchInput.getMaxCorpusCount());
		}
		if( wordsSearchInput != null && wordsSearchInput.getMinDictionaryCount() != null) {
		 	queryParams.put("minDictionaryCount", wordsSearchInput.getMinDictionaryCount());
		}
		if( wordsSearchInput != null && wordsSearchInput.getMaxDictionaryCount() != null) {
		 	queryParams.put("maxDictionaryCount", wordsSearchInput.getMaxDictionaryCount());
		}
		if( wordsSearchInput != null && wordsSearchInput.getMinLength() != null) {
		 	queryParams.put("minLength", wordsSearchInput.getMinLength());
		}
		if( wordsSearchInput != null && wordsSearchInput.getMaxLength() != null) {
		 	queryParams.put("maxLength", wordsSearchInput.getMaxLength());
		}
		if( wordsSearchInput != null && wordsSearchInput.getSkip() != null) {
		 	queryParams.put("skip", wordsSearchInput.getSkip());
		}
		if( wordsSearchInput != null && wordsSearchInput.getLimit() != null) {
		 	queryParams.put("limit", wordsSearchInput.getLimit());
		}

	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		
        TypeReference<ArrayList<WordFrequency>> typeRef = new TypeReference<ArrayList<WordFrequency>>() {
		};
        try {
            List<WordFrequency> responseObject = (List<WordFrequency>) mapper.readValue(response, typeRef);
            return responseObject;
        } catch (IOException ioe) {
        	String[] args = new String[]{response, typeRef.toString()};
            throw new WordnikAPIException(WordnikExceptionCodes.ERROR_CONVERTING_JSON_TO_JAVA, args, "Error in converting response json value to java object : " + ioe.getMessage(), ioe);
        }						
	}
	
	
	/**
	 * Fetches an array of WordOfTheDayList basd on a criteria
 
	 * @param containsWord  Lists must contain a specific word
 
	 * @param subscriberCount  Lists must have the specified number of subscribers
 
	 * @param itemCount  Lists must have the specified number of items
 
	 * @param includeAll  Returns future WordOfTheDay items
 

	 * 
	 * @return List<WordOfTheDayList> {@link WordOfTheDayList}
	 * @throws WordnikAPIException 400 - Invalid word supplied.  
	 */
	 @MethodArgumentNames(value="containsWord, subscriberCount, itemCount, includeAll") 
	public static List<WordOfTheDayList> getWordOfTheDayListsContainingWord(String containsWord, String subscriberCount, String itemCount, String includeAll) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDayLists";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( containsWord != null) {
		 	queryParams.put("containsWord", containsWord);
		}
		if( subscriberCount != null) {
		 	queryParams.put("subscriberCount", subscriberCount);
		}
		if( itemCount != null) {
		 	queryParams.put("itemCount", itemCount);
		}
		if( includeAll != null) {
		 	queryParams.put("includeAll", includeAll);
		}

		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		
        TypeReference<ArrayList<WordOfTheDayList>> typeRef = new TypeReference<ArrayList<WordOfTheDayList>>() {
		};
        try {
            List<WordOfTheDayList> responseObject = (List<WordOfTheDayList>) mapper.readValue(response, typeRef);
            return responseObject;
        } catch (IOException ioe) {
        	String[] args = new String[]{response, typeRef.toString()};
            throw new WordnikAPIException(WordnikExceptionCodes.ERROR_CONVERTING_JSON_TO_JAVA, args, "Error in converting response json value to java object : " + ioe.getMessage(), ioe);
        }						
	}
	
	
	/**
	 * Fetches WordOfTheDay objects for a specific date
 
	 * @param date  ID of WordOfTheDayList
 
	 * @param includeAll  Returns future WordOfTheDay items
 

	 * 
	 * @return List<WordOfTheDay> {@link WordOfTheDay}
	 * @throws WordnikAPIException 400 - Invalid ID supplied 404 - WordOfTheDayList or User not found  
	 */
	 @MethodArgumentNames(value="date, includeAll") 
	public static List<WordOfTheDay> getWordOfTheDayListsForDate(String date, String includeAll) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDayLists/{date}";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( includeAll != null) {
		 	queryParams.put("includeAll", includeAll);
		}

		if( date != null) {
			resourcePath = resourcePath.replace("{date}", date);
		}
		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		
        TypeReference<ArrayList<WordOfTheDay>> typeRef = new TypeReference<ArrayList<WordOfTheDay>>() {
		};
        try {
            List<WordOfTheDay> responseObject = (List<WordOfTheDay>) mapper.readValue(response, typeRef);
            return responseObject;
        } catch (IOException ioe) {
        	String[] args = new String[]{response, typeRef.toString()};
            throw new WordnikAPIException(WordnikExceptionCodes.ERROR_CONVERTING_JSON_TO_JAVA, args, "Error in converting response json value to java object : " + ioe.getMessage(), ioe);
        }						
	}
	
	
	/**
	 * Subscribes a user to a WordOfTheDayList
 
	 * @param authToken  auth_token of logged-in user
 
	 * @param permalink  ID of WordOfTheDayList
 
	 * @param medium  Medium to subscribe with
 
	 * @param postObject  Username to subscribe
 

	 * 
	 * @return void {@link Void}
	 * @throws WordnikAPIException 400 - Invalid ID supplied 403 - Not authorized to subscribe 404 - WordOfTheDayList or User not found  
	 */
	 @MethodArgumentNames(value="authToken, permalink, medium, postObject") 
	public static void subscribeToList(String authToken, String permalink, String medium, String postObject) throws WordnikAPIException {

		if(authToken == null || authToken.length() == 0) {
			throw new WordnikAPIException(WordnikExceptionCodes.AUTH_TOKEN_NOT_VALID);
		}		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDayList/{permalink}/subscription";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "POST";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( medium != null) {
		 	queryParams.put("medium", medium);
		}

		if( permalink != null) {
			resourcePath = resourcePath.replace("{permalink}", permalink);
		}
		
	
		//make the API Call
	
		String response = invokeAPI(authToken, resourcePath, method, queryParams, postObject);		
		
		//create output objects if the response has more than one object
		
	}
	
	
	/**
	 * Searches definitions.
 
	 * @param wordsSearchDefinitionsInput  
 

	 * 
	 * @return DefinitionSearchResults {@link DefinitionSearchResults}
	 * @throws WordnikAPIException 400 - Invalid term supplied.  
	 */
	 @MethodArgumentNames(value="wordsSearchDefinitionsInput") 
	public static DefinitionSearchResults searchDefinitions(WordsSearchDefinitionsInput wordsSearchDefinitionsInput) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/searchDefinitions";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getQuery() != null) {
		 	queryParams.put("query", wordsSearchDefinitionsInput.getQuery());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getDefinedWordSearchTerm() != null) {
		 	queryParams.put("definedWordSearchTerm", wordsSearchDefinitionsInput.getDefinedWordSearchTerm());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getIncludeSourceDictionaries() != null) {
		 	queryParams.put("includeSourceDictionaries", wordsSearchDefinitionsInput.getIncludeSourceDictionaries());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getExcludeSourceDictionaries() != null) {
		 	queryParams.put("excludeSourceDictionaries", wordsSearchDefinitionsInput.getExcludeSourceDictionaries());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getIncludePartOfSpeech() != null) {
		 	queryParams.put("includePartOfSpeech", wordsSearchDefinitionsInput.getIncludePartOfSpeech());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getExcludePartOfSpeech() != null) {
		 	queryParams.put("excludePartOfSpeech", wordsSearchDefinitionsInput.getExcludePartOfSpeech());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getMinCorpusCount() != null) {
		 	queryParams.put("minCorpusCount", wordsSearchDefinitionsInput.getMinCorpusCount());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getMaxCorpusCount() != null) {
		 	queryParams.put("maxCorpusCount", wordsSearchDefinitionsInput.getMaxCorpusCount());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getMinLength() != null) {
		 	queryParams.put("minLength", wordsSearchDefinitionsInput.getMinLength());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getMaxLength() != null) {
		 	queryParams.put("maxLength", wordsSearchDefinitionsInput.getMaxLength());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getExpandTerms() != null) {
		 	queryParams.put("expandTerms", wordsSearchDefinitionsInput.getExpandTerms());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getWordTypes() != null) {
		 	queryParams.put("wordTypes", wordsSearchDefinitionsInput.getWordTypes());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getIncludeTags() != null) {
		 	queryParams.put("includeTags", wordsSearchDefinitionsInput.getIncludeTags());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getSortBy() != null) {
		 	queryParams.put("sortBy", wordsSearchDefinitionsInput.getSortBy());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getSortOrder() != null) {
		 	queryParams.put("sortOrder", wordsSearchDefinitionsInput.getSortOrder());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getSkip() != null) {
		 	queryParams.put("skip", wordsSearchDefinitionsInput.getSkip());
		}
		if( wordsSearchDefinitionsInput != null && wordsSearchDefinitionsInput.getLimit() != null) {
		 	queryParams.put("limit", wordsSearchDefinitionsInput.getLimit());
		}

	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		DefinitionSearchResults responseObject = (DefinitionSearchResults)deserialize(response, DefinitionSearchResults.class);
		return responseObject;		
				
	}
	
	
	/**
	 * Searches dictionary entries.
 
	 * @param query  Search term
 
	 * @param skip  Results to skip
	 *        Allowed values are - 0 to 1000    
	 * @param limit  Maximum number of results to return
	 *        Allowed values are - 1 to 1000    

	 * 
	 * @return EntrySearchResults {@link EntrySearchResults}
	 * @throws WordnikAPIException 400 - Invalid term supplied.  
	 */
	 @MethodArgumentNames(value="query, skip, limit") 
	public static EntrySearchResults searchEntries(String query, String skip, String limit) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/searchEntries";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( query != null) {
		 	queryParams.put("query", query);
		}
		if( skip != null) {
		 	queryParams.put("skip", skip);
		}
		if( limit != null) {
		 	queryParams.put("limit", limit);
		}

		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		EntrySearchResults responseObject = (EntrySearchResults)deserialize(response, EntrySearchResults.class);
		return responseObject;		
				
	}
	
	
	/**
	 * Fetches surface forms of a word
 
	 * @param term  Word to get surface forms for.
 

	 * 
	 * @return String {@link String}
	 * @throws WordnikAPIException 400 - Invalid term supplied.  
	 */
	 @MethodArgumentNames(value="term") 
	public static String getSurfaceForms(String term) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/surfaceForms";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( term != null) {
		 	queryParams.put("term", term);
		}

		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		String responseObject = (String)deserialize(response, String.class);
		return responseObject;		
				
	}
	
	
	/**
	 * Returns a specific WordOfTheDay
 
	 * @param date  Fetches by date in yyyy-MM-dd
 
	 * @param category  Filters response by category
 
	 * @param creator  Filters response by username
 

	 * 
	 * @return WordOfTheDay {@link WordOfTheDay}
	 * @throws WordnikAPIException 404 - No data available  
	 */
	 @MethodArgumentNames(value="date, category, creator") 
	public static WordOfTheDay getWordOfTheDay(String date, String category, String creator) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDay";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( date != null) {
		 	queryParams.put("date", date);
		}
		if( category != null) {
		 	queryParams.put("category", category);
		}
		if( creator != null) {
		 	queryParams.put("creator", creator);
		}

		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		WordOfTheDay responseObject = (WordOfTheDay)deserialize(response, WordOfTheDay.class);
		return responseObject;		
				
	}
	
	
	/**
	 * Returns a WordOfTheDay range
 
	 * @param wordsWordOfTheDayInputRangeInput  
 

	 * 
	 * @return List<WordOfTheDay> {@link WordOfTheDay}
	 * @throws WordnikAPIException 404 - No data available  
	 */
	 @MethodArgumentNames(value="wordsWordOfTheDayInputRangeInput") 
	public static List<WordOfTheDay> getWordOfTheDayRange(WordsWordOfTheDayInputRangeInput wordsWordOfTheDayInputRangeInput) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDay/range";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		
		if( wordsWordOfTheDayInputRangeInput != null && wordsWordOfTheDayInputRangeInput.getCategory() != null) {
		 	queryParams.put("category", wordsWordOfTheDayInputRangeInput.getCategory());
		}
		if( wordsWordOfTheDayInputRangeInput != null && wordsWordOfTheDayInputRangeInput.getCreator() != null) {
		 	queryParams.put("creator", wordsWordOfTheDayInputRangeInput.getCreator());
		}
		if( wordsWordOfTheDayInputRangeInput != null && wordsWordOfTheDayInputRangeInput.getProvider() != null) {
		 	queryParams.put("provider", wordsWordOfTheDayInputRangeInput.getProvider());
		}
		if( wordsWordOfTheDayInputRangeInput != null && wordsWordOfTheDayInputRangeInput.getSkip() != null) {
		 	queryParams.put("skip", wordsWordOfTheDayInputRangeInput.getSkip());
		}
		if( wordsWordOfTheDayInputRangeInput != null && wordsWordOfTheDayInputRangeInput.getLimit() != null) {
		 	queryParams.put("limit", wordsWordOfTheDayInputRangeInput.getLimit());
		}

	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		
        TypeReference<ArrayList<WordOfTheDay>> typeRef = new TypeReference<ArrayList<WordOfTheDay>>() {
		};
        try {
            List<WordOfTheDay> responseObject = (List<WordOfTheDay>) mapper.readValue(response, typeRef);
            return responseObject;
        } catch (IOException ioe) {
        	String[] args = new String[]{response, typeRef.toString()};
            throw new WordnikAPIException(WordnikExceptionCodes.ERROR_CONVERTING_JSON_TO_JAVA, args, "Error in converting response json value to java object : " + ioe.getMessage(), ioe);
        }						
	}
	
	
	/**
	 * Fetches a WordOfTheDayList by ID
 
	 * @param permalink  ID of WordOfTheDayList
 
	 * @param includeAll  Returns future WordOfTheDay items
 

	 * 
	 * @return WordOfTheDayList {@link WordOfTheDayList}
	 * @throws WordnikAPIException 400 - Invalid id supplied 404 - WordOfTheDayList not found  
	 */
	 @MethodArgumentNames(value="permalink, includeAll") 
	public static WordOfTheDayList getWordOfTheDayList(String permalink, String includeAll) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDayList/{permalink}";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( includeAll != null) {
		 	queryParams.put("includeAll", includeAll);
		}

		if( permalink != null) {
			resourcePath = resourcePath.replace("{permalink}", permalink);
		}
		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		WordOfTheDayList responseObject = (WordOfTheDayList)deserialize(response, WordOfTheDayList.class);
		return responseObject;		
				
	}
	
	
	/**
	 * Fetches a WordOfTheDayList by ID
 
	 * @param permalink  ID of WordOfTheDayList
 
	 * @param specifier  Specifier for the item to fetch.  Either 'current' or a date.
 

	 * 
	 * @return WordOfTheDay {@link WordOfTheDay}
	 * @throws WordnikAPIException 400 - Invalid id supplied 404 - WordOfTheDayList not found  
	 */
	 @MethodArgumentNames(value="permalink, specifier") 
	public static WordOfTheDay getWordOfTheDayListItem(String permalink, String specifier) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDayList/{permalink}/{specifier}";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( permalink != null) {
			resourcePath = resourcePath.replace("{permalink}", permalink);
		}
		if( specifier != null) {
			resourcePath = resourcePath.replace("{specifier}", specifier);
		}
		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		WordOfTheDay responseObject = (WordOfTheDay)deserialize(response, WordOfTheDay.class);
		return responseObject;		
				
	}
	
	
	/**
	 * Fetches recently created WordOfTheDayLists
 
	 * @param skip  Results to skip
 
	 * @param limit  Maximum number of results to return
 

	 * 
	 * @return List<WordOfTheDayList> {@link WordOfTheDayList}
	 * @throws WordnikAPIException 404 - No WordOfTheDayLists found.  
	 */
	 @MethodArgumentNames(value="skip, limit") 
	public static List<WordOfTheDayList> getRecentWordOfTheDayLists(String skip, String limit) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDayLists/recent";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( skip != null) {
		 	queryParams.put("skip", skip);
		}
		if( limit != null) {
		 	queryParams.put("limit", limit);
		}

		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		
        TypeReference<ArrayList<WordOfTheDayList>> typeRef = new TypeReference<ArrayList<WordOfTheDayList>>() {
		};
        try {
            List<WordOfTheDayList> responseObject = (List<WordOfTheDayList>) mapper.readValue(response, typeRef);
            return responseObject;
        } catch (IOException ioe) {
        	String[] args = new String[]{response, typeRef.toString()};
            throw new WordnikAPIException(WordnikExceptionCodes.ERROR_CONVERTING_JSON_TO_JAVA, args, "Error in converting response json value to java object : " + ioe.getMessage(), ioe);
        }						
	}
	
	
	/**
	 * Returns whether or not a subscription process has been run.
 Uses the current server time (day resolution) as the default date to check for, optionally a dateString can be supplied for a specific date to check for.
	 * @param date  Date string to fetch for.
 

	 * 
	 * @return String {@link String}
	 * @throws WordnikAPIException 400 - Invalid date format supplied.  
	 */
	 @MethodArgumentNames(value="date") 
	public static String getWordOfTheDayListSubscriptionProcessStatus(String date) throws WordnikAPIException {

		
		//parse inputs
		String  resourcePath = "/words.{format}/wordOfTheDayLists/subscriptionProcess";
		resourcePath = resourcePath.replace("{format}","json");
		String method = "GET";
		Map<String, String> queryParams = new HashMap<String, String>();
		
		if( date != null) {
		 	queryParams.put("date", date);
		}

		
	
		//make the API Call
		String response = invokeAPI(null, resourcePath, method, queryParams, null);
		//create output objects if the response has more than one object
        if(response == null || response.length() == 0){
            return null;
        }
		String responseObject = (String)deserialize(response, String.class);
		return responseObject;		
				
	}
	
	
	
}