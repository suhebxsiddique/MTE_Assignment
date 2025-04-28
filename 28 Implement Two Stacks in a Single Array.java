public class Question28 {
    static class TwoStacks {
        int[] suheb1;
        int suheb2, suheb3;

        public TwoStacks(int size) {
            suheb1 = new int[size];
            suheb2 = -1;
            suheb3 = size;
        }

        void push1(int x) {
            if (suheb2 < suheb3 - 1) {
                suheb1[++suheb2] = x;
            } else {
                System.out.println("Stack1 Overflow");
            }
        }

        void push2(int x) {
            if (suheb3 - 1 > suheb2) {
                suheb1[--suheb3] = x;
            } else {
                System.out.println("Stack2 Overflow");
            }
        }

        int pop1() {
            if (suheb2 >= 0) {
                return suheb1[suheb2--];
            } else {
                System.out.println("Stack1 Underflow");
                return -1;
            }
        }

        int pop2() {
            if (suheb3 < suheb1.length) {
                return suheb1[suheb3++];
            } else {
                System.out.println("Stack2 Underflow");
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        TwoStacks suheb = new TwoStacks(10);

        suheb.push1(5);
        suheb.push2(10);

        System.out.println("Pop from Stack1: " + suheb.pop1());
        System.out.println("Pop from Stack2: " + suheb.pop2());
    }
}
