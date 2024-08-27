package of;

import android.util.Log;
import m.j;
import m.u0;

/* loaded from: classes.dex */
public final class b extends com.android.vending.licensing.b {

    /* renamed from: a, reason: collision with root package name */
    public final e f29976a;

    /* renamed from: b, reason: collision with root package name */
    public final j f29977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f29978c;

    public b(c cVar, e eVar) {
        this.f29978c = cVar;
        this.f29976a = eVar;
        j jVar = new j(14, this, cVar);
        this.f29977b = jVar;
        Log.i("LicenseChecker", "Start monitoring timeout.");
        cVar.f29984e.postDelayed(jVar, 10000L);
    }

    @Override // com.android.vending.licensing.c
    public final void verifyLicense(int i10, String str, String str2) {
        this.f29978c.f29984e.post(new u0(this, i10, str, str2));
    }
}
