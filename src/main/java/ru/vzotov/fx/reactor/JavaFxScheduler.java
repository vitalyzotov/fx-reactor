package ru.vzotov.fx.reactor;

import javafx.application.Platform;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

public final class JavaFxScheduler {

    private static final Scheduler FX_SCHEDULER = Schedulers.fromExecutor(Platform::runLater);

    public static Scheduler instance() {
        return FX_SCHEDULER;
    }

    private JavaFxScheduler() {
    }
}
