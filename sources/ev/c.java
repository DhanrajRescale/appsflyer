package ev;

import dv.s;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public String f15868a;

    @Override // ev.a
    public final boolean a(s sVar) {
        if (sVar == null) {
            return false;
        }
        return sVar.c().equalsIgnoreCase(this.f15868a);
    }
}
