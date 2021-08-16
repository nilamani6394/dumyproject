package com.dumy.dumyproject.controller

import com.dumy.dumyproject.entity.Product_Entity
import com.dumy.dumyproject.model.req.ReqProduct
import com.dumy.dumyproject.repository.CategoryRepository
import com.dumy.dumyproject.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/product")
class ProductController {
    @Autowired
    private lateinit var productRepository: ProductRepository
    @Autowired
    private lateinit var categoryRepository: CategoryRepository
    fun addProduct(@ModelAttribute request:ReqProduct):ResponseEntity<*>{
        val newProduct=Product_Entity(
            name = request.name,
            tags = request.tags,
            price = request.price,
            description = request.description
        )
        val saveProduct=productRepository.save(newProduct)
    }
}
//public Course createCourse(@PathVariable(value = "instructorId") Long instructorId,
//@Valid @RequestBody Course course) throws ResourceNotFoundException {
//    return instructorRepository.findById(instructorId).map(instructor - > {
//        course.setInstructor(instructor);
//        return courseRepository.save(course);
//    }).orElseThrow(() -> new ResourceNotFoundException("instructor not found"));
//}