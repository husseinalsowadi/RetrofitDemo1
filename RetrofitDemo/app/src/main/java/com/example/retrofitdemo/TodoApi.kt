package com.example.retrofitdemo

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface TodoApi {
    //This will get us our desired json data
    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>



/*
//How to create post request
    @POST("/createTodo")
    fun createTodo(@Body todo: Todo): Response<CreateTodoResponse>

 */
}