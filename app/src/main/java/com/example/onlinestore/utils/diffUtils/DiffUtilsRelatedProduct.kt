package com.example.onlinestore.utils.diffUtils

import androidx.recyclerview.widget.DiffUtil
import com.example.onlinestore.data.model.RelatedProductModel

object DiffUtilsRelatedProduct {

    val diffUtilItems = object : DiffUtil.ItemCallback<RelatedProductModel>() {
        override fun areItemsTheSame(oldItem: RelatedProductModel, newItem: RelatedProductModel): Boolean {
            return oldItem.id == newItem.id
                    && oldItem.title == newItem.title
                    && oldItem.full_title == newItem.full_title
                    && oldItem.images == newItem.images
                    && oldItem.image == newItem.image
                    && oldItem.price == newItem.price
                    && oldItem.old_price == newItem.old_price
                    && oldItem.favorite == newItem.favorite
                    && oldItem.rank == newItem.rank
                    && oldItem.description == newItem.description
                    && oldItem.specification == newItem.specification
        }

        override fun areContentsTheSame(oldItem: RelatedProductModel, newItem: RelatedProductModel): Boolean {
            return oldItem == newItem
        }
    }
}

