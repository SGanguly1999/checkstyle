//non-compiled with eclipse: The value for annotation attribute must be a constant expression
package com.puppycrawl.tools.checkstyle.checks.annotation.annotationusestyle;

/* Config:
 * closingParens = ignore
 * elementStyle = ignore
 * trailingArrayComma = ALWAYS
 */
public class InputAnnotationUseStyleNoTrailingComma
{
  @Test2(value={(false) ? "" : "foo"}, more={(true) ? "" : "bar"}) // violation

  enum P {
      L,
      Y;
  }

}

@interface Test2 {
  String[] value();
  String[] more() default {};
}
