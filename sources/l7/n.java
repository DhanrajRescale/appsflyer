package l7;

import java.util.Set;

/* loaded from: classes.dex */
public final class n extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24142c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, String[] strArr, int i10) {
        super(strArr);
        this.f24141b = i10;
        this.f24142c = obj;
    }

    @Override // l7.h
    public final boolean a() {
        switch (this.f24141b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // l7.h
    public final void b(Set set) {
        int i10 = this.f24141b;
        Object obj = this.f24142c;
        switch (i10) {
            case 0:
                ((o) obj).getClass();
                throw null;
            default:
                n.b u02 = n.b.u0();
                u uVar = ((v) obj).f24189j;
                if (u02.v0()) {
                    uVar.run();
                    return;
                } else {
                    u02.w0(uVar);
                    return;
                }
        }
    }
}
