package aq;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import h.r0;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ls.y0;

/* loaded from: classes2.dex */
public final class j extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2733a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2734b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2735c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2736d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2737e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2738f;

    public j(r0 r0Var, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, zp.h hVar) {
        this.f2733a = 0;
        this.f2738f = r0Var;
        this.f2734b = new WeakReference(activity);
        this.f2735c = taskCompletionSource;
        this.f2736d = firebaseAuth;
        this.f2737e = hVar;
    }

    public static String a(Matcher matcher) {
        String group;
        if (matcher.find() && (group = matcher.group(2)) != null) {
            try {
                return URLDecoder.decode(group, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                el.l.M("MixpanelAPI.InstRfrRcvr", "Could not decode a parameter into UTF-8");
                return null;
            }
        }
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String string;
        int i10 = this.f2733a;
        Object obj = this.f2737e;
        Object obj2 = this.f2736d;
        Object obj3 = this.f2735c;
        Object obj4 = this.f2734b;
        switch (i10) {
            case 0:
                if (((Activity) ((WeakReference) obj4).get()) == null) {
                    Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
                    ((TaskCompletionSource) obj3).setException(zzaag.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
                    r0.i(context);
                    return;
                }
                if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
                    String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
                    if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
                        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                        ((FirebaseAuth) obj2).c(r0.j(intent)).addOnSuccessListener(new i(taskCompletionSource, context, 1)).addOnFailureListener(new i(taskCompletionSource, context, 0));
                        return;
                    }
                    if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
                        TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj3;
                        ((zp.h) obj).S(r0.j(intent)).addOnSuccessListener(new i(taskCompletionSource2, context, 3)).addOnFailureListener(new i(taskCompletionSource2, context, 2));
                        return;
                    }
                    if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                        TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) obj3;
                        zp.h hVar = (zp.h) obj;
                        zp.d0 j10 = r0.j(intent);
                        hVar.getClass();
                        Preconditions.checkNotNull(j10);
                        FirebaseAuth.getInstance(pp.g.e(((g0) hVar).f2718c)).k(hVar, j10).addOnSuccessListener(new i(taskCompletionSource3, context, 5)).addOnFailureListener(new i(taskCompletionSource3, context, 4));
                        return;
                    }
                    ((TaskCompletionSource) obj3).setException(zzaag.zza(lp.g0.p("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
                    return;
                }
                HashMap hashMap = u.f2757a;
                Preconditions.checkNotNull(intent);
                if (intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                    Preconditions.checkNotNull(intent);
                    Preconditions.checkNotNull(intent);
                    Preconditions.checkArgument(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
                    ((TaskCompletionSource) obj3).setException(zzaag.zza((Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR)));
                    r0.i(context);
                    return;
                }
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    ((TaskCompletionSource) obj3).setException(zzaag.zza(lp.g0.p("WEB_CONTEXT_CANCELED")));
                    r0.i(context);
                    return;
                }
                return;
            default:
                Bundle extras = intent.getExtras();
                if (extras != null && (string = extras.getString("referrer")) != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("referrer", string);
                    String a10 = a(((Pattern) obj4).matcher(string));
                    if (a10 != null) {
                        hashMap2.put("utm_source", a10);
                    }
                    String a11 = a(((Pattern) obj3).matcher(string));
                    if (a11 != null) {
                        hashMap2.put("utm_medium", a11);
                    }
                    String a12 = a(((Pattern) obj2).matcher(string));
                    if (a12 != null) {
                        hashMap2.put("utm_campaign", a12);
                    }
                    String a13 = a(((Pattern) obj).matcher(string));
                    if (a13 != null) {
                        hashMap2.put("utm_content", a13);
                    }
                    String a14 = a(((Pattern) this.f2738f).matcher(string));
                    if (a14 != null) {
                        hashMap2.put("utm_term", a14);
                    }
                    y0.r(context, hashMap2);
                    return;
                }
                return;
        }
    }

    public j() {
        this.f2733a = 1;
        this.f2734b = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");
        this.f2735c = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");
        this.f2736d = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");
        this.f2737e = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");
        this.f2738f = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");
    }
}
