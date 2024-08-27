package xu;

import qu.i0;

/* loaded from: classes2.dex */
public final class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f40591c;

    public j(Runnable runnable, long j10, de.d dVar) {
        super(j10, dVar);
        this.f40591c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f40591c.run();
        } finally {
            this.f40590b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f40591c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(i0.w(runnable));
        sb2.append(", ");
        sb2.append(this.f40589a);
        sb2.append(", ");
        sb2.append(this.f40590b);
        sb2.append(']');
        return sb2.toString();
    }
}
