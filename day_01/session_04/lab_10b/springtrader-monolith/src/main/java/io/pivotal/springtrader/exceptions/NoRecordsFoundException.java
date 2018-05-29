/*
 * Copyright 2002-2012 the original author or authors.
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
package io.pivotal.springtrader.exceptions;

/**
 *  NoRecordsFoundException should be thrown whenever an entity is not 
 *  found via the repositories finder method. This exception is thrown from the controller
 *  
 *  @author Brian Dussault
 */

@SuppressWarnings("serial")
public class NoRecordsFoundException extends RuntimeException {

	
}
