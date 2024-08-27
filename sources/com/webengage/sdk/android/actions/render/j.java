package com.webengage.sdk.android.actions.render;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.webengage.sdk.android.NotificationClickHandlerService;
import com.webengage.sdk.android.WETransparentActivity;
import in.juspay.hyper.constants.LogCategory;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12353a;

    /* renamed from: b, reason: collision with root package name */
    private final PushNotificationData f12354b;

    /* renamed from: c, reason: collision with root package name */
    private final CallToAction f12355c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12356d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12357e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f12358f;

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f12359g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f12360h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f12361i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f12362j;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f12363a;

        /* renamed from: b, reason: collision with root package name */
        private final PushNotificationData f12364b;

        /* renamed from: c, reason: collision with root package name */
        private final CallToAction f12365c;

        /* renamed from: d, reason: collision with root package name */
        private String f12366d;

        /* renamed from: e, reason: collision with root package name */
        private String f12367e;

        /* renamed from: f, reason: collision with root package name */
        private Bundle f12368f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f12369g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f12370h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f12371i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f12372j;

        public b(Context context, PushNotificationData pushNotificationData, CallToAction callToAction) {
            this.f12366d = null;
            this.f12367e = null;
            this.f12368f = null;
            this.f12369g = null;
            this.f12370h = true;
            this.f12371i = true;
            this.f12372j = false;
            this.f12363a = context;
            this.f12364b = pushNotificationData;
            this.f12365c = callToAction;
        }

        public PendingIntent a() {
            return new j(this).a();
        }

        public b(Context context, PushNotificationData pushNotificationData, String str) {
            this.f12367e = null;
            this.f12368f = null;
            this.f12369g = null;
            this.f12370h = true;
            this.f12371i = true;
            this.f12372j = false;
            this.f12363a = context;
            this.f12364b = pushNotificationData;
            this.f12365c = null;
            this.f12366d = str;
        }

        public b b(Bundle bundle) {
            this.f12369g = bundle;
            return this;
        }

        public b c(boolean z10) {
            this.f12372j = z10;
            return this;
        }

        public b a(Bundle bundle) {
            this.f12368f = bundle;
            return this;
        }

        public b b(String str) {
            this.f12366d = str;
            return this;
        }

        public b a(String str) {
            this.f12367e = str;
            return this;
        }

        public b b(boolean z10) {
            this.f12370h = z10;
            return this;
        }

        public b a(boolean z10) {
            this.f12371i = z10;
            return this;
        }
    }

    private j(b bVar) {
        this.f12353a = bVar.f12363a;
        this.f12354b = bVar.f12364b;
        this.f12355c = bVar.f12365c;
        this.f12356d = bVar.f12366d;
        this.f12357e = bVar.f12367e;
        this.f12358f = bVar.f12368f;
        this.f12359g = bVar.f12369g;
        this.f12360h = bVar.f12370h;
        this.f12361i = bVar.f12371i;
        this.f12362j = bVar.f12372j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PendingIntent a() {
        boolean z10;
        Intent intent;
        String str;
        Bundle bundle = new Bundle();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            Intent intent2 = new Intent(this.f12353a.getApplicationContext(), (Class<?>) NotificationClickHandlerService.class);
            if (this.f12362j) {
                bundle.putString(LogCategory.ACTION, "push_rerender");
            } else {
                bundle.putString(LogCategory.ACTION, "WebEngageDeeplink");
            }
            z10 = false;
            intent = intent2;
        } else if (this.f12362j) {
            intent = new Intent(this.f12353a.getApplicationContext(), (Class<?>) NotificationClickHandlerService.class);
            bundle.putString(LogCategory.ACTION, "push_rerender");
            z10 = false;
        } else {
            Intent intent3 = new Intent(this.f12353a.getApplicationContext(), (Class<?>) WETransparentActivity.class);
            bundle.putString(LogCategory.ACTION, "WebEngageDeeplink");
            intent = intent3;
            z10 = true;
        }
        intent.setAction("com.webengage.sdk.android.intent.ACTION");
        String str2 = this.f12357e;
        if (str2 != null) {
            bundle.putString("event", str2);
        }
        bundle.putBoolean("dismiss_flag", this.f12360h);
        bundle.putBoolean("launch_app_if_invalid", this.f12361i);
        bundle.putString("id", this.f12354b.getVariationId());
        bundle.putString("experiment_id", this.f12354b.getExperimentId());
        bundle.putInt("hashed_notification_id", this.f12354b.getVariationId().hashCode());
        if (this.f12354b.getCustomData() != null) {
            bundle.putBundle("custom_data", this.f12354b.getCustomData());
        }
        Bundle bundle2 = this.f12358f;
        if (bundle2 != null) {
            bundle.putBundle("event_data", bundle2);
        }
        Bundle bundle3 = this.f12359g;
        if (bundle3 != null) {
            bundle.putBundle("extra_data", bundle3);
        }
        CallToAction callToAction = this.f12355c;
        if (callToAction != null) {
            if (callToAction.isPrimeAction()) {
                bundle.putBoolean("notification_main_intent", true);
            } else {
                bundle.putBoolean("notification_main_intent", false);
            }
            if (this.f12355c.getId() != null) {
                bundle.putString("call_to_action", this.f12355c.getId());
            }
            bundle.putString("deeplink_uri", this.f12355c.getFullActionUri());
        }
        if (this.f12356d == null) {
            CallToAction callToAction2 = this.f12355c;
            str = (callToAction2 == null || callToAction2.isPrimeAction() || this.f12355c.getId() == null) ? this.f12354b.getVariationId() : this.f12355c.getId();
        } else {
            str = this.f12356d + this.f12354b.getVariationId();
        }
        int hashCode = str.hashCode();
        intent.putExtras(bundle);
        if (i10 < 31) {
            return PendingIntent.getService(this.f12353a.getApplicationContext(), hashCode, intent, 134217728);
        }
        Context applicationContext = this.f12353a.getApplicationContext();
        return z10 ? PendingIntent.getActivity(applicationContext, hashCode, intent, 201326592) : PendingIntent.getService(applicationContext, hashCode, intent, 201326592);
    }
}
