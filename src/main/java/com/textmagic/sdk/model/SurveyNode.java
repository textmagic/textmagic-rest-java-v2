/*
 * TextMagic API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.textmagic.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SurveyNode
 */

public class SurveyNode {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("nodeType")
  private String nodeType = null;

  @SerializedName("isEndNode")
  private Boolean isEndNode = null;

  @SerializedName("sendDelay")
  private Integer sendDelay = null;

  @SerializedName("startNodes")
  private List<String> startNodes = new ArrayList<String>();

  @SerializedName("endNodes")
  private List<String> endNodes = new ArrayList<String>();

  public SurveyNode id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SurveyNode label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "Question 1", required = true, value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public SurveyNode body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(example = "Hello {First name}! Would you like to participate in a short survey? To continue, just reply Yes.", required = true, value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public SurveyNode nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(example = "q", required = true, value = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public SurveyNode isEndNode(Boolean isEndNode) {
    this.isEndNode = isEndNode;
    return this;
  }

   /**
   * Get isEndNode
   * @return isEndNode
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean isIsEndNode() {
    return isEndNode;
  }

  public void setIsEndNode(Boolean isEndNode) {
    this.isEndNode = isEndNode;
  }

  public SurveyNode sendDelay(Integer sendDelay) {
    this.sendDelay = sendDelay;
    return this;
  }

   /**
   * Get sendDelay
   * @return sendDelay
  **/
  @ApiModelProperty(example = "0", required = true, value = "")
  public Integer getSendDelay() {
    return sendDelay;
  }

  public void setSendDelay(Integer sendDelay) {
    this.sendDelay = sendDelay;
  }

  public SurveyNode startNodes(List<String> startNodes) {
    this.startNodes = startNodes;
    return this;
  }

  public SurveyNode addStartNodesItem(String startNodesItem) {
    this.startNodes.add(startNodesItem);
    return this;
  }

   /**
   * Get startNodes
   * @return startNodes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getStartNodes() {
    return startNodes;
  }

  public void setStartNodes(List<String> startNodes) {
    this.startNodes = startNodes;
  }

  public SurveyNode endNodes(List<String> endNodes) {
    this.endNodes = endNodes;
    return this;
  }

  public SurveyNode addEndNodesItem(String endNodesItem) {
    this.endNodes.add(endNodesItem);
    return this;
  }

   /**
   * Get endNodes
   * @return endNodes
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getEndNodes() {
    return endNodes;
  }

  public void setEndNodes(List<String> endNodes) {
    this.endNodes = endNodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyNode surveyNode = (SurveyNode) o;
    return Objects.equals(this.id, surveyNode.id) &&
        Objects.equals(this.label, surveyNode.label) &&
        Objects.equals(this.body, surveyNode.body) &&
        Objects.equals(this.nodeType, surveyNode.nodeType) &&
        Objects.equals(this.isEndNode, surveyNode.isEndNode) &&
        Objects.equals(this.sendDelay, surveyNode.sendDelay) &&
        Objects.equals(this.startNodes, surveyNode.startNodes) &&
        Objects.equals(this.endNodes, surveyNode.endNodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, body, nodeType, isEndNode, sendDelay, startNodes, endNodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    isEndNode: ").append(toIndentedString(isEndNode)).append("\n");
    sb.append("    sendDelay: ").append(toIndentedString(sendDelay)).append("\n");
    sb.append("    startNodes: ").append(toIndentedString(startNodes)).append("\n");
    sb.append("    endNodes: ").append(toIndentedString(endNodes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

