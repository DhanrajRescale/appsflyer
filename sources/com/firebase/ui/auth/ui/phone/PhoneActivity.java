package com.firebase.ui.auth.ui.phone;

import android.os.Bundle;
import androidx.fragment.app.b1;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import cm.a;
import cm.b;
import com.assetgro.stockgro.prod.R;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.viewmodel.phone.PhoneProviderResponseHandler;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuthException;
import da.e;
import gm.f;
import iu.a0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import y4.c;
import zl.d;

/* loaded from: classes.dex */
public class PhoneActivity extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f10951d = 0;

    /* renamed from: c, reason: collision with root package name */
    public PhoneNumberVerificationHandler f10952c;

    public static void B(PhoneActivity phoneActivity, Exception exc) {
        TextInputLayout textInputLayout;
        gm.a aVar = (gm.a) phoneActivity.getSupportFragmentManager().C("VerifyPhoneFragment");
        f fVar = (f) phoneActivity.getSupportFragmentManager().C("SubmitConfirmationCodeFragment");
        if (aVar != null && aVar.getView() != null) {
            textInputLayout = (TextInputLayout) aVar.getView().findViewById(R.id.phone_layout);
        } else if (fVar != null && fVar.getView() != null) {
            textInputLayout = (TextInputLayout) fVar.getView().findViewById(R.id.confirmation_code_layout);
        } else {
            textInputLayout = null;
        }
        if (textInputLayout != null) {
            if (exc instanceof FirebaseAuthAnonymousUpgradeException) {
                phoneActivity.w(5, ((FirebaseAuthAnonymousUpgradeException) exc).f10891a.h());
                return;
            }
            int i10 = 37;
            if (exc instanceof FirebaseAuthException) {
                try {
                    i10 = e.F(((FirebaseAuthException) exc).f11651a);
                } catch (IllegalArgumentException unused) {
                }
                if (i10 == 11) {
                    phoneActivity.w(0, d.a(new FirebaseUiException(12)).h());
                    return;
                } else {
                    textInputLayout.setError(phoneActivity.D(i10));
                    return;
                }
            }
            if (exc != null) {
                textInputLayout.setError(phoneActivity.D(37));
            } else {
                textInputLayout.setError(null);
            }
        }
    }

    public final b C() {
        b bVar = (gm.a) getSupportFragmentManager().C("VerifyPhoneFragment");
        if (bVar == null || bVar.getView() == null) {
            bVar = (f) getSupportFragmentManager().C("SubmitConfirmationCodeFragment");
        }
        if (bVar != null && bVar.getView() != null) {
            return bVar;
        }
        throw new IllegalStateException("No fragments added");
    }

    public final String D(int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 != 15) {
                if (i11 != 25) {
                    if (i11 != 27) {
                        if (i11 != 31) {
                            if (i11 != 32) {
                                return e.a(i10);
                            }
                            return getString(R.string.fui_error_quota_exceeded);
                        }
                        return getString(R.string.fui_error_session_expired);
                    }
                    return getString(R.string.fui_incorrect_code_dialog_body);
                }
                return getString(R.string.fui_invalid_phone_number);
            }
            return getString(R.string.fui_error_too_many_attempts);
        }
        throw null;
    }

    @Override // cm.g
    public final void b() {
        C().b();
    }

    @Override // cm.g
    public final void f(int i10) {
        C().f(i10);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        ArrayList arrayList = getSupportFragmentManager().f1647d;
        if (arrayList != null && arrayList.size() > 0) {
            d1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            supportFragmentManager.v(new b1(supportFragmentManager, null, -1, 0), false);
            return;
        }
        super.onBackPressed();
    }

    @Override // cm.a, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_activity_register_phone);
        Intrinsics.checkNotNullParameter(this, "owner");
        h1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        androidx.lifecycle.d1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(PhoneProviderResponseHandler.class, "modelClass");
        Intrinsics.checkNotNullParameter(PhoneProviderResponseHandler.class, "<this>");
        iu.e modelClass = a0.a(PhoneProviderResponseHandler.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String s7 = i0.s(modelClass);
        if (s7 != null) {
            PhoneProviderResponseHandler phoneProviderResponseHandler = (PhoneProviderResponseHandler) cVar.G(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            phoneProviderResponseHandler.f(y());
            phoneProviderResponseHandler.f10959e.observe(this, new gm.b(this, this, R.string.fui_progress_dialog_signing_in, phoneProviderResponseHandler, 0));
            Intrinsics.checkNotNullParameter(this, "owner");
            h1 store2 = getViewModelStore();
            Intrinsics.checkNotNullParameter(this, "owner");
            androidx.lifecycle.d1 factory2 = getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, "owner");
            c defaultCreationExtras2 = getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(store2, "store");
            Intrinsics.checkNotNullParameter(factory2, "factory");
            Intrinsics.checkNotNullParameter(defaultCreationExtras2, "defaultCreationExtras");
            h.c cVar2 = new h.c(store2, factory2, defaultCreationExtras2);
            Intrinsics.checkNotNullParameter(PhoneNumberVerificationHandler.class, "modelClass");
            Intrinsics.checkNotNullParameter(PhoneNumberVerificationHandler.class, "<this>");
            iu.e modelClass2 = a0.a(PhoneNumberVerificationHandler.class);
            Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
            Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
            String s10 = i0.s(modelClass2);
            if (s10 != null) {
                PhoneNumberVerificationHandler phoneNumberVerificationHandler = (PhoneNumberVerificationHandler) cVar2.G(modelClass2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s10));
                this.f10952c = phoneNumberVerificationHandler;
                phoneNumberVerificationHandler.f(y());
                PhoneNumberVerificationHandler phoneNumberVerificationHandler2 = this.f10952c;
                if (phoneNumberVerificationHandler2.f10953h == null && bundle != null) {
                    phoneNumberVerificationHandler2.f10953h = bundle.getString("verification_id");
                }
                this.f10952c.f10959e.observe(this, new gm.b(this, this, R.string.fui_verifying, phoneProviderResponseHandler, 1));
                if (bundle != null) {
                    return;
                }
                Bundle bundle2 = getIntent().getExtras().getBundle("extra_params");
                gm.a aVar = new gm.a();
                Bundle bundle3 = new Bundle();
                bundle3.putBundle("extra_params", bundle2);
                aVar.setArguments(bundle3);
                d1 supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                aVar2.f(R.id.fragment_phone, aVar, "VerifyPhoneFragment");
                aVar2.d();
                aVar2.h(false);
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // androidx.activity.m, q3.o, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("verification_id", this.f10952c.f10953h);
    }
}
