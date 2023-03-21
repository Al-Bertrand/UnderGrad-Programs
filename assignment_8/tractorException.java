// lets make our own excetion class

//class ShipException extends RuntimeException {

class tractorException extends Exception {

    public tractorException( String mess ) {
             super(mess);
    }
}