package patterns.structural.adapter;

import patterns.structural.adapter.objects.Printer;

import java.util.List;

public class PrinterAdapter implements PageListPrinter {

    private Printer printer = new Printer();

    public void print(List<String> list) {
        list.forEach(printer::print);
    }
}
