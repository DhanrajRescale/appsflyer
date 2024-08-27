package androidx.activity;

import android.content.Context;
import androidx.fragment.app.j0;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f850b;

    public /* synthetic */ e(m mVar, int i10) {
        this.f849a = i10;
        this.f850b = mVar;
    }

    @Override // d.b
    public final void a(Context context) {
        int i10 = this.f849a;
        m mVar = this.f850b;
        switch (i10) {
            case 0:
                m.l(mVar);
                return;
            default:
                j0.n((j0) mVar);
                return;
        }
    }
}
