/**
 * The MIT License
 *
 * Copyright 2014 Ivar Grimstad <ivar.grimstad@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eu.agilejava.javaee7;

/**
 *
 * @author Ivar Grimstad <ivar.grimstad@gmail.com>
 */
public class Greeting {

   private final String content;
   private final long count;
   private long simpleCount;
   private long awsomeCount;

   public Greeting(long id, String content) {
      this.count = id;
      this.content = content;
   }

   public long getCount() {
      return count;
   }

   public String getContent() {
      return content;
   }

   public long getSimpleCount() {
      return simpleCount;
   }

   public void setSimpleCount(long simpleCount) {
      this.simpleCount = simpleCount;
   }

   public long getAwsomeCount() {
      return awsomeCount;
   }

   public void setAwsomeCount(long awsomeCount) {
      this.awsomeCount = awsomeCount;
   }
}
