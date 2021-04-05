package com.upgrad.blog.model;

import javax.persistence.*;


    @Entity
    public class User {  //user will become tabl
        @Id
        private Integer id;//primary key
        private String userName;//other three are the part of table i.e column
        private String password;
        private String fullName;



        public User() {
            super();
        }

        public User(Integer id, String userName, String password, String fullName) {
            this.id = id;
            this.userName = userName;
            this.password = password;
            this.fullName = fullName;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

}
