package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import x1.h0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(h0.f39856b);
        return this;
    }
}
