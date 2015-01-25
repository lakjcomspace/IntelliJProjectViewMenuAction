package com.lakj.comspace.intellij.projectviewmenuaction;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * Created by Lak J Comspace on 1/25/2015.
 */
public class ProjectViewAction extends AnAction {
    /**
     * Implement this method to provide your action handler.
     *
     * @param e Carries information on the invocation place
     */
    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getProject();
        Messages.showMessageDialog(project, "Hello, You just clicked the IntelliJ project view popup menu action item.",
                "Project View Action", Messages.getInformationIcon());
    }
}
