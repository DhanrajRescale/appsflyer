package ll;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f24910a = new ThreadLocal();

    public final void a() {
        ThreadLocal threadLocal = this.f24910a;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() - 1;
        if (intValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(intValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        ThreadLocal threadLocal = this.f24910a;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() + 1;
        threadLocal.set(Integer.valueOf(intValue));
        try {
            if (intValue <= 15) {
                command.run();
            } else {
                h.f24911c.f24912a.execute(command);
            }
            a();
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
