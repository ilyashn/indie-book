package com.dream.team.indiebook.repository

import com.dream.team.indiebook.entity.Book
import com.dream.team.indiebook.entity.Tag
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : CrudRepository<Book, Long?> {
    fun findByAuthorId(authorId: Long): List<Book>
    fun findAllByTagsContains(tags: Tag): List<Book>
    fun findByNameContaining(name: String): List<Book>
}