package com.company;
/*
Encrypted Data Project Goal:
taking a word, generating an encryption key, and sending the
encrypted data to a CLASS where it is stored.
If user requests the word, the user may retrieve it by accessing the decryption key
As an added bonus, if user 1 gives access to user 2, user 1 and user 2 can decipher each others word
^^^how data can pass through classes and how only certain objects may be granted access

Planning:
- Use Caesar Cipher; use a method in a class for crypting and decripting; if user 1 gives access to 2 have
another method that decripts the message for user 2
- Objects would be users?
- maybe have a method that allows user 1 to give access to user 2; maybe use a SOP that asks user 1 if they
want to give access to user 2 --> decryption method and etc
- check if all letters of the word that's supposed to be encrypted are letters not numbers
 */
public class Main {

    public static void main(String[] args) {
	EncryptedData obj = new EncryptedData();
	obj.encrypt();
	obj.decrypt();
	obj.access();
    }
}
