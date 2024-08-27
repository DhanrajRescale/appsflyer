package l7;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f24197a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final s f24198b;

    /* renamed from: c, reason: collision with root package name */
    public volatile q7.g f24199c;

    public x(s sVar) {
        this.f24198b = sVar;
    }

    public final q7.g a() {
        this.f24198b.a();
        if (this.f24197a.compareAndSet(false, true)) {
            if (this.f24199c == null) {
                String b10 = b();
                s sVar = this.f24198b;
                sVar.a();
                sVar.b();
                this.f24199c = new q7.g(((q7.b) sVar.f24162d.A()).f31808a.compileStatement(b10));
            }
            return this.f24199c;
        }
        String b11 = b();
        s sVar2 = this.f24198b;
        sVar2.a();
        sVar2.b();
        return new q7.g(((q7.b) sVar2.f24162d.A()).f31808a.compileStatement(b11));
    }

    public abstract String b();

    public final void c(q7.g gVar) {
        if (gVar == this.f24199c) {
            this.f24197a.set(false);
        }
    }
}
