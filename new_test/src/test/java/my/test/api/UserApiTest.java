/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package my.test.api;

import my.test.support.ApiException;
import my.test.model.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        User body = null;
        // api.createUser(body);

        // TODO: test validations
    }
    
    /**
     * Creates list of users with given input array
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithArrayInputTest() throws ApiException {
        List<User> body = null;
        // api.createUsersWithArrayInput(body);

        // TODO: test validations
    }
    
    /**
     * Creates list of users with given input array
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsersWithListInputTest() throws ApiException {
        List<User> body = null;
        // api.createUsersWithListInput(body);

        // TODO: test validations
    }
    
    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String username = null;
        // api.deleteUser(username);

        // TODO: test validations
    }
    
    /**
     * Get user by user name
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByNameTest() throws ApiException {
        String username = null;
        // User response = api.getUserByName(username);

        // TODO: test validations
    }
    
    /**
     * Logs user into the system
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginUserTest() throws ApiException {
        String username = null;
        String password = null;
        // String response = api.loginUser(username, password);

        // TODO: test validations
    }
    
    /**
     * Logs out current logged in user session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void logoutUserTest() throws ApiException {
        // api.logoutUser();

        // TODO: test validations
    }
    
    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String username = null;
        User body = null;
        // api.updateUser(username, body);

        // TODO: test validations
    }
    
}
