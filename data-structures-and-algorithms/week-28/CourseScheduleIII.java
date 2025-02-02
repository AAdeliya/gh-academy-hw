package data-structures-and-algorithms.week-28;

public class CourseScheduleIII {
    pubkic
    int schedulecourse(int[][] courses) {

   // Sort the courses by their deadlines.
        // Greedy! (We have to deal with courses with early deadlines first.)
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
 
        // max-heap for durations of chosen courses.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
 
        // Total duration of chosen courses.
        int total_duration = 0;
 
        // Iterating over courses (in the increasing order of deadlines).
        for (int[] course : courses) {
            int course_duration = course[0];
            int course_deadline = course[1];
 
            // Take the current course. Add its duration to the total_duration.
            // Also, add the duration to the max-heap.
            total_duration += course_duration;
            pq.add(course_duration);
 
            // If the total duration of the chosen courses exceeds the deadline
            // for the current course (don't forget that we are iterating over courses
            // in the increasing order of deadlines – the next courses have deadlines
            // that are further out), then..
            while (total_duration > course_deadline) {
                // ..drop one of the taken courses, particularly the one with 
                // the longest duration. Greedy! (That must be the best choice)
                total_duration -= pq.poll();
            }
        }        
        return pq.size();
    }
}