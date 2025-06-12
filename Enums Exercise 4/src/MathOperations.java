public enum MathOperations {
    ADD {
        public double calculate(Number a, Number b) {
            return a.doubleValue() + b.doubleValue();
        }
    },
    SUBSTRACT {
        public double calculate(Number a, Number b) {
            return a.doubleValue() - b.doubleValue();
        }
    },
    MULTIPLY {
        public double calculate(Number a, Number b) {
            return a.doubleValue() * b.doubleValue();
        }
    },
    DIVIDE {
        public double calculate(Number a, Number b) {
            return a.doubleValue() / b.doubleValue();
        }
    };


    public abstract double calculate(Number a, Number b);
}
