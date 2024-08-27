package com.firebase.ui.auth.ui.email;

import a3.a;
import am.b;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.g;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import cm.c;
import cm.e;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.viewmodel.email.EmailLinkSignInHandler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import q0.g0;
import qu.i0;
import zl.d;
import zp.f;
import zp.h;

/* loaded from: classes.dex */
public class EmailLinkCatcherActivity extends e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f10912g = 0;

    /* renamed from: f, reason: collision with root package name */
    public EmailLinkSignInHandler f10913f;

    public static void A(EmailLinkCatcherActivity emailLinkCatcherActivity, int i10) {
        emailLinkCatcherActivity.getClass();
        if (i10 != 116 && i10 != 115) {
            throw new IllegalStateException("Invalid flow param. It must be either RequestCodes.EMAIL_LINK_CROSS_DEVICE_LINKING_FLOW or RequestCodes.EMAIL_LINK_PROMPT_FOR_EMAIL_FLOW");
        }
        emailLinkCatcherActivity.startActivityForResult(c.v(emailLinkCatcherActivity.getApplicationContext(), EmailLinkErrorRecoveryActivity.class, emailLinkCatcherActivity.y()).putExtra("com.firebase.ui.auth.ui.email.recoveryTypeKey", i10), i10);
    }

    @Override // cm.c, androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 115 || i10 == 116) {
            d b10 = d.b(intent);
            if (i11 == -1) {
                w(-1, b10.h());
            } else {
                w(0, null);
            }
        }
    }

    @Override // cm.e, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public final void onCreate(Bundle bundle) {
        h hVar;
        h8.h hVar2;
        super.onCreate(bundle);
        Intrinsics.checkNotNullParameter(this, "owner");
        h1 store = getViewModelStore();
        Intrinsics.checkNotNullParameter(this, "owner");
        d1 factory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, "owner");
        y4.c defaultCreationExtras = getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(EmailLinkSignInHandler.class, "modelClass");
        iu.e b10 = a.b(EmailLinkSignInHandler.class, "<this>", EmailLinkSignInHandler.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            EmailLinkSignInHandler emailLinkSignInHandler = (EmailLinkSignInHandler) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            this.f10913f = emailLinkSignInHandler;
            emailLinkSignInHandler.f(y());
            this.f10913f.f10959e.observe(this, new zl.e(this, this, 2));
            if (y().f748h != null) {
                EmailLinkSignInHandler emailLinkSignInHandler2 = this.f10913f;
                emailLinkSignInHandler2.h(am.d.b());
                String str = ((b) emailLinkSignInHandler2.f10961d).f748h;
                emailLinkSignInHandler2.f10958g.getClass();
                if (!f.S(str)) {
                    emailLinkSignInHandler2.h(am.d.a(new FirebaseUiException(7)));
                    return;
                }
                im.b bVar = im.b.f20115c;
                Application e10 = emailLinkSignInHandler2.e();
                bVar.getClass();
                Preconditions.checkNotNull(e10);
                boolean z10 = false;
                SharedPreferences sharedPreferences = e10.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0);
                h8.h hVar3 = null;
                String string = sharedPreferences.getString("com.firebase.ui.auth.data.client.email", null);
                String string2 = sharedPreferences.getString("com.firebase.ui.auth.data.client.sid", null);
                if (string != null && string2 != null) {
                    String string3 = sharedPreferences.getString("com.firebase.ui.auth.data.client.auid", null);
                    String string4 = sharedPreferences.getString("com.firebase.ui.auth.data.client.provider", null);
                    String string5 = sharedPreferences.getString("com.firebase.ui.auth.data.client.idpToken", null);
                    String string6 = sharedPreferences.getString("com.firebase.ui.auth.data.client.idpSecret", null);
                    h8.h hVar4 = new h8.h(string2, string3);
                    hVar4.f18057c = string;
                    if (string4 == null || (string5 == null && bVar.f20116a == null)) {
                        hVar2 = hVar4;
                    } else {
                        hVar2 = hVar4;
                        g0 g0Var = new g0(new am.e(string4, string, null, null, null));
                        g0Var.f31493c = bVar.f20116a;
                        g0Var.f31494d = string5;
                        g0Var.f31495e = string6;
                        g0Var.f31491a = false;
                        hVar2.f18059e = g0Var.a();
                    }
                    bVar.f20116a = null;
                    hVar3 = hVar2;
                }
                Preconditions.checkNotEmpty(str);
                HashMap z12 = dp.b.z1(Uri.parse(str));
                if (!z12.isEmpty()) {
                    String str2 = (String) z12.get("ui_sid");
                    String str3 = (String) z12.get("ui_auid");
                    String str4 = (String) z12.get("oobCode");
                    String str5 = (String) z12.get("ui_pid");
                    String str6 = (String) z12.get("ui_sd");
                    if (!TextUtils.isEmpty(str6)) {
                        z10 = str6.equals("1");
                    }
                    if (hVar3 != null && !TextUtils.isEmpty((String) hVar3.f18056b) && !TextUtils.isEmpty(str2) && str2.equals((String) hVar3.f18056b)) {
                        if (str3 != null && ((hVar = emailLinkSignInHandler2.f10958g.f11632f) == null || (hVar.R() && !str3.equals(((aq.g0) emailLinkSignInHandler2.f10958g.f11632f).f2717b.f2702a)))) {
                            emailLinkSignInHandler2.h(am.d.a(new FirebaseUiException(11)));
                            return;
                        } else {
                            emailLinkSignInHandler2.k((d) hVar3.f18059e, (String) hVar3.f18057c);
                            return;
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        emailLinkSignInHandler2.h(am.d.a(new FirebaseUiException(7)));
                        return;
                    }
                    if (!z10 && TextUtils.isEmpty(str3)) {
                        FirebaseAuth firebaseAuth = emailLinkSignInHandler2.f10958g;
                        firebaseAuth.getClass();
                        Preconditions.checkNotEmpty(str4);
                        firebaseAuth.f11631e.zzb(firebaseAuth.f11627a, str4, firebaseAuth.f11637k).addOnCompleteListener(new g(3, emailLinkSignInHandler2, str5));
                        return;
                    }
                    emailLinkSignInHandler2.h(am.d.a(new FirebaseUiException(8)));
                    return;
                }
                throw new IllegalArgumentException("Invalid link: no parameters found");
            }
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
