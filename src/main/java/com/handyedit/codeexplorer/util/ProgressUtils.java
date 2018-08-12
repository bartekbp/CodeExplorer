package com.handyedit.codeexplorer.util;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ReadAction;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProcessCanceledException;
import com.intellij.openapi.util.ThrowableComputable;

public class ProgressUtils {

    public static <T> T run(Project project, String title, final Action<T> action) {
        return ReadAction.compute(action::run);
    }

    public static void report(String msg) {
        ProgressIndicator indicator = ProgressManager.getInstance().getProgressIndicator();
        if (indicator == null) {
            return;
        }
        indicator.setText(msg);
    }

    public static void report(String msg, int stepNo, int steps) {
        ProgressIndicator indicator = ProgressManager.getInstance().getProgressIndicator();
        if (indicator == null) {
            return;
        }
        indicator.setText(msg);
        double fraction = (double) stepNo / steps;
        indicator.setFraction(fraction);
    }

    public static boolean isCanceled() {
        try {
            ProgressManager.getInstance().checkCanceled();
            return false;
        } catch (ProcessCanceledException e) {
            return true;
        }
    }

    public static interface Action<T> {
        T run();
    }
}
