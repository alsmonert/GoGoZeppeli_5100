/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    public void getFiveInactiveUserByComment(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList, new Comparator<User>() {
            @Override 
            public int compare(User u1, User u2) {
                return u1.getComments().size() - u2.getComments().size();
            }
        });
        System.out.println("5 least-comment users: ");
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println(userList.get(i));
        }
        
    }
    
    public int overall(User u){
        LinkedHashSet<Integer> postIDset = new LinkedHashSet<>();
        List<Integer> postIDs = new ArrayList<>();
        int likescount = 0;
        for (Comment c : u.getComments()){
            likescount += c.getLikes();
            postIDs.add(c.getPostId());
        }
        postIDset.addAll(postIDs); 
        int postcount = postIDset.size();
        return postcount+likescount+u.getComments().size();
    }        
    public void getFiveInactiveUserOverall(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList, new Comparator<User>() {
            @Override 
            public int compare(User u1, User u2) {
                return overall(u1) - overall(u2);
            }
        });
        System.out.println("5 least-overall users: ");
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println(userList.get(i));
        } 
    }
    public void getFiveProactiveUserOverall(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<User> userList = new ArrayList<>(users.values());
        
        Collections.sort(userList, new Comparator<User>() {
            @Override 
            public int compare(User u1, User u2) {
                return overall(u2) - overall(u1);
            }
        });
        System.out.println("5 most-overall users: ");
        for (int i = 0; i < userList.size() && i < 5; i++) {
            System.out.println(userList.get(i));
        } 
    }
}
