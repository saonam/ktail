/*
 * Copyright (C) 2016 BROADSoftware
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kappaware.ktail;

import java.util.Calendar;

import javax.xml.bind.DatatypeConverter;

public class Utils {

	public static String printIsoDateTime(Long ts) {
		if (ts != null) {
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(ts);
			return DatatypeConverter.printDateTime(c);
		} else {
			return null;
		}
	}
}