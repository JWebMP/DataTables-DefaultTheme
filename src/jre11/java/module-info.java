import com.jwebmp.core.services.*;
import com.jwebmp.plugins.datatable.dt.*;

module com.jwebmp.plugins.datatable.dt {
	
	exports com.jwebmp.plugins.datatable.dt;
	
	requires transitive com.jwebmp.plugins.datatable;
	requires transitive com.jwebmp.core.base.angular.client;

	provides IPageConfigurator with DataTablesDTPageConfigurator;
	
	opens com.jwebmp.plugins.datatable.dt to com.google.guice;
	
}
