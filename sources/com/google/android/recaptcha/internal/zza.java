package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import iu.k;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import qu.i1;
import qu.l0;
import qu.t;
import qu.x1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zza extends k implements Function1 {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ l0 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(TaskCompletionSource taskCompletionSource, l0 l0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Throwable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        t tVar;
        Exception exc;
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof CancellationException) {
            this.zza.setException((Exception) th2);
        } else {
            Object P = ((x1) this.zzb).P();
            if (!(P instanceof i1)) {
                Exception exc2 = null;
                if (P instanceof t) {
                    tVar = (t) P;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    exc = tVar.f32267a;
                } else {
                    exc = null;
                }
                if (exc == null) {
                    this.zza.setResult(this.zzb.c());
                } else {
                    TaskCompletionSource taskCompletionSource = this.zza;
                    if (exc instanceof Exception) {
                        exc2 = exc;
                    }
                    if (exc2 == null) {
                        exc2 = new RuntimeExecutionException(exc);
                    }
                    taskCompletionSource.setException(exc2);
                }
            } else {
                throw new IllegalStateException("This job has not completed yet".toString());
            }
        }
        return Unit.f23355a;
    }
}
