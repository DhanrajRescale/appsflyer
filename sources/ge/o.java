package ge;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.ym;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import iu.a0;
import k7.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qj.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lge/o;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/helper/search/SearchContactViewModel;", "Lba/ym;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class o extends gd.m<SearchContactViewModel, ym> {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f17326l = 0;

    /* renamed from: g, reason: collision with root package name */
    public Intent f17327g;

    /* renamed from: h, reason: collision with root package name */
    public k f17328h;

    /* renamed from: i, reason: collision with root package name */
    public i0 f17329i;

    /* renamed from: j, reason: collision with root package name */
    public qe.a f17330j;

    /* renamed from: k, reason: collision with root package name */
    public final e.c f17331k;

    public o() {
        e.c registerForActivityResult = registerForActivityResult(new f.b(1), new b3.t(this, 2));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f17331k = registerForActivityResult;
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_search_contact_v2;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((SearchContactViewModel) r()).f9084g.observe(this, new id.a(21, new m(this, 0)));
        ((SearchContactViewModel) r()).f9363z.observe(this, new id.a(21, new m(this, 1)));
        ((SearchContactViewModel) r()).f9359v.observe(this, new id.a(21, new m(this, 2)));
        ((SearchContactViewModel) r()).E.observe(this, new id.a(21, new m(this, 3)));
        ((SearchContactViewModel) r()).F.observe(this, new id.a(21, new m(this, 4)));
        ((SearchContactViewModel) r()).f9362y.observe(this, new id.a(21, new m(this, 5)));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [qj.i0, java.lang.Object] */
    @Override // gd.m
    public final void E(View view) {
        boolean z10;
        Intrinsics.checkNotNullParameter(view, "view");
        if (getActivity() instanceof h.m) {
            ym ymVar = (ym) q();
            String string = getString(R.string.add_friends);
            Toolbar toolbar = ymVar.f6753u;
            toolbar.setTitle(string);
            p(toolbar);
            j0 activity = getActivity();
            Intrinsics.d(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            ((h.m) activity).u(toolbar);
        }
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        new d(lifecycle, new m(this, 7));
        androidx.lifecycle.o lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "<get-lifecycle>(...)");
        this.f17328h = new k(lifecycle2, new m(this, 8));
        RecyclerView recyclerView = ((ym) q()).f6752t.f6890s;
        recyclerView.setAdapter(this.f17328h);
        requireContext();
        int i10 = 1;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        i1 layoutManager = ((ym) q()).f6752t.f6890s.getLayoutManager();
        Intrinsics.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager layoutManager2 = (LinearLayoutManager) layoutManager;
        Intrinsics.checkNotNullParameter(layoutManager2, "layoutManager");
        ?? obj = new Object();
        obj.f32016d = layoutManager2;
        this.f17329i = obj;
        n mOnLoadMoreListener = new n(this);
        Intrinsics.checkNotNullParameter(mOnLoadMoreListener, "mOnLoadMoreListener");
        obj.f32013a = mOnLoadMoreListener;
        RecyclerView recyclerView2 = ((ym) q()).f6752t.f6890s;
        i0 i0Var = this.f17329i;
        if (i0Var != null) {
            recyclerView2.j(i0Var);
            ((ym) q()).f6753u.setNavigationOnClickListener(new l(this, 0));
            ((ym) q()).f6751s.f6902s.setOnClickListener(new l(this, i10));
            if (r3.k.checkSelfPermission(requireContext(), "android.permission.READ_CONTACTS") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            qv.a.a(new Object[0]);
            if (z10) {
                View view2 = ((ym) q()).f6751s.f27491e;
                Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
                t(view2);
            } else {
                View view3 = ((ym) q()).f6751s.f27491e;
                Intrinsics.checkNotNullExpressionValue(view3, "getRoot(...)");
                F(view3);
            }
            ((ym) q()).f6751s.f6903t.setOnClickListener(new l(this, 2));
            setHasOptionsMenu(true);
            return;
        }
        Intrinsics.k("scrollListener");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        SearchView searchView;
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        inflater.inflate(R.menu.toolbar_menu_search, menu);
        androidx.lifecycle.o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        MenuItem findItem = menu.findItem(R.id.action_search);
        findItem.setOnActionExpandListener(new la.a(this, 4));
        View actionView = findItem.getActionView();
        if (actionView instanceof SearchView) {
            searchView = (SearchView) actionView;
        } else {
            searchView = null;
        }
        if (searchView != null) {
            searchView.setOnSearchClickListener(new l(this, 3));
            searchView.setOnQueryTextListener(new f(lifecycle, new m(this, 6)));
        }
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        ChatRepository chatRepository = bVar.b();
        yk.g.i(chatRepository);
        ContactsRepository contactsRepository = fragmentComponent.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        FollowerRepository followerRepository = bVar.f();
        yk.g.i(followerRepository);
        androidx.work.i0 workManager = (androidx.work.i0) bVar.f14273y.get();
        yk.g.i(workManager);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        ca.c factory = new ca.c(a0.a(SearchContactViewModel.class), new ea.i0(k10, c10, chatRepository, contactsRepository, userRepository, followerRepository, workManager));
        gd.m mVar = n0Var.f15238a;
        h1 e10 = com.google.android.gms.internal.p002firebaseauthapi.a.e(mVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.o(mVar, "owner", e10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(e10, factory, defaultCreationExtras, SearchContactViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(SearchContactViewModel.class, "<this>", SearchContactViewModel.class, "modelClass", "modelClass");
        String s7 = qu.i0.s(b10);
        if (s7 != null) {
            SearchContactViewModel searchContactViewModel = (SearchContactViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(searchContactViewModel);
            this.f17284b = searchContactViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h11 = bVar.h();
            yk.g.i(h11);
            this.f17287e = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
