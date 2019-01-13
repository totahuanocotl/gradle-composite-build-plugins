package mx.com.totahuanocotl.compositebuild.app

import mx.com.totahuanocotl.compositebuild.Library

class App {
    static void main(String[] args) {
        println(new App().greet("isaac"))
    }

    String greet(String recipient){
        return new Library().greet(recipient)
    }
}
