package com.crowdpark.sonar.widget;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;
import org.sonar.api.web.WidgetCategory;
import org.sonar.api.web.WidgetProperties;
import org.sonar.api.web.WidgetProperty;

@UserRole(UserRole.USER)
@Description("Show some stats from the GIT repository")
@WidgetCategory("GIT")
public class GitStatsWidget extends AbstractRubyTemplate implements RubyRailsWidget {

    public String getId() {
        return "git-stats";
    }

    public String getTitle() {
        return "GIT Stats";
    }

    @Override
    protected String getTemplatePath() {
        return "/template/git-stats.html.erb";
    }
}