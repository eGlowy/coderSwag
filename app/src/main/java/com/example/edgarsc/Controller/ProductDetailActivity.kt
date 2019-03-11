package com.example.edgarsc.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.edgarsc.Model.Product
import com.example.edgarsc.R
import com.example.edgarsc.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)

        productDetailImage.setImageResource(resourceId)
        ProductDetailProductName.text = product.title
        ProductDetailProductPrice.text = product.price


    }
}
