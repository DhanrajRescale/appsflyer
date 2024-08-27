package com.assetgro.stockgro.feature_social.presentation;

import android.content.Context;
import android.content.Intent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import ba.n3;
import com.assetgro.stockgro.data.WifiService;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FollowerRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileActivity;
import com.assetgro.stockgro.feature_social.presentation.RiaProfileViewModel;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.u;
import ea.v;
import eb.c;
import gd.b;
import ib.a0;
import ib.e;
import ib.f;
import ib.p;
import ig.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qu.i0;
import wn.g;
import yk.j;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_social/presentation/RiaProfileActivity;", "Lgd/b;", "Lcom/assetgro/stockgro/feature_social/presentation/RiaProfileViewModel;", "Lba/n3;", "Landroid/view/View;", "bindingView", HttpUrl.FRAGMENT_ENCODE_SET, "setupPopupMenu", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "isSheetOpened", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RiaProfileActivity extends b {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f8791m = 0;

    /* renamed from: k, reason: collision with root package name */
    public PopupMenu f8792k;

    /* renamed from: l, reason: collision with root package name */
    public MenuItem f8793l;

    public static final void K(RiaProfileActivity riaProfileActivity, String str, Integer num) {
        ((n3) riaProfileActivity.w()).A.setText(str);
        if (num != null) {
            ((n3) riaProfileActivity.w()).A.setIconResource(R.drawable.grid_tick);
        } else {
            ((n3) riaProfileActivity.w()).A.setIcon(null);
        }
    }

    @Override // gd.b
    public final int F() {
        return R.layout.activity_ria_profile;
    }

    @Override // gd.b
    public final void H() {
        super.H();
        ((RiaProfileViewModel) x()).f8798r.observe(this, new c(4, new e(this)));
        ((RiaProfileViewModel) x()).f8802v.observe(this, new c(4, new f(this, 0)));
        ((RiaProfileViewModel) x()).f8799s.observe(this, new c(4, new f(this, 1)));
        ((RiaProfileViewModel) x()).f9084g.observe(this, new c(4, new f(this, 2)));
        ((RiaProfileViewModel) x()).f8801u.observe(this, new c(4, new f(this, 3)));
    }

    @Override // gd.b
    public final void I() {
        String userId;
        u(((n3) w()).T);
        Toolbar toolbar = ((n3) w()).T;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        v(toolbar);
        ((n3) w()).p(this);
        Intent intent = getIntent();
        if (intent == null || (userId = intent.getStringExtra("USER_IDENTIFIER")) == null) {
            userId = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ((RiaProfileViewModel) x()).f8804x = userId;
        ((RiaProfileViewModel) x()).k(a0.f19755a);
        MaterialCardView overflowMenu = ((n3) w()).E;
        Intrinsics.checkNotNullExpressionValue(overflowMenu, "overflowMenu");
        setupPopupMenu(overflowMenu);
        MaterialCardView overflowMenuCollapsable = ((n3) w()).F;
        Intrinsics.checkNotNullExpressionValue(overflowMenuCollapsable, "overflowMenuCollapsable");
        setupPopupMenu(overflowMenuCollapsable);
        RiaProfileViewModel riaProfileViewModel = (RiaProfileViewModel) x();
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (Intrinsics.a(userId, riaProfileViewModel.f9081d.getCurrentUserId())) {
            MaterialCardView overflowMenu2 = ((n3) w()).E;
            Intrinsics.checkNotNullExpressionValue(overflowMenu2, "overflowMenu");
            zq.f.M(overflowMenu2);
            MaterialCardView overflowMenuCollapsable2 = ((n3) w()).F;
            Intrinsics.checkNotNullExpressionValue(overflowMenuCollapsable2, "overflowMenuCollapsable");
            zq.f.M(overflowMenuCollapsable2);
            MaterialButton followFollowingButton = ((n3) w()).A;
            Intrinsics.checkNotNullExpressionValue(followFollowingButton, "followFollowingButton");
            zq.f.M(followFollowingButton);
            MaterialButton unblockButton = ((n3) w()).V;
            Intrinsics.checkNotNullExpressionValue(unblockButton, "unblockButton");
            zq.f.M(unblockButton);
        }
        final int i10 = 0;
        ((n3) w()).F.setOnClickListener(new View.OnClickListener(this) { // from class: ib.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiaProfileActivity f19765b;

            {
                this.f19765b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RiaProfileResponseDto.ExpertMeta expertMeta;
                String userId2;
                RiaProfileResponseDto.ExpertMeta expertMeta2;
                String userId3;
                int i11 = i10;
                RiaProfileActivity this$0 = this.f19765b;
                switch (i11) {
                    case 0:
                        int i12 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu = this$0.f8792k;
                        if (popupMenu != null) {
                            popupMenu.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 1:
                        int i13 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu2 = this$0.f8792k;
                        if (popupMenu2 != null) {
                            popupMenu2.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 2:
                        int i14 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i0 i0Var = ((RiaProfileViewModel) this$0.x()).f8803w;
                        boolean a10 = Intrinsics.a(i0Var, jb.a.f21291i);
                        a0 a0Var = a0.f19756b;
                        String uuid = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (a10) {
                            RiaProfileViewModel riaProfileViewModel2 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto != null && (expertMeta2 = riaProfileResponseDto.getExpertMeta()) != null && (userId3 = expertMeta2.getUserId()) != null) {
                                uuid = userId3;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "userId");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel2.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel2), null, null, new b0(riaProfileViewModel2, uuid, null), 3);
                                return;
                            }
                        }
                        if (Intrinsics.a(i0Var, jb.a.f21292j)) {
                            RiaProfileViewModel riaProfileViewModel3 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto2 = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto2 != null && (expertMeta = riaProfileResponseDto2.getExpertMeta()) != null && (userId2 = expertMeta.getUserId()) != null) {
                                uuid = userId2;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "uuid");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel3.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel3.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel3), null, null, new g0(riaProfileViewModel3, uuid, null), 3);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i15 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 4:
                        int i16 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 5:
                        int i17 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    case 6:
                        int i18 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    default:
                        int i19 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View findViewById = this$0.findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        o oVar = new o(composeView, this$0, viewGroup, 1);
                        Object obj = b1.d.f3079a;
                        composeView.setContent(new b1.c(oVar, true, -836165915));
                        viewGroup.addView(composeView);
                        return;
                }
            }
        });
        final int i11 = 1;
        ((n3) w()).E.setOnClickListener(new View.OnClickListener(this) { // from class: ib.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiaProfileActivity f19765b;

            {
                this.f19765b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RiaProfileResponseDto.ExpertMeta expertMeta;
                String userId2;
                RiaProfileResponseDto.ExpertMeta expertMeta2;
                String userId3;
                int i112 = i11;
                RiaProfileActivity this$0 = this.f19765b;
                switch (i112) {
                    case 0:
                        int i12 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu = this$0.f8792k;
                        if (popupMenu != null) {
                            popupMenu.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 1:
                        int i13 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu2 = this$0.f8792k;
                        if (popupMenu2 != null) {
                            popupMenu2.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 2:
                        int i14 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i0 i0Var = ((RiaProfileViewModel) this$0.x()).f8803w;
                        boolean a10 = Intrinsics.a(i0Var, jb.a.f21291i);
                        a0 a0Var = a0.f19756b;
                        String uuid = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (a10) {
                            RiaProfileViewModel riaProfileViewModel2 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto != null && (expertMeta2 = riaProfileResponseDto.getExpertMeta()) != null && (userId3 = expertMeta2.getUserId()) != null) {
                                uuid = userId3;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "userId");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel2.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel2), null, null, new b0(riaProfileViewModel2, uuid, null), 3);
                                return;
                            }
                        }
                        if (Intrinsics.a(i0Var, jb.a.f21292j)) {
                            RiaProfileViewModel riaProfileViewModel3 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto2 = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto2 != null && (expertMeta = riaProfileResponseDto2.getExpertMeta()) != null && (userId2 = expertMeta.getUserId()) != null) {
                                uuid = userId2;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "uuid");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel3.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel3.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel3), null, null, new g0(riaProfileViewModel3, uuid, null), 3);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i15 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 4:
                        int i16 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 5:
                        int i17 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    case 6:
                        int i18 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    default:
                        int i19 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View findViewById = this$0.findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        o oVar = new o(composeView, this$0, viewGroup, 1);
                        Object obj = b1.d.f3079a;
                        composeView.setContent(new b1.c(oVar, true, -836165915));
                        viewGroup.addView(composeView);
                        return;
                }
            }
        });
        View childAt = ((n3) w()).T.getChildAt(0);
        Intrinsics.d(childAt, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        final ConstraintLayout constraintLayout = (ConstraintLayout) childAt;
        ((n3) w()).I.a(new g() { // from class: ib.d
            @Override // wn.d
            public final void a(AppBarLayout appBarLayout, int i12) {
                float f10;
                int i13 = RiaProfileActivity.f8791m;
                RiaProfileActivity this$0 = RiaProfileActivity.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ConstraintLayout linearLayout = constraintLayout;
                Intrinsics.checkNotNullParameter(linearLayout, "$linearLayout");
                double totalScrollRange = ((n3) this$0.w()).I.getTotalScrollRange();
                double d10 = 0.75d * totalScrollRange;
                double d11 = -i12;
                if (d11 <= d10) {
                    ((n3) this$0.w()).O.setAlpha(1.0f);
                    ((n3) this$0.w()).T.setVisibility(8);
                    f10 = s0.g.f34069a;
                } else {
                    f10 = ((float) (d11 - d10)) / ((float) (totalScrollRange - d10));
                    ((n3) this$0.w()).O.setAlpha(1 - f10);
                    ((n3) this$0.w()).T.setVisibility(0);
                }
                linearLayout.setAlpha(f10);
                if (f10 > 0.95f) {
                    ((n3) this$0.w()).T.setBackground(r3.k.getDrawable(this$0, R.drawable.collapsing_app_bar_background));
                } else {
                    ((n3) this$0.w()).T.setBackgroundColor(r3.k.getColor(this$0, R.color.fui_transparent));
                }
            }
        });
        final int i12 = 2;
        ((n3) w()).A.setOnClickListener(new View.OnClickListener(this) { // from class: ib.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiaProfileActivity f19765b;

            {
                this.f19765b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RiaProfileResponseDto.ExpertMeta expertMeta;
                String userId2;
                RiaProfileResponseDto.ExpertMeta expertMeta2;
                String userId3;
                int i112 = i12;
                RiaProfileActivity this$0 = this.f19765b;
                switch (i112) {
                    case 0:
                        int i122 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu = this$0.f8792k;
                        if (popupMenu != null) {
                            popupMenu.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 1:
                        int i13 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu2 = this$0.f8792k;
                        if (popupMenu2 != null) {
                            popupMenu2.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 2:
                        int i14 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i0 i0Var = ((RiaProfileViewModel) this$0.x()).f8803w;
                        boolean a10 = Intrinsics.a(i0Var, jb.a.f21291i);
                        a0 a0Var = a0.f19756b;
                        String uuid = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (a10) {
                            RiaProfileViewModel riaProfileViewModel2 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto != null && (expertMeta2 = riaProfileResponseDto.getExpertMeta()) != null && (userId3 = expertMeta2.getUserId()) != null) {
                                uuid = userId3;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "userId");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel2.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel2), null, null, new b0(riaProfileViewModel2, uuid, null), 3);
                                return;
                            }
                        }
                        if (Intrinsics.a(i0Var, jb.a.f21292j)) {
                            RiaProfileViewModel riaProfileViewModel3 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto2 = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto2 != null && (expertMeta = riaProfileResponseDto2.getExpertMeta()) != null && (userId2 = expertMeta.getUserId()) != null) {
                                uuid = userId2;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "uuid");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel3.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel3.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel3), null, null, new g0(riaProfileViewModel3, uuid, null), 3);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i15 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 4:
                        int i16 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 5:
                        int i17 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    case 6:
                        int i18 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    default:
                        int i19 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View findViewById = this$0.findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        o oVar = new o(composeView, this$0, viewGroup, 1);
                        Object obj = b1.d.f3079a;
                        composeView.setContent(new b1.c(oVar, true, -836165915));
                        viewGroup.addView(composeView);
                        return;
                }
            }
        });
        final int i13 = 3;
        ((n3) w()).f5514s.setOnClickListener(new View.OnClickListener(this) { // from class: ib.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiaProfileActivity f19765b;

            {
                this.f19765b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RiaProfileResponseDto.ExpertMeta expertMeta;
                String userId2;
                RiaProfileResponseDto.ExpertMeta expertMeta2;
                String userId3;
                int i112 = i13;
                RiaProfileActivity this$0 = this.f19765b;
                switch (i112) {
                    case 0:
                        int i122 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu = this$0.f8792k;
                        if (popupMenu != null) {
                            popupMenu.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 1:
                        int i132 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu2 = this$0.f8792k;
                        if (popupMenu2 != null) {
                            popupMenu2.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 2:
                        int i14 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i0 i0Var = ((RiaProfileViewModel) this$0.x()).f8803w;
                        boolean a10 = Intrinsics.a(i0Var, jb.a.f21291i);
                        a0 a0Var = a0.f19756b;
                        String uuid = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (a10) {
                            RiaProfileViewModel riaProfileViewModel2 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto != null && (expertMeta2 = riaProfileResponseDto.getExpertMeta()) != null && (userId3 = expertMeta2.getUserId()) != null) {
                                uuid = userId3;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "userId");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel2.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel2), null, null, new b0(riaProfileViewModel2, uuid, null), 3);
                                return;
                            }
                        }
                        if (Intrinsics.a(i0Var, jb.a.f21292j)) {
                            RiaProfileViewModel riaProfileViewModel3 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto2 = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto2 != null && (expertMeta = riaProfileResponseDto2.getExpertMeta()) != null && (userId2 = expertMeta.getUserId()) != null) {
                                uuid = userId2;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "uuid");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel3.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel3.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel3), null, null, new g0(riaProfileViewModel3, uuid, null), 3);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i15 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 4:
                        int i16 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 5:
                        int i17 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    case 6:
                        int i18 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    default:
                        int i19 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View findViewById = this$0.findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        o oVar = new o(composeView, this$0, viewGroup, 1);
                        Object obj = b1.d.f3079a;
                        composeView.setContent(new b1.c(oVar, true, -836165915));
                        viewGroup.addView(composeView);
                        return;
                }
            }
        });
        final int i14 = 4;
        ((n3) w()).U.setOnClickListener(new View.OnClickListener(this) { // from class: ib.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiaProfileActivity f19765b;

            {
                this.f19765b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RiaProfileResponseDto.ExpertMeta expertMeta;
                String userId2;
                RiaProfileResponseDto.ExpertMeta expertMeta2;
                String userId3;
                int i112 = i14;
                RiaProfileActivity this$0 = this.f19765b;
                switch (i112) {
                    case 0:
                        int i122 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu = this$0.f8792k;
                        if (popupMenu != null) {
                            popupMenu.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 1:
                        int i132 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu2 = this$0.f8792k;
                        if (popupMenu2 != null) {
                            popupMenu2.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 2:
                        int i142 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i0 i0Var = ((RiaProfileViewModel) this$0.x()).f8803w;
                        boolean a10 = Intrinsics.a(i0Var, jb.a.f21291i);
                        a0 a0Var = a0.f19756b;
                        String uuid = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (a10) {
                            RiaProfileViewModel riaProfileViewModel2 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto != null && (expertMeta2 = riaProfileResponseDto.getExpertMeta()) != null && (userId3 = expertMeta2.getUserId()) != null) {
                                uuid = userId3;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "userId");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel2.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel2), null, null, new b0(riaProfileViewModel2, uuid, null), 3);
                                return;
                            }
                        }
                        if (Intrinsics.a(i0Var, jb.a.f21292j)) {
                            RiaProfileViewModel riaProfileViewModel3 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto2 = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto2 != null && (expertMeta = riaProfileResponseDto2.getExpertMeta()) != null && (userId2 = expertMeta.getUserId()) != null) {
                                uuid = userId2;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "uuid");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel3.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel3.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel3), null, null, new g0(riaProfileViewModel3, uuid, null), 3);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i15 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 4:
                        int i16 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 5:
                        int i17 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    case 6:
                        int i18 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    default:
                        int i19 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View findViewById = this$0.findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        o oVar = new o(composeView, this$0, viewGroup, 1);
                        Object obj = b1.d.f3079a;
                        composeView.setContent(new b1.c(oVar, true, -836165915));
                        viewGroup.addView(composeView);
                        return;
                }
            }
        });
        final int i15 = 5;
        ((n3) w()).G.setOnClickListener(new View.OnClickListener(this) { // from class: ib.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiaProfileActivity f19765b;

            {
                this.f19765b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RiaProfileResponseDto.ExpertMeta expertMeta;
                String userId2;
                RiaProfileResponseDto.ExpertMeta expertMeta2;
                String userId3;
                int i112 = i15;
                RiaProfileActivity this$0 = this.f19765b;
                switch (i112) {
                    case 0:
                        int i122 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu = this$0.f8792k;
                        if (popupMenu != null) {
                            popupMenu.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 1:
                        int i132 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu2 = this$0.f8792k;
                        if (popupMenu2 != null) {
                            popupMenu2.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 2:
                        int i142 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i0 i0Var = ((RiaProfileViewModel) this$0.x()).f8803w;
                        boolean a10 = Intrinsics.a(i0Var, jb.a.f21291i);
                        a0 a0Var = a0.f19756b;
                        String uuid = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (a10) {
                            RiaProfileViewModel riaProfileViewModel2 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto != null && (expertMeta2 = riaProfileResponseDto.getExpertMeta()) != null && (userId3 = expertMeta2.getUserId()) != null) {
                                uuid = userId3;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "userId");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel2.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel2), null, null, new b0(riaProfileViewModel2, uuid, null), 3);
                                return;
                            }
                        }
                        if (Intrinsics.a(i0Var, jb.a.f21292j)) {
                            RiaProfileViewModel riaProfileViewModel3 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto2 = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto2 != null && (expertMeta = riaProfileResponseDto2.getExpertMeta()) != null && (userId2 = expertMeta.getUserId()) != null) {
                                uuid = userId2;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "uuid");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel3.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel3.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel3), null, null, new g0(riaProfileViewModel3, uuid, null), 3);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i152 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 4:
                        int i16 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 5:
                        int i17 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    case 6:
                        int i18 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    default:
                        int i19 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View findViewById = this$0.findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        o oVar = new o(composeView, this$0, viewGroup, 1);
                        Object obj = b1.d.f3079a;
                        composeView.setContent(new b1.c(oVar, true, -836165915));
                        viewGroup.addView(composeView);
                        return;
                }
            }
        });
        final int i16 = 6;
        ((n3) w()).H.setOnClickListener(new View.OnClickListener(this) { // from class: ib.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiaProfileActivity f19765b;

            {
                this.f19765b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RiaProfileResponseDto.ExpertMeta expertMeta;
                String userId2;
                RiaProfileResponseDto.ExpertMeta expertMeta2;
                String userId3;
                int i112 = i16;
                RiaProfileActivity this$0 = this.f19765b;
                switch (i112) {
                    case 0:
                        int i122 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu = this$0.f8792k;
                        if (popupMenu != null) {
                            popupMenu.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 1:
                        int i132 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu2 = this$0.f8792k;
                        if (popupMenu2 != null) {
                            popupMenu2.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 2:
                        int i142 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i0 i0Var = ((RiaProfileViewModel) this$0.x()).f8803w;
                        boolean a10 = Intrinsics.a(i0Var, jb.a.f21291i);
                        a0 a0Var = a0.f19756b;
                        String uuid = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (a10) {
                            RiaProfileViewModel riaProfileViewModel2 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto != null && (expertMeta2 = riaProfileResponseDto.getExpertMeta()) != null && (userId3 = expertMeta2.getUserId()) != null) {
                                uuid = userId3;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "userId");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel2.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel2), null, null, new b0(riaProfileViewModel2, uuid, null), 3);
                                return;
                            }
                        }
                        if (Intrinsics.a(i0Var, jb.a.f21292j)) {
                            RiaProfileViewModel riaProfileViewModel3 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto2 = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto2 != null && (expertMeta = riaProfileResponseDto2.getExpertMeta()) != null && (userId2 = expertMeta.getUserId()) != null) {
                                uuid = userId2;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "uuid");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel3.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel3.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel3), null, null, new g0(riaProfileViewModel3, uuid, null), 3);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i152 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 4:
                        int i162 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 5:
                        int i17 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    case 6:
                        int i18 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    default:
                        int i19 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View findViewById = this$0.findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        o oVar = new o(composeView, this$0, viewGroup, 1);
                        Object obj = b1.d.f3079a;
                        composeView.setContent(new b1.c(oVar, true, -836165915));
                        viewGroup.addView(composeView);
                        return;
                }
            }
        });
        final int i17 = 7;
        ((n3) w()).V.setOnClickListener(new View.OnClickListener(this) { // from class: ib.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiaProfileActivity f19765b;

            {
                this.f19765b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RiaProfileResponseDto.ExpertMeta expertMeta;
                String userId2;
                RiaProfileResponseDto.ExpertMeta expertMeta2;
                String userId3;
                int i112 = i17;
                RiaProfileActivity this$0 = this.f19765b;
                switch (i112) {
                    case 0:
                        int i122 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu = this$0.f8792k;
                        if (popupMenu != null) {
                            popupMenu.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 1:
                        int i132 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PopupMenu popupMenu2 = this$0.f8792k;
                        if (popupMenu2 != null) {
                            popupMenu2.show();
                            return;
                        } else {
                            Intrinsics.k("popupMenu");
                            throw null;
                        }
                    case 2:
                        int i142 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        i0 i0Var = ((RiaProfileViewModel) this$0.x()).f8803w;
                        boolean a10 = Intrinsics.a(i0Var, jb.a.f21291i);
                        a0 a0Var = a0.f19756b;
                        String uuid = HttpUrl.FRAGMENT_ENCODE_SET;
                        if (a10) {
                            RiaProfileViewModel riaProfileViewModel2 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto != null && (expertMeta2 = riaProfileResponseDto.getExpertMeta()) != null && (userId3 = expertMeta2.getUserId()) != null) {
                                uuid = userId3;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "userId");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel2.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel2.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel2), null, null, new b0(riaProfileViewModel2, uuid, null), 3);
                                return;
                            }
                        }
                        if (Intrinsics.a(i0Var, jb.a.f21292j)) {
                            RiaProfileViewModel riaProfileViewModel3 = (RiaProfileViewModel) this$0.x();
                            RiaProfileResponseDto riaProfileResponseDto2 = (RiaProfileResponseDto) ((RiaProfileViewModel) this$0.x()).f8798r.getValue();
                            if (riaProfileResponseDto2 != null && (expertMeta = riaProfileResponseDto2.getExpertMeta()) != null && (userId2 = expertMeta.getUserId()) != null) {
                                uuid = userId2;
                            }
                            Intrinsics.checkNotNullParameter(uuid, "uuid");
                            if (!WifiService.INSTANCE.getInstance().isOnline()) {
                                riaProfileViewModel3.k(a0Var);
                                return;
                            } else {
                                riaProfileViewModel3.f9084g.postValue(Boolean.TRUE);
                                yk.g.H(u0.f(riaProfileViewModel3), null, null, new g0(riaProfileViewModel3, uuid, null), 3);
                                return;
                            }
                        }
                        return;
                    case 3:
                        int i152 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 4:
                        int i162 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.finish();
                        return;
                    case 5:
                        int i172 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    case 6:
                        int i18 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((RiaProfileViewModel) this$0.x()).j();
                        return;
                    default:
                        int i19 = RiaProfileActivity.f8791m;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        View findViewById = this$0.findViewById(android.R.id.content);
                        Intrinsics.d(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) findViewById;
                        Context context = viewGroup.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        ComposeView composeView = new ComposeView(context, null, 6);
                        o oVar = new o(composeView, this$0, viewGroup, 1);
                        Object obj = b1.d.f3079a;
                        composeView.setContent(new b1.c(oVar, true, -836165915));
                        viewGroup.addView(composeView);
                        return;
                }
            }
        });
        yk.g.H(j.X0(this), null, null, new p(this, null), 3);
    }

    public final void setupPopupMenu(@NotNull View bindingView) {
        Intrinsics.checkNotNullParameter(bindingView, "bindingView");
        PopupMenu popupMenu = new PopupMenu(this, bindingView);
        this.f8792k = popupMenu;
        MenuInflater menuInflater = popupMenu.getMenuInflater();
        PopupMenu popupMenu2 = this.f8792k;
        if (popupMenu2 != null) {
            menuInflater.inflate(R.menu.overflow_menu_ria, popupMenu2.getMenu());
            PopupMenu popupMenu3 = this.f8792k;
            if (popupMenu3 != null) {
                MenuItem findItem = popupMenu3.getMenu().findItem(R.id.menu_block_unblock_user);
                Intrinsics.checkNotNullExpressionValue(findItem, "findItem(...)");
                this.f8793l = findItem;
                PopupMenu popupMenu4 = this.f8792k;
                if (popupMenu4 != null) {
                    popupMenu4.setOnMenuItemClickListener(new a(this, 2));
                    return;
                } else {
                    Intrinsics.k("popupMenu");
                    throw null;
                }
            }
            Intrinsics.k("popupMenu");
            throw null;
        }
        Intrinsics.k("popupMenu");
        throw null;
    }

    @Override // gd.b
    public final void z(da.a activityComponent) {
        Intrinsics.checkNotNullParameter(activityComponent, "activityComponent");
        v vVar = (v) activityComponent.f14247b;
        kq.e schedulerProvider = activityComponent.f14246a.k();
        ct.a compositeDisposable = activityComponent.f14246a.c();
        UserRepository userRepository = activityComponent.f14246a.m();
        yk.g.i(userRepository);
        FollowerRepository followerRepository = activityComponent.f14246a.f();
        yk.g.i(followerRepository);
        ChatRepository chatRepository = activityComponent.f14246a.b();
        yk.g.i(chatRepository);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(followerRepository, "followerRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        ca.c factory = new ca.c(iu.a0.a(RiaProfileViewModel.class), new u(schedulerProvider, compositeDisposable, userRepository, followerRepository, chatRepository, 0));
        b bVar = vVar.f15290a;
        h1 c10 = com.google.android.gms.internal.p002firebaseauthapi.a.c(bVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.m(bVar, "owner", c10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(c10, factory, defaultCreationExtras, RiaProfileViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(RiaProfileViewModel.class, "<this>", RiaProfileViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            RiaProfileViewModel riaProfileViewModel = (RiaProfileViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(riaProfileViewModel);
            this.f17254b = riaProfileViewModel;
            FirebaseAnalytics d10 = activityComponent.f14246a.d();
            yk.g.i(d10);
            this.f17256d = d10;
            Analytics o10 = activityComponent.f14246a.o();
            yk.g.i(o10);
            this.f17257e = o10;
            n0 h11 = activityComponent.f14246a.h();
            yk.g.i(h11);
            this.f17258f = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }
}
