package id;

import android.view.View;
import b5.s0;
import ba.en;
import c0.m0;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.SocialChatListViewModel;
import com.assetgro.stockgro.ui.chat.home.SocialSharedViewModel;
import com.assetgro.stockgro.ui.main.MainSharedViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lid/g;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/chat/SocialChatListViewModel;", "Lba/en;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends gd.m<SocialChatListViewModel, en> {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f19854k = 0;

    /* renamed from: g, reason: collision with root package name */
    public MainSharedViewModel f19855g;

    /* renamed from: h, reason: collision with root package name */
    public SocialSharedViewModel f19856h;

    /* renamed from: i, reason: collision with root package name */
    public m0 f19857i;

    /* renamed from: j, reason: collision with root package name */
    public final e.c f19858j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    public g() {
        e.c registerForActivityResult = registerForActivityResult(new Object(), new s0(0));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f19858j = registerForActivityResult;
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_social_chat_list;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((SocialChatListViewModel) r()).f9096s.observe(this, new a(0, new b(this, 0)));
        H().f9367o.observe(this, new a(0, new b(this, 1)));
        MainSharedViewModel mainSharedViewModel = this.f19855g;
        if (mainSharedViewModel != null) {
            mainSharedViewModel.B.observe(this, new a(0, new b(this, 2)));
            ((SocialChatListViewModel) r()).I.observe(this, new a(0, new b(this, 3)));
        } else {
            Intrinsics.k("mainSharedViewModel");
            throw null;
        }
    }

    @Override // gd.m
    public final void E(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        en enVar = (en) q();
        e eVar = new e(this, 1);
        Object obj = b1.d.f3079a;
        enVar.f4628s.setContent(new b1.c(eVar, true, 1990353428));
    }

    public final SocialSharedViewModel H() {
        SocialSharedViewModel socialSharedViewModel = this.f19856h;
        if (socialSharedViewModel != null) {
            return socialSharedViewModel;
        }
        Intrinsics.k("socialSharedViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onResume() {
        super.onResume();
        ((SocialChatListViewModel) r()).o(new m(true));
        MainSharedViewModel mainSharedViewModel = this.f19855g;
        if (mainSharedViewModel != null) {
            Intrinsics.checkNotNullParameter("social-chat", "<set-?>");
            mainSharedViewModel.H = "social-chat";
            MainSharedViewModel mainSharedViewModel2 = this.f19855g;
            if (mainSharedViewModel2 != null) {
                mainSharedViewModel2.i();
                ((SocialChatListViewModel) r()).h();
                return;
            } else {
                Intrinsics.k("mainSharedViewModel");
                throw null;
            }
        }
        Intrinsics.k("mainSharedViewModel");
        throw null;
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        this.f17284b = fragmentComponent.j();
        da.b bVar = fragmentComponent.f14279b;
        FirebaseAnalytics d10 = bVar.d();
        yk.g.i(d10);
        this.f17285c = d10;
        Analytics o10 = bVar.o();
        yk.g.i(o10);
        this.f17286d = o10;
        n0 h10 = bVar.h();
        yk.g.i(h10);
        this.f17287e = h10;
        this.f19855g = fragmentComponent.f();
        this.f19856h = fragmentComponent.k();
    }
}
