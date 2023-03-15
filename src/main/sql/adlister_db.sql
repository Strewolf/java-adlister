use adlister_db;
CREATE TABLE ads (
                     id INT NOT NULL AUTO_INCREMENT,
                     user_id INT NOT NULL,
                     title VARCHAR(255) NOT NULL,
                     description TEXT NOT NULL,
                     PRIMARY KEY (id),
                     FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO users (username, email, password) VALUES ('admin', 'adminuser@example.com', 'password');
select * from ads;
INSERT INTO ads (user_id, title, description) VALUES
                                                  (1, 'Playstation 5', 'worth everything you own'),
                                                  (1, 'mercedes amg c63', 'my favorite car'),
                                                  (1, 'bmw gle', 'also favorite car matte black paint only'),
                                                  (1, '1999 mustang gt', 'my current car built ford tuff');
