package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzabj {
    zzaaf zza;
    Executor zzb;

    public final Task zzS(final zzabi zzabiVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzabh
            @Override // java.lang.Runnable
            public final void run() {
                zzabiVar.zzc(taskCompletionSource, zzabj.this.zza);
            }
        });
        return taskCompletionSource.getTask();
    }
}
