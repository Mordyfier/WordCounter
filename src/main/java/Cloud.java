import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.bg.CircleBackground;
import com.kennycason.kumo.bg.RectangleBackground;
import com.kennycason.kumo.font.FontWeight;
import com.kennycason.kumo.font.KumoFont;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import com.kennycason.kumo.font.scale.SqrtFontScalar;
import com.kennycason.kumo.image.AngleGenerator;
import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.palette.ColorPalette;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.List;

public class Cloud {
    public static void main (String [] args) throws IOException {
        final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
        frequencyAnalyzer.setWordFrequenciesToReturn(50);
        frequencyAnalyzer.setMinWordLength(3);

        final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load("dataSet.txt");
        final Dimension dimension = new Dimension(500, 500);
        final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
        wordCloud.setPadding(5);
        wordCloud.setBackground(new RectangleBackground(dimension));
        wordCloud.setKumoFont(new KumoFont("Impact", FontWeight.PLAIN));
        wordCloud.setAngleGenerator(new AngleGenerator(-60, 60, 5));
        wordCloud.setColorPalette(new ColorPalette(new Color(0x4055F1), new Color(0x408DF1), new Color(0x40AAF1), new Color(0x40C5F1), new Color(0x40D3F1), new Color(0x000000)));
        wordCloud.setFontScalar(new LinearFontScalar(1, 40));
        wordCloud.build(wordFrequencies);
        wordCloud.writeToFile("output.png");
    }

}
