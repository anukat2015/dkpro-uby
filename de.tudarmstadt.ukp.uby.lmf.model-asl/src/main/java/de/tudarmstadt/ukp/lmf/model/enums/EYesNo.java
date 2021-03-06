/*******************************************************************************
 * Copyright 2016
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 * 
 */
package de.tudarmstadt.ukp.lmf.model.enums;

/**
 * This enumerator is used as a replacement for
 * the boolean values <i>true</i> and <i>false</i>.<br>
 * It is created for convenience reasons when converting the Uby-LMF
 * to an XML-file or to a database.
 * @deprecated Use boolean types instead. This enum will be removed.
 */
@Deprecated
public enum EYesNo {
	yes,
	no
}
