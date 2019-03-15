/**
 * Copyright 2018 LinkedIn Corporation. All rights reserved. Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.tony.util;

import com.linkedin.tony.rpc.TaskInfo;
import com.linkedin.tony.rpc.proto.YarnTensorFlowClusterProtos.GetTaskInfosResponseProto.TaskInfoProto;


public class ProtoUtils {
  public static TaskInfo taskUrlProtoToTaskUrl(TaskInfoProto taskInfoProto) {
    return new TaskInfo(taskInfoProto.getName(), taskInfoProto.getIndex(), taskInfoProto.getUrl());
  }

  public static TaskInfoProto taskUrlToTaskUrlProto(TaskInfo taskInfo) {
    return TaskInfoProto.newBuilder().setName(taskInfo.getName()).setIndex(taskInfo.getIndex())
        .setUrl(taskInfo.getUrl()).build();
  }

  private ProtoUtils() { }
}
