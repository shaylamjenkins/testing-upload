package io.matty.wrike.helpers;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.matty.wrike.json.WrikeContacts;
import io.matty.wrike.json.WrikeData;
import org.apache.oltu.oauth2.client.response.OAuthResourceResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import io.matty.wrike.WrikeClient;

import java.io.IOException;

public class WrikeContactsHelper {

    public static WrikeData<WrikeContacts> getContacts(String token, WrikeClient client, String parameters) {
        try {
            OAuthResourceResponse res
                    = client.makeRequest(token, "https://www.wrike.com/api/v3/contacts" + parameters, OAuth.HttpMethod.GET);

            ObjectMapper mapper = new ObjectMapper();

            JavaType type = mapper.getTypeFactory()
                    .constructParametricType(WrikeData.class, WrikeContacts.class);

            WrikeData<WrikeContacts> data = mapper.readValue(res.getBody(), type);
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
