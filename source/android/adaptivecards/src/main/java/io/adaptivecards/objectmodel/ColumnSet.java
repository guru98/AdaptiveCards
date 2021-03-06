/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class ColumnSet extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ColumnSet(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.ColumnSet_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ColumnSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_ColumnSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ColumnSet() {
    this(AdaptiveCardObjectModelJNI.new_ColumnSet__SWIG_0(), true);
  }

  public ColumnSet(ColumnVector columns) {
    this(AdaptiveCardObjectModelJNI.new_ColumnSet__SWIG_1(ColumnVector.getCPtr(columns), columns), true);
  }

  public SWIGTYPE_p_Json__Value SerializeToJsonValue() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.ColumnSet_SerializeToJsonValue(swigCPtr, this), true);
  }

  public ColumnVector GetColumns() {
    return new ColumnVector(AdaptiveCardObjectModelJNI.ColumnSet_GetColumns__SWIG_0(swigCPtr, this), false);
  }

  public BaseActionElement GetSelectAction() {
    long cPtr = AdaptiveCardObjectModelJNI.ColumnSet_GetSelectAction(swigCPtr, this);
    return (cPtr == 0) ? null : new BaseActionElement(cPtr, true);
  }

  public void SetSelectAction(BaseActionElement action) {
    AdaptiveCardObjectModelJNI.ColumnSet_SetSelectAction(swigCPtr, this, BaseActionElement.getCPtr(action), action);
  }

  public void SetLanguage(String language) {
    AdaptiveCardObjectModelJNI.ColumnSet_SetLanguage(swigCPtr, this, language);
  }

  public static ColumnSet dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.ColumnSet_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new ColumnSet(cPtr, true);
  }

}
