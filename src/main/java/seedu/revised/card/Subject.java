package seedu.revised.card;

import seedu.revised.card.quiz.Result;
import seedu.revised.card.quiz.ResultList;
import seedu.revised.task.Task;
import seedu.revised.task.TaskList;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String title;
    private TopicList topics;
    private TaskList tasks;
    private ResultList results;

    public Subject(String title) {
        this(title, new ArrayList<>());
    }

    public Subject(String title, List<Topic> topics) {
        this(title, topics, new ArrayList<>());
    }

    public Subject(String title, List<Topic> topics, List<Task> tasks) {
        this(title, topics, tasks, new ArrayList<>());
    }

    public Subject(String title, List<Topic> topics, List<Task> tasks, List<Result> results) {
        this.title = title;
        this.topics = new TopicList(topics);
        this.tasks = new TaskList(tasks);
        this.results = new ResultList(results);
    }


    public String getTitle() {
        return title;
    }

    public TopicList getTopics() {
        return topics;
    }

    public TaskList getTasks() {
        return tasks;
    }

    public ResultList getResults() {
        return results;
    }

    @Override
    public String toString() {
        return this.title;
    }


}
