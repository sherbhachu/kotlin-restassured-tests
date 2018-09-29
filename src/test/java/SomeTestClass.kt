import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.not
import org.junit.Test

class SomeTestClass: FunctionalTest() {

    //@Before
    //fun setup() {
    //    RestAssured.baseURI = "http://localhost"
    //    RestAssured.port = 8888
    //    RestAssured.basePath = "/"
    //    FunctionalTest.setUp()
    //}

    @Test
    fun wiremockGetTest() {
        given().
        //        param("firstName", "Johan").
        //        param("lastName", "Haleby").
        When().
                get("/greeting").
        then().
                statusCode(200).
                body("greeting.firstName", not(equalTo(("Bob")))).
                body("greeting.lastName", not(equalTo(("Stevens"))))
    }

    @Test
    fun explicitlySetBasePathUriAndPortGetTest() {
        given().
                basePath("/").
                baseUri("http://localhost").
                port(8888).
        When().
                get("/greeting").
        then().
                statusCode(200)
    }

    @Test
    fun greetingEndpointGetRequestTest() {
        given().When().get("/greeting").then().statusCode(200)
    }

    @Test
    fun greetingPostEndpointPostRequestTest() {
        given().When().post("/post/greeting").then().statusCode(201)
    }
}