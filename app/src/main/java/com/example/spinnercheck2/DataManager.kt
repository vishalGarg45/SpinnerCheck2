package com.example.spinnercheck2

class DataManager {
    val courses =HashMap<String, CourseInfo>()

    init{
        initializeCourses()
    }
    private fun initializeCourses() {
        var course =CourseInfo("andrintents","Andr ptog with intents")
        courses.set(course.courseId, course)
        course =CourseInfo("andrintents2","Andr ptog with intents2")
        courses.set(course.courseId, course)
    }
}