/*
 * OriginStamp API Documentation
 * The following documentation describes the API v3 for OriginStamp. OriginStamp is a trusted timestamping service that uses the decentralized blockchain to store anonymous, tamper-proof timestamps for any digital content. OriginStamp allows users to timestamp files, emails, or plain text, and subsequently store the created hashes in the blockchain as well as retrieve and verify timetamps that have been committed to the blockchain.The trusted timestamping service of OriginStamp allows you to generate a hash fingerprint and prove that it was created at a specific point in time. If you are interested in integrating trusted timestamping into your own project, feel free to use our provided API. The following interactive documentation describes the interfaces and supports your integration. With this documentation you are able to try out the different requests and see the responses. For the authorization, add your API key to the Authorization header of your request.<br/><h2>Timestamping Steps</h2><ol><li><strong>Determine Hash: </strong> Calculate the SHA-256 of your record using a cryptographic library.</li><li><strong>Create Timestamp: </strong>Create a timestamp and add meta information to index it, e.g. a comment. You can also request a notification (email or webhook) once the tamper-proof timestamp has been created.</li><li><strong>Archive original file: </strong>Since we have no access to your original data, you should archive it because the timestamp is only valid in combination with the original file.</li><li><strong>Check Timestamp Status: </strong>Since the timestamps are always transmitted to the blockchain network at certain times, i.e. there is a delay, you can check the status of a hash and thus get the timestamp information.</li><li><strong>Get Timestamp Proof: </strong>As soon as the tamper-proof timestamp has been generated, you should archive the proof (Merkle Tree), which we created in our open procedure, together with the original file. With this proof, the existence of the file can be verified independently of OriginStamp. Here you can choose if the raw proof (xml) is sufficient proof or if you want to have a certificate (pdf).</li></ol><br/><h2>Installation Notes</h2><ul><li>Make sure you set the Authorization header correctly using your API key.</li><li>If a Cloudflare error occurs, please set a custom UserAgent header.</li><li>Please have a look at the models below to find out what each field means.</li></ul>
 *
 * OpenAPI spec version: 3.0
 * Contact: mail@originstamp.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.originstamp.api;

import com.originstamp.api.client.ApiCallback;
import com.originstamp.api.client.ApiClient;
import com.originstamp.api.client.ApiException;
import com.originstamp.api.client.ApiResponse;
import com.originstamp.api.client.Configuration;
import com.originstamp.api.client.Pair;
import com.originstamp.api.client.ProgressRequestBody;
import com.originstamp.api.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.originstamp.model.DefaultOfWebhookResponse;
import com.originstamp.model.DefaultOfstring;
import com.originstamp.model.ManualWebhookRequest;
import com.originstamp.model.ModelDefault;
import com.originstamp.model.WebhookRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhookApi {
    private ApiClient apiClient;

    public WebhookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getWebhookStatus
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param webhookRequest DTO for registering webhook information. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWebhookStatusCall(String authorization, WebhookRequest webhookRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = webhookRequest;

        // create path and map variables
        String localVarPath = "/v3/webhook/information";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API Key Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWebhookStatusValidateBeforeCall(String authorization, WebhookRequest webhookRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getWebhookStatus(Async)");
        }
        
        // verify the required parameter 'webhookRequest' is set
        if (webhookRequest == null) {
            throw new ApiException("Missing the required parameter 'webhookRequest' when calling getWebhookStatus(Async)");
        }
        

        com.squareup.okhttp.Call call = getWebhookStatusCall(authorization, webhookRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Webhook
     * RESTful interface to receive the status of a webhook. Based on the input parameters (target URL, hash and currency), we look up the most recent entry in the notification queue.This method is intended to support the webhook integration.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param webhookRequest DTO for registering webhook information. (required)
     * @return DefaultOfWebhookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DefaultOfWebhookResponse getWebhookStatus(String authorization, WebhookRequest webhookRequest) throws ApiException {
        ApiResponse<DefaultOfWebhookResponse> resp = getWebhookStatusWithHttpInfo(authorization, webhookRequest);
        return resp.getData();
    }

    /**
     * Webhook
     * RESTful interface to receive the status of a webhook. Based on the input parameters (target URL, hash and currency), we look up the most recent entry in the notification queue.This method is intended to support the webhook integration.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param webhookRequest DTO for registering webhook information. (required)
     * @return ApiResponse&lt;DefaultOfWebhookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DefaultOfWebhookResponse> getWebhookStatusWithHttpInfo(String authorization, WebhookRequest webhookRequest) throws ApiException {
        com.squareup.okhttp.Call call = getWebhookStatusValidateBeforeCall(authorization, webhookRequest, null, null);
        Type localVarReturnType = new TypeToken<DefaultOfWebhookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Webhook (asynchronously)
     * RESTful interface to receive the status of a webhook. Based on the input parameters (target URL, hash and currency), we look up the most recent entry in the notification queue.This method is intended to support the webhook integration.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param webhookRequest DTO for registering webhook information. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWebhookStatusAsync(String authorization, WebhookRequest webhookRequest, final ApiCallback<DefaultOfWebhookResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getWebhookStatusValidateBeforeCall(authorization, webhookRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DefaultOfWebhookResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for registerWebhookNotification
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param webhookRequest DTO for querying webhook information. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call registerWebhookNotificationCall(String authorization, WebhookRequest webhookRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = webhookRequest;

        // create path and map variables
        String localVarPath = "/v3/webhook/register";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API Key Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call registerWebhookNotificationValidateBeforeCall(String authorization, WebhookRequest webhookRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling registerWebhookNotification(Async)");
        }
        
        // verify the required parameter 'webhookRequest' is set
        if (webhookRequest == null) {
            throw new ApiException("Missing the required parameter 'webhookRequest' when calling registerWebhookNotification(Async)");
        }
        

        com.squareup.okhttp.Call call = registerWebhookNotificationCall(authorization, webhookRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Webhook
     * Method which allows a subscription for a webhook notification. If this method is called, a new entry is added to notification queue that is triggered as soon as a tamper-proof timestamp or the hash is created. An empty data payload means that the entry was created successfully.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param webhookRequest DTO for querying webhook information. (required)
     * @return ModelDefault
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ModelDefault registerWebhookNotification(String authorization, WebhookRequest webhookRequest) throws ApiException {
        ApiResponse<ModelDefault> resp = registerWebhookNotificationWithHttpInfo(authorization, webhookRequest);
        return resp.getData();
    }

    /**
     * Webhook
     * Method which allows a subscription for a webhook notification. If this method is called, a new entry is added to notification queue that is triggered as soon as a tamper-proof timestamp or the hash is created. An empty data payload means that the entry was created successfully.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param webhookRequest DTO for querying webhook information. (required)
     * @return ApiResponse&lt;ModelDefault&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ModelDefault> registerWebhookNotificationWithHttpInfo(String authorization, WebhookRequest webhookRequest) throws ApiException {
        com.squareup.okhttp.Call call = registerWebhookNotificationValidateBeforeCall(authorization, webhookRequest, null, null);
        Type localVarReturnType = new TypeToken<ModelDefault>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Webhook (asynchronously)
     * Method which allows a subscription for a webhook notification. If this method is called, a new entry is added to notification queue that is triggered as soon as a tamper-proof timestamp or the hash is created. An empty data payload means that the entry was created successfully.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param webhookRequest DTO for querying webhook information. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call registerWebhookNotificationAsync(String authorization, WebhookRequest webhookRequest, final ApiCallback<ModelDefault> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = registerWebhookNotificationValidateBeforeCall(authorization, webhookRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ModelDefault>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for triggerTimestampWebhook
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param manualWebhookRequest DTO for webhook request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call triggerTimestampWebhookCall(String authorization, ManualWebhookRequest manualWebhookRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = manualWebhookRequest;

        // create path and map variables
        String localVarPath = "/v3/webhook/start";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (authorization != null)
        localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API Key Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call triggerTimestampWebhookValidateBeforeCall(String authorization, ManualWebhookRequest manualWebhookRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling triggerTimestampWebhook(Async)");
        }
        
        // verify the required parameter 'manualWebhookRequest' is set
        if (manualWebhookRequest == null) {
            throw new ApiException("Missing the required parameter 'manualWebhookRequest' when calling triggerTimestampWebhook(Async)");
        }
        

        com.squareup.okhttp.Call call = triggerTimestampWebhookCall(authorization, manualWebhookRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Dev
     * With this interface you can trigger manual webhook to see how a webhook looks like. Please use a hash, that was already timestamped before such as https://redir.originstamp.com/hash/9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08 . Usually, the webhook is triggered as soon as the tamper-proof time stamp with the selected crypto currency has been created.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param manualWebhookRequest DTO for webhook request. (required)
     * @return DefaultOfstring
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DefaultOfstring triggerTimestampWebhook(String authorization, ManualWebhookRequest manualWebhookRequest) throws ApiException {
        ApiResponse<DefaultOfstring> resp = triggerTimestampWebhookWithHttpInfo(authorization, manualWebhookRequest);
        return resp.getData();
    }

    /**
     * Dev
     * With this interface you can trigger manual webhook to see how a webhook looks like. Please use a hash, that was already timestamped before such as https://redir.originstamp.com/hash/9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08 . Usually, the webhook is triggered as soon as the tamper-proof time stamp with the selected crypto currency has been created.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param manualWebhookRequest DTO for webhook request. (required)
     * @return ApiResponse&lt;DefaultOfstring&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DefaultOfstring> triggerTimestampWebhookWithHttpInfo(String authorization, ManualWebhookRequest manualWebhookRequest) throws ApiException {
        com.squareup.okhttp.Call call = triggerTimestampWebhookValidateBeforeCall(authorization, manualWebhookRequest, null, null);
        Type localVarReturnType = new TypeToken<DefaultOfstring>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Dev (asynchronously)
     * With this interface you can trigger manual webhook to see how a webhook looks like. Please use a hash, that was already timestamped before such as https://redir.originstamp.com/hash/9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08 . Usually, the webhook is triggered as soon as the tamper-proof time stamp with the selected crypto currency has been created.
     * @param authorization A valid API key is essential for authorization to handle the request. (required)
     * @param manualWebhookRequest DTO for webhook request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call triggerTimestampWebhookAsync(String authorization, ManualWebhookRequest manualWebhookRequest, final ApiCallback<DefaultOfstring> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = triggerTimestampWebhookValidateBeforeCall(authorization, manualWebhookRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DefaultOfstring>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}