package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.actions.rules.RuleExecutor;
import com.webengage.sdk.android.u;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AbstractWebEngage {
    public abstract void a(BroadcastReceiver broadcastReceiver);

    public abstract void a(Intent intent);

    public abstract void a(Intent intent, BroadcastReceiver broadcastReceiver);

    public abstract void a(Location location, BroadcastReceiver broadcastReceiver);

    public abstract void a(u.a aVar, BroadcastReceiver broadcastReceiver);

    public abstract Analytics analytics();

    public abstract void b(BroadcastReceiver broadcastReceiver);

    public abstract void b(Intent intent);

    public abstract void b(Intent intent, BroadcastReceiver broadcastReceiver);

    public abstract void c(BroadcastReceiver broadcastReceiver);

    public abstract void c(Intent intent);

    public abstract void c(Intent intent, BroadcastReceiver broadcastReceiver);

    public abstract void d(BroadcastReceiver broadcastReceiver);

    public abstract void e(BroadcastReceiver broadcastReceiver);

    public abstract void f(BroadcastReceiver broadcastReceiver);

    public abstract void filterCustomEvents(boolean z10);

    public abstract WebEngageConfig getWebEngageConfig();

    public abstract void receive(Intent intent);

    public abstract void receive(Bundle bundle);

    public abstract void receive(Map<String, String> map);

    public abstract RuleExecutor ruleExecutor();

    public abstract void setEventReportingStrategy(ReportingStrategy reportingStrategy);

    public abstract void setEveryActivityIsScreen(boolean z10);

    public abstract void setHuaweiRegistrationID(String str);

    @Deprecated
    public abstract void setLocationTracking(boolean z10);

    public abstract void setLocationTrackingStrategy(LocationTrackingStrategy locationTrackingStrategy);

    public abstract void setLogLevel(int i10);

    public abstract void setRegistrationID(String str);

    @Deprecated
    public abstract void setRegistrationID(String str, String str2);

    public abstract void setXiaomiRegistrationID(String str);

    public abstract User user();
}
