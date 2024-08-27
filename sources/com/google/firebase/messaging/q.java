package com.google.firebase.messaging;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f11772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11773b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11774c;

    public q(ek.u uVar) {
        this.f11772a = uVar.y("gcm.n.title");
        uVar.u("gcm.n.title");
        Object[] t10 = uVar.t("gcm.n.title");
        if (t10 != null) {
            String[] strArr = new String[t10.length];
            for (int i10 = 0; i10 < t10.length; i10++) {
                strArr[i10] = String.valueOf(t10[i10]);
            }
        }
        this.f11773b = uVar.y("gcm.n.body");
        uVar.u("gcm.n.body");
        Object[] t11 = uVar.t("gcm.n.body");
        if (t11 != null) {
            String[] strArr2 = new String[t11.length];
            for (int i11 = 0; i11 < t11.length; i11++) {
                strArr2[i11] = String.valueOf(t11[i11]);
            }
        }
        uVar.y("gcm.n.icon");
        if (TextUtils.isEmpty(uVar.y("gcm.n.sound2"))) {
            uVar.y("gcm.n.sound");
        }
        uVar.y("gcm.n.tag");
        uVar.y("gcm.n.color");
        uVar.y("gcm.n.click_action");
        uVar.y("gcm.n.android_channel_id");
        String y10 = uVar.y("gcm.n.link_android");
        y10 = TextUtils.isEmpty(y10) ? uVar.y("gcm.n.link") : y10;
        if (!TextUtils.isEmpty(y10)) {
            Uri.parse(y10);
        }
        this.f11774c = uVar.y("gcm.n.image");
        uVar.y("gcm.n.ticker");
        uVar.q("gcm.n.notification_priority");
        uVar.q("gcm.n.visibility");
        uVar.q("gcm.n.notification_count");
        uVar.n("gcm.n.sticky");
        uVar.n("gcm.n.local_only");
        uVar.n("gcm.n.default_sound");
        uVar.n("gcm.n.default_vibrate_timings");
        uVar.n("gcm.n.default_light_settings");
        uVar.v();
        uVar.s();
        uVar.z();
    }
}
