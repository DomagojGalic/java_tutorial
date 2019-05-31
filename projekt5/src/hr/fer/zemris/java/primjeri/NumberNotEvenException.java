package hr.fer.zemris.java.primjeri;

public class NumberNotEvenException
    extends IllegalArgumentException {

        private static final long serialVersionUID = 1L;

        public NumberNotEvenException() {
        }

        public NumberNotEvenException(String message) {
            super(message);
        }

        public NumberNotEvenException(Throwable cause) {
            super(cause);
        }

        public NumberNotEvenException(String message,
                Throwable cause) {
            super(message, cause);
        }
    }