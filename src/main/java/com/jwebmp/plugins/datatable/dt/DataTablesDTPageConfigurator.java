/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.datatable.dt;

import com.jwebmp.core.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.core.services.*;
import jakarta.validation.constraints.*;

/**
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via
 * file://
 */
@PluginInformation(pluginName = "Data Tables",
                   pluginUniqueName = "data-tables-dt",
                   pluginDescription = "DataTables is a plug-in for the " +
                                       "jQuery Javascript library. " +
                                       "It is a highly flexible " +
                                       "tool, based upon the " +
                                       "foundations of progressive " +
                                       "enhancement, and will add advanced interaction  controls  to any  HTML  table .",
                   pluginVersion = "1.10.22",
                   pluginDependancyUniqueIDs = "jquery,bootstrap",
                   pluginCategories = "jquery,datatables, tables, ui, " + "web, framework",
                   pluginSubtitle = "DataTables is very simple to use as a jQuery plug-in with a huge range of customisable option",
                   pluginGitUrl = "https://github.com/GedMarc/JWebMP-DataTablesPlugin",
                   pluginSourceUrl = "https://datatables" + "" + ".net/download/index",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebMP-DataTablesPlugin/wiki",
                   pluginOriginalHomepage = "https://www.datatables.net/",
                   pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.forms/jwebmp-data-tables",
                   pluginIconUrl = "",
                   pluginIconImageUrl = "",
                   pluginLastUpdatedDate = "2021/09/05",
                   pluginGroupId = "com.jwebmp.plugins.forms",
                   pluginArtifactId = "jwebmp-data-tables-dt",
                   pluginModuleName = "com.jwebmp.plugins.datatable",
                   pluginStatus = PluginStatus.Released
)

@TsDependency(value = "datatables.net-dt",version = "*")
@TsDependency(value = "datatables.net-autofill-dt",version = "*")
@TsDependency(value = "datatables.net-buttons-dt",version = "*")
@TsDependency(value = "datatables.net-colreorder-dt",version = "*")
@TsDependency(value = "datatables.net-datetime",version = "*")
@TsDependency(value = "datatables.net-fixedcolumns-dt",version = "*")
@TsDependency(value = "datatables.net-fixedheader-dt",version = "*")
@TsDependency(value = "datatables.net-keytable-dt",version = "*")
@TsDependency(value = "datatables.net-responsive-dt",version = "*")
@TsDependency(value = "datatables.net-rowgroup-dt",version = "*")
@TsDependency(value = "datatables.net-rowreorder-dt",version = "*")
@TsDependency(value = "datatables.net-scroller-dt",version = "*")
@TsDependency(value = "datatables.net-searchbuilder-dt",version = "*")
@TsDependency(value = "datatables.net-searchpanes-dt",version = "*")
@TsDependency(value = "datatables.net-select-dt",version = "*")
@TsDependency(value = "datatables.net-staterestore-dt",version = "*")


public class DataTablesDTPageConfigurator
		implements IPageConfigurator<DataTablesDTPageConfigurator>
{
	public DataTablesDTPageConfigurator()
	{
		//Nothing Needed
	}
	
	@NotNull
	@Override
	public Page<?> configure(Page<?> page)
	{
		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return true;
	}
	
}
