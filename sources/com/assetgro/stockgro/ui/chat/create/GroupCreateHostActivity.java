package com.assetgro.stockgro.ui.chat.create;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.d1;
import ba.o;
import com.assetgro.stockgro.prod.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import gd.b;
import jd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import od.e;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/create/GroupCreateHostActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/chat/create/GroupCreateViewModel;", "Lba/o;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class GroupCreateHostActivity extends b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9114k = 0;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_create_group_host;
    }

    @Override // gd.b
    public final void I() {
        Bundle extras;
        o oVar = (o) w();
        String string = getString(R.string.text_create_group);
        Toolbar toolbar = oVar.f5629s;
        toolbar.setTitle(string);
        v(toolbar);
        u(toolbar);
        toolbar.setNavigationOnClickListener(new a(this, 1));
        d1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(aVar, "beginTransaction(...)");
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.getString("GROUP_TYPE") != null) {
            int i10 = e.f29968k;
            Bundle extras2 = getIntent().getExtras();
            Bundle bundle = new Bundle();
            bundle.putAll(extras2);
            e eVar = new e();
            eVar.setArguments(bundle);
            aVar.e(R.id.container_fragment, eVar, "CreateSocialGroupFragment", 1);
        }
        aVar.h(false);
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
