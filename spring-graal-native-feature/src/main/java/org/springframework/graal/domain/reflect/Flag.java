/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.graal.domain.reflect;

/**
 * The various types of access that can be requested.
 * 
 * @author Andy Clement
 */
public enum Flag {
	allPublicFields, //
	allDeclaredFields, //
	allDeclaredConstructors, //
	allPublicConstructors, //
	allDeclaredMethods, //
	allPublicMethods, //
	allDeclaredClasses, //
	allPublicClasses;

	public static String toString(Flag[] flags) {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i=0;i<flags.length;i++) {
			if (i>0) {
				s.append(",");
			}
			s.append(flags[i]);
		}
		s.append("]");
		return s.toString();
	}
}