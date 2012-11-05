/**
 * Copyright 2012
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 */
package de.tudarmstadt.ukp.lmf.transform.wordnet;

import static de.tudarmstadt.ukp.lmf.transform.wordnet.TestSuite.UBY_HOME;
import static de.tudarmstadt.ukp.lmf.transform.wordnet.TestSuite.wordNet;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.Word;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import de.tudarmstadt.ukp.lmf.model.core.LexicalEntry;
import de.tudarmstadt.ukp.lmf.model.core.Sense;
import de.tudarmstadt.ukp.lmf.transform.wordnet.util.IndexSenseReader;


/**
 * Tests methods of {@link SenseGenerator} class.<br>
 * 
 * Tests are made for WordNet 3.0
 * data and UBY-LMF DTD version 0.2.0.
 * 
 * @author Zijad Maksuti
 * 
 * @since 0.2.0
 *
 */
public class SenseGeneratorTest {
	
	/**
	 * Invokes {@link GNConverter#toLMF()} method.
	 * @throws JWNLException 
	 * @throws FileNotFoundException 
	 * 
	 * @since 0.2.0
	 */
	@BeforeClass
	public static void setUpClass() throws FileNotFoundException, JWNLException {
		if(wordNet == null)
			TestSuite.setUpClass();
	}

	/**
	 * Test method for {@link de.tudarmstadt.ukp.lmf.transform.wordnet.SenseGenerator#SenseGenerator(de.tudarmstadt.ukp.lmf.transform.wordnet.SynsetGenerator, de.tudarmstadt.ukp.lmf.transform.wordnet.util.IndexSenseReader)}.
	 */
	@Ignore
	@Test
	public final void testSenseGenerator() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link de.tudarmstadt.ukp.lmf.transform.wordnet.SenseGenerator#generateSenses(java.util.Set, de.tudarmstadt.ukp.lmf.model.core.LexicalEntry)}.
	 * @throws JWNLException 
	 */
	@Test
	public final void testGenerateSensesSetOfWordLexicalEntry() throws JWNLException {
		SynsetGenerator synsetGenerator = new SynsetGenerator(wordNet, new File(UBY_HOME +"/WordNet/cache/ExampleSentenceLexemeMapping.xml"));
		synsetGenerator.initialize();
		
		IndexSenseReader isr = new IndexSenseReader();
		isr.initialize();
		
		SenseGenerator senseGenerator = new SenseGenerator(synsetGenerator, isr);
		String lexicalEntryId = "testLexicalEntry";
		LexicalEntry lexicalEntry = new LexicalEntry(lexicalEntryId);
		
		Set<Word> lexemeGroup = new HashSet<Word>();
		lexemeGroup.add(wordNet.getWordBySenseKey("polemics%1:09:00::"));
		
		List<Sense> senses = senseGenerator.generateSenses(lexemeGroup, lexicalEntry);
		for(Sense sense : senses)
			assertEquals(lexicalEntry, sense.getLexicalEntry());
		// TODO test the rest of the method
	}

	/**
	 * Test method for {@link de.tudarmstadt.ukp.lmf.transform.wordnet.SenseGenerator#getSense(net.sf.extjwnl.data.Word)}.
	 */
	@Ignore
	@Test
	public final void testGetSense() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link de.tudarmstadt.ukp.lmf.transform.wordnet.SenseGenerator#getProcessedLexemes()}.
	 */
	@Ignore
	@Test
	public final void testGetProcessedLexemes() {
		fail("Not yet implemented"); // TODO
	}

}