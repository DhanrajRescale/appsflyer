package cm;

import android.os.Bundle;
import androidx.fragment.app.g0;
import androidx.fragment.app.j0;

/* loaded from: classes.dex */
public abstract class b extends g0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public c f8228a;

    @Override // androidx.fragment.app.g0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j0 activity = getActivity();
        if (activity instanceof c) {
            this.f8228a = (c) activity;
            return;
        }
        throw new IllegalStateException("Cannot use this fragment without the helper activity");
    }
}
