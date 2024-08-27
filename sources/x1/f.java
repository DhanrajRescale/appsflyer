package x1;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final t.o f39844a;

    /* renamed from: b, reason: collision with root package name */
    public final v f39845b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39846c;

    public f(t.o oVar, v vVar) {
        this.f39844a = oVar;
        this.f39845b = vVar;
    }

    public final boolean a(long j10) {
        Object obj;
        List list = this.f39845b.f39925a;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (s.a(((w) obj).f39927a, j10)) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        w wVar = (w) obj;
        if (wVar == null) {
            return false;
        }
        return wVar.f39934h;
    }
}
