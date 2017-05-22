package io.matty.wrike.helpers;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.matty.wrike.json.WrikeData;
import io.matty.wrike.json.WrikeUsers;
import org.apache.oltu.oauth2.client.response.OAuthResourceResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import io.matty.wrike.WrikeClient;

import java.io.IOException;

public class WrikeUsersHelper {

    public static WrikeData<WrikeUsers> getUser(String token, WrikeClient client, String userId, String parameters) {
        try {
            OAuthResourceResponse res
                    = client.makeRequest(token, "https://www.wrike.com/api/v3/users/" + userId + parameters, OAuth.HttpMethod.GET);

            ObjectMapper mapper = new ObjectMapper();

            JavaType type = mapper.getTypeFactory()
                    .constructParametricType(WrikeData.class, WrikeUsers.class);

            WrikeData<WrikeUsers> data = mapper.readValue(res.getBody(), type);
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
