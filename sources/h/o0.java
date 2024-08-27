package h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17720a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f17720a) {
            case 0:
                new Thread(command).start();
                return;
            case 1:
                command.run();
                return;
            case 2:
                command.run();
                return;
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                new Handler(Looper.getMainLooper()).post(command);
                return;
        }
    }
}
