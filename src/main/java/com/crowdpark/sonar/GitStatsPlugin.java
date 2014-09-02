package com.crowdpark.sonar;

import com.crowdpark.sonar.widget.GitStatsWidget;
import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

@Properties({
        @Property(
                key = GitStatsPlugin.BASE_URL,
                name = "baseUrl",
                description = "Base url for GIT stats",
                defaultValue = "http://git-stats.crowdpark-cloud.com"
        ),
        @Property(
            key = GitStatsPlugin.PROJECTS,
            name = "projects",
            description = "Specify projects separated by ,",
            defaultValue = ""
        )
})
public final class GitStatsPlugin extends SonarPlugin {

    public static final String BASE_URL = "sonar.gitStats.baseUrl";
    public static final String PROJECTS = "sonar.gitStats.projects";

    public List getExtensions() {
        return Arrays.asList(
                GitStatsWidget.class);
    }


}