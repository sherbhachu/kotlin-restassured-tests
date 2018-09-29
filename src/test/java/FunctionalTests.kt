import io.restassured.RestAssured
import io.restassured.specification.RequestSpecification
import org.junit.BeforeClass

open class FunctionalTest {

    companion object {

        @BeforeClass @JvmStatic
        fun setUp() {
            RestAssured.baseURI = "http://localhost"
            RestAssured.port = 8888
            RestAssured.basePath = "/"
            //RestAssured.authentication = basic("username", "password")
        }
    }
}

fun RequestSpecification.When(): RequestSpecification {
    return this.`when`()
}