// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/model.proto

package com.google.cloud.automl.v1beta1;

public interface ModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.Model)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Metadata for image classification models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ImageClassificationModelMetadata image_classification_model_metadata = 13;</code>
   */
  boolean hasImageClassificationModelMetadata();
  /**
   * <pre>
   * Metadata for image classification models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ImageClassificationModelMetadata image_classification_model_metadata = 13;</code>
   */
  com.google.cloud.automl.v1beta1.ImageClassificationModelMetadata getImageClassificationModelMetadata();
  /**
   * <pre>
   * Metadata for image classification models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ImageClassificationModelMetadata image_classification_model_metadata = 13;</code>
   */
  com.google.cloud.automl.v1beta1.ImageClassificationModelMetadataOrBuilder getImageClassificationModelMetadataOrBuilder();

  /**
   * <pre>
   * Metadata for text classification models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextClassificationModelMetadata text_classification_model_metadata = 14;</code>
   */
  boolean hasTextClassificationModelMetadata();
  /**
   * <pre>
   * Metadata for text classification models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextClassificationModelMetadata text_classification_model_metadata = 14;</code>
   */
  com.google.cloud.automl.v1beta1.TextClassificationModelMetadata getTextClassificationModelMetadata();
  /**
   * <pre>
   * Metadata for text classification models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextClassificationModelMetadata text_classification_model_metadata = 14;</code>
   */
  com.google.cloud.automl.v1beta1.TextClassificationModelMetadataOrBuilder getTextClassificationModelMetadataOrBuilder();

  /**
   * <pre>
   * Metadata for translation models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationModelMetadata translation_model_metadata = 15;</code>
   */
  boolean hasTranslationModelMetadata();
  /**
   * <pre>
   * Metadata for translation models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationModelMetadata translation_model_metadata = 15;</code>
   */
  com.google.cloud.automl.v1beta1.TranslationModelMetadata getTranslationModelMetadata();
  /**
   * <pre>
   * Metadata for translation models.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TranslationModelMetadata translation_model_metadata = 15;</code>
   */
  com.google.cloud.automl.v1beta1.TranslationModelMetadataOrBuilder getTranslationModelMetadataOrBuilder();

  /**
   * <pre>
   * Output only.
   * Resource name of the model.
   * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only.
   * Resource name of the model.
   * Format: `projects/{project_id}/locations/{location_id}/models/{model_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The name of the model to show in the interface. The name can be
   * up to 32 characters
   * long and can consist only of ASCII Latin letters A-Z and a-z, underscores
   * (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Required. The name of the model to show in the interface. The name can be
   * up to 32 characters
   * long and can consist only of ASCII Latin letters A-Z and a-z, underscores
   * (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Required.
   * The resource ID of the dataset used to create the model. The dataset must
   * come from the
   * same ancestor project and location.
   * </pre>
   *
   * <code>string dataset_id = 3;</code>
   */
  java.lang.String getDatasetId();
  /**
   * <pre>
   * Required.
   * The resource ID of the dataset used to create the model. The dataset must
   * come from the
   * same ancestor project and location.
   * </pre>
   *
   * <code>string dataset_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getDatasetIdBytes();

  /**
   * <pre>
   * Output only.
   * Timestamp when this model was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only.
   * Timestamp when this model was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only.
   * Timestamp when this model was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only.
   * Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only.
   * Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only.
   * Timestamp when this model was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Deployment state of the model.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Model.DeploymentState deployment_state = 8;</code>
   */
  int getDeploymentStateValue();
  /**
   * <pre>
   * Output only. Deployment state of the model.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.Model.DeploymentState deployment_state = 8;</code>
   */
  com.google.cloud.automl.v1beta1.Model.DeploymentState getDeploymentState();

  public com.google.cloud.automl.v1beta1.Model.ModelMetadataCase getModelMetadataCase();
}
