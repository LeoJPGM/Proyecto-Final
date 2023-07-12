package com.example.application.views.principal;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import pagina.base.PaginaBase;

@PageTitle("Primeros Pasos")
@Route(value = "primeros-pasos")

public class PrimerosPasosView extends PaginaBase {
    public PrimerosPasosView(){
        PaginaPrincipal();
    }
    public void PaginaPrincipal(){
        VerticalLayout contenedorDeTitulo = new VerticalLayout();
        VerticalLayout contenedorDeSubtitulo = new VerticalLayout();
        VerticalLayout contenedorDeInfo = new VerticalLayout();
        VerticalLayout contenedorBase = new VerticalLayout();
        HorizontalLayout contenedorColorBase = new HorizontalLayout();

        //Primer Contenedor (Solo color)
        VerticalLayout contenedor1 = new VerticalLayout();
        contenedor1.getStyle().set("background-color", "#57dbff");
        contenedorColorBase.add(contenedor1);
        contenedorColorBase.setWidthFull();

        contenedorBase.add(contenedorColorBase);

        //Contenedor de informacion
        Span info = new Span("Primeros pasos");
        info.getStyle().set("color", "black");
        info.getStyle().set("font-weight", "bold");
        info.getStyle().set("font-size", "28px");

        contenedorDeTitulo.add(info);
        contenedorDeTitulo.setAlignItems(FlexComponent.Alignment.CENTER);

        Span info2 = new Span("PixelCode es es fácil y sencillo");
        info2.getStyle().set("font-size", "24px");
        info2.getStyle().set("color", "black");
        info2.getStyle().set("font-weight", "bold");

        Span info3 = new Span("Todo lo que necesitas es un ordenador con conexión a Internet. No es necesario descargar ni instalar nada. PixelCode es gratuito y funciona en todos los navegadores y plataformas.");

        contenedorDeInfo.add(info2, info3);
        contenedorDeInfo.getStyle().set("background-color", "#dae1f0");
        contenedorDeInfo.setWidth("50%");

        //Contenedor subtitulo
        Span info4 = new Span("Empieza a programar");
        info4.getStyle().set("color", "black");
        info4.getStyle().set("font-weight", "bold");
        info4.getStyle().set("font-size", "28px");

        contenedorDeSubtitulo.add(info4);
        contenedorDeSubtitulo.setAlignItems(FlexComponent.Alignment.CENTER);


        contenedorBase.add(contenedorColorBase, contenedorDeTitulo, contenedorDeInfo, contenedorDeSubtitulo);

        setContent(contenedorBase);
    }
}
