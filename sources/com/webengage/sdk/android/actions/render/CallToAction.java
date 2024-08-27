package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.net.Uri;
import java.net.URLEncoder;
import java.util.List;

/* loaded from: classes2.dex */
public class CallToAction {
    private String action;

    /* renamed from: id, reason: collision with root package name */
    private String f12318id;
    private boolean isNative;
    private boolean isPrime;
    private String text;
    private TYPE type;

    /* loaded from: classes2.dex */
    public enum TYPE {
        LAUNCH_ACTIVITY("start_activity"),
        LINK("open_url_in_browser");


        /* renamed from: s, reason: collision with root package name */
        private String f12319s;

        TYPE(String str) {
            this.f12319s = str;
        }

        public static TYPE valueFromString(String str) {
            try {
                TYPE type = LAUNCH_ACTIVITY;
                if (type.toString().equals(str)) {
                    return type;
                }
                TYPE type2 = LINK;
                if (type2.toString().equals(str)) {
                    return type2;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f12319s;
        }
    }

    public CallToAction(String str, String str2, String str3, boolean z10, boolean z11) {
        this.type = null;
        this.f12318id = str;
        this.text = str2;
        this.action = str3;
        this.isPrime = z10;
        this.isNative = z11;
        if (str3 != null) {
            List<String> pathSegments = Uri.parse(str3).getPathSegments();
            if (pathSegments.size() > 0) {
                this.type = TYPE.valueFromString(pathSegments.get(0));
            }
        }
    }

    public String getAction() {
        String str = this.action;
        if (str == null) {
            return null;
        }
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() > 1) {
            return pathSegments.get(1);
        }
        return null;
    }

    public String getFullActionUri() {
        return this.action;
    }

    public String getId() {
        return this.f12318id;
    }

    public String getText() {
        return this.text;
    }

    public TYPE getType() {
        return this.type;
    }

    public boolean isNative() {
        return this.isNative;
    }

    public boolean isPrimeAction() {
        return this.isPrime;
    }

    public void setAction(String str, TYPE type, Context context) {
        try {
            this.action = "webengage://" + context.getPackageName() + "/" + type.toString() + "/" + URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            this.action = "webengage://" + context.getPackageName() + "/" + TYPE.LAUNCH_ACTIVITY.toString() + "/" + context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName();
        }
        this.type = type;
    }

    public void setText(String str) {
        this.text = str;
    }
}
