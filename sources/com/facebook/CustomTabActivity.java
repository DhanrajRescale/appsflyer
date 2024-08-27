package com.facebook;

import a5.b;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import h.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "ek/h", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10863b = Intrinsics.i(".action_customTabRedirect", "CustomTabActivity");

    /* renamed from: c, reason: collision with root package name */
    public static final String f10864c = Intrinsics.i(".action_destroy", "CustomTabActivity");

    /* renamed from: a, reason: collision with root package name */
    public a0 f10865a;

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 == 0) {
            Intent intent2 = new Intent(f10863b);
            intent2.putExtra(CustomTabMainActivity.f10869f, getIntent().getDataString());
            b.a(this).c(intent2);
            a0 a0Var = new a0(this, 9);
            b.a(this).b(a0Var, new IntentFilter(f10864c));
            this.f10865a = a0Var;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f10863b);
        intent.putExtra(CustomTabMainActivity.f10869f, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        a0 a0Var = this.f10865a;
        if (a0Var != null) {
            b.a(this).d(a0Var);
        }
        super.onDestroy();
    }
}
