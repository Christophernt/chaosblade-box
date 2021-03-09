/*
 * Copyright 1999-2021 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.chaosbox.service.model.device;

import com.alibaba.chaosbox.dao.page.PageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yefei
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DevicePodRequest extends PageQuery {

    private String namespace;

    private String clusterName;

    private String node;

    private String pod;

    private String ip;

    private Byte status;

    private String containerName;

    private String original;
}