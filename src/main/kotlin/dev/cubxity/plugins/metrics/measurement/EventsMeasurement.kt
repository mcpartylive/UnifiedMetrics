/*
 *     UnifiedMetrics is a fully-featured metrics collection plugin for Spigot.
 *     Copyright (C) 2021  Cubxity
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published
 *     by the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package dev.cubxity.plugins.metrics.measurement

import com.influxdb.annotations.Column
import com.influxdb.annotations.Measurement

@Measurement(name = "events")
data class EventsMeasurement(
    @Column
    val server: String,
    @Column(name = "join_count")
    val joinCount: Long,
    @Column(name = "quit_count")
    val quitCount: Long,
    @Column(name = "chat_count")
    val chatCount: Long
)