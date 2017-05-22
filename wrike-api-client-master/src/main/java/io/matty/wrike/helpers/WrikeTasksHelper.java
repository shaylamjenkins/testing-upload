package io.matty.wrike.helpers;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.matty.wrike.json.WrikeTasks;
import org.apache.oltu.oauth2.client.response.OAuthResourceResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import io.matty.wrike.WrikeClient;
import io.matty.wrike.json.WrikeData;

import java.io.IOException;

public class WrikeTasksHelper {

    public static WrikeData<WrikeTasks> getTasks(String token, WrikeClient client, String parameters) {
        try {
            OAuthResourceResponse res
                    = client.makeRequest(token, "https://www.wrike.com/api/v3/tasks" + parameters, OAuth.HttpMethod.GET);

            ObjectMapper mapper = new ObjectMapper();

            JavaType type = mapper.getTypeFactory()
                    .constructParametricType(WrikeData.class, WrikeTasks.class);

            WrikeData<WrikeTasks> data = mapper.readValue(res.getBody(), type);
            return data;
        } catch (OAuthSystemException e) {
            e.printStackTrace();
        } catch (OAuthProblemException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static WrikeData<WrikeTasks> getTasksForAccount(String token, WrikeClient client, String accountId, String parameters) {
        try {
            OAuthResourceResponse res
                    = client.makeRequest(token, "https://www.wrike.com/api/v3/accounts/" + accountId + "/tasks" + parameters, OAuth.HttpMethod.GET);

            ObjectMapper mapper = new ObjectMapper();

            JavaType type = mapper.getTypeFactory()
                    .constructParametricType(WrikeData.class, WrikeTasks.class);

            WrikeData<WrikeTasks> data = mapper.readValue(res.getBody(), type);
            return data;
        } catch (OAuthSystemException e) {
            e.printStackTrace();
        } catch (OAuthProblemException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static WrikeData<WrikeTasks> getTasksForFolder(String token, WrikeClient client, String folderId, String parameters) {
        try {
            OAuthResourceResponse res
                    = client.makeRequest(token, "https://www.wrike.com/api/v3/folders/" + folderId + "/tasks" + parameters, OAuth.HttpMethod.GET);

            ObjectMapper mapper = new ObjectMapper();

            JavaType type = mapper.getTypeFactory()
                    .constructParametricType(WrikeData.class, WrikeTasks.class);

            WrikeData<WrikeTasks> data = mapper.readValue(res.getBody(), type);
            return data;
        } catch (OAuthSystemException e) {
            e.printStackTrace();
        } catch (OAuthProblemException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
