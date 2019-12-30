package pachage1228;

import java.util.UUID;

 class User {
    String id;
    String username;
    String avatarUrl;
    String show;
        User(String username,String avatarUrl,String show){
            this.id= UUID.randomUUID().toString();
            this.username=username;
            this.avatarUrl=avatarUrl;
            this.show=show;
        }

}
