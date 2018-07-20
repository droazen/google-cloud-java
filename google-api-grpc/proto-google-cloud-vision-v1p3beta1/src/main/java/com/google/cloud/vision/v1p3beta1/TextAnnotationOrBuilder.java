// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/text_annotation.proto

package com.google.cloud.vision.v1p3beta1;

public interface TextAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.TextAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Page pages = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p3beta1.Page> 
      getPagesList();
  /**
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Page pages = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.Page getPages(int index);
  /**
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Page pages = 1;</code>
   */
  int getPagesCount();
  /**
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Page pages = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p3beta1.PageOrBuilder> 
      getPagesOrBuilderList();
  /**
   * <pre>
   * List of pages detected by OCR.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.Page pages = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.PageOrBuilder getPagesOrBuilder(
      int index);

  /**
   * <pre>
   * UTF-8 text detected on the pages.
   * </pre>
   *
   * <code>string text = 2;</code>
   */
  java.lang.String getText();
  /**
   * <pre>
   * UTF-8 text detected on the pages.
   * </pre>
   *
   * <code>string text = 2;</code>
   */
  com.google.protobuf.ByteString
      getTextBytes();
}
