/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ChoiceSetInputParser extends IBaseCardElementParser {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ChoiceSetInputParser(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.ChoiceSetInputParser_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChoiceSetInputParser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_ChoiceSetInputParser(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BaseCardElement Deserialize(ElementParserRegistration elementParserRegistration, ActionParserRegistration actionParserRegistration, SWIGTYPE_p_Json__Value root) {
    long cPtr = AdaptiveCardObjectModelJNI.ChoiceSetInputParser_Deserialize(swigCPtr, this, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration, ActionParserRegistration.getCPtr(actionParserRegistration), actionParserRegistration, SWIGTYPE_p_Json__Value.getCPtr(root));
    return (cPtr == 0) ? null : new BaseCardElement(cPtr, true);
  }

  public BaseCardElement DeserializeFromString(ElementParserRegistration elementParserRegistration, ActionParserRegistration actionParserRegistration, String jsonString) {
    long cPtr = AdaptiveCardObjectModelJNI.ChoiceSetInputParser_DeserializeFromString(swigCPtr, this, ElementParserRegistration.getCPtr(elementParserRegistration), elementParserRegistration, ActionParserRegistration.getCPtr(actionParserRegistration), actionParserRegistration, jsonString);
    return (cPtr == 0) ? null : new BaseCardElement(cPtr, true);
  }

  public ChoiceSetInputParser() {
    this(AdaptiveCardObjectModelJNI.new_ChoiceSetInputParser(), true);
  }

}