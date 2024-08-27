package sc;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.e0;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.of;
import ba.sf;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.v2.upcoming.viewmodel.ArenaUpcomingViewModel;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import e5.o;
import ea.n;
import ea.n0;
import g7.a0;
import g7.b3;
import g7.l0;
import g7.r0;
import g7.x;
import g7.y;
import gd.m;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.t;
import qu.a2;
import qu.g0;
import qu.i0;
import rc.l;
import tu.a1;
import tu.c1;
import tu.p;
import tu.r;
import tu.w0;
import tu.x0;
import vt.p0;
import vu.u;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsc/i;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/arena/asset/v2/upcoming/viewmodel/ArenaUpcomingViewModel;", "Lba/sf;", "Lrc/d;", "Lrc/i;", "Lrc/j;", "Lrc/e;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends m<ArenaUpcomingViewModel, sf> implements rc.d, rc.i, rc.j, rc.e {

    /* renamed from: j, reason: collision with root package name */
    public static boolean f34563j;

    /* renamed from: g, reason: collision with root package name */
    public l f34564g;

    /* renamed from: h, reason: collision with root package name */
    public MainSharedViewModel f34565h;

    /* renamed from: i, reason: collision with root package name */
    public final String f34566i = "ALL";

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_arena_upcoming_host;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((ArenaUpcomingViewModel) r()).f9084g.observe(this, new eb.c(13, new c(this, 0)));
        ((ArenaUpcomingViewModel) r()).f8965v.observe(this, new eb.c(13, new c(this, 1)));
        ((ArenaUpcomingViewModel) r()).f8964u.observe(this, new eb.c(13, new c(this, 2)));
        ((ArenaUpcomingViewModel) r()).f8959p.observe(this, new eb.c(13, new c(this, 3)));
        MainSharedViewModel mainSharedViewModel = this.f34565h;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.C.observe(this, new eb.c(13, new c(this, 4)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [au.i, kotlin.jvm.functions.Function2] */
    @Override // gd.m
    public final void E(View view) {
        g0 g0Var;
        qu.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        ((sf) q()).p(this);
        ArenaUpcomingViewModel arenaUpcomingViewModel = (ArenaUpcomingViewModel) r();
        arenaUpcomingViewModel.f9084g.postValue(Boolean.TRUE);
        yt.a aVar2 = null;
        byte b10 = 0;
        yk.g.H(u0.f(arenaUpcomingViewModel), null, null, new tc.c(arenaUpcomingViewModel, null), 3);
        if (kj.a.f23207b) {
            CollapsingToolbarLayout collapsingToolbar = ((sf) q()).f6077t;
            Intrinsics.checkNotNullExpressionValue(collapsingToolbar, "collapsingToolbar");
            zq.f.M(collapsingToolbar);
        } else {
            CollapsingToolbarLayout collapsingToolbar2 = ((sf) q()).f6077t;
            Intrinsics.checkNotNullExpressionValue(collapsingToolbar2, "collapsingToolbar");
            zq.f.M(collapsingToolbar2);
        }
        this.f34564g = new l(this.f34566i, this, this, this, this);
        sf sfVar = (sf) q();
        l lVar = this.f34564g;
        if (lVar != null) {
            sfVar.f6079v.setAdapter(lVar);
            ((sf) q()).f6079v.setItemAnimator(null);
            ArenaUpcomingViewModel arenaUpcomingViewModel2 = (ArenaUpcomingViewModel) r();
            int i10 = 0;
            tu.f fVar = (tu.f) new e.l(new b3(20, 2, 0, 60), new lc.b(arenaUpcomingViewModel2, 2)).f14641b;
            z4.a scope = u0.f(arenaUpcomingViewModel2);
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            Intrinsics.checkNotNullParameter(scope, "scope");
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            Intrinsics.checkNotNullParameter(scope, "scope");
            tu.f a10 = r0.a(fVar, new y(aVar2, scope, b10 == true ? 1 : 0, i10));
            t operation = new t(null);
            Intrinsics.checkNotNullParameter(a10, "<this>");
            Intrinsics.checkNotNullParameter(operation, "operation");
            p pVar = new p(new r(new au.i(2, null), new x(new tu.j((Function2) new l0(a10, operation, null)), i10)), new a0(0, null, null));
            c1 c1Var = a1.f36406b;
            o D = el.l.D(pVar);
            w0 a11 = x0.a(1, D.f15029b, (su.a) D.f15031d);
            CoroutineContext coroutineContext = (CoroutineContext) D.f15032e;
            tu.f fVar2 = (tu.f) D.f15030c;
            kp.g gVar = x0.f36585a;
            if (Intrinsics.a(c1Var, a1.f36405a)) {
                g0Var = g0.f32205a;
            } else {
                g0Var = g0.f32208d;
            }
            tu.l0 l0Var = new tu.l0(c1Var, fVar2, a11, gVar, null);
            CoroutineContext J = yk.g.J(scope, coroutineContext);
            if (g0Var == g0.f32206b) {
                aVar = new a2(J, l0Var);
            } else {
                aVar = new qu.a(J, true);
            }
            aVar.m0(g0Var, aVar, l0Var);
            arenaUpcomingViewModel2.f8966w = new tu.r0(a11);
            int i11 = 0;
            for (Object obj : vt.y.g(getString(R.string.text_all), getString(R.string.stocks), getString(R.string.text_fno))) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    String str = (String) obj;
                    yo.g j10 = ((sf) q()).f6080w.j();
                    Intrinsics.checkNotNullExpressionValue(j10, "newTab(...)");
                    Context requireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    TabLayout tabLayout = ((sf) q()).f6080w;
                    Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
                    View f02 = el.l.f0(requireContext, tabLayout, i11);
                    TextView textView = (TextView) f02.findViewById(R.id.tv_tabtext);
                    if (textView != null) {
                        textView.setText(str);
                    }
                    j10.f41756e = f02;
                    j10.c();
                    ((sf) q()).f6080w.b(j10);
                    i11 = i12;
                } else {
                    vt.y.j();
                    throw null;
                }
            }
            sf sfVar2 = (sf) q();
            sfVar2.f6081x.setOnRefreshListener(new b3.t(this, 28));
            sf sfVar3 = (sf) q();
            sfVar3.f6076s.setOnClickListener(new d7.j(this, 22));
            androidx.lifecycle.t viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            yk.g.H(yk.j.X0(viewLifecycleOwner), null, null, new f(this, null), 3);
            yk.g.H(hl.f.d(u.f38408a), null, null, new h(this, null), 3);
            sf sfVar4 = (sf) q();
            sfVar4.f6080w.a(new nc.c(this, 2));
            return;
        }
        Intrinsics.k("arenaUpcomingMiddleLayerAdapter");
        throw null;
    }

    public final void H(boolean z10) {
        nc.d dVar;
        androidx.fragment.app.g0 parentFragment = getParentFragment();
        if (parentFragment instanceof nc.d) {
            dVar = (nc.d) parentFragment;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            ((of) dVar.q()).f5661t.setUserInputEnabled(z10);
        }
    }

    public final void I(String selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        AnalyticEvent analyticEvent = new AnalyticEvent("app_arena_upcoming_asset_filter", p0.f(new Pair("selected", selected)));
        z(analyticEvent);
        B(analyticEvent);
    }

    public final void J() {
        e0 e0Var = ((ArenaUpcomingViewModel) r()).f8964u;
        Intrinsics.c(((ArenaUpcomingViewModel) r()).f8964u.getValue());
        e0Var.setValue(Boolean.valueOf(!((Boolean) r1).booleanValue()));
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        MainSharedViewModel mainSharedViewModel = this.f34565h;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.F.setValue("arena-upcoming-leagues");
            ArenaUpcomingViewModel arenaUpcomingViewModel = (ArenaUpcomingViewModel) r();
            fd.c cVar = arenaUpcomingViewModel.f8960q;
            if (cVar != null) {
                cVar.a();
                yk.g.H(u0.f(arenaUpcomingViewModel), null, null, new tc.e(arenaUpcomingViewModel, null), 3);
                return;
            } else {
                Intrinsics.k("timer");
                throw null;
            }
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        ArenaRepository arenaRepository = bVar.a();
        yk.g.i(arenaRepository);
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(iu.a0.a(ArenaUpcomingViewModel.class), new n(k10, c10, arenaRepository, userRepository, 2));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ArenaUpcomingViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ArenaUpcomingViewModel.class, "<this>", ArenaUpcomingViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ArenaUpcomingViewModel arenaUpcomingViewModel = (ArenaUpcomingViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(arenaUpcomingViewModel);
            this.f17284b = arenaUpcomingViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            this.f34565h = fragmentComponent.f();
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
