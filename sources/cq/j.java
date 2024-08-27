package cq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class j implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f13062f = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13063a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13064b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f13065c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f13066d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final i f13067e = new i(this, 0);

    public j(Executor executor) {
        this.f13063a = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f13064b) {
            int i10 = this.f13065c;
            if (i10 != 4 && i10 != 3) {
                long j10 = this.f13066d;
                i iVar = new i(this, runnable);
                this.f13064b.add(iVar);
                this.f13065c = 2;
                try {
                    this.f13063a.execute(this.f13067e);
                    if (this.f13065c != 2) {
                        return;
                    }
                    synchronized (this.f13064b) {
                        try {
                            if (this.f13066d == j10 && this.f13065c == 2) {
                                this.f13065c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f13064b) {
                        try {
                            int i11 = this.f13065c;
                            boolean z10 = true;
                            if ((i11 != 1 && i11 != 2) || !this.f13064b.removeLastOccurrence(iVar)) {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f13064b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + UrlTreeKt.componentParamPrefix + this.f13063a + UrlTreeKt.componentParamSuffix;
    }
}
