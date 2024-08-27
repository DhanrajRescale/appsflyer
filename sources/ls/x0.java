package ls;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class x0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f25347a;

    public x0(y0 y0Var) {
        this.f25347a = y0Var;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (y0.f25351s) {
            this.f25347a.k();
            y0.f25350r = false;
        }
    }
}
