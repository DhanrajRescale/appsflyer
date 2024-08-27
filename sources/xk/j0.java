package xk;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ek.h f40404d = new ek.h(18, 0);

    /* renamed from: e, reason: collision with root package name */
    public static volatile j0 f40405e;

    /* renamed from: a, reason: collision with root package name */
    public final a5.b f40406a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f40407b;

    /* renamed from: c, reason: collision with root package name */
    public h0 f40408c;

    public j0(a5.b localBroadcastManager, i0 profileCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(profileCache, "profileCache");
        this.f40406a = localBroadcastManager;
        this.f40407b = profileCache;
    }

    public final void a(h0 profile, boolean z10) {
        h0 h0Var = this.f40408c;
        this.f40408c = profile;
        if (z10) {
            i0 i0Var = this.f40407b;
            if (profile != null) {
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(profile, "profile");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.f40390a);
                    jSONObject.put("first_name", profile.f40391b);
                    jSONObject.put("middle_name", profile.f40392c);
                    jSONObject.put("last_name", profile.f40393d);
                    jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, profile.f40394e);
                    Uri uri = profile.f40395f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.f40396g;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    i0Var.f40402a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                i0Var.f40402a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!nl.n0.a(h0Var, profile)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", h0Var);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
            this.f40406a.c(intent);
        }
    }
}
