package Endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static Testcases.Testcases.my_idBoard;
import static io.restassured.RestAssured.given;

public class Endpoints1 {
    public static Response createBoard(String NewBoard) {
        Response boardCreate_response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("name", NewBoard)
                .when().post(Links.createBoard);

        return boardCreate_response;
    }

    public static Response getBoards(String my_idBoard) {
        Response getboard_response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("idBoard", my_idBoard)
                .when().get(Links.getBoard);

        return getboard_response;
    }

    public static Response createList(String listName, String my_idBoard) {
        Response listCreate_response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("listName", listName)
                .pathParam("idBoard", my_idBoard)
                .when().post(Links.createList);
        return listCreate_response;
    }

    public static Response createCard(String listId, String cardName) {
        Response listCreate_response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("listId", listId)
                .pathParam("cardName", cardName)
                .when().post(Links.createCard);
        return listCreate_response;
    }

    public static Response Createlabel(String my_idBoard, String my_labelName) {
        Response Label1_response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("idBoard", my_idBoard)
                .pathParam("name", my_labelName)
                .when().post(Links.createLabel);
        return Label1_response;
    }

    public static Response Createlabel2(String my_idBoard, String my_labelName) {
        Response Label2_response = given()
                .contentType(ContentType.JSON)
                 .accept(ContentType.JSON)
                .pathParam("idBoard", my_idBoard)
                .pathParam("name", my_labelName)
                .when().post(Links.createLabel);
        return Label2_response;
    }

    public static Response DeleteLabel (String my_lable) {

        Response Label2Delete_response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("idLabel", my_lable)
                .when().delete(Links.DeleteLabel);
        return Label2Delete_response;

    }
}