package be;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.o;
import ba.gn;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.home.SocialSharedViewModel;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.f;
import gd.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbe/c;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/SocialChatListViewModel;", "Lba/gn;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends m<SocialChatListViewModel, gn> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f6956j = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f6957g;

    /* renamed from: h, reason: collision with root package name */
    public SocialSharedViewModel f6958h;

    /* renamed from: i, reason: collision with root package name */
    public ce.b f6959i;

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_social_discover;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((SocialChatListViewModel) r()).f9084g.observe(this, new id.a(17, new a(this, 0)));
        ((SocialChatListViewModel) r()).f9094q.observe(this, new id.a(17, new a(this, 1)));
        ((SocialChatListViewModel) r()).f9099v.observe(this, new id.a(17, new a(this, 2)));
        ((SocialChatListViewModel) r()).f9098u.observe(this, new id.a(17, new a(this, 3)));
        ((SocialChatListViewModel) r()).f9096s.observe(this, new id.a(17, new a(this, 4)));
        ((SocialChatListViewModel) r()).f9097t.observe(this, new id.a(17, new a(this, 5)));
        MainSharedViewModel mainSharedViewModel = this.f6957g;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.B.observe(this, new id.a(17, new a(this, 6)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        gn gnVar = (gn) q();
        gnVar.f4833v.setOnRefreshListener(new vc.b(this, 7));
        o lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        this.f6959i = new ce.b(lifecycle, new b(this, 0));
        gn gnVar2 = (gn) q();
        ce.b bVar = this.f6959i;
        if (bVar != null) {
            gnVar2.f4830s.setAdapter(bVar);
        } else {
            Intrinsics.k("discoverCategoryAdapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 9876 && i11 == -1) {
            ((SocialChatListViewModel) r()).l();
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        MainSharedViewModel mainSharedViewModel = this.f6957g;
        if (mainSharedViewModel != null) {
            Intrinsics.checkNotNullParameter("social-discover", "<set-?>");
            mainSharedViewModel.H = "social-discover";
            ((SocialChatListViewModel) r()).l();
            ((SocialChatListViewModel) r()).h();
            return;
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void w(f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.j();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        g.i(h10);
        this.f17287e = h10;
        this.f6957g = fragmentComponent.f();
        this.f6958h = fragmentComponent.k();
    }
}
