/*
 * This file is part of Spout.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Spout is licensed under the Spout License Version 1.
 *
 * Spout is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the Spout License Version 1.
 *
 * Spout is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the Spout License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://spout.in/licensev1> for the full license, including
 * the MIT license.
 */
package org.spout.api.event.world;

import org.spout.api.entity.Entity;
import org.spout.api.event.HandlerList;
import org.spout.api.geo.World;

/**
 * Called when a {@link org.spout.api.entity.Entity} leaves a {@link World}.
 *
 * This is not to be confused with {@see org.spout.api.event.entity.EntityDespawnEvent} where that event is fired when the entity is de-spawned.
 */
public class EntityExitWorldEvent extends AbstractWorldEvent {
	private static final HandlerList handlers = new HandlerList();
	private final Entity entity;

	public EntityExitWorldEvent(World world, Entity entity) {
		super(world);
		this.entity = entity;
	}

	/**
	 * Returns the entity entering the world.
	 *
	 * @return entity
	 */
	public Entity getEntity() {
		return entity;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
