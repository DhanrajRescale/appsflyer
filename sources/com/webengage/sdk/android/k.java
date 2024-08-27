package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.actions.database.ReportingStrategy;

/* loaded from: classes2.dex */
public class k extends h {
    public k(Context context) {
        super(context);
    }

    public void a(LocationTrackingStrategy locationTrackingStrategy) {
        a("location_tracking_strategy", (Object) locationTrackingStrategy.name());
    }

    public void i(String str) {
        a("license_code", (Object) str);
    }

    public ReportingStrategy r() {
        return ReportingStrategy.valueOf(b("webengage_prefs.txt").getString("event_reporting_strategy", ReportingStrategy.BUFFER.name()));
    }

    public String s() {
        return b("webengage_prefs.txt").getString("license_code", null);
    }

    public boolean t() {
        return b("webengage_prefs.txt").getBoolean("location_tracking_flag", true);
    }

    public LocationTrackingStrategy u() {
        return LocationTrackingStrategy.valueOf(b("webengage_prefs.txt").getString("location_tracking_strategy", LocationTrackingStrategy.ACCURACY_CITY.name()));
    }

    public void a(ReportingStrategy reportingStrategy) {
        a("event_reporting_strategy", (Object) reportingStrategy.name());
    }

    public void a(boolean z10) {
        a("location_tracking_flag", Boolean.valueOf(z10));
    }
}
