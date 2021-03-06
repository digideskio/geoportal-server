/* See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * Esri Inc. licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.esri.gpt.catalog.gxe;

/**
 * Represents an XML node (element or attribute).
 */
public class XmlNode {
  
  /** instance variables ====================================================== */ 
  private XmlNodeInfo nodeInfo = new XmlNodeInfo();
  private XmlElement  parent;
  
  /** constructors ============================================================ */
  
  /** Default constructor */
  public XmlNode() {}
  
  /**
   * Construct by duplicating an existing object.
   * @param objectToDuplicate the object to duplicate
   * @param parent the parent
   */
  public XmlNode(XmlNode objectToDuplicate, XmlElement parent) {
    this.parent = parent;
    if (objectToDuplicate != null) {
      if (objectToDuplicate.getNodeInfo() != null) {
        this.setNodeInfo(objectToDuplicate.getNodeInfo().duplicate());
      }
    } 
  }
  
  /** properties ============================================================== */
  
  /**
   * Gets the information associated with this XML node.
   * @return the node information
   */
  public XmlNodeInfo getNodeInfo() {
    return this.nodeInfo;
  }
  /**
   * Sets the information associated with this XML node.
   * @param nodeInfo the node information
   */
  public void setNodeInfo(XmlNodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
  }
  
  /**
   * Gets the parent.
   * @return the parent
   */
  public XmlElement getParent() {
    return this.parent;
  }
  /**
   * Sets the parent.
   * @param parent the parent
   */
  public void setParent(XmlElement parent) {
    this.parent = parent;
  }
  
  /** methods ================================================================= */
  
  /**
   * Produces a deep clone of the object.
   * <br/>The duplication constructor is invoked.
   * <br/>return new XmlNode(this,parent);
   * @param parent the parent
   * @return the duplicated object
   */
  public XmlNode duplicate(XmlElement parent) {
    return new XmlNode(this,parent);
  }
  
  /**
   * Ensures that the node information is not null and returns the value.
   * @return the node information
   */
  public XmlNodeInfo ensureNodeInfo() {
    if (this.getNodeInfo() == null) {
      this.setNodeInfo(new XmlNodeInfo());
    }
    return this.getNodeInfo();
  }
   
}
