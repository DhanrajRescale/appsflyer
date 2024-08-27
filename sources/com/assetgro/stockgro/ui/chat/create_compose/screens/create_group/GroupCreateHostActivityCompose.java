package com.assetgro.stockgro.ui.chat.create_compose.screens.create_group;

import androidx.compose.foundation.layout.e;
import b1.c;
import b1.d;
import ba.g0;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import id.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import pd.j0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/create_compose/screens/create_group/GroupCreateHostActivityCompose;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/create/GroupCreateViewModel;", "Lba/g0;", "<init>", "()V", "sb/b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupCreateHostActivityCompose extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final sb.b f9132k = new sb.b(19, 0);

    @Override // gd.b
    public final int F() {
        return R.layout.activity_group_create_host_compose;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((GroupCreateViewModel) x()).f9084g.observe(this, new a(3, new j0(this, 0)));
        ((GroupCreateViewModel) x()).f9123v.observe(this, new a(3, new j0(this, 1)));
    }

    @Override // gd.b
    public final void I() {
        g0 g0Var = (g0) w();
        e eVar = new e(this, 22);
        Object obj = d.f3079a;
        g0Var.f4772s.setContent(new c(eVar, true, 509074089));
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.g();
        FirebaseAnalytics d10 = activityComponent.f14246a.d();
        g.i(d10);
        this.f17256d = d10;
        Analytics o10 = activityComponent.f14246a.o();
        g.i(o10);
        this.f17257e = o10;
        n0 h10 = activityComponent.f14246a.h();
        g.i(h10);
        this.f17258f = h10;
    }
}
