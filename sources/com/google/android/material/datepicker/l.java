package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import d4.n1;
import k7.v0;

/* loaded from: classes2.dex */
public final class l<S> extends w {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f11287m = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f11288b;

    /* renamed from: c, reason: collision with root package name */
    public d f11289c;

    /* renamed from: d, reason: collision with root package name */
    public r f11290d;

    /* renamed from: e, reason: collision with root package name */
    public int f11291e;

    /* renamed from: f, reason: collision with root package name */
    public android.support.v4.media.d f11292f;

    /* renamed from: g, reason: collision with root package name */
    public RecyclerView f11293g;

    /* renamed from: h, reason: collision with root package name */
    public RecyclerView f11294h;

    /* renamed from: i, reason: collision with root package name */
    public View f11295i;

    /* renamed from: j, reason: collision with root package name */
    public View f11296j;

    /* renamed from: k, reason: collision with root package name */
    public View f11297k;

    /* renamed from: l, reason: collision with root package name */
    public View f11298l;

    @Override // androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11288b = bundle.getInt("THEME_RES_ID_KEY");
        com.google.android.gms.internal.p002firebaseauthapi.a.q(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f11289c = (d) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        com.google.android.gms.internal.p002firebaseauthapi.a.q(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f11290d = (r) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        f fVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f11288b);
        this.f11292f = new android.support.v4.media.d(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        r rVar = this.f11289c.f11266a;
        int i12 = 1;
        int i13 = 0;
        if (p.s(R.attr.windowFullscreen, contextThemeWrapper)) {
            i10 = com.assetgro.stockgro.prod.R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = com.assetgro.stockgro.prod.R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.mtrl_calendar_days_of_week_height);
        int i14 = s.f11334d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.mtrl_calendar_month_vertical_padding) * (i14 - 1)) + (resources.getDimensionPixelSize(com.assetgro.stockgro.prod.R.dimen.mtrl_calendar_day_height) * i14) + resources.getDimensionPixelOffset(com.assetgro.stockgro.prod.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(com.assetgro.stockgro.prod.R.id.mtrl_calendar_days_of_week);
        n1.n(gridView, new h(this, i13));
        int i15 = this.f11289c.f11270e;
        if (i15 > 0) {
            fVar = new f(i15);
        } else {
            fVar = new f();
        }
        gridView.setAdapter((ListAdapter) fVar);
        gridView.setNumColumns(rVar.f11330d);
        gridView.setEnabled(false);
        this.f11294h = (RecyclerView) inflate.findViewById(com.assetgro.stockgro.prod.R.id.mtrl_calendar_months);
        getContext();
        this.f11294h.setLayoutManager(new i(this, i11, i11));
        this.f11294h.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.f11289c, new ek.u(this, 9));
        this.f11294h.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.assetgro.stockgro.prod.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(com.assetgro.stockgro.prod.R.id.mtrl_calendar_year_selector_frame);
        this.f11293g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f11293g.setLayoutManager(new GridLayoutManager(integer));
            this.f11293g.setAdapter(new a0(this));
            this.f11293g.i(new j(this));
        }
        if (inflate.findViewById(com.assetgro.stockgro.prod.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(com.assetgro.stockgro.prod.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            n1.n(materialButton, new h(this, 2));
            View findViewById = inflate.findViewById(com.assetgro.stockgro.prod.R.id.month_navigation_previous);
            this.f11295i = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(com.assetgro.stockgro.prod.R.id.month_navigation_next);
            this.f11296j = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f11297k = inflate.findViewById(com.assetgro.stockgro.prod.R.id.mtrl_calendar_year_selector_frame);
            this.f11298l = inflate.findViewById(com.assetgro.stockgro.prod.R.id.mtrl_calendar_day_selector_frame);
            q(1);
            materialButton.setText(this.f11290d.c());
            this.f11294h.j(new k(this, vVar, materialButton));
            materialButton.setOnClickListener(new h.b(this, 6));
            this.f11296j.setOnClickListener(new g(this, vVar, i12));
            this.f11295i.setOnClickListener(new g(this, vVar, i13));
        }
        if (!p.s(R.attr.windowFullscreen, contextThemeWrapper)) {
            new v0().a(this.f11294h);
        }
        this.f11294h.i0(vVar.f11343d.f11266a.d(this.f11290d));
        n1.n(this.f11294h, new h(this, i12));
        return inflate;
    }

    @Override // androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f11288b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11289c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f11290d);
    }

    public final void p(r rVar) {
        boolean z10;
        v vVar = (v) this.f11294h.getAdapter();
        int d10 = vVar.f11343d.f11266a.d(rVar);
        int d11 = d10 - vVar.f11343d.f11266a.d(this.f11290d);
        boolean z11 = false;
        if (Math.abs(d11) > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (d11 > 0) {
            z11 = true;
        }
        this.f11290d = rVar;
        int i10 = 2;
        if (z10 && z11) {
            this.f11294h.i0(d10 - 3);
            this.f11294h.post(new a8.o(d10, i10, this));
        } else if (z10) {
            this.f11294h.i0(d10 + 3);
            this.f11294h.post(new a8.o(d10, i10, this));
        } else {
            this.f11294h.post(new a8.o(d10, i10, this));
        }
    }

    public final void q(int i10) {
        this.f11291e = i10;
        if (i10 == 2) {
            this.f11293g.getLayoutManager().t0(this.f11290d.f11329c - ((a0) this.f11293g.getAdapter()).f11263d.f11289c.f11266a.f11329c);
            this.f11297k.setVisibility(0);
            this.f11298l.setVisibility(8);
            this.f11295i.setVisibility(8);
            this.f11296j.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f11297k.setVisibility(8);
            this.f11298l.setVisibility(0);
            this.f11295i.setVisibility(0);
            this.f11296j.setVisibility(0);
            p(this.f11290d);
        }
    }
}
