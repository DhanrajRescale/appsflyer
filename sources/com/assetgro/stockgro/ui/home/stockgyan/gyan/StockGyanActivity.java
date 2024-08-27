package com.assetgro.stockgro.ui.home.stockgyan.gyan;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.a4;
import com.assetgro.stockgro.data.model.CardInteraction;
import com.assetgro.stockgro.data.model.StockGyanCard;
import com.assetgro.stockgro.data.model.StockGyanIndex;
import com.assetgro.stockgro.data.repository.StockRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanActivity;
import com.assetgro.stockgro.ui.home.stockgyan.gyan.StockGyanViewModel;
import com.assetgro.stockgro.ui.maintenance.MaintenanceWindowActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import da.a;
import ea.r;
import ea.v;
import gd.b;
import iu.a0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import jf.c;
import jf.e;
import jf.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;
import re.d;
import vt.p0;
import yk.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/assetgro/stockgro/ui/home/stockgyan/gyan/StockGyanActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/ui/home/stockgyan/gyan/StockGyanViewModel;", "Lba/a4;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockGyanActivity extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f9565l = 0;

    /* renamed from: k, reason: collision with root package name */
    public e f9566k;

    @Override // gd.b
    public final int F() {
        return R.layout.activity_stock_gyan;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((StockGyanViewModel) x()).f9571r.observe(this, new d(14, new jf.b(this, 0)));
        ((StockGyanViewModel) x()).f9569p.observe(this, new d(14, new jf.b(this, 1)));
        ((StockGyanViewModel) x()).f9572s.observe(this, new d(14, new jf.b(this, 2)));
    }

    @Override // gd.b
    public final void I() {
        Unit unit;
        this.f17260h = "gyan-level-two";
        StockGyanIndex stockGyanIndex = (StockGyanIndex) getIntent().getParcelableExtra("DATA");
        if (stockGyanIndex != null) {
            ((StockGyanViewModel) x()).f9569p.postValue(stockGyanIndex.getStockGyanCards());
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            StockGyanViewModel stockGyanViewModel = (StockGyanViewModel) x();
            String category = getIntent().getStringExtra("category_id");
            if (category == null) {
                category = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Intrinsics.checkNotNullParameter(category, "category");
            stockGyanViewModel.f9084g.postValue(Boolean.TRUE);
            g.H(u0.f(stockGyanViewModel), null, null, new h(stockGyanViewModel, category, null), 3);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("CARD_INTERACTION");
        if (serializableExtra != null) {
            HashMap hashMap = (HashMap) serializableExtra;
            StockGyanViewModel stockGyanViewModel2 = (StockGyanViewModel) x();
            Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
            stockGyanViewModel2.f9570q = hashMap;
        }
        final int i10 = 0;
        ((a4) w()).f4162t.setOnClickListener(new View.OnClickListener(this) { // from class: jf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockGyanActivity f21341b;

            {
                this.f21341b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                StockGyanActivity this$0 = this.f21341b;
                switch (i11) {
                    case 0:
                        int i12 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list != null) {
                            StockGyanCard card = (StockGyanCard) list.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            Intrinsics.checkNotNullParameter(card, "card");
                            com.bumptech.glide.g j10 = com.bumptech.glide.b.c(this$0).f(this$0).j();
                            j10.F = card.getDisplayPicture().getUrl();
                            j10.J = true;
                            j10.A(new d(this$0, 0));
                            return;
                        }
                        return;
                    case 1:
                        int i13 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list2 = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list2 != null) {
                            StockGyanCard stockGyanCard = (StockGyanCard) list2.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            if (((StockGyanViewModel) this$0.x()).f9570q.containsKey(stockGyanCard.getId())) {
                                ((StockGyanViewModel) this$0.x()).h(stockGyanCard.getId(), true ^ ((CardInteraction) p0.e(stockGyanCard.getId(), ((StockGyanViewModel) this$0.x()).f9570q)).isLiked());
                                return;
                            }
                            ((StockGyanViewModel) this$0.x()).h(stockGyanCard.getId(), true);
                            return;
                        }
                        return;
                    default:
                        int i14 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list3 = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list3 != null) {
                            StockGyanCard stockGyanCard2 = (StockGyanCard) list3.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            if (((StockGyanViewModel) this$0.x()).f9570q.containsKey(stockGyanCard2.getId())) {
                                ((StockGyanViewModel) this$0.x()).h(stockGyanCard2.getId(), true ^ ((CardInteraction) p0.e(stockGyanCard2.getId(), ((StockGyanViewModel) this$0.x()).f9570q)).isLiked());
                                return;
                            }
                            ((StockGyanViewModel) this$0.x()).h(stockGyanCard2.getId(), true);
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        ((a4) w()).f4161s.setOnClickListener(new View.OnClickListener(this) { // from class: jf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockGyanActivity f21341b;

            {
                this.f21341b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i11;
                StockGyanActivity this$0 = this.f21341b;
                switch (i112) {
                    case 0:
                        int i12 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list != null) {
                            StockGyanCard card = (StockGyanCard) list.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            Intrinsics.checkNotNullParameter(card, "card");
                            com.bumptech.glide.g j10 = com.bumptech.glide.b.c(this$0).f(this$0).j();
                            j10.F = card.getDisplayPicture().getUrl();
                            j10.J = true;
                            j10.A(new d(this$0, 0));
                            return;
                        }
                        return;
                    case 1:
                        int i13 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list2 = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list2 != null) {
                            StockGyanCard stockGyanCard = (StockGyanCard) list2.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            if (((StockGyanViewModel) this$0.x()).f9570q.containsKey(stockGyanCard.getId())) {
                                ((StockGyanViewModel) this$0.x()).h(stockGyanCard.getId(), true ^ ((CardInteraction) p0.e(stockGyanCard.getId(), ((StockGyanViewModel) this$0.x()).f9570q)).isLiked());
                                return;
                            }
                            ((StockGyanViewModel) this$0.x()).h(stockGyanCard.getId(), true);
                            return;
                        }
                        return;
                    default:
                        int i14 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list3 = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list3 != null) {
                            StockGyanCard stockGyanCard2 = (StockGyanCard) list3.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            if (((StockGyanViewModel) this$0.x()).f9570q.containsKey(stockGyanCard2.getId())) {
                                ((StockGyanViewModel) this$0.x()).h(stockGyanCard2.getId(), true ^ ((CardInteraction) p0.e(stockGyanCard2.getId(), ((StockGyanViewModel) this$0.x()).f9570q)).isLiked());
                                return;
                            }
                            ((StockGyanViewModel) this$0.x()).h(stockGyanCard2.getId(), true);
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 2;
        ((a4) w()).f4163u.setOnClickListener(new View.OnClickListener(this) { // from class: jf.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StockGyanActivity f21341b;

            {
                this.f21341b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                StockGyanActivity this$0 = this.f21341b;
                switch (i112) {
                    case 0:
                        int i122 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list != null) {
                            StockGyanCard card = (StockGyanCard) list.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            Intrinsics.checkNotNullParameter(card, "card");
                            com.bumptech.glide.g j10 = com.bumptech.glide.b.c(this$0).f(this$0).j();
                            j10.F = card.getDisplayPicture().getUrl();
                            j10.J = true;
                            j10.A(new d(this$0, 0));
                            return;
                        }
                        return;
                    case 1:
                        int i13 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list2 = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list2 != null) {
                            StockGyanCard stockGyanCard = (StockGyanCard) list2.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            if (((StockGyanViewModel) this$0.x()).f9570q.containsKey(stockGyanCard.getId())) {
                                ((StockGyanViewModel) this$0.x()).h(stockGyanCard.getId(), true ^ ((CardInteraction) p0.e(stockGyanCard.getId(), ((StockGyanViewModel) this$0.x()).f9570q)).isLiked());
                                return;
                            }
                            ((StockGyanViewModel) this$0.x()).h(stockGyanCard.getId(), true);
                            return;
                        }
                        return;
                    default:
                        int i14 = StockGyanActivity.f9565l;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        List list3 = (List) ((StockGyanViewModel) this$0.x()).f9569p.getValue();
                        if (list3 != null) {
                            StockGyanCard stockGyanCard2 = (StockGyanCard) list3.get(((a4) this$0.w()).f4165w.getCurrentItem());
                            if (((StockGyanViewModel) this$0.x()).f9570q.containsKey(stockGyanCard2.getId())) {
                                ((StockGyanViewModel) this$0.x()).h(stockGyanCard2.getId(), true ^ ((CardInteraction) p0.e(stockGyanCard2.getId(), ((StockGyanViewModel) this$0.x()).f9570q)).isLiked());
                                return;
                            }
                            ((StockGyanViewModel) this$0.x()).h(stockGyanCard2.getId(), true);
                            return;
                        }
                        return;
                }
            }
        });
        ((a4) w()).f4165w.b(new c(this, 0));
    }

    public final void K() {
        Intent intent = new Intent(this, (Class<?>) MaintenanceWindowActivity.class);
        intent.putExtra("DATA", qf.b.f31936k);
        intent.putExtra("SHOW_TOOLBAR", true);
        intent.putExtra("TOOLBAR_TITLE", getString(R.string.text_learn_with_stockgyan));
        startActivity(intent);
        finish();
    }

    @Override // gd.b, androidx.fragment.app.j0, android.app.Activity
    public final void onResume() {
        super.onResume();
        StockGyanViewModel stockGyanViewModel = (StockGyanViewModel) x();
        if (stockGyanViewModel.f9568o.b(qf.b.f31936k)) {
            K();
        }
    }

    @Override // gd.b
    public final void z(a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        StockRepository stockRepository = activityComponent.f14246a.l();
        g.i(stockRepository);
        UserRepository userRepository = activityComponent.f14246a.m();
        g.i(userRepository);
        qf.a maintenanceConfigManager = activityComponent.f14246a.g();
        g.i(maintenanceConfigManager);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(stockRepository, "stockRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(maintenanceConfigManager, "maintenanceConfigManager");
        ca.c factory = new ca.c(a0.a(StockGyanViewModel.class), new r(schedulerProvider, compositeDisposable, stockRepository, userRepository, maintenanceConfigManager, 2));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, StockGyanViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(StockGyanViewModel.class, "<this>", StockGyanViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            StockGyanViewModel stockGyanViewModel = (StockGyanViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            g.j(stockGyanViewModel);
            this.f17254b = stockGyanViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
