package com.dumy.dumyproject.repository

import com.dumy.dumyproject.entity.CategoryEntity
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<CategoryEntity,Long> {
}
//https://ozenero.com/kotlin-springjpa-hibernate-one-many-relationship