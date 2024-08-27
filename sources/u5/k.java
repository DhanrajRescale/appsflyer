package u5;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import lp.i1;

/* loaded from: classes.dex */
public final class k implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f36799a;

    public k(p pVar) {
        this.f36799a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f36799a;
        i1 i1Var = p.f36827j;
        pVar.g();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f36799a;
        i1 i1Var = p.f36827j;
        pVar.g();
    }
}
