public class SegmentTree {
    public static void main(String args[]) {
        int array[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int n=10;

     SegmTree sg=new SegmTree(0,n-1,array);

     sg.pointUpdate(2,40);
     System.out.println(sg.rangeSum(0,2));

    }


    static class SegmTree {

        int leftIndices, rightIndices;
        SegmTree leftC, rightC;//left children and right children
        int sum;

        SegmTree(int leftIndices, int rightIndices, int array[]) {

            this.leftIndices = leftIndices;
            this.rightIndices = rightIndices;
            //if we are at leaf
            if (leftIndices == rightIndices) {
                sum += array[leftIndices];
            } else {
                //have two children
                int mid = (leftIndices + rightIndices) / 2;
                // array[l,mid].....array[moid+1,right]
                leftC = new SegmTree(leftIndices, mid, array);
                rightC = new SegmTree(mid + 1, rightIndices, array);
                recalc();

            }
        }

        public void recalc() {
            if (leftIndices == rightIndices) return;
            sum = leftC.sum + rightC.sum;
        }

        public void pointUpdate(int index, int value) {
            if (leftIndices == rightIndices) {
                //leaf
                sum = value;
                return;
            } else {
                if (index <= leftC.rightIndices) leftC.pointUpdate(index, value);
                else {
                    rightC.pointUpdate(index, value);
                }
                recalc();
            }

        }


        public int rangeSum(int start, int end) {
            //3 cases fpor range sum //entirely disjoint
            if (start < leftIndices || end > rightIndices) return 0;

                //case 2 covers you
            else if (start <= leftIndices && end >= rightIndices) {
                return sum;
            } else
                return leftC.rangeSum(start, end) + rightC.rangeSum(start, end);
        }


    }
}

