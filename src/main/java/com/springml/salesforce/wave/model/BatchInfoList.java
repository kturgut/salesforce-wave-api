/*
 * Copyright 2015 - 2017, salesforce-wave-api, springml
 * Author  :
 * 	  Samual Alexander, springml
 * Contributors:
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
package com.springml.salesforce.wave.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

@JsonIgnoreProperties
public class BatchInfoList implements Serializable {
    private static final long serialVersionUID = -6396097094521689813L;

    @JacksonXmlElementWrapper(useWrapping=false)
    private List<BatchInfo> batchInfo;

    public List<BatchInfo> getBatchInfo() {
        return batchInfo;
    }

    public void setBatchInfo(List<BatchInfo> batchInfo) {
        this.batchInfo = batchInfo;
    }

}
