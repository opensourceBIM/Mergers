package org.bimserver.merging;

/******************************************************************************
 * Copyright (C) 2009-2016  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.store.ObjectDefinition;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.PluginContext;
import org.bimserver.plugins.modelmerger.ModelMerger;
import org.bimserver.plugins.modelmerger.ModelMergerPlugin;
import org.bimserver.shared.exceptions.PluginException;

public class BasicModelMergerPlugin implements ModelMergerPlugin {

	@Override
	public void init(PluginContext pluginContext) throws PluginException {
	}

	@Override
	public ModelMerger createModelMerger(PluginConfiguration pluginConfiguration) {
		return new BasicModelMerger();
	}

	@Override
	public ObjectDefinition getSettingsDefinition() {
		return null;
	}
}