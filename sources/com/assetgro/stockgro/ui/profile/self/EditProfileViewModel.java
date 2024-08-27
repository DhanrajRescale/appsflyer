package com.assetgro.stockgro.ui.profile.self;

import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.SocialDataDto;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import ek.e;
import ih.f;
import ih.g;
import java.util.Date;
import jr.h;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mj.a;
import ni.j;
import okhttp3.HttpUrl;
import qu.i0;
import qu.r0;
import xk.h0;
import xk.j0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/self/EditProfileViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EditProfileViewModel extends BaseViewModel {
    public final d0 A;
    public final d0 B;
    public final d0 C;
    public final d0 D;
    public final d0 E;

    /* renamed from: n, reason: collision with root package name */
    public final a f10030n;

    /* renamed from: o, reason: collision with root package name */
    public final String f10031o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10032p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f10033q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f10034r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f10035s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f10036t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f10037u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10038v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f10039w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f10040x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f10041y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10042z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public EditProfileViewModel(pj.a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, a stockgroRemoteConfig) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(stockgroRemoteConfig, "stockgroRemoteConfig");
        this.f10030n = stockgroRemoteConfig;
        this.f10031o = HttpUrl.FRAGMENT_ENCODE_SET;
        ?? liveData = new LiveData();
        this.f10032p = liveData;
        ?? liveData2 = new LiveData();
        this.f10033q = liveData2;
        this.f10034r = liveData2;
        ?? liveData3 = new LiveData();
        this.f10035s = liveData3;
        this.f10036t = new LiveData();
        this.f10037u = new LiveData();
        this.f10038v = new LiveData();
        this.f10039w = h.i();
        this.f10040x = new LiveData();
        h();
        this.f10041y = i0.C(liveData, g.f20001f);
        this.f10042z = new LiveData(HttpUrl.FRAGMENT_ENCODE_SET);
        this.A = i0.C(liveData, g.f20002g);
        this.B = i0.C(liveData, g.f19997b);
        this.C = i0.C(liveData, g.f19999d);
        this.D = i0.C(liveData3, g.f19998c);
        this.E = i0.C(liveData3, g.f20000e);
    }

    public static void j() {
        LoginManager m10 = LoginManager.f10882f.m();
        Date date = xk.a.f40309l;
        xk.g.f40363f.r().c(null, true);
        e.E(null);
        String str = h0.f40389h;
        j0.f40404d.s().a(null, true);
        SharedPreferences.Editor edit = m10.f10888c.edit();
        edit.putBoolean("express_login_allowed", false);
        edit.apply();
    }

    public final void h() {
        boolean isOnline = WifiService.INSTANCE.getInstance().isOnline();
        e0 e0Var = this.f9084g;
        if (!isOnline) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            e0Var.postValue(Boolean.FALSE);
        } else {
            e0Var.postValue(Boolean.TRUE);
            yk.g.H(u0.f(this), r0.f32256b, null, new f(this, null), 2);
        }
    }

    public final void i() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            return;
        }
        e0 e0Var = this.f9084g;
        e0Var.postValue(Boolean.TRUE);
        try {
            yk.g.H(u0.f(this), null, null, new ih.h(this, null), 3);
        } catch (Exception e10) {
            e0Var.postValue(Boolean.FALSE);
            e10.printStackTrace();
        }
    }

    public final void k(SocialDataDto socialDataDto, String platform) {
        Intrinsics.checkNotNullParameter(socialDataDto, "socialDataDto");
        Intrinsics.checkNotNullParameter(platform, "platform");
        e0 e0Var = this.f9084g;
        e0Var.postValue(Boolean.TRUE);
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            e0Var.postValue(Boolean.FALSE);
        } else {
            nt.h c10 = this.f9081d.saveUserSocialData(socialDataDto, platform).c(((kq.e) this.f9079b).J());
            d dVar = new d(new androidx.fragment.app.g(23, this, platform), new vg.d(25, new qg.a(this, 8)));
            c10.a(dVar);
            this.f9080c.c(dVar);
        }
    }

    public final void l(xk.a token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f9083f.setValue(j.i("Not connected to internet"));
            this.f9084g.postValue(Boolean.FALSE);
            return;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        zp.g gVar = new zp.g(token.f40316e);
        Intrinsics.checkNotNullExpressionValue(gVar, "getCredential(...)");
        firebaseAuth.c(gVar).addOnCompleteListener(new androidx.fragment.app.g(0, firebaseAuth, this));
    }
}
