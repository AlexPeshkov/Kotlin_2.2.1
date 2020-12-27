package com.peshale.domain

import kotlin.random.Random

/*
com.peshale.domain.Post objects https://vk.com/dev/objects/post
 */

data class Post (
    //we set 0 for each post, WallService is responsible to assign unique id for each new post
    var id: Int = 0,
    var ownerId: Int,
    val fromId: Int,
    val createdBy:  Int,
    val date: Long,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int) {



    companion object {
        /*
    fun for testing purpose
     */
        fun createPostWithRandomData(): Post {
            return Post(
                Random.nextInt(0, Int.MAX_VALUE),
                Random.nextInt(0, Int.MAX_VALUE),
                Random.nextInt(0, Int.MAX_VALUE),
                Random.nextInt(0, Int.MAX_VALUE),
                System.currentTimeMillis(),
                "Post",
                Random.nextInt(0, Int.MAX_VALUE),
                Random.nextInt(0, Int.MAX_VALUE),
                false,
                Comments(1, true, true, true, true),
                Copyright(Random.nextInt(0, Int.MAX_VALUE), true, "VK", "default"),
                Likes(Random.nextInt(0, Int.MAX_VALUE), true, true, true),
                Reposts(Random.nextInt(0, Int.MAX_VALUE), false),
                Views(Random.nextInt()),
                "Test",
                Random.nextInt(0, Int.MAX_VALUE),
                true,
                true,
                true,
                false,
                false,
                false,
                Donut(false, 0, "", false, "default"),
                Random.nextInt(0, Int.MAX_VALUE)
            )
        }
    }
}
