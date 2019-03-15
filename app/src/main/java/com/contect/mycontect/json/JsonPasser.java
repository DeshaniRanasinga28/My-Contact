package com.contect.mycontect.json;

import com.contect.mycontect.model.Contacts;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JsonPasser {

    public static ArrayList<Contacts> getContacts(String response){
        String name;
        String number;
        String image_url;

        ArrayList<Contacts> contacts = new ArrayList<>();
        try{
            JSONArray jsonArray = new JSONArray(response);
            for(int i = 0; i < jsonArray.length(); i++){
                JSONObject con = jsonArray.getJSONObject(i);
                name = con.getString("name");
                number = con.getString("number");
                image_url = con.getString("image_url");
                contacts.add(new Contacts(name, number, image_url));
            }
            return contacts;
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }




//    public static ArrayList<Articles> getArticles(String response){
//        String id;
//        String name;
//        String author;
//        String title;
//        String description;
//        String url;
//        String urlToImage;
//        String publishedAt;
//
//        ArrayList<Articles> articles1 = new ArrayList<>();
//        try{
//
//            JSONObject jsonObject = new JSONObject(response);
//            //JsonArray Node
//            JSONArray articlesArray = jsonObject.getJSONArray("articles");
//
//            for(int i=0; i<articlesArray.length(); i++){
//                JSONObject jObject = articlesArray.getJSONObject(i);
//
//                ArrayList<Source>sourceArray = new ArrayList<Source>();
//                JSONObject source = jObject.getJSONObject("source");
//                for(int j=0; j<source.length(); j++){
//                    if(source.getString("id").equals("null")){
//                        id = "";
//                    }else{
//                        id = source.getString("id");
//                    }
//
//                    if(source.getString("name").equals("null")){
//                        name = "";
//                    }else{
//                        name = source.getString("name");
//                    }
//
//                    sourceArray.add(new Source(id, name));
//                }
//
////                 author = jObject.getString("author");
//                if(jObject.getString("author").equals("null")){
//                    author = "";
//                }else{
//                    author = jObject.getString("author");
//                }
////                 title = jObject.getString("title");
//                if(jObject.getString("title").equals("null")){
//                    title = "";
//                }else{
//                    title = jObject.getString("title");
//                }
//
//                if(jObject.getString("description").equals("null")){
//                    description = "";
//                }else{
//                    description = jObject.getString("description");
//                }
//
//                if(jObject.getString("url").equals("null")){
//                    url = "";
//                }else{
//                    url = jObject.getString("url");
//                }
//
//                urlToImage = jObject.getString("urlToImage");
//
//                if(jObject.getString("publishedAt").equals("null")){
//                    publishedAt = "";
//                }else{
//                    publishedAt = jObject.getString("publishedAt");
//                }
//
//                articles1.add(new Articles(sourceArray, author, title, description, url, urlToImage, publishedAt));
//            }
//            return articles1;
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

}
