/*
 * Copyright 2021 Mikołaj Leszczyński & Appmattus Limited
 * Copyright 2020 Babylon Partners Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * File modified by Mikołaj Leszczyński & Appmattus Limited
 * See: https://github.com/orbit-mvi/orbit-mvi/compare/c5b8b3f2b83b5972ba2ad98f73f75086a89653d3...main
 */

package org.orbitmvi.orbit.sample.posts.app.features.postlist.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import org.orbitmvi.orbit.sample.posts.domain.repositories.PostOverview

@Composable
fun PostListItem(post: PostOverview, onClick: (post: PostOverview) -> Unit) {
    Row(Modifier.clickable { onClick(post) }) {
        Image(
            painter = rememberImagePainter(post.avatarUrl),
            contentDescription = null,
            modifier = Modifier
                .padding(16.dp)
                .size(40.dp)
        )

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = post.username,
                style = MaterialTheme.typography.overline,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = post.title,
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
