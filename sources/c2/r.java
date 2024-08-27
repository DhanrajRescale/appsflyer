package c2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final q f7831a = new q();

    /* renamed from: b, reason: collision with root package name */
    public final q f7832b = new q();

    public final void a(androidx.compose.ui.node.a aVar, boolean z10) {
        q qVar = this.f7831a;
        if (z10) {
            qVar.a(aVar);
        } else if (!qVar.b(aVar)) {
            this.f7832b.a(aVar);
        }
    }

    public final boolean b() {
        boolean z10;
        if (this.f7832b.f7812c.isEmpty() && this.f7831a.f7812c.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
