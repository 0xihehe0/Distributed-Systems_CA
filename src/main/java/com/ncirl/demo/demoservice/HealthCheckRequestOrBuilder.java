// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DemoService.proto

package com.ncirl.demo.demoservice;

public interface HealthCheckRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ncirl.demo.HealthCheckRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string serviceName = 1;</code>
   */
  String getServiceName();
  /**
   * <code>string serviceName = 1;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <code>string serviceVersion = 2;</code>
   */
  String getServiceVersion();
  /**
   * <code>string serviceVersion = 2;</code>
   */
  com.google.protobuf.ByteString
      getServiceVersionBytes();

  /**
   * <code>int64 timestamp = 3;</code>
   */
  long getTimestamp();
}
