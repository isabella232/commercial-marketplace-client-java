/*
 * SaaS fulfillment APIs, version 2
 * This spec details the APIs that enable partners to sell their SaaS applications in the AppSource marketplace and the Azure Marketplace. These APIs are a requirement for transactable SaaS offers on the AppSource and Azure Marketplace.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * Copyright (c) Microsoft Corporation.
 * Licensed under the MIT license.
 */

package com.azure.marketplace;

public class Configuration {
    private static ApiClient defaultApiClient = null;

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        if (null == defaultApiClient) {
            throw new IllegalStateException("Make sure that the defaultApiClient is set first.");
        }
        return defaultApiClient;
    }

    /**
     * Initializes the default Api Client with the parameters needed to authenticate against
     * AAD using the values entered into 'Technical Configuration' for the entity in the
     * Microsoft Partner Portal.
     * @param tenantId: GUID for the tenant holding the app registration/Service Principal.
     * @param clientId: GUID identifying the app registration/Service Principal.
     * @param clientSecret: Secret for the clientId.
     */
    public static void initDefaultApiClient(String tenantId, String clientId, String clientSecret) throws Exception {
        defaultApiClient = new MarketplaceApiClient(tenantId, clientId, clientSecret);
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
