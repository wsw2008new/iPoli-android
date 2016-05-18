package io.ipoli.android.app.rate.events;

import org.joda.time.LocalDateTime;

/**
 * Created by Polina Zhelyazkova <polina@ipoli.io>
 * on 5/18/16.
 */
public class RateDialogShownEvent {

    public final int appRun;
    public final LocalDateTime dateTime;

    public RateDialogShownEvent(int appRun) {
        this.appRun = appRun;
        this.dateTime = new LocalDateTime();
    }
}
