// File generated by hadoop record compiler. Do not edit.
/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.zookeeper.proto;

import org.apache.jute.*;
import org.apache.yetus.audience.InterfaceAudience;
@InterfaceAudience.Public
public class GetEphemeralsResponse implements Record {
  private java.util.List<String> ephemerals;
  public GetEphemeralsResponse() {
  }
  public GetEphemeralsResponse(
        java.util.List<String> ephemerals) {
    this.ephemerals=ephemerals;
  }
  public java.util.List<String> getEphemerals() {
    return ephemerals;
  }
  public void setEphemerals(java.util.List<String> m_) {
    ephemerals=m_;
  }
  public void serialize(OutputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(this,tag);
    {
      a_.startVector(ephemerals,"ephemerals");
      if (ephemerals!= null) {          int len1 = ephemerals.size();
          for(int vidx1 = 0; vidx1<len1; vidx1++) {
            String e1 = (String) ephemerals.get(vidx1);
        a_.writeString(e1,"e1");
          }
      }
      a_.endVector(ephemerals,"ephemerals");
    }
    a_.endRecord(this,tag);
  }
  public void deserialize(InputArchive a_, String tag) throws java.io.IOException {
    a_.startRecord(tag);
    {
      Index vidx1 = a_.startVector("ephemerals");
      if (vidx1!= null) {          ephemerals=new java.util.ArrayList<String>();
          for (; !vidx1.done(); vidx1.incr()) {
    String e1;
        e1=a_.readString("e1");
            ephemerals.add(e1);
          }
      }
    a_.endVector("ephemerals");
    }
    a_.endRecord(tag);
}
  public String toString() {
    try {
      java.io.ByteArrayOutputStream s =
        new java.io.ByteArrayOutputStream();
      ToStringOutputArchive a_ = 
        new ToStringOutputArchive(s);
      a_.startRecord(this,"");
    {
      a_.startVector(ephemerals,"ephemerals");
      if (ephemerals!= null) {          int len1 = ephemerals.size();
          for(int vidx1 = 0; vidx1<len1; vidx1++) {
            String e1 = (String) ephemerals.get(vidx1);
        a_.writeString(e1,"e1");
          }
      }
      a_.endVector(ephemerals,"ephemerals");
    }
      a_.endRecord(this,"");
      return new String(s.toByteArray(), "UTF-8");
    } catch (Throwable ex) {
      ex.printStackTrace();
    }
    return "ERROR";
  }
  public void write(java.io.DataOutput out) throws java.io.IOException {
    BinaryOutputArchive archive = new BinaryOutputArchive(out);
    serialize(archive, "");
  }
  public void readFields(java.io.DataInput in) throws java.io.IOException {
    BinaryInputArchive archive = new BinaryInputArchive(in);
    deserialize(archive, "");
  }
  public int compareTo (Object peer_) throws ClassCastException {
    throw new UnsupportedOperationException("comparing GetEphemeralsResponse is unimplemented");
  }
  public boolean equals(Object peer_) {
    if (!(peer_ instanceof GetEphemeralsResponse)) {
      return false;
    }
    if (peer_ == this) {
      return true;
    }
    GetEphemeralsResponse peer = (GetEphemeralsResponse) peer_;
    boolean ret = false;
    ret = ephemerals.equals(peer.ephemerals);
    if (!ret) return ret;
     return ret;
  }
  public int hashCode() {
    int result = 17;
    int ret;
    ret = ephemerals.hashCode();
    result = 37*result + ret;
    return result;
  }
  public static String signature() {
    return "LGetEphemeralsResponse([s])";
  }
}
