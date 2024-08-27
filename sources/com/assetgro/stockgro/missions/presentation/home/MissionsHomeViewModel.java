package com.assetgro.stockgro.missions.presentation.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.MissionsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e1.s;
import fd.c;
import hc.d;
import hc.l;
import hc.m;
import hc.n;
import hv.e;
import hv.q;
import hv.t;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pj.a;
import qu.i0;
import th.b;
import tu.k1;
import tu.l1;
import uh.i;
import yk.g;
import z9.h;
import zq.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/missions/presentation/home/MissionsHomeViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MissionsHomeViewModel extends BaseViewModel {
    public final k1 A;
    public final s B;
    public final s C;

    /* renamed from: n, reason: collision with root package name */
    public final MissionsRepository f8916n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f8917o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f8918p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f8919q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f8920r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8921s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8922t;

    /* renamed from: u, reason: collision with root package name */
    public c f8923u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f8924v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f8925w;

    /* renamed from: x, reason: collision with root package name */
    public final d0 f8926x;

    /* renamed from: y, reason: collision with root package name */
    public final d0 f8927y;

    /* renamed from: z, reason: collision with root package name */
    public final k1 f8928z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public MissionsHomeViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, MissionsRepository missionsRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(missionsRepository, "missionsRepository");
        this.f8916n = missionsRepository;
        ?? liveData = new LiveData();
        this.f8917o = liveData;
        ?? liveData2 = new LiveData();
        this.f8918p = liveData2;
        this.f8919q = new LiveData();
        this.f8920r = new LiveData(Boolean.FALSE);
        this.f8921s = true;
        this.f8922t = true;
        ?? liveData3 = new LiveData();
        this.f8924v = liveData3;
        this.f8925w = i0.C(liveData2, d.f18265m);
        this.f8926x = i0.C(liveData2, d.f18264l);
        this.f8927y = i0.C(liveData2, d.f18266n);
        k1 a10 = l1.a(new i());
        this.f8928z = a10;
        this.A = a10;
        s sVar = new s();
        this.B = sVar;
        this.C = sVar;
        jv.a b10 = jv.a.b("EEEE, dd MMMM");
        Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
        e l10 = e.l(0, System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        q p10 = q.p();
        l10.getClass();
        String a11 = b10.a(t.p(l10, p10));
        Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
        liveData3.postValue(a11);
        UserRepository userRepository2 = this.f9081d;
        liveData.postValue(new Pair(userRepository2.getUserDisplayName(), userRepository2.getUserDisplayImage()));
        g.H(u0.f(this), null, null, new l(this, null), 3);
    }

    public static final void h(MissionsHomeViewModel missionsHomeViewModel, th.a aVar) {
        b bVar;
        k1 k1Var;
        Object value;
        i iVar;
        String str;
        k1 k1Var2 = missionsHomeViewModel.A;
        b bVar2 = ((i) k1Var2.getValue()).f37208f;
        if (bVar2 != null) {
            bVar = b.a(bVar2, aVar.f36079c);
        } else {
            bVar = null;
        }
        b bVar3 = ((i) k1Var2.getValue()).f37208f;
        s sVar = missionsHomeViewModel.C;
        f.u(sVar).remove(bVar3);
        do {
            k1Var = missionsHomeViewModel.f8928z;
            value = k1Var.getValue();
            iVar = (i) value;
            if (sVar.isEmpty()) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = iVar.f37204b;
            }
        } while (!k1Var.l(value, i.a(iVar, null, str, false, false, false, bVar, false, 93)));
    }

    public final void i() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            this.f8919q.postValue(new h(R.string.no_internet_connection, new Object[0]));
            return;
        }
        if (this.f8921s) {
            this.f8921s = false;
            this.f9084g.postValue(Boolean.TRUE);
        }
        g.H(u0.f(this), null, null, new n(this, null), 3);
    }

    public final void j(g stateEvents) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        boolean z10 = stateEvents instanceof uh.f;
        k1 k1Var = this.f8928z;
        if (z10) {
            s sVar = this.B;
            sVar.clear();
            th.c cVar = ((uh.f) stateEvents).f37200b;
            sVar.addAll(cVar.f36086c);
            do {
                value2 = k1Var.getValue();
            } while (!k1Var.l(value2, i.a((i) value2, cVar.f36084a, cVar.f36085b, false, false, false, null, false, 124)));
            return;
        }
        if (stateEvents instanceof uh.g) {
            boolean z11 = ((uh.g) stateEvents).f37201b;
            do {
                value = k1Var.getValue();
            } while (!k1Var.l(value, i.a((i) value, null, null, z11, false, false, null, false, 123)));
        } else {
            if (stateEvents instanceof uh.e) {
                uh.e eVar = (uh.e) stateEvents;
                if (!WifiService.INSTANCE.getInstance().isOnline()) {
                    this.f8919q.postValue(new h(R.string.no_internet_connection, new Object[0]));
                    return;
                } else {
                    g.H(u0.f(this), null, null, new m(this, eVar.f37199b, null), 3);
                    return;
                }
            }
            Intrinsics.a(stateEvents, uh.h.f37202b);
        }
    }
}
