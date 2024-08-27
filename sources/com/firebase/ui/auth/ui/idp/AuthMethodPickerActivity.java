package com.firebase.ui.auth.ui.idp;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.lifecycle.g1;
import bm.d;
import cm.a;
import com.facebook.FacebookSdk;
import com.firebase.ui.auth.data.remote.AnonymousSignInHandler;
import com.firebase.ui.auth.data.remote.EmailSignInHandler;
import com.firebase.ui.auth.data.remote.FacebookSignInHandler;
import com.firebase.ui.auth.data.remote.GenericIdpSignInHandler;
import com.firebase.ui.auth.data.remote.GoogleSignInHandler;
import com.firebase.ui.auth.data.remote.PhoneSignInHandler;
import com.firebase.ui.auth.viewmodel.OperableViewModel;
import com.firebase.ui.auth.viewmodel.ProviderSignInBase;
import com.firebase.ui.auth.viewmodel.idp.SocialProviderResponseHandler;
import ha.h;
import java.util.ArrayList;
import java.util.Iterator;
import zl.b;

/* loaded from: classes.dex */
public class AuthMethodPickerActivity extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f10932h = 0;

    /* renamed from: c, reason: collision with root package name */
    public SocialProviderResponseHandler f10933c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10934d;

    /* renamed from: e, reason: collision with root package name */
    public ProgressBar f10935e;

    /* renamed from: f, reason: collision with root package name */
    public ViewGroup f10936f;

    /* renamed from: g, reason: collision with root package name */
    public zl.a f10937g;

    public final void B(b bVar, View view) {
        OperableViewModel operableViewModel;
        g1 g1Var = new g1(this);
        x();
        String str = bVar.f42555a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095811475:
                if (str.equals("anonymous")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c10 = 1;
                    break;
                }
                break;
            case -364826023:
                if (str.equals(FacebookSdk.FACEBOOK_COM)) {
                    c10 = 2;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4 && c10 != 5) {
                            if (!TextUtils.isEmpty(bVar.a().getString("generic_oauth_provider_id"))) {
                                operableViewModel = (GenericIdpSignInHandler) g1Var.a(GenericIdpSignInHandler.class);
                                operableViewModel.f(bVar);
                            } else {
                                throw new IllegalStateException("Unknown provider: ".concat(str));
                            }
                        } else {
                            operableViewModel = (EmailSignInHandler) g1Var.a(EmailSignInHandler.class);
                            operableViewModel.f(null);
                        }
                    } else {
                        operableViewModel = (PhoneSignInHandler) g1Var.a(PhoneSignInHandler.class);
                        operableViewModel.f(bVar);
                    }
                } else {
                    operableViewModel = (FacebookSignInHandler) g1Var.a(FacebookSignInHandler.class);
                    operableViewModel.f(bVar);
                }
            } else {
                operableViewModel = (GoogleSignInHandler) g1Var.a(GoogleSignInHandler.class);
                operableViewModel.f(new d(bVar, null));
            }
        } else {
            operableViewModel = (AnonymousSignInHandler) g1Var.a(AnonymousSignInHandler.class);
            operableViewModel.f(y());
        }
        this.f10934d.add(operableViewModel);
        operableViewModel.f10959e.observe(this, new dm.a(this, this, str, 1));
        view.setOnClickListener(new h(7, this, operableViewModel, bVar));
    }

    @Override // cm.g
    public final void b() {
        if (this.f10937g == null) {
            this.f10935e.setVisibility(4);
            for (int i10 = 0; i10 < this.f10936f.getChildCount(); i10++) {
                View childAt = this.f10936f.getChildAt(i10);
                childAt.setEnabled(true);
                childAt.setAlpha(1.0f);
            }
        }
    }

    @Override // cm.g
    public final void f(int i10) {
        if (this.f10937g == null) {
            this.f10935e.setVisibility(0);
            for (int i11 = 0; i11 < this.f10936f.getChildCount(); i11++) {
                View childAt = this.f10936f.getChildAt(i11);
                childAt.setEnabled(false);
                childAt.setAlpha(0.75f);
            }
        }
    }

    @Override // cm.c, androidx.fragment.app.j0, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f10933c.k(i10, i11, intent);
        Iterator it = this.f10934d.iterator();
        while (it.hasNext()) {
            ((ProviderSignInBase) it.next()).i(i10, i11, intent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01da  */
    @Override // cm.a, androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.firebase.ui.auth.ui.idp.AuthMethodPickerActivity.onCreate(android.os.Bundle):void");
    }
}
