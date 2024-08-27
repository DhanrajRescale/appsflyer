package fh;

import androidx.fragment.app.j0;
import androidx.lifecycle.h1;
import b3.t;
import ba.dl;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.group.GroupMyProfileViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.n0;
import gd.m;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qu.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfh/b;", "Lgd/m;", "Lcom/assetgro/stockgro/ui/profile/group/GroupMyProfileViewModel;", "Lba/dl;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends m<GroupMyProfileViewModel, dl> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f16100j = 0;

    /* renamed from: g, reason: collision with root package name */
    public g f16101g;

    /* renamed from: h, reason: collision with root package name */
    public String f16102h;

    /* renamed from: i, reason: collision with root package name */
    public final e.c f16103i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f.a, java.lang.Object] */
    public b() {
        e.c registerForActivityResult = registerForActivityResult(new Object(), new t(this, 9));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.f16103i = registerForActivityResult;
    }

    @Override // gd.m
    public final int C() {
        return R.layout.fragment_my_profile_group;
    }

    @Override // gd.m
    public final void D() {
        super.D();
        ((GroupMyProfileViewModel) r()).f9984o.observe(this, new ch.c(2, new a(this, 0)));
        ((GroupMyProfileViewModel) r()).f9987r.observe(this, new ch.c(2, new a(this, 1)));
        ((GroupMyProfileViewModel) r()).f9986q.observe(this, new ch.c(2, new a(this, 2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0134  */
    @Override // gd.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.b.E(android.view.View):void");
    }

    @Override // gd.m
    public final void w(da.f fragmentComponent) {
        Intrinsics.checkNotNullParameter(fragmentComponent, "fragmentComponent");
        da.b bVar = fragmentComponent.f14279b;
        kq.e k10 = bVar.k();
        ct.a c10 = bVar.c();
        UserRepository userRepository = bVar.m();
        yk.g.i(userRepository);
        ChatRepository chatRepository = bVar.b();
        yk.g.i(chatRepository);
        n0 n0Var = fragmentComponent.f14278a;
        com.google.android.gms.internal.p002firebaseauthapi.a.s(n0Var, k10, "schedulerProvider", c10, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        j0 requireActivity = n0Var.f15238a.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ca.c factory = new ca.c(a0.a(GroupMyProfileViewModel.class), new ea.d(k10, c10, userRepository, chatRepository, 9));
        h1 h10 = da.e.h(requireActivity, "owner", factory, "factory");
        y4.c defaultCreationExtras = da.e.u(requireActivity, "owner", h10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h11 = com.google.android.gms.internal.p002firebaseauthapi.a.h(h10, factory, defaultCreationExtras, GroupMyProfileViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(GroupMyProfileViewModel.class, "<this>", GroupMyProfileViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            GroupMyProfileViewModel groupMyProfileViewModel = (GroupMyProfileViewModel) h11.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(groupMyProfileViewModel);
            this.f17284b = groupMyProfileViewModel;
            FirebaseAnalytics d10 = bVar.d();
            yk.g.i(d10);
            this.f17285c = d10;
            Analytics o10 = bVar.o();
            yk.g.i(o10);
            this.f17286d = o10;
            ls.n0 h12 = bVar.h();
            yk.g.i(h12);
            this.f17287e = h12;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
