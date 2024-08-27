package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class q<S> extends w {

    /* renamed from: b, reason: collision with root package name */
    public int f11325b;

    /* renamed from: c, reason: collision with root package name */
    public d f11326c;

    @Override // androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f11325b = bundle.getInt("THEME_RES_ID_KEY");
        com.google.android.gms.internal.p002firebaseauthapi.a.q(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f11326c = (d) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f11325b));
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f11325b);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f11326c);
    }
}
