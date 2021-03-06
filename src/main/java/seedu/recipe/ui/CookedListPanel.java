package seedu.recipe.ui;

import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.Region;
import seedu.recipe.commons.core.LogsCenter;
import seedu.recipe.model.cooked.Record;

/**
 * Panel containing the list of recipes.
 */
public class CookedListPanel extends UiPart<Region> {
    private static final String FXML = "CookedListPanel.fxml";
    private final Logger logger = LogsCenter.getLogger(CookedListPanel.class);

    @FXML
    private ListView<Record> cookedListView;

    @FXML
    private PieChart pieChart;

    public CookedListPanel(ObservableList<Record> recordList, ObservableList<Integer> goalCountList) {
        super(FXML);
        cookedListView.setItems(recordList);
        cookedListView.setCellFactory(listView -> new RecordListViewCell());

        setChart(goalCountList);
    }

    public void setChart(ObservableList<Integer> goalCountList) {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Herbivore", goalCountList.get(0)),
                        new PieChart.Data("Bulk like the Hulk", goalCountList.get(1)),
                        new PieChart.Data("Wholesome Wholemeal", goalCountList.get(2)));

        pieChart.setTitle("My Healthy Plate");
        pieChart.setData(pieChartData);
    }

    /**
     * Custom {@code ListCell} that displays the graphics of a {@code Record} using a {@code RecordCard}.
     */
    class RecordListViewCell extends ListCell<Record> {
        @Override
        protected void updateItem(Record record, boolean empty) {
            super.updateItem(record, empty);
            if (empty || record == null) {
                setGraphic(null);
                setText(null);
            } else {
                setGraphic(new CookedCard(record, getIndex() + 1).getRoot());
            }
        }
    }

}
