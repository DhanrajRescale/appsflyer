package le;

import ek.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f24605a;

    public b(androidx.compose.foundation.layout.e eVar) {
        this.f24605a = eVar;
    }

    @Override // le.d
    public final void b() {
        Unit unit;
        fv.e eVar = c.f24606a;
        Function2 function2 = this.f24605a;
        if (eVar != null) {
            if (!eVar.a()) {
                c.a(function2);
            }
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            c.a(function2);
        }
    }

    @Override // le.d
    public final void e(boolean z10) {
        if (z10) {
            Object[] objArr = new Object[0];
            Intrinsics.checkNotNullParameter("ChatChannelManager", "tag");
            com.google.android.gms.internal.p002firebaseauthapi.a.g("connection established", "s", objArr, "params", "ChatChannelManager").getClass();
            u.A(objArr);
            c.a(this.f24605a);
        }
    }
}
