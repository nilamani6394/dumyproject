package com.dumy.dumyproject.repository

import com.dumy.dumyproject.entity.Category_Entity
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository<Category_Entity,Long> {
}
//https://ozenero.com/kotlin-springjpa-hibernate-one-many-relationship