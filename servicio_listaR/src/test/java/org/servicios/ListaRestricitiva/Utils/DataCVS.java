package org.servicios.ListaRestricitiva.Utils;

import com.opencsv.CSVWriter;
import org.servicios.ListaRestricitiva.PageObject.Ejecuciones;
import java.io.FileWriter;

public class DataCVS {


    static String CSV_LISTAR_PATH_OUT = "src/archivosCVS/Cliente.csv";

    public void CrearCsv() {

        try{
            CSVWriter writer = new CSVWriter(new FileWriter(CSV_LISTAR_PATH_OUT),',',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
            String[] headerRecord = {"celularDestinatario", "idDestinatario","celularRemitente","idRemitente"};
            writer.writeNext(headerRecord);
            writer.writeAll(Ejecuciones.outCsv());
            writer.close();
        }catch (Exception e){
            throw new RuntimeException("No se guardo el excel");
        }

    }

}
