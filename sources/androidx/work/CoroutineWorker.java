package androidx.work;

import android.content.Context;
import c2.e1;
import h.q0;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qu.q1;
import qu.r0;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u0006\u0010\u0011\u001a\u00020\nR\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lop/a;", "Landroidx/work/t;", "startWork", "Landroidx/work/m;", "getForegroundInfo", "(Lyt/a;)Ljava/lang/Object;", "Landroidx/work/k;", "data", HttpUrl.FRAGMENT_ENCODE_SET, "setProgress", "(Landroidx/work/k;Lyt/a;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/m;Lyt/a;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "Lqu/r;", "job", "Lqu/r;", "getJob$work_runtime_ktx_release", "()Lqu/r;", "Ll8/j;", "future", "Ll8/j;", "getFuture$work_runtime_ktx_release", "()Ll8/j;", "Lqu/b0;", "coroutineContext", "Lqu/b0;", "getCoroutineContext", "()Lqu/b0;", "getCoroutineContext$annotations", "()V", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    @NotNull
    private final qu.b0 coroutineContext;

    @NotNull
    private final l8.j future;

    @NotNull
    private final qu.r job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [l8.h, l8.j, java.lang.Object] */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.job = hl.f.l();
        ?? obj = new Object();
        Intrinsics.checkNotNullExpressionValue(obj, "create()");
        this.future = obj;
        obj.a(new q0(this, 14), (k8.j) ((h.c) getTaskExecutor()).f17583b);
        this.coroutineContext = r0.f32255a;
    }

    @ut.a
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, yt.a aVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(yt.a aVar);

    @NotNull
    public qu.b0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(@NotNull yt.a<? super m> aVar) {
        return getForegroundInfo$suspendImpl(this, aVar);
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final op.a getForegroundInfoAsync() {
        q1 context = hl.f.l();
        qu.b0 coroutineContext = getCoroutineContext();
        coroutineContext.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        vu.f d10 = hl.f.d(kotlin.coroutines.g.a(coroutineContext, context));
        p pVar = new p(context);
        yk.g.H(d10, null, null, new h(pVar, this, null), 3);
        return pVar;
    }

    @NotNull
    /* renamed from: getFuture$work_runtime_ktx_release, reason: from getter */
    public final l8.j getFuture() {
        return this.future;
    }

    @NotNull
    /* renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final qu.r getJob() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(@NotNull m mVar, @NotNull yt.a<? super Unit> frame) {
        Object obj;
        op.a foregroundAsync = setForegroundAsync(mVar);
        Intrinsics.checkNotNullExpressionValue(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                obj = foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            qu.i iVar = new qu.i(1, zt.f.b(frame));
            iVar.s();
            foregroundAsync.a(new m.j(iVar, foregroundAsync, 8), l.f2626a);
            iVar.u(new e1(foregroundAsync, 18));
            obj = iVar.p();
            if (obj == zt.a.f42823a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
        }
        if (obj == zt.a.f42823a) {
            return obj;
        }
        return Unit.f23355a;
    }

    public final Object setProgress(@NotNull k kVar, @NotNull yt.a<? super Unit> frame) {
        Object obj;
        op.a progressAsync = setProgressAsync(kVar);
        Intrinsics.checkNotNullExpressionValue(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                obj = progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            qu.i iVar = new qu.i(1, zt.f.b(frame));
            iVar.s();
            progressAsync.a(new m.j(iVar, progressAsync, 8), l.f2626a);
            iVar.u(new e1(progressAsync, 18));
            obj = iVar.p();
            if (obj == zt.a.f42823a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
        }
        if (obj == zt.a.f42823a) {
            return obj;
        }
        return Unit.f23355a;
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final op.a startWork() {
        yk.g.H(hl.f.d(getCoroutineContext().l(this.job)), null, null, new i(this, null), 3);
        return this.future;
    }
}
