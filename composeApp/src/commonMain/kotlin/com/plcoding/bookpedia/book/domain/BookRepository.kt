package com.plcoding.bookpedia.book.domain

import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.EmptyResult
import com.plcoding.bookpedia.core.domain.Result
import kotlinx.coroutines.flow.Flow

interface BookRepository {
    suspend fun searchBooks(
        query: String,
        limit: Int? = null,
        offset: Int? = null
    ): Result<List<Book>, DataError.Remote>
    suspend fun getBookDescription(bookID: String): Result<String?, DataError>

    suspend fun getFavoriteBooks(): Flow<List<Book>>
    suspend fun isBookFavorite(id: String): Flow<Boolean>
    suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local>
    suspend fun deleteFromFavorites(id: String): EmptyResult<DataError.Local>
}