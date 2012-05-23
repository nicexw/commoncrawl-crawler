/**
 * Copyright 2008 - CommonCrawl Foundation
 * 
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/
package org.commoncrawl.util;

import java.io.IOException;
import java.io.OutputStreamWriter;

import com.google.gson.JsonElement;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;

/**
 * 
 * @author rana
 *
 */
public class JSONUtils {

  public static void prettyPrintJSON(JsonElement e) throws IOException { 
    JsonWriter writer = new JsonWriter(new OutputStreamWriter(System.out, "UTF-8"));
    writer.setIndent("    ");
    writer.setHtmlSafe(true);
    writer.setLenient(true);
    Streams.write(e, writer);
    writer.flush();
    System.out.println();
  }
  
}
