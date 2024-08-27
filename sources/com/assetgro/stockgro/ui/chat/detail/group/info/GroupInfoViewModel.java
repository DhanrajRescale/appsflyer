package com.assetgro.stockgro.ui.chat.detail.group.info;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.assetgro.stockgro.data.enums.GroupImageType;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.data.model.GroupMember;
import com.assetgro.stockgro.data.model.OneToOneChatGroup;
import com.assetgro.stockgro.data.remote.request.ExitData;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import hv.e;
import hv.t;
import java.io.File;
import jr.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.a;
import okhttp3.HttpUrl;
import qu.i0;
import rd.q;
import td.d;
import td.h0;
import td.k0;
import td.p0;
import td.q0;
import td.u0;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/info/GroupInfoViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "td/e0", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupInfoViewModel extends BaseViewModel {
    public GroupMember A;
    public final e0 B;
    public File C;
    public a D;
    public String E;
    public String F;
    public final d0 G;
    public final d0 H;
    public final d0 I;
    public final d0 J;
    public final d0 K;
    public final d0 L;
    public final d0 M;
    public final d0 N;
    public final d0 O;
    public final d0 P;
    public final d0 Q;
    public final d0 R;
    public final d0 S;
    public final d0 T;
    public final d0 U;
    public final d0 V;
    public final d0 W;
    public final d0 X;
    public final d0 Y;
    public final d0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final d0 f9228a0;

    /* renamed from: b0, reason: collision with root package name */
    public final d0 f9229b0;

    /* renamed from: c0, reason: collision with root package name */
    public final d0 f9230c0;

    /* renamed from: d0, reason: collision with root package name */
    public final d0 f9231d0;

    /* renamed from: e0, reason: collision with root package name */
    public final d0 f9232e0;

    /* renamed from: f0, reason: collision with root package name */
    public final d0 f9233f0;

    /* renamed from: g0, reason: collision with root package name */
    public final d0 f9234g0;

    /* renamed from: h0, reason: collision with root package name */
    public final d0 f9235h0;

    /* renamed from: i0, reason: collision with root package name */
    public final d0 f9236i0;

    /* renamed from: j0, reason: collision with root package name */
    public final d0 f9237j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d0 f9238k0;

    /* renamed from: l0, reason: collision with root package name */
    public final d0 f9239l0;

    /* renamed from: m0, reason: collision with root package name */
    public final d0 f9240m0;

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f9241n;
    public final d0 n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArenaRepository f9242o;

    /* renamed from: o0, reason: collision with root package name */
    public final d0 f9243o0;

    /* renamed from: p, reason: collision with root package name */
    public GroupImageType f9244p;

    /* renamed from: p0, reason: collision with root package name */
    public final d0 f9245p0;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9246q;

    /* renamed from: q0, reason: collision with root package name */
    public final d0 f9247q0;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9248r;

    /* renamed from: r0, reason: collision with root package name */
    public final d0 f9249r0;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9250s;

    /* renamed from: s0, reason: collision with root package name */
    public final d0 f9251s0;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9252t;

    /* renamed from: t0, reason: collision with root package name */
    public final d0 f9253t0;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9254u;

    /* renamed from: u0, reason: collision with root package name */
    public final d0 f9255u0;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9256v;

    /* renamed from: v0, reason: collision with root package name */
    public final d0 f9257v0;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9258w;

    /* renamed from: w0, reason: collision with root package name */
    public final d0 f9259w0;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9260x;

    /* renamed from: x0, reason: collision with root package name */
    public final int f9261x0;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9262y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9263z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public GroupInfoViewModel(ArenaRepository arenaRepository, ChatRepository chatRepository, UserRepository userRepository, pj.a schedulerProvider, ct.a compositeDisposable) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        this.f9241n = chatRepository;
        this.f9242o = arenaRepository;
        new LiveData();
        this.f9244p = GroupImageType.Display;
        ?? liveData = new LiveData();
        this.f9246q = liveData;
        ?? liveData2 = new LiveData();
        this.f9248r = liveData2;
        this.f9250s = new LiveData();
        this.f9252t = new LiveData();
        this.f9254u = new LiveData();
        e0 i10 = h.i();
        this.f9256v = i10;
        this.f9258w = new LiveData();
        this.f9260x = new LiveData();
        this.f9262y = h.i();
        this.f9263z = new LiveData();
        this.B = new LiveData();
        this.E = HttpUrl.FRAGMENT_ENCODE_SET;
        this.F = HttpUrl.FRAGMENT_ENCODE_SET;
        this.G = i0.C(liveData, d.f35849s);
        this.H = i0.C(liveData, d.f35847q);
        this.I = i0.C(liveData, d.f35846p);
        this.J = i0.C(liveData, d.f35848r);
        this.K = i0.C(liveData, d.f35853w);
        this.L = i0.C(liveData, d.f35835e);
        this.M = i0.C(liveData, u0.f35956b);
        this.N = i0.C(liveData, d.f35845o);
        this.O = i0.C(liveData, d.C);
        i0.C(liveData, u0.f35957c);
        this.P = i0.C(liveData, d.f35851u);
        this.Q = i0.C(liveData, d.f35852v);
        this.R = i0.C(liveData, d.f35850t);
        this.S = i0.C(liveData, u0.f35970p);
        this.T = i0.C(liveData, d.f35838h);
        this.U = i0.C(liveData, d.f35856z);
        this.V = i0.C(liveData, d.f35837g);
        this.W = i0.C(liveData, d.f35836f);
        this.X = i0.C(liveData, u0.f35958d);
        this.Y = i0.C(i10, u0.f35961g);
        this.Z = i0.C(i10, u0.f35960f);
        i0.C(i10, u0.f35959e);
        this.f9228a0 = i0.C(i10, new k0(this, 2));
        this.f9229b0 = i0.C(i10, d.D);
        this.f9230c0 = i0.C(i10, d.B);
        this.f9231d0 = i0.C(i10, u0.f35966l);
        this.f9232e0 = i0.C(liveData2, d.f35854x);
        this.f9233f0 = i0.C(liveData2, d.f35839i);
        this.f9234g0 = i0.C(liveData2, d.f35843m);
        this.f9235h0 = i0.C(liveData2, u0.f35967m);
        this.f9236i0 = i0.C(liveData2, d.f35840j);
        this.f9237j0 = i0.C(liveData, d.f35834d);
        this.f9238k0 = i0.C(liveData2, d.f35855y);
        this.f9239l0 = i0.C(liveData, d.E);
        this.f9240m0 = i0.C(liveData, d.f35844n);
        this.n0 = i0.C(liveData, d.A);
        this.f9243o0 = i0.C(liveData, u0.f35963i);
        this.f9245p0 = i0.C(liveData, u0.f35964j);
        this.f9247q0 = i0.C(liveData, u0.f35965k);
        this.f9249r0 = i0.C(liveData, u0.f35962h);
        this.f9251s0 = i0.C(liveData, u0.f35968n);
        this.f9253t0 = i0.C(liveData, u0.f35969o);
        this.f9255u0 = i0.C(liveData, u0.f35971q);
        this.f9257v0 = i0.C(liveData2, d.f35841k);
        this.f9259w0 = i0.C(liveData2, d.f35842l);
        this.f9261x0 = R.drawable.ic_placeholder_league;
    }

    public static final String h(GroupInfoViewModel groupInfoViewModel, long j10, long j11) {
        groupInfoViewModel.getClass();
        jv.a b10 = jv.a.b("hh:mm a");
        Intrinsics.checkNotNullExpressionValue(b10, "ofPattern(...)");
        e l10 = e.l(0, j10);
        t a10 = a3.a.a(l10, l10);
        e l11 = e.l(0, j11);
        return a3.a.g(b10.a(a10), " to ", b10.a(a3.a.a(l11, l11)));
    }

    @Override // com.assetgro.stockgro.ui.base.BaseViewModel
    public final void e() {
    }

    public final void i(String userId, String role) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.f9084g.postValue(Boolean.TRUE);
        g.H(androidx.lifecycle.u0.f(this), null, null, new h0(this, userId, role, null), 3);
    }

    public final void j(String userId, String role) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.f9084g.postValue(Boolean.TRUE);
        g.H(androidx.lifecycle.u0.f(this), null, null, new td.i0(this, userId, role, null), 3);
    }

    public final void k(String str) {
        String d10 = a3.a.d("toString(...)");
        this.f9084g.postValue(Boolean.TRUE);
        ChatRepository chatRepository = this.f9241n;
        nt.h c10 = chatRepository.createOneToOneChatGroup(new OneToOneChatGroup(d10, str, chatRepository.getUserId())).c(((kq.e) this.f9079b).J());
        jt.d dVar = new jt.d(new q(25, new k0(this, 0)), new q(26, new k0(this, 1)));
        c10.a(dVar);
        this.f9080c.c(dVar);
    }

    public final void l(ExitData exitData) {
        String groupId;
        Group group = (Group) this.f9246q.getValue();
        if (group != null && (groupId = group.getGroupId()) != null) {
            this.f9084g.postValue(Boolean.TRUE);
            g.H(androidx.lifecycle.u0.f(this), null, null, new p0(this, groupId, exitData, null), 3);
        }
    }

    public final void m() {
        this.f9084g.postValue(Boolean.TRUE);
        g.H(androidx.lifecycle.u0.f(this), null, null, new q0(this, null), 3);
    }

    public final void n(GroupImageType groupImageType) {
        Intrinsics.checkNotNullParameter(groupImageType, "groupImageType");
        File file = this.C;
        if (file != null) {
            this.f9084g.postValue(Boolean.TRUE);
            nt.h c10 = this.f9241n.uploadChatGroupAssets(this.F, file, "image/jpeg", groupImageType).c(((kq.e) this.f9079b).J());
            jt.d dVar = new jt.d(new q(27, new k0(this, 3)), new q(28, new k0(this, 4)));
            c10.a(dVar);
            this.f9080c.c(dVar);
        }
    }
}
