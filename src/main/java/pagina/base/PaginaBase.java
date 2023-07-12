package pagina.base;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

public class PaginaBase extends AppLayout {
    public PaginaBase() {
        TituloPrincipal();
        menuOpciones();
    }

    private void TituloPrincipal() {
        DrawerToggle toggle = new DrawerToggle();

        H1 pixel = new H1("PIXEL");
        H1 code = new H1("CODE");
        Span espacio = new Span();

        espacio.getStyle().set("flex-grow", "1");

        pixel.getStyle().set("font-family", "Courier");
        pixel.getStyle().set("color", "#d86363");
        code.getStyle().set("font-family", "Courier");
        code.getStyle().set("color", "gray");


        addToNavbar(pixel, code, espacio, toggle);
    }

    private void menuOpciones() {
        //Titulo del menu
        Span menu = new Span("MENU");
        menu.getStyle().set("font-family", "Courier");

        //Personalizacion de Iconos
        Icon globo = new Icon(VaadinIcon.GLOBE);
        Span texto_idioma = new Span("Idioma");
        texto_idioma.getStyle().set("font-family", "Courier");

        Icon blog = new Icon(VaadinIcon.LIST_SELECT);
        Span texto_blog = new Span("Blog");
        texto_blog.getStyle().set("font-family", "Courier");

        Icon config = new Icon(VaadinIcon.TOOLS);
        Span texto_config = new Span("Configuracion");
        texto_config.getStyle().set("font-family", "Courier");

        //Iconos agregados a las diferentes opciones
        Tab tab1 = new Tab(new HorizontalLayout(globo, texto_idioma));
        Tab tab2 = new Tab(new HorizontalLayout(blog, texto_blog));
        Tab tab3 = new Tab(new HorizontalLayout(config, texto_config));

        Tabs tabs = new Tabs(tab1, tab2, tab3);
        tabs.setOrientation(Tabs.Orientation.VERTICAL);

        addToDrawer(menu, tabs);

    }
}
