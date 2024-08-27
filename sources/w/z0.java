package w;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class z0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i10, int i11) {
        super("Mutation interrupted");
        this.f38738a = i10;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f38738a) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                return this;
            case 3:
                setStackTrace(g1.p.f16419a);
                return this;
            default:
                setStackTrace(x1.h0.f39856b);
                return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i10) {
        super("The coroutine scope left the composition");
        this.f38738a = i10;
        if (i10 == 3) {
            super("The Modifier.Node was detached");
        } else if (i10 != 4) {
        } else {
            super("Pointer input was reset");
        }
    }
}
