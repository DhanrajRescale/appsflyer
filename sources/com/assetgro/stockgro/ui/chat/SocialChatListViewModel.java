package com.assetgro.stockgro.ui.chat;

import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import e.l;
import e1.s;
import g7.b3;
import id.i;
import id.k;
import id.m;
import id.n;
import id.o;
import id.t;
import id.u;
import id.v;
import java.util.Map;
import jt.d;
import kj.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import okhttp3.HttpUrl;
import qf.a;
import qf.b;
import t0.n1;
import tu.f;
import tu.k1;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/SocialChatListViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "zq/f", "id/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SocialChatListViewModel extends BaseViewModel {
    public static boolean S;
    public static boolean T;
    public static boolean U;
    public final e0 A;
    public final e0 B;
    public String C;
    public boolean D;
    public final e0 E;
    public final boolean F;
    public final int G;
    public boolean H;
    public final e0 I;
    public final s J;
    public final s K;
    public final k1 L;
    public final k1 M;
    public final d0 N;
    public final d0 O;
    public final d0 P;
    public final n1 Q;
    public final k1 R;

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9091n;

    /* renamed from: o, reason: collision with root package name */
    public final FollowerRepository f9092o;

    /* renamed from: p, reason: collision with root package name */
    public final a f9093p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9094q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9095r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9096s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9097t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9098u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9099v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9100w;

    /* renamed from: x, reason: collision with root package name */
    public Map f9101x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9102y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9103z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017e  */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r11v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r11v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r11v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SocialChatListViewModel(pj.a r9, ct.a r10, com.assetgro.stockgro.data.repository.UserRepository r11, com.assetgro.stockgro.data.repository.ChatRepository r12, com.assetgro.stockgro.data.repository.FollowerRepository r13, qf.a r14) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.assetgro.stockgro.ui.chat.SocialChatListViewModel.<init>(pj.a, ct.a, com.assetgro.stockgro.data.repository.UserRepository, com.assetgro.stockgro.data.repository.ChatRepository, com.assetgro.stockgro.data.repository.FollowerRepository, qf.a):void");
    }

    public final void h() {
        UserRepository userRepository = this.f9081d;
        if (userRepository.getIsDeepLinkActive()) {
            if (Intrinsics.a(userRepository.getDeepLinkPath(), "chat_group")) {
                String deepLinkPathIdentifier = userRepository.getDeepLinkPathIdentifier();
                if (deepLinkPathIdentifier != null) {
                    this.f9098u.postValue(deepLinkPathIdentifier);
                }
                userRepository.setIsDeepLinkActive(false);
                userRepository.setDeepLinkPath(HttpUrl.FRAGMENT_ENCODE_SET);
                userRepository.setDeepLinkPathIdentifier(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            }
            this.f9097t.postValue(Boolean.TRUE);
        }
    }

    public final void i() {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            g.H(u0.f(this), null, null, new t(this, null), 3);
        } else {
            if (!(!Intrinsics.a(this.C, "Rogue"))) {
                return;
            }
            o(new n(true));
            g.H(u0.f(this), null, null, new u(this, null), 3);
        }
    }

    public final void j() {
        this.Q.setValue((f) new l(new b3(10, 0, 10, 50), new v(this, 0)).f14641b);
    }

    public final void k(boolean z10) {
        k1 k1Var;
        Object value;
        do {
            k1Var = this.L;
            value = k1Var.getValue();
        } while (!k1Var.l(value, o.a((o) value, false, 0, 0, 30, null, z10, false, 83)));
    }

    public final void l() {
        if (!(!Intrinsics.a(this.C, "Rogue"))) {
            return;
        }
        this.f9084g.postValue(Boolean.TRUE);
        h c10 = this.f9091n.getDiscoverHomeData().c(((e) this.f9079b).J());
        d dVar = new d(new za.e(29, new i(this, 5)), new id.h(0, new i(this, 6)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void m() {
        b bVar = b.f31929d;
        a aVar = this.f9093p;
        boolean b10 = aVar.b(bVar);
        if (S != b10) {
            S = b10;
            this.f9103z.postValue(new j(Boolean.valueOf(b10)));
        }
        if (!b10) {
            boolean b11 = aVar.b(b.f31930e);
            if (T != b11) {
                T = b11;
                this.A.postValue(new j(Boolean.TRUE));
            }
            boolean b12 = aVar.b(b.f31931f);
            if (U != b12) {
                U = b12;
                this.B.postValue(new j(Boolean.TRUE));
            }
        }
    }

    public final void n() {
        k1 k1Var;
        Object value;
        do {
            k1Var = this.L;
            value = k1Var.getValue();
        } while (!k1Var.l(value, o.a((o) value, false, -1, 0, 0, null, false, false, 125)));
    }

    public final void o(zq.f stateEvents) {
        Object value;
        Object value2;
        Object value3;
        Intrinsics.checkNotNullParameter(stateEvents, "stateEvents");
        if (Intrinsics.a(stateEvents, id.l.f19865e)) {
            k(true);
            return;
        }
        boolean z10 = stateEvents instanceof id.j;
        k1 k1Var = this.L;
        if (z10) {
            id.j jVar = (id.j) stateEvents;
            do {
                value3 = k1Var.getValue();
            } while (!k1Var.l(value3, o.a((o) value3, false, 0, 0, 0, null, false, false, 31)));
            int i10 = ((o) k1Var.getValue()).f19870c;
            s sVar = this.J;
            if (i10 == 0) {
                sVar.clear();
            }
            sVar.addAll(jVar.f19863e);
            return;
        }
        if (stateEvents instanceof n) {
            boolean z11 = ((n) stateEvents).f19867e;
            this.f9084g.postValue(Boolean.valueOf(z11));
            do {
                value2 = k1Var.getValue();
            } while (!k1Var.l(value2, o.a((o) value2, z11, 0, 0, 0, null, false, false, 126)));
            return;
        }
        if (stateEvents instanceof k) {
            this.I.postValue(((k) stateEvents).f19864e);
        } else if (stateEvents instanceof m) {
            k(((m) stateEvents).f19866e);
            do {
                value = k1Var.getValue();
            } while (!k1Var.l(value, o.a((o) value, false, 0, 0, 30, null, false, false, 115)));
            i();
        }
    }
}
