package g7;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k4 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final q4 f16876a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(q4 runner) {
        super("Cancelled isolated runner");
        Intrinsics.checkNotNullParameter(runner, "runner");
        this.f16876a = runner;
    }
}
