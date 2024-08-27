package com.webengage.sdk.android;

import android.content.Context;
import android.os.Build;
import com.webengage.sdk.android.PushChannelConfiguration;
import com.webengage.sdk.android.actions.database.ReportingStrategy;
import com.webengage.sdk.android.utils.WebEngageUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class WebEngageConfig {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private long H;

    /* renamed from: a, reason: collision with root package name */
    private boolean f12179a;

    /* renamed from: b, reason: collision with root package name */
    private LocationTrackingStrategy f12180b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12181c;

    /* renamed from: d, reason: collision with root package name */
    private String f12182d;

    /* renamed from: e, reason: collision with root package name */
    private String f12183e;

    /* renamed from: f, reason: collision with root package name */
    private ReportingStrategy f12184f;

    /* renamed from: g, reason: collision with root package name */
    private String f12185g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12186h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12187i;

    /* renamed from: j, reason: collision with root package name */
    private String f12188j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12189k;

    /* renamed from: l, reason: collision with root package name */
    private int f12190l;

    /* renamed from: m, reason: collision with root package name */
    private int f12191m;

    /* renamed from: n, reason: collision with root package name */
    private int f12192n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12193o;

    /* renamed from: p, reason: collision with root package name */
    private PushChannelConfiguration f12194p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12195q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12196r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12197s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12198t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f12199u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f12200v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f12201w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f12202x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f12203y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f12204z;

    /* loaded from: classes2.dex */
    public static class Builder {
        private boolean A;
        private boolean B;
        private boolean C;
        private boolean D;
        private boolean E;
        private boolean F;
        private boolean G;
        private long H;

        /* renamed from: a, reason: collision with root package name */
        private AtomicBoolean f12205a;

        /* renamed from: b, reason: collision with root package name */
        private LocationTrackingStrategy f12206b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f12207c;

        /* renamed from: d, reason: collision with root package name */
        private String f12208d;

        /* renamed from: e, reason: collision with root package name */
        private String f12209e;

        /* renamed from: f, reason: collision with root package name */
        private String f12210f;

        /* renamed from: g, reason: collision with root package name */
        private ReportingStrategy f12211g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f12212h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f12213i;

        /* renamed from: j, reason: collision with root package name */
        private String f12214j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f12215k;

        /* renamed from: l, reason: collision with root package name */
        private int f12216l;

        /* renamed from: m, reason: collision with root package name */
        private int f12217m;

        /* renamed from: n, reason: collision with root package name */
        private int f12218n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f12219o;

        /* renamed from: p, reason: collision with root package name */
        private PushChannelConfiguration f12220p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f12221q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f12222r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f12223s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f12224t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f12225u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f12226v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f12227w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f12228x;

        /* renamed from: y, reason: collision with root package name */
        private boolean f12229y;

        /* renamed from: z, reason: collision with root package name */
        private boolean f12230z;

        public Builder() {
            this.f12205a = new AtomicBoolean(false);
            this.f12206b = LocationTrackingStrategy.ACCURACY_CITY;
            this.f12207c = false;
            this.f12208d = null;
            this.f12209e = null;
            this.f12210f = "4.0.0";
            this.f12211g = ReportingStrategy.BUFFER;
            this.f12212h = false;
            this.f12213i = false;
            this.f12214j = "aws";
            this.f12215k = false;
            this.f12216l = -1;
            this.f12217m = -1;
            this.f12218n = -1;
            this.f12219o = false;
            this.f12220p = new PushChannelConfiguration.Builder().build();
            this.f12221q = false;
            this.f12222r = false;
            this.f12223s = false;
            this.f12224t = false;
            this.f12225u = false;
            this.f12226v = false;
            this.f12227w = false;
            this.f12228x = false;
            this.f12229y = false;
            this.f12230z = false;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = false;
            this.E = false;
            this.F = false;
            this.G = true;
            this.H = -1L;
        }

        public Builder a(String str) {
            String str2 = "in";
            if (!"in".equalsIgnoreCase(str)) {
                str2 = "gce";
                if (!"gce".equalsIgnoreCase(str)) {
                    str2 = "ir0";
                    if (!"ir0".equalsIgnoreCase(str)) {
                        str2 = "unl";
                        if (!"unl".equalsIgnoreCase(str)) {
                            this.f12214j = "aws";
                            this.f12230z = true;
                            return this;
                        }
                    }
                }
            }
            this.f12214j = str2;
            this.f12230z = true;
            return this;
        }

        public WebEngageConfig build() {
            return new WebEngageConfig(this);
        }

        public Builder c(boolean z10) {
            this.f12219o = z10;
            this.E = true;
            return this;
        }

        public Builder setAutoGCMRegistrationFlag(boolean z10) {
            this.f12207c = z10;
            this.f12223s = true;
            return this;
        }

        public Builder setDebugMode(boolean z10) {
            this.f12212h = z10;
            this.f12228x = true;
            return this;
        }

        public Builder setDefaultPushChannelConfiguration(PushChannelConfiguration pushChannelConfiguration) {
            this.f12220p = pushChannelConfiguration;
            this.F = true;
            return this;
        }

        public Builder setEventReportingStrategy(ReportingStrategy reportingStrategy) {
            this.f12211g = reportingStrategy;
            this.f12227w = true;
            return this;
        }

        public Builder setEveryActivityIsScreen(boolean z10) {
            this.f12213i = z10;
            this.f12229y = true;
            return this;
        }

        public Builder setGCMProjectNumber(String str) {
            this.f12209e = str;
            this.f12225u = true;
            return this;
        }

        @Deprecated
        public Builder setLocationTracking(boolean z10) {
            this.f12205a.set(z10);
            this.f12221q = true;
            return this;
        }

        public Builder setLocationTrackingStrategy(LocationTrackingStrategy locationTrackingStrategy) {
            this.f12206b = locationTrackingStrategy;
            this.f12222r = true;
            return this;
        }

        public Builder setPushAccentColor(int i10) {
            this.f12218n = i10;
            this.D = true;
            return this;
        }

        public Builder setPushLargeIcon(int i10) {
            this.f12217m = i10;
            this.C = true;
            return this;
        }

        public Builder setPushSmallIcon(int i10) {
            this.f12216l = i10;
            this.B = true;
            return this;
        }

        public Builder setSessionDestroyTime(long j10) {
            this.H = j10;
            return this;
        }

        public Builder setWebEngageKey(String str) {
            this.f12208d = str;
            this.f12224t = true;
            return this;
        }

        public Builder(k kVar) {
            this.f12205a = new AtomicBoolean(false);
            this.f12206b = LocationTrackingStrategy.ACCURACY_CITY;
            this.f12207c = false;
            this.f12208d = null;
            this.f12209e = null;
            this.f12210f = "4.0.0";
            this.f12211g = ReportingStrategy.BUFFER;
            this.f12212h = false;
            this.f12213i = false;
            this.f12214j = "aws";
            this.f12215k = false;
            this.f12216l = -1;
            this.f12217m = -1;
            this.f12218n = -1;
            this.f12219o = false;
            this.f12220p = new PushChannelConfiguration.Builder().build();
            this.f12221q = false;
            this.f12222r = false;
            this.f12223s = false;
            this.f12224t = false;
            this.f12225u = false;
            this.f12226v = false;
            this.f12227w = false;
            this.f12228x = false;
            this.f12229y = false;
            this.f12230z = false;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = false;
            this.E = false;
            this.F = false;
            this.G = true;
            this.H = -1L;
            this.f12205a.set(kVar.t());
            this.f12221q = kVar.b("webengage_prefs.txt").contains("location_tracking_flag");
            this.f12206b = kVar.u();
            this.f12222r = kVar.b("webengage_prefs.txt").contains("location_tracking_strategy");
            this.f12211g = kVar.r();
            this.f12227w = kVar.b("webengage_prefs.txt").contains("event_reporting_strategy");
        }

        @Deprecated
        public Builder a(boolean z10) {
            this.f12215k = z10;
            this.A = true;
            return this;
        }

        public Builder b(String str) {
            this.f12210f = str;
            this.f12226v = true;
            return this;
        }

        public Builder b(boolean z10) {
            this.G = z10;
            return this;
        }
    }

    private WebEngageConfig(Builder builder) {
        this.H = -1L;
        this.f12179a = builder.f12205a.get();
        this.f12180b = builder.f12206b;
        this.f12181c = builder.f12207c;
        this.f12182d = builder.f12208d;
        this.f12183e = builder.f12209e;
        this.f12184f = builder.f12211g;
        this.f12185g = builder.f12210f;
        this.f12186h = builder.f12212h;
        this.f12187i = builder.f12213i;
        this.f12188j = builder.f12214j;
        this.f12189k = builder.f12215k;
        this.f12190l = builder.f12216l;
        this.f12191m = builder.f12217m;
        this.f12192n = builder.f12218n;
        this.f12193o = builder.f12219o;
        this.f12194p = builder.f12220p;
        this.f12195q = builder.f12221q;
        this.f12196r = builder.f12222r;
        this.f12197s = builder.f12223s;
        this.f12198t = builder.f12224t;
        this.f12199u = builder.f12225u;
        this.f12200v = builder.f12226v;
        this.f12201w = builder.f12227w;
        this.f12202x = builder.f12228x;
        this.f12203y = builder.f12229y;
        this.f12204z = builder.f12230z;
        this.A = builder.A;
        this.B = builder.B;
        this.C = builder.C;
        this.D = builder.D;
        this.E = builder.E;
        this.F = builder.F;
        this.G = builder.G;
        this.H = builder.H;
    }

    public boolean a() {
        return this.D;
    }

    public boolean b() {
        return this.A;
    }

    public boolean c() {
        return this.f12197s;
    }

    public boolean d() {
        return this.f12202x;
    }

    public boolean e() {
        return this.F;
    }

    public boolean f() {
        return this.f12204z;
    }

    public boolean g() {
        return this.f12203y;
    }

    public int getAccentColor() {
        return this.f12192n;
    }

    public boolean getAlternateInterfaceIdFlag() {
        return this.f12189k;
    }

    public boolean getAutoGCMRegistrationFlag() {
        return this.f12181c;
    }

    public Builder getCurrentState() {
        Builder builder = new Builder();
        if (j()) {
            builder.setLocationTracking(getLocationTrackingFlag());
        }
        if (k()) {
            builder.setLocationTrackingStrategy(getLocationTrackingStrategy());
        }
        if (c()) {
            builder.setAutoGCMRegistrationFlag(getAutoGCMRegistrationFlag());
        }
        if (o()) {
            builder.setWebEngageKey(getWebEngageKey());
        }
        if (i()) {
            builder.setGCMProjectNumber(getGcmProjectNumber());
        }
        if (p()) {
            builder.b(getWebEngageVersion());
        }
        if (n()) {
            builder.setEventReportingStrategy(getEventReportingStrategy());
        }
        if (d()) {
            builder.setDebugMode(getDebugMode());
        }
        if (g()) {
            builder.setEveryActivityIsScreen(getEveryActivityIsScreen());
        }
        if (f()) {
            builder.a(getEnvironment());
        }
        if (b()) {
            builder.a(getAlternateInterfaceIdFlag());
        }
        if (m()) {
            builder.setPushSmallIcon(getPushSmallIcon());
        }
        if (l()) {
            builder.setPushLargeIcon(getPushLargeIcon());
        }
        if (a()) {
            builder.setPushAccentColor(getAccentColor());
        }
        if (h()) {
            builder.c(getFilterCustomEvents());
        }
        if (e()) {
            builder.setDefaultPushChannelConfiguration(getDefaultPushChannelConfiguration());
        }
        builder.b(isEnableCrashTracking());
        builder.setSessionDestroyTime(this.H);
        return builder;
    }

    public boolean getDebugMode() {
        return this.f12186h;
    }

    public PushChannelConfiguration getDefaultPushChannelConfiguration() {
        return this.f12194p;
    }

    public String getEnvironment() {
        return this.f12188j;
    }

    public ReportingStrategy getEventReportingStrategy() {
        return this.f12184f;
    }

    public boolean getEveryActivityIsScreen() {
        return this.f12187i;
    }

    public boolean getFilterCustomEvents() {
        return this.f12193o;
    }

    public String getGcmProjectNumber() {
        return this.f12183e;
    }

    @Deprecated
    public boolean getLocationTrackingFlag() {
        return this.f12179a;
    }

    public LocationTrackingStrategy getLocationTrackingStrategy() {
        return this.f12180b;
    }

    public int getPushLargeIcon() {
        return this.f12191m;
    }

    public int getPushSmallIcon() {
        return this.f12190l;
    }

    public long getSessionDestroyTime() {
        return this.H;
    }

    public String getWebEngageKey() {
        return this.f12182d;
    }

    public String getWebEngageVersion() {
        return this.f12185g;
    }

    public boolean h() {
        return this.E;
    }

    public boolean i() {
        return this.f12199u;
    }

    public boolean isEnableCrashTracking() {
        return this.G;
    }

    public boolean isLocationTrackingEnabled() {
        return k() ? getLocationTrackingStrategy() != LocationTrackingStrategy.DISABLED : getLocationTrackingFlag();
    }

    public boolean isValid(Context context) {
        String str;
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (WebEngageUtils.c(getWebEngageKey())) {
            str = "WebEngage key not found";
        } else if (getAutoGCMRegistrationFlag() && WebEngageUtils.c(getGcmProjectNumber())) {
            str = "GCM project number not found";
        } else if (!"gce".equals(getEnvironment()) && !"aws".equals(getEnvironment()) && !"in".equals(getEnvironment()) && !"ir0".equals(getEnvironment()) && !"unl".equals(getEnvironment())) {
            str = "Invalid value for Environment provided";
        } else {
            if (Build.VERSION.SDK_INT < 26 || getDefaultPushChannelConfiguration().isValid(applicationContext)) {
                return true;
            }
            str = "Invalid Push channel configuration found";
        }
        Logger.e("WebEngage", str);
        return false;
    }

    public boolean j() {
        return this.f12195q;
    }

    public boolean k() {
        return this.f12196r;
    }

    public boolean l() {
        return this.C;
    }

    public boolean m() {
        return this.B;
    }

    public boolean n() {
        return this.f12201w;
    }

    public boolean o() {
        return this.f12198t;
    }

    public boolean p() {
        return this.f12200v;
    }

    public String toString() {
        return "LocationTracking: " + getLocationTrackingFlag() + "\nLocationTrackingStrategy: " + getLocationTrackingStrategy() + "\nAutoGCMRegistration: " + getAutoGCMRegistrationFlag() + "\nWebEngageKey: " + getWebEngageKey() + "\nGCMProjectNumber: " + getGcmProjectNumber() + "\nWebEngageVersion: " + getWebEngageVersion() + "\nReportingStrategy: " + getEventReportingStrategy() + "\nDebugMode: " + getDebugMode() + "\nEveryActivityIsScreen: " + getEveryActivityIsScreen() + "\nEnvironment: " + getEnvironment() + "\nAlternateInterfaceId: " + getAlternateInterfaceIdFlag() + "\nPushSmallIcon: " + getPushSmallIcon() + "\nPushLargeIcon: " + getPushLargeIcon() + "\nAccentColor: " + getAccentColor() + "\nFilterCustomEvent: " + getFilterCustomEvents() + "\nSessionDestroyTime: " + getSessionDestroyTime() + "\nDefaultPushChannelConfiguration: " + getDefaultPushChannelConfiguration();
    }
}
