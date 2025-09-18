class TaskManager {
private Map<Integer, Task> taskMap;

    // A sorted structure that lets me get the highest priority / highest taskId
    private TreeSet<Task> taskSet;
    public static class Task implements Comparable<Task>
    {
        int userId;
        int taskId;
        int priority;
    
    Task(int userId,int taskId,int priority)
    {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
    }
  public int compareTo(Task other) {
            if (this.priority != other.priority) {
                return Integer.compare(other.priority, this.priority);
            } else {
                return Integer.compare(other.taskId, this.taskId);
            }
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Task)) return false;
            Task t = (Task) o;
            return this.taskId == t.taskId && this.priority == t.priority;
        }
        @Override
        public int hashCode() {
            return Objects.hash(taskId, priority);
        }
    }


    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        taskSet = new TreeSet<>();
        for (List<Integer> t : tasks) {
            int user = t.get(0), id = t.get(1), pr = t.get(2);
            add(user, id, pr);
        }
    }
    
    public void add(int userId, int taskId, int priority) {
     Task task = new Task(userId, taskId, priority);
        taskMap.put(taskId, task);
        taskSet.add(task);   
    }
    
    public void edit(int taskId, int newPriority) {
          Task old = taskMap.get(taskId);
        // Remove old task from sorted set
        taskSet.remove(old);
        // Create new task with updated priority
        Task updated = new Task(old.userId, taskId, newPriority);
        taskMap.put(taskId, updated);
        taskSet.add(updated);
    }
    
    public void rmv(int taskId) {
         Task task = taskMap.get(taskId);
        taskSet.remove(task);
        taskMap.remove(taskId);
    }
    
    public int execTop() {
         if (taskSet.isEmpty()) {
            return -1;
        }
        Task top = taskSet.first(); // since TreeSet sorted so first is highest priority/taskId
        taskSet.remove(top);
        taskMap.remove(top.taskId);
        return top.userId;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */
