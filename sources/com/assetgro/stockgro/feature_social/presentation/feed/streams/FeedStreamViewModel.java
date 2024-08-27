package com.assetgro.stockgro.feature_social.presentation.feed.streams;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.remote.response.ErrorResponse;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.data.remote.feed.stream.FeedStreamDto;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import com.google.gson.Gson;
import e1.s;
import hb.u;
import hb.v;
import hb.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nv.v0;
import okhttp3.ResponseBody;
import pj.a;
import sb.a0;
import sb.b0;
import sb.c;
import sb.c0;
import sb.d;
import sb.d0;
import sb.e;
import sb.f;
import sb.f0;
import sb.h;
import sb.h0;
import sb.j;
import sb.j0;
import sb.k;
import sb.k0;
import sb.l;
import sb.m;
import sb.n;
import sb.p;
import sb.q;
import sb.r;
import sb.w;
import t0.n1;
import t0.o3;
import t0.t;
import tu.k1;
import tu.l1;
import vt.g0;
import vt.i0;
import vt.y;
import vt.z;
import yk.g;
import yk.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/assetgro/stockgro/feature_social/presentation/feed/streams/FeedStreamViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "sb/d", "sb/m", "yk/o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FeedStreamViewModel extends BaseViewModel {
    public boolean A;

    /* renamed from: n, reason: collision with root package name */
    public final FeedRepository f8833n;

    /* renamed from: o, reason: collision with root package name */
    public final FollowerRepository f8834o;

    /* renamed from: p, reason: collision with root package name */
    public final ChatRepository f8835p;

    /* renamed from: q, reason: collision with root package name */
    public final n1 f8836q;

    /* renamed from: r, reason: collision with root package name */
    public final n1 f8837r;

    /* renamed from: s, reason: collision with root package name */
    public final s f8838s;

    /* renamed from: t, reason: collision with root package name */
    public final s f8839t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f8840u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f8841v;

    /* renamed from: w, reason: collision with root package name */
    public final k1 f8842w;

    /* renamed from: x, reason: collision with root package name */
    public final k1 f8843x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8844y;

    /* renamed from: z, reason: collision with root package name */
    public int f8845z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public FeedStreamViewModel(Context context, ChatRepository chatRepository, FeedRepository feedRepository, FollowerRepository followerRepository, UserRepository userRepository, a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f8833n = feedRepository;
        this.f8834o = followerRepository;
        this.f8835p = chatRepository;
        n1 n0 = t.n0(new d(null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, false, false, null, false, false, null), o3.f35116a);
        this.f8836q = n0;
        this.f8837r = n0;
        s sVar = new s();
        this.f8838s = sVar;
        this.f8839t = sVar;
        ?? liveData = new LiveData(UUID.randomUUID().toString());
        this.f8840u = liveData;
        this.f8841v = liveData;
        k1 a10 = l1.a(f.f34469a);
        this.f8842w = a10;
        this.f8843x = a10;
        this.f8844y = 20;
        this.A = true;
    }

    public static final void h(FeedStreamViewModel feedStreamViewModel, v0 v0Var, boolean z10) {
        FeedStreamDto feedStreamDto;
        feedStreamViewModel.getClass();
        String str = null;
        r1 = null;
        Unit unit = null;
        if (v0Var.f29302a.isSuccessful()) {
            BaseResponseDto baseResponseDto = (BaseResponseDto) v0Var.f29303b;
            if (baseResponseDto != null && (feedStreamDto = (FeedStreamDto) baseResponseDto.getData()) != null) {
                x feedCategory = feedStreamDto.toFeedCategory(((d) feedStreamViewModel.f8837r.getValue()).f34446d);
                feedStreamViewModel.k(new n(g0.S(feedCategory.f18238b), z10, feedCategory.f18240d));
                feedStreamViewModel.k(new d0(feedCategory.f18237a));
                feedStreamViewModel.k(new w(feedCategory.f18239c));
                unit = Unit.f23355a;
            }
            if (unit == null) {
                i0 i0Var = i0.f38321a;
                feedStreamViewModel.k(new n(i0Var, true, i0Var));
                return;
            }
            return;
        }
        feedStreamViewModel.i();
        Gson gson = new Gson();
        ResponseBody responseBody = v0Var.f29304c;
        if (responseBody != null) {
            str = responseBody.string();
        }
        feedStreamViewModel.k(new sb.s(((ErrorResponse) gson.fromJson(str, ErrorResponse.class)).getMessage()));
    }

    public final void i() {
        int i10 = this.f8845z;
        int i11 = this.f8844y;
        if (i10 < i11) {
            this.f8845z = 0;
        } else {
            this.f8845z = i10 - i11;
        }
    }

    public final void j(c progressBarType, Boolean bool, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(progressBarType, "progressBarType");
        if (!WifiService.INSTANCE.getInstance().isOnline()) {
            g.H(u0.f(this), null, null, new j0(this, null), 3);
            return;
        }
        n1 n1Var = this.f8837r;
        String str2 = ((d) n1Var.getValue()).f34443a;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -738829375:
                    if (str2.equals("FEED_STREAM_POST_DETAILS")) {
                        String str3 = ((d) n1Var.getValue()).f34444b;
                        if (str3 != null) {
                            g.H(u0.f(this), null, null, new k0(this, progressBarType, str3, bool, str, null), 3);
                            return;
                        }
                        return;
                    }
                    break;
                case 329458145:
                    if (str2.equals("FEED_STREAM_GROUP")) {
                        String str4 = ((d) n1Var.getValue()).f34445c;
                        if (str4 != null) {
                            g.H(u0.f(this), null, null, new sb.g0(this, progressBarType, str4, bool, str, z10, null), 3);
                            return;
                        }
                        return;
                    }
                    break;
                case 340040169:
                    if (str2.equals("FEED_STREAM_SAVED")) {
                        g.H(u0.f(this), null, null, new sb.i0(this, progressBarType, bool, str, z10, null), 3);
                        return;
                    }
                    break;
                case 896387360:
                    if (str2.equals("FEED_STREAM_SUBCATEGORY")) {
                        String str5 = ((d) n1Var.getValue()).f34445c;
                        if (str5 != null) {
                            g.H(u0.f(this), null, null, new h0(this, progressBarType, str5, bool, str, z10, null), 3);
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        g.H(u0.f(this), null, null, new f0(this, progressBarType, bool, str, z10, null), 3);
    }

    public final void k(o viewStateEvent) {
        v vVar;
        ArrayList arrayList;
        Object obj;
        boolean z10;
        Object obj2;
        Intrinsics.checkNotNullParameter(viewStateEvent, "viewStateEvent");
        boolean z11 = viewStateEvent instanceof sb.o;
        s sVar = this.f8838s;
        n1 n1Var = this.f8836q;
        if (z11) {
            sVar.clear();
            d dVar = (d) n1Var.getValue();
            sb.o oVar = (sb.o) viewStateEvent;
            String str = oVar.f34526d;
            boolean z12 = oVar.f34528f;
            String str2 = oVar.f34527e;
            n1Var.setValue(d.a(dVar, str, oVar.f34531i, str2, z12, c.f34438b, false, false, null, null, null, null, null, null, null, null, oVar.f34530h, false, null, false, Intrinsics.a(str2, "trade_views"), null, 1536064));
            n(f.f34469a);
            return;
        }
        ArrayList arrayList2 = null;
        if (viewStateEvent instanceof p) {
            d dVar2 = (d) n1Var.getValue();
            boolean z13 = ((p) viewStateEvent).f34535d;
            n1Var.setValue(d.a(dVar2, null, null, null, false, null, z13, !z13, null, null, null, null, null, null, null, null, false, false, null, false, false, null, 2097039));
            n(null);
            return;
        }
        int i10 = 0;
        if (viewStateEvent instanceof n) {
            n nVar = (n) viewStateEvent;
            List list = nVar.f34521f;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.a(((v) obj2).f18231a, ((d) n1Var.getValue()).f34460r)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                vVar = (v) obj2;
            } else {
                vVar = null;
            }
            if (list != null) {
                ArrayList arrayList3 = new ArrayList(z.k(list));
                int i11 = 0;
                for (Object obj3 : list) {
                    int i12 = i11 + 1;
                    if (i11 >= 0) {
                        v vVar2 = (v) obj3;
                        String str3 = ((d) n1Var.getValue()).f34460r;
                        if (str3 != null && str3.length() != 0 && vVar != null) {
                            z10 = Intrinsics.a(vVar2.f18231a, ((d) n1Var.getValue()).f34460r);
                        } else if (i11 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        arrayList3.add(v.a(vVar2, z10));
                        i11 = i12;
                    } else {
                        y.j();
                        throw null;
                    }
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            this.A = true;
            List<u> list2 = nVar.f34519d;
            if (nVar.f34520e) {
                sVar.clear();
                sVar.addAll(list2);
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (u uVar : list2) {
                    ListIterator listIterator = this.f8839t.listIterator();
                    while (true) {
                        e1.x xVar = (e1.x) listIterator;
                        if (xVar.hasNext()) {
                            obj = xVar.next();
                            if (Intrinsics.a(((u) obj).f18230a.f18224a, uVar.f18230a.f18224a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (obj == null) {
                        arrayList4.add(uVar);
                    }
                }
                sVar.addAll(arrayList4);
            }
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, false, false, null, false, false, arrayList, 1044591));
            n(null);
            return;
        }
        if (viewStateEvent instanceof b0) {
            ListIterator listIterator2 = sVar.listIterator();
            while (true) {
                e1.x xVar2 = (e1.x) listIterator2;
                if (xVar2.hasNext()) {
                    if (Intrinsics.a(((u) xVar2.next()).f18230a.f18224a, ((b0) viewStateEvent).f34436d.f18230a.f18224a)) {
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
                sVar.set(i10, ((b0) viewStateEvent).f34436d);
            }
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, false, false, null, false, false, null, 2097135));
            n(null);
            return;
        }
        if (viewStateEvent instanceof c0) {
            for (u uVar2 : ((c0) viewStateEvent).f34442d) {
                ListIterator listIterator3 = sVar.listIterator();
                int i13 = 0;
                while (true) {
                    e1.x xVar3 = (e1.x) listIterator3;
                    if (xVar3.hasNext()) {
                        if (Intrinsics.a(((u) xVar3.next()).f18230a.f18224a, uVar2.f18230a.f18224a)) {
                            break;
                        } else {
                            i13++;
                        }
                    } else {
                        i13 = -1;
                        break;
                    }
                }
                if (i13 != -1) {
                    sVar.set(i13, uVar2);
                }
            }
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, false, false, null, false, false, null, 2097135));
            n(null);
            return;
        }
        if (viewStateEvent instanceof sb.x) {
            sb.x xVar4 = (sb.x) viewStateEvent;
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, xVar4.f34543e, false, false, null, null, xVar4.f34542d, null, null, null, null, null, false, false, null, false, false, null, 2093135));
            n(null);
            return;
        }
        if (viewStateEvent instanceof sb.y) {
            sb.y yVar = (sb.y) viewStateEvent;
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, yVar.f34544d, null, null, null, null, null, null, false, false, null, false, false, null, 2093167));
            n(new j(yVar.f34544d));
            return;
        }
        if (viewStateEvent instanceof sb.z) {
            sb.z zVar = (sb.z) viewStateEvent;
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, zVar.f34545d, null, null, null, false, false, null, false, false, null, 2093167));
            n(new k(zVar.f34545d));
            return;
        }
        if (viewStateEvent instanceof a0) {
            a0 a0Var = (a0) viewStateEvent;
            n(new l(a0Var.f34431d, a0Var.f34432e, a0Var.f34433f, a0Var.f34434g));
            return;
        }
        if (viewStateEvent instanceof sb.t) {
            sb.t tVar = (sb.t) viewStateEvent;
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, tVar.f34539d, null, null, null, null, false, false, null, false, false, null, 2093295));
            n(new e(tVar.f34539d));
            return;
        }
        if (viewStateEvent instanceof q) {
            q qVar = (q) viewStateEvent;
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, qVar.f34536d, null, null, null, null, null, null, null, false, false, null, false, false, null, 2093167));
            n(new sb.g(qVar.f34536d.f18230a.f18224a));
            return;
        }
        if (viewStateEvent instanceof sb.s) {
            sb.s sVar2 = (sb.s) viewStateEvent;
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, null, sVar2.f34538d, null, null, false, false, null, false, false, null, 2093039));
            String str4 = sVar2.f34538d;
            if (str4 != null && str4.length() != 0) {
                if (str4 == null) {
                    str4 = "Something went wrong!";
                }
                n(new h(str4));
                return;
            }
            return;
        }
        if (viewStateEvent instanceof d0) {
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, null, null, ((d0) viewStateEvent).f34464d, null, false, false, null, false, false, null, 2088959));
            n(null);
            return;
        }
        if (viewStateEvent instanceof sb.v) {
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, false, false, null, false, false, null, 2080751));
            return;
        }
        if (viewStateEvent instanceof w) {
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, false, ((w) viewStateEvent).f34541d, null, false, false, null, 2031615));
            n(null);
            return;
        }
        boolean z14 = viewStateEvent instanceof r;
        n1 n1Var2 = this.f8837r;
        if (z14) {
            this.f8845z = 0;
            d dVar3 = (d) n1Var.getValue();
            List<v> list3 = ((d) n1Var.getValue()).f34463u;
            if (list3 != null) {
                arrayList2 = new ArrayList(z.k(list3));
                for (v vVar3 : list3) {
                    arrayList2.add(v.a(vVar3, Intrinsics.a(vVar3.f18231a, ((r) viewStateEvent).f34537d.f18231a)));
                }
            }
            v vVar4 = ((r) viewStateEvent).f34537d;
            n1Var.setValue(d.a(dVar3, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, false, false, vVar4.f18231a, false, false, arrayList2, 917503));
            j(c.f34438b, Boolean.valueOf(((d) n1Var2.getValue()).f34461s), vVar4.f18231a, true);
            return;
        }
        if (viewStateEvent instanceof sb.u) {
            sb.u uVar3 = (sb.u) viewStateEvent;
            n1Var.setValue(d.a((d) n1Var.getValue(), null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, false, false, null, uVar3.f34540d, false, null, 1835007));
            this.f8845z = 0;
            j(c.f34438b, Boolean.valueOf(uVar3.f34540d), ((d) n1Var2.getValue()).f34460r, true);
        }
    }

    public final void l(String str) {
        Object obj;
        ListIterator listIterator = this.f8838s.listIterator();
        while (true) {
            e1.x xVar = (e1.x) listIterator;
            if (xVar.hasNext()) {
                obj = xVar.next();
                if (Intrinsics.a(((u) obj).f18230a.f18224a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        u uVar = (u) obj;
        if (uVar != null) {
            hb.s sVar = uVar.f18230a;
            k(new b0(u.a(hb.s.a(sVar, null, hb.q.a(sVar.f18229f, null, null, new hb.n(!r1.f18213d.f18205a), 7), 31))));
        }
    }

    public final void m(String str) {
        Object obj;
        int i10;
        ListIterator listIterator = this.f8838s.listIterator();
        while (true) {
            e1.x xVar = (e1.x) listIterator;
            if (xVar.hasNext()) {
                obj = xVar.next();
                if (Intrinsics.a(((u) obj).f18230a.f18224a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        u uVar = (u) obj;
        if (uVar != null) {
            hb.s sVar = uVar.f18230a;
            hb.q qVar = sVar.f18229f;
            hb.p pVar = qVar.f18210a;
            int i11 = pVar.f18209b;
            boolean z10 = !pVar.f18208a;
            if (z10) {
                i10 = i11 + 1;
            } else {
                i10 = i11 - 1;
            }
            k(new b0(u.a(hb.s.a(sVar, null, hb.q.a(qVar, new hb.p(i10, z10), null, null, 14), 31))));
        }
    }

    public final void n(m mVar) {
        this.f8840u.postValue(UUID.randomUUID().toString());
        this.f8842w.m(mVar);
    }

    public final void o(String groupId, boolean z10) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = this.f8838s.listIterator();
        while (true) {
            e1.x xVar = (e1.x) listIterator;
            if (!xVar.hasNext()) {
                break;
            }
            Object next = xVar.next();
            if (Intrinsics.a(((u) next).f18230a.f18227d.f18218e, groupId)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(z.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hb.s sVar = ((u) it.next()).f18230a;
            arrayList2.add(u.a(hb.s.a(sVar, hb.r.a(sVar.f18227d, z10), null, 55)));
        }
        k(new c0(arrayList2));
    }
}
