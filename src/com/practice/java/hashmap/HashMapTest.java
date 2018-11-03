package com.practice.java.hashmap;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String args[]) {

        HashMap<Friend, String> hMap = new HashMap<>();

        hMap.put((new HashMapTest()).new Friend("Amit", "Premi"), "Mindtree");
        hMap.put((new HashMapTest()).new Friend("Abhishek", "Kumar"), "Microsoft");
        hMap.put((new HashMapTest()).new Friend("Narra", "Amar"), "Mindtree-Hyderabad");
        hMap.put((new HashMapTest()).new Friend("Sandip", "Kumar"), "Cognizant");
        hMap.put((new HashMapTest()).new Friend("Amit", "Premi"), "Mindtree-Bangalore");

        System.out.println("Hash Map result: " + hMap.toString());
        System.out.println("Hash Map Size: " + hMap.size());
    }

    private class Friend {
        private String firstName;
        private String lastName;

        Friend(String fName, String lName) {
            super();
            this.firstName = fName;
            this.lastName = lName;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
            result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Friend other = (Friend) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (firstName == null) {
                if (other.firstName != null)
                    return false;
            } else if (!firstName.equals(other.firstName))
                return false;
            if (lastName == null) {
                if (other.lastName != null)
                    return false;
            } else if (!lastName.equals(other.lastName))
                return false;
            return true;
        }

        @Override
        public String toString() {
            return "Friend [firstName=" + firstName + ", lastName=" + lastName + "]";
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        private HashMapTest getOuterType() {
            return HashMapTest.this;
        }
    }
}
