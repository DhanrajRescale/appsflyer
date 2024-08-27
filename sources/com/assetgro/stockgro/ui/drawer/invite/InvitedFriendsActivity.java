package com.assetgro.stockgro.ui.drawer.invite;

import androidx.lifecycle.o;
import ba.c1;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import gd.d;
import java.util.ArrayList;
import jd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import ye.e;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/drawer/invite/InvitedFriendsActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/drawer/invite/InviteViewModel;", "Lba/c1;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class InvitedFriendsActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9495l = 0;

    /* renamed from: k, reason: collision with root package name */
    public e f9496k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_invited_friend;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gd.d, ye.e] */
    /* JADX WARN: Type inference failed for: r3v2, types: [k7.w, java.lang.Object] */
    @Override // gd.b
    public final void I() {
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("DATA");
        o parentLifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(parentLifecycle, "<get-lifecycle>(...)");
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        this.f9496k = new d(parentLifecycle, new Object());
        c1 c1Var = (c1) w();
        e eVar = this.f9496k;
        if (eVar != null) {
            c1Var.f4333s.setAdapter(eVar);
            e eVar2 = this.f9496k;
            if (eVar2 != null) {
                eVar2.u(parcelableArrayListExtra);
                c1 c1Var2 = (c1) w();
                c1Var2.f4334t.setNavigationOnClickListener(new a(this, 25));
                return;
            }
            Intrinsics.k("invitedFriendsAdapter");
            throw null;
        }
        Intrinsics.k("invitedFriendsAdapter");
        throw null;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        this.f17254b = activityComponent.h();
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
