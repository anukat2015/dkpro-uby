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
package de.tudarmstadt.ukp.lmf.model.interfaces;

import de.tudarmstadt.ukp.lmf.model.enums.ERelTypeSemantics;

/**
 * ISemanticRelation is an interface for UBY-LMF class which represent
 * a semantic relation.
 *
 * @param <Target> The class targeted by the relation
 *
 * @author Zijad Maksuti
 *
 */
public interface ISemanticRelation<Target> {

	/**
	 * Returns the type of the semantic relation represented by this Uby-LMF class instance.
	 *
	 * @return the type of the sense relation
	 *
	 * @see ERelTypeSemantics
	 */
	ERelTypeSemantics getRelType();

	/**
	 * Sets the type of the semantic relation represented by this UBY-LMF class instance.
	 *
	 * @param relType the type of the relation to set
	 */
	void setRelType(ERelTypeSemantics relType);

	/**
	 * Returns the target of the semantic relation represented by this UBY-LMF class instance.
	 * @return the target of this relation or null if the target is not set
	 */
	Target getTarget();

	/**
	 * Sets the target of the semantic relation represented by this UBY-LMF class instance.
	 * @param target the targeted sense to set
	 */
	void setTarget(Target target);

	/**
	 * Returns the name of the semantic relation represented by this UBY-LMF class instance.
	 * @return the name of the semantic relation or null if the name is not set
	 */
	String getRelName();

	/**
	 * Sets the name of the semantic relation represented by this UBY-LMF class instance.
	 * @param relName the name of the semantic relation to set
	 */
	void setRelName(String relName);

}
