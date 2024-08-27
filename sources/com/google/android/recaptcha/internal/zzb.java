package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.jetbrains.annotations.NotNull;
import qu.l0;
import qu.x1;

/* loaded from: classes2.dex */
public final class zzb {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final Task zza(@NotNull l0 l0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        ((x1) l0Var).I(new zza(taskCompletionSource, l0Var));
        return taskCompletionSource.getTask();
    }
}
