package af.asr.auth.test;

import af.asr.keycloakauthservice.data.dto.AuthNResponseDto;
import af.asr.keycloakauthservice.data.dto.LoginUser;
import af.asr.keycloakauthservice.resource.AuthController;
import af.asr.keycloakauthservice.service.AuthService;

import static org.mockito.Mockito.when;



//@RunWith(SpringRunner.class)
//@SpringBootTest(classes=AuthApp.class)
public class AuthControllerTest {

	// @Mock
	private AuthService authService;

	// @InjectMocks
	AuthController controller;

	private LoginUser loginUser;

	// @Before
	public void setUp() throws Exception {
		loginUser = new LoginUser();
		loginUser.setUserName("individual");
		loginUser.setPassword("individual");
		loginUser.setAppId("preregistration");

	}

	/**
	 * Test method for {//@link
	 * io.mosip.kernel.auth.controller.AuthController#authenticateUseridPwd(io.mosip.kernel.auth.entities.LoginUser,
	 * javax.servlet.http.HttpServletResponse)}. //@throws Exception
	 */
	// @Test
	public void testAuthenticateUseridPwd() throws Exception {
		AuthNResponseDto authNResponseDto = new AuthNResponseDto();
		when(authService.authenticateUser(loginUser)).thenReturn(authNResponseDto);
		String token = authNResponseDto.getToken();
	}

	/**
	 * Test method for {//@link
	 * io.mosip.kernel.auth.controller.AuthController#sendOTP(io.mosip.kernel.auth.entities.otp.OtpUser)}.
	 */
	// @Test
	public void testSendOTP() {

	}

	/**
	 * Test method for {//@link
	 * io.mosip.kernel.auth.controller.AuthController#userIdOTP(io.mosip.kernel.auth.entities.UserOtp,
	 * javax.servlet.http.HttpServletResponse)}.
	 */
	// @Test
	public void testUserIdOTP() {

	}

	/**
	 * Test method for {//@link
	 * io.mosip.kernel.auth.controller.AuthController#clientIdSecretKey(io.mosip.kernel.auth.entities.ClientSecret,
	 * javax.servlet.http.HttpServletResponse)}.
	 */
	// @Test
	public void testClientIdSecretKey() {

	}

	/**
	 * Test method for {//@link
	 * io.mosip.kernel.auth.controller.AuthController#validateToken(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)}.
	 */
	// @Test
	public void testValidateToken() {

	}

	/**
	 * Test method for {//@link
	 * io.mosip.kernel.auth.controller.AuthController#retryToken(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)}.
	 */
	// @Test
	public void testRetryToken() {

	}

	/**
	 * Test method for {//@link
	 * io.mosip.kernel.auth.controller.AuthController#invalidateToken(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)}.
	 */
	// @Test
	public void testInvalidateToken() {

	}

}
