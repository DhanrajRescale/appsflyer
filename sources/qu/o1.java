package qu;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public interface o1 extends CoroutineContext.Element {
    public static final /* synthetic */ int U = 0;

    t0 I(Function1 function1);

    Object S(yt.a aVar);

    void a(CancellationException cancellationException);

    boolean b();

    m d(x1 x1Var);

    o1 getParent();

    t0 j(boolean z10, boolean z11, i0.g2 g2Var);

    Sequence n();

    boolean start();

    CancellationException v();
}
