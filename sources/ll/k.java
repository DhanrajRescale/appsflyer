package ll;

import com.facebook.bolts.ExecutorException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f24917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f24918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Executor f24919d;

    public /* synthetic */ k(n nVar, i iVar, Executor executor, int i10) {
        this.f24916a = i10;
        this.f24917b = nVar;
        this.f24918c = iVar;
        this.f24919d = executor;
    }

    @Override // ll.i
    public final Object then(m task) {
        Executor executor = this.f24919d;
        i continuation = this.f24918c;
        n tcs = this.f24917b;
        switch (this.f24916a) {
            case 0:
                Intrinsics.checkNotNullParameter(tcs, "$tcs");
                Intrinsics.checkNotNullParameter(continuation, "$continuation");
                Intrinsics.checkNotNullParameter(executor, "$executor");
                Intrinsics.checkNotNullParameter(task, "task");
                g gVar = m.f24924h;
                try {
                    executor.execute(new l(tcs, continuation, task, 0));
                } catch (Exception e10) {
                    tcs.b(new ExecutorException(e10));
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(tcs, "$tcs");
                Intrinsics.checkNotNullParameter(continuation, "$continuation");
                Intrinsics.checkNotNullParameter(executor, "$executor");
                Intrinsics.checkNotNullParameter(task, "task");
                g gVar2 = m.f24924h;
                try {
                    executor.execute(new l(tcs, continuation, task, 1));
                } catch (Exception e11) {
                    tcs.b(new ExecutorException(e11));
                }
                return null;
        }
    }
}
