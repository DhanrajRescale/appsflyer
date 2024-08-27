package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.WebEngageUtils;

/* loaded from: classes2.dex */
public class PushChannelConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private String f12127a;

    /* renamed from: b, reason: collision with root package name */
    private String f12128b;

    /* renamed from: c, reason: collision with root package name */
    private int f12129c;

    /* renamed from: d, reason: collision with root package name */
    private String f12130d;

    /* renamed from: e, reason: collision with root package name */
    private int f12131e;

    /* renamed from: f, reason: collision with root package name */
    private int f12132f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12133g;

    /* renamed from: h, reason: collision with root package name */
    private String f12134h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12135i;

    /* renamed from: j, reason: collision with root package name */
    private String f12136j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f12137k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12138l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12139m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12140n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12141o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f12142p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f12143q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12144r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12145s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12146t;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f12147a = "we_wk_push_channel";

        /* renamed from: b, reason: collision with root package name */
        private String f12148b = "Marketing";

        /* renamed from: c, reason: collision with root package name */
        private String f12149c = null;

        /* renamed from: d, reason: collision with root package name */
        private int f12150d = 3;

        /* renamed from: e, reason: collision with root package name */
        private String f12151e = null;

        /* renamed from: f, reason: collision with root package name */
        private int f12152f = -1;

        /* renamed from: g, reason: collision with root package name */
        private int f12153g = 1;

        /* renamed from: h, reason: collision with root package name */
        private boolean f12154h = true;

        /* renamed from: i, reason: collision with root package name */
        private String f12155i = null;

        /* renamed from: j, reason: collision with root package name */
        private boolean f12156j = true;

        /* renamed from: k, reason: collision with root package name */
        private boolean f12157k = false;

        /* renamed from: l, reason: collision with root package name */
        private boolean f12158l = false;

        /* renamed from: m, reason: collision with root package name */
        private boolean f12159m = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f12160n = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f12161o = false;

        /* renamed from: p, reason: collision with root package name */
        private boolean f12162p = false;

        /* renamed from: q, reason: collision with root package name */
        private boolean f12163q = false;

        /* renamed from: r, reason: collision with root package name */
        private boolean f12164r = false;

        /* renamed from: s, reason: collision with root package name */
        private boolean f12165s = false;

        /* renamed from: t, reason: collision with root package name */
        private boolean f12166t = false;

        public PushChannelConfiguration build() {
            return new PushChannelConfiguration(this);
        }

        public Builder setNotificationChannelDescription(String str) {
            this.f12149c = str;
            this.f12159m = true;
            return this;
        }

        public Builder setNotificationChannelGroup(String str) {
            this.f12151e = str;
            this.f12161o = true;
            return this;
        }

        public Builder setNotificationChannelImportance(int i10) {
            this.f12150d = i10;
            this.f12160n = true;
            return this;
        }

        public Builder setNotificationChannelLightColor(int i10) {
            this.f12152f = i10;
            this.f12162p = true;
            return this;
        }

        public Builder setNotificationChannelLockScreenVisibility(int i10) {
            this.f12153g = i10;
            this.f12163q = true;
            return this;
        }

        public Builder setNotificationChannelName(String str) {
            this.f12148b = str;
            this.f12158l = true;
            return this;
        }

        public Builder setNotificationChannelShowBadge(boolean z10) {
            this.f12154h = z10;
            this.f12164r = true;
            return this;
        }

        public Builder setNotificationChannelSound(String str) {
            this.f12155i = str;
            this.f12165s = true;
            return this;
        }

        public Builder setNotificationChannelVibration(boolean z10) {
            this.f12156j = z10;
            this.f12166t = true;
            return this;
        }
    }

    private PushChannelConfiguration(Builder builder) {
        this.f12127a = builder.f12148b;
        this.f12128b = builder.f12149c;
        this.f12129c = builder.f12150d;
        this.f12130d = builder.f12151e;
        this.f12131e = builder.f12152f;
        this.f12132f = builder.f12153g;
        this.f12133g = builder.f12154h;
        this.f12134h = builder.f12155i;
        this.f12135i = builder.f12156j;
        this.f12136j = builder.f12147a;
        this.f12137k = builder.f12157k;
        this.f12138l = builder.f12158l;
        this.f12139m = builder.f12159m;
        this.f12140n = builder.f12160n;
        this.f12141o = builder.f12161o;
        this.f12142p = builder.f12162p;
        this.f12143q = builder.f12163q;
        this.f12144r = builder.f12164r;
        this.f12145s = builder.f12165s;
        this.f12146t = builder.f12166t;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PushChannelConfiguration) {
            return ((PushChannelConfiguration) obj).getNotificationChannelId().equals(getNotificationChannelId());
        }
        return false;
    }

    public String getNotificationChannelDescription() {
        return this.f12128b;
    }

    public String getNotificationChannelGroup() {
        return this.f12130d;
    }

    public String getNotificationChannelId() {
        return this.f12136j;
    }

    public int getNotificationChannelImportance() {
        return this.f12129c;
    }

    public int getNotificationChannelLightColor() {
        return this.f12131e;
    }

    public int getNotificationChannelLockScreenVisibility() {
        return this.f12132f;
    }

    public String getNotificationChannelName() {
        return this.f12127a;
    }

    public String getNotificationChannelSound() {
        return this.f12134h;
    }

    public int hashCode() {
        return this.f12136j.hashCode();
    }

    public boolean isNotificationChannelDescriptionSet() {
        return this.f12139m;
    }

    public boolean isNotificationChannelGroupSet() {
        return this.f12141o;
    }

    public boolean isNotificationChannelIdSet() {
        return this.f12137k;
    }

    public boolean isNotificationChannelImportanceSet() {
        return this.f12140n;
    }

    public boolean isNotificationChannelNameSet() {
        return this.f12138l;
    }

    public boolean isNotificationChannelShowBadge() {
        return this.f12133g;
    }

    public boolean isNotificationChannelShowBadgeSet() {
        return this.f12144r;
    }

    public boolean isNotificationChannelSoundSet() {
        return this.f12145s;
    }

    public boolean isNotificationChannelVibration() {
        return this.f12135i;
    }

    public boolean isNotificationChannelVibrationSet() {
        return this.f12146t;
    }

    public boolean isNotificationLightColorSet() {
        return this.f12142p;
    }

    public boolean isNotificationLockScreenVisibilitySet() {
        return this.f12143q;
    }

    public boolean isValid(Context context) {
        String str;
        if (context == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (WebEngageUtils.c(getNotificationChannelId())) {
            str = " Notification channel cannot be null or empty";
        } else if (WebEngageUtils.c(getNotificationChannelName())) {
            str = " Notification channel name cannot be null or empty";
        } else if (getNotificationChannelImportance() < 0 || getNotificationChannelImportance() > 5) {
            str = " Notification channel importance should be >=0 && <= 5";
        } else {
            if (getNotificationChannelGroup() == null || z.a(getNotificationChannelGroup(), applicationContext)) {
                return true;
            }
            str = " Notification channel group with id: " + getNotificationChannelGroup() + " is not yet registered";
        }
        Logger.e("WebEngage", str);
        return false;
    }

    public String toString() {
        return "ChannelId: " + getNotificationChannelId() + "\nChannelName: " + getNotificationChannelName() + "\nChannelImportance: " + getNotificationChannelImportance() + "\nChannelDescription: " + getNotificationChannelDescription() + "\nChannelGroup: " + getNotificationChannelGroup() + "\nChannelColor: " + getNotificationChannelLightColor() + "\nLockScreenVisibility: " + getNotificationChannelLockScreenVisibility() + "\nShowBadge: " + isNotificationChannelShowBadge() + "\nSound: " + getNotificationChannelSound() + "\nVibration: " + isNotificationChannelVibration();
    }
}
