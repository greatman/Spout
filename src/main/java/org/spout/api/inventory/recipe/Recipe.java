/*
 * This file is part of SpoutAPI.
 *
 * Copyright (c) 2011-2012, SpoutDev <http://www.spout.org/>
 * SpoutAPI is licensed under the SpoutDev License Version 1.
 *
 * SpoutAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * SpoutAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.api.inventory.recipe;

import java.io.Serializable;
import java.util.Collection;

import org.spout.api.inventory.Inventory;
import org.spout.api.inventory.ItemStack;

/**
 * Represents an arrangement of {@link ItemStack} with an outcome
 */
public abstract class Recipe implements Serializable, Cloneable {
	protected final ItemStack result;

	public Recipe(ItemStack result) {
		this.result = result;
	}

	/**
	 * Returns the result of the Recipe if successful.
	 *
	 * @return result of recipe
	 */
	public ItemStack getResult() {
		return result;
	}

	/**
	 * Returns the required ingredients to meet the requirements of the recipe.
	 *
	 * @return collection of ingredients to craft the recipe
	 */
	public abstract Collection<ItemStack> getIngredients();

	/**
	 * Whether the inventory has the required ingredients in it in the proper
	 * arrangement to craft the result.
	 *
	 * @param inventory to check
	 * @return true if the inventory meets the requirements
	 */
	public abstract boolean handle(Inventory inventory);

	@Override
	public abstract Recipe clone();
}
