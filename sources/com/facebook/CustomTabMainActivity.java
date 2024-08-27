package com.facebook;

import a5.b;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import h.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.h0;
import nl.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "ek/e", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static final String f10866c = Intrinsics.i(".extra_action", "CustomTabMainActivity");

    /* renamed from: d, reason: collision with root package name */
    public static final String f10867d = Intrinsics.i(".extra_params", "CustomTabMainActivity");

    /* renamed from: e, reason: collision with root package name */
    public static final String f10868e = Intrinsics.i(".extra_chromePackage", "CustomTabMainActivity");

    /* renamed from: f, reason: collision with root package name */
    public static final String f10869f = Intrinsics.i(".extra_url", "CustomTabMainActivity");

    /* renamed from: g, reason: collision with root package name */
    public static final String f10870g = Intrinsics.i(".extra_targetApp", "CustomTabMainActivity");

    /* renamed from: h, reason: collision with root package name */
    public static final String f10871h = Intrinsics.i(".action_refresh", "CustomTabMainActivity");

    /* renamed from: i, reason: collision with root package name */
    public static final String f10872i = Intrinsics.i(".no_activity_exception", "CustomTabMainActivity");

    /* renamed from: a, reason: collision with root package name */
    public boolean f10873a = true;

    /* renamed from: b, reason: collision with root package name */
    public a0 f10874b;

    public final void a(int i10, Intent intent) {
        Bundle bundle;
        a0 a0Var = this.f10874b;
        if (a0Var != null) {
            b.a(this).d(a0Var);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f10869f);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                bundle = n0.M(parse.getQuery());
                bundle.putAll(n0.M(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            h0 h0Var = h0.f28857a;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Intent e10 = h0.e(intent2, bundle, null);
            if (e10 != null) {
                intent = e10;
            }
            setResult(i10, intent);
        } else {
            h0 h0Var2 = h0.f28857a;
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            setResult(i10, h0.e(intent3, null, null));
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.a(f10871h, intent.getAction())) {
            b.a(this).c(new Intent(CustomTabActivity.f10864c));
            a(-1, intent);
        } else if (Intrinsics.a(CustomTabActivity.f10863b, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f10873a) {
            a(0, null);
        }
        this.f10873a = true;
    }
}
