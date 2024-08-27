package com.webengage.sdk.android;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.actions.rules.RuleExecutor;
import com.webengage.sdk.android.u;
import com.webengage.sdk.android.utils.Provider;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class c0 extends AbstractWebEngage {

    /* renamed from: a, reason: collision with root package name */
    private WebEngageConfig f12536a;

    /* renamed from: b, reason: collision with root package name */
    private Queue<i0> f12537b;

    public c0(WebEngageConfig webEngageConfig) {
        this.f12537b = null;
        this.f12536a = webEngageConfig;
        this.f12537b = new LinkedList();
    }

    public Queue<i0> a() {
        return this.f12537b;
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public Analytics analytics() {
        return c.a(this.f12537b);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void b(BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(11, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void c(BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(10, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void d(BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(20, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void e(BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(9, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void f(BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(16, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void filterCustomEvents(boolean z10) {
        this.f12537b.add(new t0(3, Boolean.valueOf(z10)));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public WebEngageConfig getWebEngageConfig() {
        return this.f12536a;
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Intent intent) {
        if (intent == null) {
            Logger.e("WebEngage", "Intent is null");
        } else {
            a(intent);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public RuleExecutor ruleExecutor() {
        return com.webengage.sdk.android.actions.rules.h.b();
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setEventReportingStrategy(ReportingStrategy reportingStrategy) {
        this.f12537b.add(new t0(2, reportingStrategy));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setEveryActivityIsScreen(boolean z10) {
        this.f12537b.add(new t0(4, Boolean.valueOf(z10)));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setHuaweiRegistrationID(String str) {
        this.f12537b.add(new t0(5, str, null, Provider.HW.name()));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLocationTracking(boolean z10) {
        this.f12537b.add(new t0(0, Boolean.valueOf(z10)));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLocationTrackingStrategy(LocationTrackingStrategy locationTrackingStrategy) {
        this.f12537b.add(new t0(19, locationTrackingStrategy));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setLogLevel(int i10) {
        this.f12537b.add(new t0(1, Integer.valueOf(i10)));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setRegistrationID(String str) {
        setRegistrationID(str, null);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setXiaomiRegistrationID(String str) {
        this.f12537b.add(new t0(5, str, null, Provider.MI.name()));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public User user() {
        return n0.a(this.f12537b);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(BroadcastReceiver broadcastReceiver) {
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void b(Intent intent) {
        this.f12537b.add(new t0(14, intent));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void c(Intent intent) {
        this.f12537b.add(new t0(17, intent, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Bundle bundle) {
        if (bundle == null) {
            Logger.e("WebEngage", "Push bundle is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtras(bundle);
        receive(intent);
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void setRegistrationID(String str, String str2) {
        this.f12537b.add(new t0(5, str, str2, Provider.FCM.name()));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(Intent intent) {
        this.f12537b.add(new t0(6, intent));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void b(Intent intent, BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(13, intent, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void c(Intent intent, BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(12, intent, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void receive(Map<String, String> map) {
        if (map == null) {
            Logger.e("WebEngage", "Push data is null");
            return;
        }
        Bundle a10 = WebEngageUtils.a(map);
        if (a10 != null) {
            receive(a10);
        }
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(Intent intent, BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(7, intent, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(Location location, BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(8, location, null));
    }

    @Override // com.webengage.sdk.android.AbstractWebEngage
    public void a(u.a aVar, BroadcastReceiver broadcastReceiver) {
        this.f12537b.add(new t0(15, aVar, null));
    }
}
