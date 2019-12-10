
import static tech.tablesaw.aggregate.AggregateFunctions.count;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.ScatterPlot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.BarTrace;
import tech.tablesaw.plotly.traces.HistogramTrace;


public class Bars {
    public static void main(String[] args) throws Exception {
        Table table = Table.read().csv("dataSet.csv");

        System.out.println(table);

        BarTrace trace =
                BarTrace.builder(table.categoricalColumn(0), table.numberColumn(1))
                        .orientation(BarTrace.Orientation.VERTICAL)
                        .build();

        Layout layout = Layout.builder().title(" \"All You Need Is Love\" \n Frequency of occurence per word").height(600).width(800).build();
        Plot.show(new Figure(layout, trace));

        Layout layout2 = Layout.builder().title("Number of words as a function of frequency").build();
        HistogramTrace trace2 = HistogramTrace.builder(table.nCol("Count")).build();

        Plot.show(new Figure(layout2, trace2));
    }
}
