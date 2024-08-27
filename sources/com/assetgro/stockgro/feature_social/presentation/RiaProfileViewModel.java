package com.assetgro.stockgro.feature_social.presentation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.model.InviteTemplateDto;
import com.assetgro.stockgro.data.model.RedirectConfig;
import com.assetgro.stockgro.data.model.TemplateParams;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import ib.a0;
import ib.d0;
import ib.f0;
import ib.y;
import ib.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pj.a;
import qu.i0;
import tu.k1;
import tu.l1;
import yk.g;
import yk.j;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_social/presentation/RiaProfileViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RiaProfileViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FollowerRepository f8794n;

    /* renamed from: o, reason: collision with root package name */
    public final ChatRepository f8795o;

    /* renamed from: p, reason: collision with root package name */
    public final k1 f8796p;

    /* renamed from: q, reason: collision with root package name */
    public final k1 f8797q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8798r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f8799s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f8800t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8801u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f8802v;

    /* renamed from: w, reason: collision with root package name */
    public i0 f8803w;

    /* renamed from: x, reason: collision with root package name */
    public String f8804x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public RiaProfileViewModel(ChatRepository chatRepository, FollowerRepository followerRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f8794n = followerRepository;
        this.f8795o = chatRepository;
        k1 a10 = l1.a(new y(null, false, false));
        this.f8796p = a10;
        this.f8797q = a10;
        this.f8798r = new LiveData();
        this.f8799s = new LiveData();
        this.f8800t = new LiveData();
        this.f8801u = new LiveData();
        this.f8802v = new LiveData();
    }

    public final void h(String str, boolean z10) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            k(a0.f19756b);
        } else {
            this.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(this), null, null, new d0(this, z10, str, null), 3);
        }
    }

    public final void i() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            k(a0.f19756b);
            return;
        }
        try {
            g.H(u0.f(this), null, null, new ib.e0(this, null), 3);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void j() {
        String str;
        RiaProfileResponseDto.ExpertMeta expertMeta;
        String name;
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            k(a0.f19756b);
            return;
        }
        e0 e0Var = this.f9084g;
        Boolean bool = Boolean.TRUE;
        e0Var.postValue(bool);
        String str2 = this.f8804x;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = str2;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        RedirectConfig redirectConfig = new RedirectConfig(str, str2, "appsflyer", null);
        RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) this.f8798r.getValue();
        if (riaProfileResponseDto != null && (expertMeta = riaProfileResponseDto.getExpertMeta()) != null && (name = expertMeta.getName()) != null) {
            str3 = name;
        }
        g.H(u0.f(this), null, null, new f0(this, new InviteTemplateDto("ria_rra_profile_share", new TemplateParams(str3, null, null), bool, redirectConfig), null), 3);
    }

    public final void k(j stateEvents) {
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        boolean z10 = stateEvents instanceof z;
        k1 k1Var = this.f8796p;
        if (z10) {
            ((y) k1Var.getValue()).getClass();
            k1Var.m(new y(((z) stateEvents).f19840a, false, false));
            return;
        }
        if (Intrinsics.a(stateEvents, a0.f19755a)) {
            k1Var.m(y.a((y) k1Var.getValue(), true, false, 5));
            i();
        } else if (Intrinsics.a(stateEvents, a0.f19756b)) {
            if (((y) k1Var.getValue()).f19837a == null) {
                k1Var.m(y.a((y) k1Var.getValue(), false, true, 3));
            }
        } else if (Intrinsics.a(stateEvents, a0.f19757c)) {
            i();
        }
    }
}
