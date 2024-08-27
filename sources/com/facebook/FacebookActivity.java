package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.fragment.app.j0;
import com.assetgro.stockgro.prod.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import nl.h0;
import nl.n;
import nl.n0;
import sl.a;
import wl.w;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/j0;", "<init>", "()V", "androidx/work/u", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookActivity extends j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10875b = FacebookActivity.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public g0 f10876a;

    @Override // androidx.fragment.app.j0, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (Intrinsics.a(null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        g0 g0Var = this.f10876a;
        if (g0Var != null) {
            g0Var.onConfigurationChanged(newConfig);
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FacebookException facebookException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!FacebookSdk.isInitialized()) {
            n0.F(f10875b, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            FacebookSdk.sdkInitialize(applicationContext);
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (Intrinsics.a("PassThrough", intent.getAction())) {
            Intent requestIntent = getIntent();
            h0 h0Var = h0.f28857a;
            Intrinsics.checkNotNullExpressionValue(requestIntent, "requestIntent");
            Bundle h10 = h0.h(requestIntent);
            if (!a.b(h0.class) && h10 != null) {
                try {
                    String string = h10.getString("error_type");
                    if (string == null) {
                        string = h10.getString("com.facebook.platform.status.ERROR_TYPE");
                    }
                    String string2 = h10.getString("error_description");
                    if (string2 == null) {
                        string2 = h10.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                    }
                    if (string != null && s.j(string, "UserCanceled", true)) {
                        facebookException = new FacebookException(string2);
                    } else {
                        facebookException = new FacebookException(string2);
                    }
                } catch (Throwable th2) {
                    a.a(h0.class, th2);
                }
                h0 h0Var2 = h0.f28857a;
                Intent intent2 = getIntent();
                Intrinsics.checkNotNullExpressionValue(intent2, "intent");
                setResult(0, h0.e(intent2, null, facebookException));
                finish();
                return;
            }
            facebookException = null;
            h0 h0Var22 = h0.f28857a;
            Intent intent22 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent22, "intent");
            setResult(0, h0.e(intent22, null, facebookException));
            finish();
            return;
        }
        Intent intent3 = getIntent();
        d1 supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        g0 C = supportFragmentManager.C("SingleFragment");
        g0 g0Var = C;
        if (C == null) {
            if (Intrinsics.a("FacebookDialogFragment", intent3.getAction())) {
                n nVar = new n();
                nVar.setRetainInstance(true);
                nVar.show(supportFragmentManager, "SingleFragment");
                g0Var = nVar;
            } else {
                w wVar = new w();
                wVar.setRetainInstance(true);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(R.id.com_facebook_fragment_container, wVar, "SingleFragment", 1);
                aVar.h(false);
                g0Var = wVar;
            }
        }
        this.f10876a = g0Var;
    }
}
