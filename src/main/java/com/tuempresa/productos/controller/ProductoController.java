package com.tuempresa.productos.controller;

import com.tuempresa.productos.model.Producto;
import com.tuempresa.productos.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("productos", service.listarTodos());
        return "listar";
    }

    @GetMapping("/nuevo")
    public String nuevoFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "formulario";
    }

    @PostMapping
    public String guardar(@Valid @ModelAttribute Producto producto, BindingResult result) {
        if (result.hasErrors()) return "formulario";
        service.guardar(producto);
        return "redirect:/productos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        var producto = service.buscarPorId(id);
        producto.ifPresent(p -> model.addAttribute("producto", p));
        return "formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/productos";
    }
}
