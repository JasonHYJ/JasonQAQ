package soot.tagkit;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 2012 Eric Bodden
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import soot.util.Switch;

public class AnnotationBooleanElem extends AnnotationElem {
  boolean value;

  public AnnotationBooleanElem(boolean v, char kind, String name) {
    super(kind, name);
    this.value = v;
  }

  public String toString() {
    return super.toString() + " value: " + value;
  }

  public boolean getValue() {
    return value;
  }

  @Override
  public void apply(Switch sw) {
    ((IAnnotationElemTypeSwitch) sw).caseAnnotationBooleanElem(this);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + (value ? 1231 : 1237);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    AnnotationBooleanElem other = (AnnotationBooleanElem) obj;
    if (value != other.value) {
      return false;
    }
    return true;
  }

}