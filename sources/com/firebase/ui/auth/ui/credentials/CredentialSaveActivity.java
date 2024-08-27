package com.firebase.ui.auth.ui.credentials;

import a3.a;
import am.b;
import am.d;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import b3.t;
import cm.e;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.viewmodel.smartlock.SmartLockHandler;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import el.l;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import y4.c;

/* loaded from: classes.dex */
public class CredentialSaveActivity extends e {

    /* renamed from: f, reason: collision with root package name */
    public SmartLockHandler f10910f;

    @Override // cm.c, androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        SmartLockHandler smartLockHandler = this.f10910f;
        smartLockHandler.getClass();
        if (i10 == 100) {
            if (i11 == -1) {
                smartLockHandler.h(d.c(smartLockHandler.f10965h));
            } else {
                Log.e("SmartLockViewModel", "SAVE: Canceled by user.");
                smartLockHandler.h(d.a(new FirebaseUiException(0, "Save canceled by user.")));
            }
        }
    }

    @Override // cm.e, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zl.d dVar = (zl.d) getIntent().getParcelableExtra("extra_idp_response");
        Credential credential = (Credential) getIntent().getParcelableExtra("extra_credential");
        Intrinsics.checkNotNullParameter(this, "owner");
        h1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        d1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(SmartLockHandler.class, "modelClass");
        iu.e b10 = a.b(SmartLockHandler.class, "<this>", SmartLockHandler.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            SmartLockHandler smartLockHandler = (SmartLockHandler) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            this.f10910f = smartLockHandler;
            smartLockHandler.f(y());
            SmartLockHandler smartLockHandler2 = this.f10910f;
            smartLockHandler2.f10965h = dVar;
            smartLockHandler2.f10959e.observe(this, new dm.a(this, this, dVar, 0));
            if (((d) this.f10910f.f10959e.getValue()) == null) {
                Log.d("CredentialSaveActivity", "Launching save operation.");
                SmartLockHandler smartLockHandler3 = this.f10910f;
                if (!((b) smartLockHandler3.f10961d).f750j) {
                    smartLockHandler3.h(d.c(smartLockHandler3.f10965h));
                    return;
                }
                smartLockHandler3.h(d.b());
                if (credential == null) {
                    smartLockHandler3.h(d.a(new FirebaseUiException(0, "Failed to build credential.")));
                    return;
                }
                if (smartLockHandler3.f10965h.e().equals("google.com")) {
                    String x02 = l.x0("google.com");
                    CredentialsClient a10 = hm.b.a(smartLockHandler3.e());
                    Credential a11 = hm.a.a(smartLockHandler3.f10958g.f11632f, "pass", x02);
                    if (a11 != null) {
                        a10.delete(a11);
                    } else {
                        throw new IllegalStateException("Unable to build credential");
                    }
                }
                smartLockHandler3.f10957f.save(credential).addOnCompleteListener(new t(smartLockHandler3, 4));
                return;
            }
            Log.d("CredentialSaveActivity", "Save operation in progress, doing nothing.");
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
