public class Solution {
    private class ClassInfo {
        public double pass;
        public double total;
        
        public ClassInfo(double p, double t) {
            pass = p;
            total = t;
        }
        
        // Calculate the benefit of adding one student
        public double GetBenefit() {
            return (pass + 1) / (total + 1) - pass / total;
        }
        
        // Add one student to this class
        public void AddStudent() {
            pass += 1;
            total += 1;
        }
    }
    public double MaxAverageRatio(int[][] classes, int extraStudents) {
        // Create a max heap (priority queue) based on the benefit of adding a student
        var pq = new PriorityQueue<ClassInfo, double>();
        
        // Add all classes to the priority queue
        foreach (var c in classes) {
            var classInfo = new ClassInfo(c[0], c[1]);
            // Use negative benefit as PriorityQueue in C# is min heap by default
            pq.Enqueue(classInfo, -classInfo.GetBenefit());
        }
        
        // Distribute extra students
        for (int i = 0; i < extraStudents; i++) {
            // Get class with maximum benefit
            var maxBenefitClass = pq.Dequeue();
            // Add a student to this class
            maxBenefitClass.AddStudent();
            // Put the class back in queue with updated benefit
            pq.Enqueue(maxBenefitClass, -maxBenefitClass.GetBenefit());
        }
        
        // Calculate final average ratio
        double totalRatio = 0;
        while (pq.Count > 0) {
            var classInfo = pq.Dequeue();
            totalRatio += classInfo.pass / classInfo.total;
        }
        
        return totalRatio / classes.Length;
    }
}