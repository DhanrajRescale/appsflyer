package com.assetgro.stockgro.feature_social.presentation.feed.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import bl.j;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import e1.s;
import e1.x;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nb.b;
import nb.c;
import nb.d;
import nb.e;
import nb.f;
import nb.h;
import nb.i;
import nb.k;
import nb.l;
import nb.m;
import nb.n;
import nb.o;
import nb.p;
import nb.q;
import nb.r;
import nb.u;
import pj.a;
import t0.n1;
import t0.o3;
import t0.t;
import tu.k1;
import tu.l1;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/feature_social/presentation/feed/home/SocialHomeFeedV2ViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "nb/c", "nb/h", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SocialHomeFeedV2ViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final FeedRepository f8818n;

    /* renamed from: o, reason: collision with root package name */
    public final n1 f8819o;

    /* renamed from: p, reason: collision with root package name */
    public final n1 f8820p;

    /* renamed from: q, reason: collision with root package name */
    public final s f8821q;

    /* renamed from: r, reason: collision with root package name */
    public final s f8822r;

    /* renamed from: s, reason: collision with root package name */
    public final s f8823s;

    /* renamed from: t, reason: collision with root package name */
    public final s f8824t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8825u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f8826v;

    /* renamed from: w, reason: collision with root package name */
    public final k1 f8827w;

    /* renamed from: x, reason: collision with root package name */
    public final k1 f8828x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public SocialHomeFeedV2ViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, FeedRepository feedRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        this.f8818n = feedRepository;
        n1 n0 = t.n0(new c(null, null, false, null, null, null, null, null), o3.f35116a);
        this.f8819o = n0;
        this.f8820p = n0;
        s sVar = new s();
        this.f8821q = sVar;
        this.f8822r = sVar;
        s sVar2 = new s();
        this.f8823s = sVar2;
        this.f8824t = sVar2;
        ?? liveData = new LiveData(UUID.randomUUID().toString());
        this.f8825u = liveData;
        this.f8826v = liveData;
        k1 a10 = l1.a(d.f28575a);
        this.f8827w = a10;
        this.f8828x = a10;
        b bVar = b.f28564a;
        h(bVar);
        i(bVar);
    }

    public final void h(b bVar) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            g.H(u0.f(this), null, null, new r(this, null), 3);
        } else {
            g.H(u0.f(this), null, null, new nb.s(this, bVar, null), 3);
        }
    }

    public final void i(b bVar) {
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            g.H(u0.f(this), null, null, new nb.t(this, null), 3);
        } else {
            g.H(u0.f(this), null, null, new u(this, bVar, null), 3);
        }
    }

    public final void j(j viewStateEvent) {
        c a10;
        Intrinsics.checkNotNullParameter(viewStateEvent, "viewStateEvent");
        boolean z10 = viewStateEvent instanceof nb.j;
        s sVar = this.f8821q;
        n1 n1Var = this.f8819o;
        if (z10) {
            sVar.clear();
            c cVar = (c) n1Var.getValue();
            b bVar = b.f28564a;
            n1Var.setValue(c.a(cVar, bVar, bVar, false, null, null, null, null, 248));
            l(d.f28575a);
            return;
        }
        if (viewStateEvent instanceof k) {
            n1Var.setValue(c.a((c) n1Var.getValue(), null, null, true, null, null, null, null, 248));
            l(null);
            return;
        }
        if (viewStateEvent instanceof i) {
            sVar.clear();
            sVar.addAll(((i) viewStateEvent).f28582b);
            n1Var.setValue(c.a((c) n1Var.getValue(), null, null, false, null, null, null, null, 249));
            l(null);
            return;
        }
        if (viewStateEvent instanceof p) {
            for (gb.b bVar2 : ((p) viewStateEvent).f28591b) {
                ListIterator listIterator = sVar.listIterator();
                int i10 = 0;
                while (true) {
                    x xVar = (x) listIterator;
                    if (xVar.hasNext()) {
                        if (Intrinsics.a(((gb.b) xVar.next()).b(), bVar2.b())) {
                            break;
                        } else {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 != -1) {
                    sVar.set(i10, bVar2);
                }
                k();
            }
            n1Var.setValue(c.a((c) n1Var.getValue(), null, null, false, null, null, null, null, 249));
            l(null);
            return;
        }
        if (viewStateEvent instanceof o) {
            o oVar = (o) viewStateEvent;
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = oVar.f28590c;
            if (Intrinsics.a(bool2, bool)) {
                a10 = c.a((c) n1Var.getValue(), oVar.f28589b, null, false, null, null, null, null, 250);
            } else if (Intrinsics.a(bool2, Boolean.FALSE)) {
                a10 = c.a((c) n1Var.getValue(), null, oVar.f28589b, false, null, null, null, null, 249);
            } else {
                c cVar2 = (c) n1Var.getValue();
                b bVar3 = oVar.f28589b;
                a10 = c.a(cVar2, bVar3, bVar3, false, null, null, null, null, 248);
            }
            n1Var.setValue(a10);
            l(null);
            return;
        }
        if (viewStateEvent instanceof l) {
            l lVar = (l) viewStateEvent;
            n1Var.setValue(c.a((c) n1Var.getValue(), null, null, false, lVar.f28584b, null, null, null, 240));
            String str = lVar.f28584b;
            if (str != null && str.length() != 0) {
                if (str == null) {
                    str = "Something went wrong!";
                }
                l(new e(str));
                return;
            }
            return;
        }
        if (viewStateEvent instanceof m) {
            m mVar = (m) viewStateEvent;
            n1Var.setValue(c.a((c) n1Var.getValue(), null, null, false, null, mVar.f28585b, mVar.f28586c, null, 153));
            l(new f(mVar.f28585b, mVar.f28586c));
        } else if (viewStateEvent instanceof n) {
            n nVar = (n) viewStateEvent;
            l(new nb.g(nVar.f28587b, nVar.f28588c, "FEED_STREAM_POST_DETAILS"));
        } else if (viewStateEvent instanceof q) {
            n1Var.setValue(c.a((c) n1Var.getValue(), null, null, false, null, null, null, Integer.valueOf(((q) viewStateEvent).f28592b), 121));
            l(null);
        }
    }

    public final void k() {
        Iterator<E> it = this.f8821q.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Iterator it2 = ((gb.b) it.next()).e().iterator();
            while (it2.hasNext()) {
                if (((gb.d) it2.next()).f()) {
                    i10++;
                }
            }
        }
        j(new q(i10));
    }

    public final void l(h hVar) {
        this.f8825u.postValue(UUID.randomUUID().toString());
        this.f8827w.m(hVar);
    }
}
