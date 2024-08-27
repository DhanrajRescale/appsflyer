package nc;

import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.d1;
import androidx.lifecycle.h1;
import androidx.lifecycle.o;
import androidx.work.u;
import b3.t;
import ba.of;
import com.airbnb.deeplinkdispatch.base.MatchIndex;
import com.assetgro.stockgro.data.repository.ArenaRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.arena.asset.host.ArenaAssetHostViewModel;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import ea.l;
import ea.n0;
import gd.m;
import iu.a0;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;
import t3.p;
import yk.g;
import yo.n;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lnc/d;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/arena/asset/host/ArenaAssetHostViewModel;", "Lba/of;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends m<ArenaAssetHostViewModel, of> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f28615i = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f28616g;

    /* renamed from: h, reason: collision with root package name */
    public e f28617h;

    /* JADX WARN: Type inference failed for: r0v0, types: [qj.b, java.lang.Object] */
    public static final void H(d dVar, String str) {
        ?? obj = new Object();
        Context requireContext = dVar.requireContext();
        String string = dVar.getString(R.string.oops);
        String string2 = dVar.getString(R.string.ok);
        u uVar = new u(0);
        Intrinsics.c(requireContext);
        Intrinsics.c(string2);
        Intrinsics.c(string);
        qj.b.b(obj, requireContext, str, string2, null, string, null, false, 0, 0, uVar, 65496);
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_arena_asset_host_v2;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((ArenaAssetHostViewModel) r()).f8945q.observe(this, new eb.c(11, new b(this, 0)));
        ((ArenaAssetHostViewModel) r()).f8946r.observe(this, new eb.c(11, new b(this, 1)));
        ((ArenaAssetHostViewModel) r()).f8944p.observe(this, new eb.c(11, new b(this, 2)));
        I().f9593x.observe(this, new eb.c(11, new b(this, 3)));
        ((ArenaAssetHostViewModel) r()).f8947s.observe(this, new eb.c(11, new b(this, 4)));
        I().C.observe(this, new eb.c(11, new b(this, 5)));
        I().P.observe(this, new eb.c(11, new b(this, 6)));
    }

    @Override // gd.m
    public final void E(View view) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        ((of) q()).p(this);
        final int i10 = 1;
        setHasOptionsMenu(true);
        of ofVar = (of) q();
        String string = getString(R.string.arena);
        Toolbar toolbar = ofVar.f5664w;
        toolbar.setTitle(string);
        p(toolbar);
        toolbar.n(R.menu.menu_prepzone);
        final int i11 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: nc.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f28610b;

            {
                this.f28610b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                d this$0 = this.f28610b;
                switch (i12) {
                    case 0:
                        int i13 = d.f28615i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I().f9587r.postValue(Boolean.TRUE);
                        return;
                    default:
                        int i14 = d.f28615i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.I().j();
                        return;
                }
            }
        });
        Menu menu = toolbar.getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        View actionView = menu.findItem(R.id.menu_item_notifications).getActionView();
        if (actionView != null && (constraintLayout = (ConstraintLayout) actionView.findViewById(R.id.menu_notification_layout)) != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: nc.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f28610b;

                {
                    this.f28610b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12 = i10;
                    d this$0 = this.f28610b;
                    switch (i12) {
                        case 0:
                            int i13 = d.f28615i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.I().f9587r.postValue(Boolean.TRUE);
                            return;
                        default:
                            int i14 = d.f28615i;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.I().j();
                            return;
                    }
                }
            });
        }
        ((of) q()).f5660s.a(new na.b(this, i10));
        d1 childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        e eVar = new e(childFragmentManager, lifecycle, getArguments());
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f28617h = eVar;
        of ofVar2 = (of) q();
        e eVar2 = this.f28617h;
        if (eVar2 != null) {
            ofVar2.f5661t.setAdapter(eVar2);
            new n(((of) q()).f5663v, ((of) q()).f5661t, new t(this, 25)).a();
            ((of) q()).f5661t.setUserInputEnabled(true);
            TabLayout tabLayout = ((of) q()).f5663v;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            Intrinsics.checkNotNullParameter(tabLayout, "<this>");
            View childAt = tabLayout.getChildAt(0);
            Intrinsics.d(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) childAt;
            int childCount = viewGroup.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = viewGroup.getChildAt(i12);
                Intrinsics.d(childAt2, "null cannot be cast to non-null type android.view.ViewGroup");
                ViewGroup viewGroup2 = (ViewGroup) childAt2;
                int childCount2 = viewGroup2.getChildCount();
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt3 = viewGroup2.getChildAt(i13);
                    if (childAt3 instanceof TextView) {
                        TextView textView = (TextView) childAt3;
                        textView.setLetterSpacing(0.1f);
                        textView.setTypeface(p.a(R.font.inter_600, tabLayout.getContext()));
                        textView.setTextSize(1, 11.0f);
                    }
                }
                try {
                    Field declaredField = TabLayout.class.getDeclaredField(MatchIndex.ROOT_VALUE);
                    Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
                    declaredField.setAccessible(true);
                    declaredField.set(tabLayout, Float.valueOf(14 * tabLayout.getContext().getResources().getDisplayMetrics().density));
                } catch (Exception unused) {
                }
            }
            ((of) q()).f5663v.a(new c(this, i11));
            return;
        }
        Intrinsics.k("hostTabAdapter");
        throw null;
    }

    public final MainSharedViewModel I() {
        MainSharedViewModel mainSharedViewModel = this.f28616g;
        if (mainSharedViewModel != null) {
            return mainSharedViewModel;
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        g.i(userRepository);
        ArenaRepository arenaRepository = bVar.a();
        g.i(arenaRepository);
        qf.a maintenanceConfigManager = bVar.g();
        g.i(maintenanceConfigManager);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(arenaRepository, "arenaRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(ArenaAssetHostViewModel.class), new l(k10, c10, userRepository, arenaRepository, maintenanceConfigManager, 1));
        m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, ArenaAssetHostViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(ArenaAssetHostViewModel.class, "<this>", ArenaAssetHostViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            ArenaAssetHostViewModel arenaAssetHostViewModel = (ArenaAssetHostViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(arenaAssetHostViewModel);
            this.f17284b = arenaAssetHostViewModel;
            FirebaseAnalytics d10 = bVar.d();
            g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            g.i(h11);
            this.f17287e = h11;
            this.f28616g = fragmentComponent.f();
            g.i(bVar.d());
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
