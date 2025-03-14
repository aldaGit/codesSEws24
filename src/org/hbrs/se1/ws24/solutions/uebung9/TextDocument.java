package org.hbrs.se1.ws24.solutions.uebung9;

import java.io.UnsupportedEncodingException;

public class TextDocument extends AbstractCoreDocument {

		/**
		 * Definition eines Aufzaehlungstyps als enum zur Gruppierung 
		 * und zur zentralen Definition von semantisch zusammengehorenden 
		 * konstanten Werten. Aufgabe hier: zentrale Definition eines
		 * Encodings eines TextDocuments.
		 * Vorteil gegenueber Typ-Definition in einer Klasse: typsichere Belegung,
		 * keine Seiteneffekte durch alternative Belegung durch konkrete Werte.
		 * @author saschaalda
		 *
		 */
		public enum Encoding {		
			UTF8("UTF-8"), 
			UTF16("UTF-16"), 
			UTF32("UTF-32");
			
			private final String code;
			private Encoding(String code) {
				this.code = code;
			}
			
			public String getCode(){
				return code;
			}
		}
		
		private Encoding coding;
		private String text;
		
		
		public TextDocument(String text, Encoding coding) {
			this.coding=coding;
			this.text=text;
		}

		@Override
		public int size() {
			try {
				return text.getBytes(coding.getCode()).length; 
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return 0;
		}
	}



