/**
 * Copyright 2010 Google Inc.
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

package com.google.gag.annotation.disclaimer;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Discloses the condition the developer was in when writing the annotated
 * code.
 * <p/>
 * There are times when you haven't given your best performance. Perhaps you were distracted. Perhaps you want everyone to think you were. That's your call. We won't judge you. We just want to give you an out.
 * <pre>
 * &#064;WrittenWhile("surfing Chatroulette")
 * public interface You {
 * void spinRightRoundBabyRightRound(Me me);
 * }
 * </pre>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface WrittenWhile {
  String value();
}