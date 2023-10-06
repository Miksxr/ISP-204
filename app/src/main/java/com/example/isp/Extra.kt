package com.example.isp

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Paint
import android.view.View
import com.example.isp.databinding.HomeworkBinding

fun homework(element: HomeworkBinding, subjectResId: String, taskResId: Int, checkVisibility: Int = View.VISIBLE, select: Boolean, checkVisibility2: Int = View.VISIBLE) {
    val task = element.root.context.getString(taskResId)
    element.Subject.text = subjectResId

    // Создаем уникальный ключ для каждой задачи
    val taskKey = "task_${subjectResId}_${taskResId}"

    // Восстанавливаем состояние зачёркивания при создании элемента
    val isChecked = loadStrikeThroughState(element.root.context, taskKey)
    element.LessonOne.Check.isChecked = isChecked

    element.Subject.setOnCheckedChangeListener { buttonView, isChecked ->
        if (isChecked) {
            element.LessonOne.Task.text = task
            element.LessonOne.Task.visibility = View.VISIBLE
            element.LessonOne.Check.visibility = checkVisibility
            element.LessonTwo.Task.visibility = checkVisibility2
        } else {
            element.LessonOne.Task.visibility = View.GONE
            element.LessonOne.Check.visibility = View.GONE
            element.LessonTwo.Task.visibility = View.GONE
        }

        // Сохраняем состояние зачёркивания при изменении
        saveStrikeThroughState(element.root.context, taskKey, isChecked)
    }

    element.LessonOne.Check.setOnCheckedChangeListener { buttonView, isChecked ->
        if (isChecked) {
            element.LessonOne.Task.paintFlags = element.LessonOne.Task.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        } else {
            element.LessonOne.Task.paintFlags = element.LessonOne.Task.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()
        }

        // Сохраняем состояние зачёркивания при изменении
        saveStrikeThroughState(element.root.context, taskKey, isChecked)
    }
}

// Функция для сохранения состояния зачёркивания в SharedPreferences
fun saveStrikeThroughState(context: Context, key: String, isChecked: Boolean) {
    val sharedPreferences: SharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    val editor = sharedPreferences.edit()
    editor.putBoolean(key, isChecked)
    editor.apply()
}

// Функция для восстановления состояния зачёркивания из SharedPreferences
fun loadStrikeThroughState(context: Context, key: String): Boolean {
    val sharedPreferences: SharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
    return sharedPreferences.getBoolean(key, false)
}





