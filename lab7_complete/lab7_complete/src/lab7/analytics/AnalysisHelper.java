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
        System.out.println("User with most likes: " + max + "\n" + users.get(maxId));
    }
    
        public void getPostWithMostLikes(){
        Map<Integer, Integer>postlikes = new HashMap<>();
        Map<Integer, Post>postsMap = DataStore.getInstance().getPosts();
        
        for (Post p: postsMap.values()) {
            for (Comment c : p.getComments()) {
                int likes = 0;
                if (postlikes.containsKey(p.getPostId())) {
                    likes = postlikes.get(p.getPostId());
                }
                likes += c.getLikes();
                postlikes.put(p.getPostId(), likes);
            }
        }
        
        int winner = 0;
        int maxLikes = 0;
        for(Integer i : postlikes.keySet()){
            if(maxLikes < postlikes.get(i)){
                winner = i;
                maxLikes = postlikes.get(i);
            }
        }
        
        System.out.print("The post with maximum likes is " + winner+ ". " + "The maximun number of likes is " + maxLikes + "\n");
        //System.out.println("User with most likes: " + winner + "\n" + p.get(maxId));
    }
    
        public void AvgLikes(){
     
            Map<Integer, Post>postsMap = DataStore.getInstance().getPosts();
            int likes = 0;
            int CommitTot = 0;
            for (Post p: postsMap.values()) {
                CommitTot += p.getComments().size();
                for (Comment c : p.getComments()) {
                    likes += c.getLikes(); 
                    
            }
        }

            double preComm = likes/CommitTot ;
        
        System.out.print("The Average likes per comment: " + preComm + "\n");
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
}
