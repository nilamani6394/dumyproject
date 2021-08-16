package com.dumy.dumyproject.controller

import com.dumy.dumyproject.entity.Category_Entity
import com.dumy.dumyproject.model.res.ResCategory
import com.dumy.dumyproject.repository.CategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/category")
class CategoryController {
    @Autowired
    private lateinit var categoryRepository: CategoryRepository
    @PostMapping("/create")
    fun addCategory(@ModelAttribute reqCategory: ResCategory?):ResponseEntity<*>?{
        val cateGory=Category_Entity(name = reqCategory?.name,product = null)
        val saveCategory=categoryRepository.save(cateGory)
        val resCategory=ResCategory(saveCategory.id,saveCategory.name)
        return ResponseEntity(resCategory,HttpStatus.OK)
    }
}