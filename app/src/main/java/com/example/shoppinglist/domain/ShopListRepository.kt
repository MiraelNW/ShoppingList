package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemID: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>


}