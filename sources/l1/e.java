package l1;

import i0.g2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t.d0;
import t.i0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f23886a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f23887b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f23888c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f23889d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f23890e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f23891f;

    public e(d dVar, g2 g2Var) {
        this.f23886a = g2Var;
        this.f23887b = dVar;
        int i10 = i0.f34869a;
        this.f23888c = new d0();
        this.f23889d = new d0();
        this.f23890e = new d0();
        this.f23891f = new d0();
    }

    public final boolean a() {
        if (!this.f23888c.c() && !this.f23890e.c() && !this.f23889d.c()) {
            return false;
        }
        return true;
    }

    public final void b(d0 d0Var, Object obj) {
        if (d0Var.d(obj) && this.f23888c.f34865d + this.f23889d.f34865d + this.f23890e.f34865d == 1) {
            this.f23886a.invoke(new d(this, 0));
        }
    }
}
