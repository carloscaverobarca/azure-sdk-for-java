/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.network.models;

/**
* Parameters supplied to the Create Virtual Network Gateway operation.
*/
public class UpdateGatewayPublicDiagnostics {
    private String captureDurationInSeconds;
    
    /**
    * Optional. The duration of the capture in seconds (between 1 and 300)
    * @return The CaptureDurationInSeconds value.
    */
    public String getCaptureDurationInSeconds() {
        return this.captureDurationInSeconds;
    }
    
    /**
    * Optional. The duration of the capture in seconds (between 1 and 300)
    * @param captureDurationInSecondsValue The CaptureDurationInSeconds value.
    */
    public void setCaptureDurationInSeconds(final String captureDurationInSecondsValue) {
        this.captureDurationInSeconds = captureDurationInSecondsValue;
    }
    
    private String containerName;
    
    /**
    * Optional. The container name provided by customer (optional)
    * @return The ContainerName value.
    */
    public String getContainerName() {
        return this.containerName;
    }
    
    /**
    * Optional. The container name provided by customer (optional)
    * @param containerNameValue The ContainerName value.
    */
    public void setContainerName(final String containerNameValue) {
        this.containerName = containerNameValue;
    }
    
    private String customerStorageKey;
    
    /**
    * Optional. The customer's storage account key
    * @return The CustomerStorageKey value.
    */
    public String getCustomerStorageKey() {
        return this.customerStorageKey;
    }
    
    /**
    * Optional. The customer's storage account key
    * @param customerStorageKeyValue The CustomerStorageKey value.
    */
    public void setCustomerStorageKey(final String customerStorageKeyValue) {
        this.customerStorageKey = customerStorageKeyValue;
    }
    
    private String customerStorageName;
    
    /**
    * Optional. The customer's storage account name
    * @return The CustomerStorageName value.
    */
    public String getCustomerStorageName() {
        return this.customerStorageName;
    }
    
    /**
    * Optional. The customer's storage account name
    * @param customerStorageNameValue The CustomerStorageName value.
    */
    public void setCustomerStorageName(final String customerStorageNameValue) {
        this.customerStorageName = customerStorageNameValue;
    }
    
    private UpdateGatewayPublicDiagnosticsOperation operation;
    
    /**
    * Optional. The update gateway diagnostics operation to perform on the
    * gateway tenant
    * @return The Operation value.
    */
    public UpdateGatewayPublicDiagnosticsOperation getOperation() {
        return this.operation;
    }
    
    /**
    * Optional. The update gateway diagnostics operation to perform on the
    * gateway tenant
    * @param operationValue The Operation value.
    */
    public void setOperation(final UpdateGatewayPublicDiagnosticsOperation operationValue) {
        this.operation = operationValue;
    }
}
