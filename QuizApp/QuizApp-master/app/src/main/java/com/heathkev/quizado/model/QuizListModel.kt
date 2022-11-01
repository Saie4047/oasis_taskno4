package com.heathkev.quizado.model

import android.os.Parcelable
import com.google.firebase.firestore.DocumentId
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QuizListModel(
    @DocumentId
    val quiz_id: String,
    val name: String,
    val desc: String,
    val image: String,
    val level: String ,
    val visibility: String,
    val category: String,
    val questions: Long) : Parcelable {

    constructor():this("","","","","","","",0L)
}