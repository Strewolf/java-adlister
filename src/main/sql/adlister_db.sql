use adlister_db;
CREATE TABLE ads (
                     id INT NOT NULL AUTO_INCREMENT,
                     user_id INT NOT NULL,
                     title VARCHAR(255) NOT NULL,
                     description TEXT NOT NULL,
                     PRIMARY KEY (id),
                     FOREIGN KEY (user_id) REFERENCES users(id)
);
