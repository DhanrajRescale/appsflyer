package h;

import android.content.Context;

/* loaded from: classes.dex */
public final class l implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f17710a;

    public l(m mVar) {
        this.f17710a = mVar;
    }

    @Override // d.b
    public final void a(Context context) {
        m mVar = this.f17710a;
        q q10 = mVar.q();
        q10.a();
        q10.d(mVar.getSavedStateRegistry().a("androidx:appcompat"));
    }
}
