package common;

import de.codecentric.jbehave.junit.monitoring.JUnitReportingRunner;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnitReportingRunner.class)
public class CustomJUnitStoriesBase extends JUnitStories {

    private List<Object> steps = new ArrayList<Object>();
    private String storyName;

    public CustomJUnitStoriesBase(String storyName, Object... steps) {
        this.storyName = storyName;
        this.steps = Arrays.asList(steps);
    }

    @Override
    public List<String> storyPaths() {
        return new StoryFinder().findPaths(CodeLocations.codeLocationFromPath("src/test/resources/"),
                "**/" + storyName + ".story", "");
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), steps);
    }

    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                .usePendingStepStrategy(new FailingUponPendingStep())
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withFormats(Format.HTML, Format.STATS, Format.CONSOLE)
                        .withFailureTrace(true));
    }
}

