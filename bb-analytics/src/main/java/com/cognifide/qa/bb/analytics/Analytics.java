/*-
 * #%L
 * Bobcat
 * %%
 * Copyright (C) 2019 Cognifide Ltd.
 * %%
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
 * #L%
 */
package com.cognifide.qa.bb.analytics;

/**
 * Interface that represents the analytics datalayer.
 */
public interface Analytics {
  /** @return json with actual data layer */
  String getActual();

  /**
   * @param fileName name of the json file defining the expected datalayer
   * @return json with expected data layer
   */
  String getExpected(String fileName);

  /**
   * Compares the datalayer retrieved from the page with the expected one
   *
   * @param expectedData name of the json file defining the expected datalayer
   */
  void compare(String expectedData);
}
