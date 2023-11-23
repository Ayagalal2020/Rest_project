package Endpoints;

public class Links {

    public static String  base_url ="https://api.trello.com";
    public  static  String key ="29f117c8199b317d6c13779d6fc31584";
    public  static  String token ="ATTAeb1bdc1a747c985abe582cc97232b88213f45028417a5a1002371bce5c852472D7A498F6";

    public static String  email="ayayasser2016@gmail.com";

    public static String createBoard =base_url+"/1/boards/?name={name}&key="+key+"&token="+token;
    public static  String getBoard =base_url+"/1/boards/{idBoard}?key="+ key +"&token="+token  ;

    // list
    public static  String createList = base_url+"/1/lists?name={listName}&idBoard={idBoard}&key="+key+"&token="+token ;

    //cards
    public static String createCard =base_url+"/1/cards?idList={listId}&key="+key+"&token="+token+"&name={cardName}";


    //labels
    public static String createLabel =base_url+"/1/boards/{idBoard}/labels?name={name}&color=red&key="+key+"&token="+token ;

    public static String DeleteLabel =base_url+"/1/labels/{idLabel}?key="+key+"&token="+token;
}