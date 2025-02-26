package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        zzadVar.zza();
        return (TResult) zza(task);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @NonNull
    public static <TResult> Task<TResult> forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forException(@NonNull Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    @NonNull
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    @NonNull
    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            Iterator<? extends Task<?>> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            zzw zzwVar = new zzw();
            zzaf zzafVar = new zzaf(collection.size(), zzwVar);
            Iterator<? extends Task<?>> it2 = collection.iterator();
            while (it2.hasNext()) {
                zzb(it2.next(), zzafVar);
            }
            return zzwVar;
        }
        return forResult(null);
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return whenAll(collection).continueWithTask(TaskExecutors.MAIN_THREAD, new zzab(collection));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> collection) {
        if (collection != null && !collection.isEmpty()) {
            return (Task<List<TResult>>) whenAll((Collection<? extends Task<?>>) collection).continueWith(TaskExecutors.MAIN_THREAD, new zzaa(collection));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <T> Task<T> withTimeout(@NonNull Task<T> task, long j10, @NonNull TimeUnit timeUnit) {
        boolean z10;
        Preconditions.checkNotNull(task, "Task must not be null");
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        final zzb zzbVar = new zzb();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        final com.google.android.gms.internal.tasks.zza zzaVar = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());
        zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j10));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                com.google.android.gms.internal.tasks.zza zzaVar2 = com.google.android.gms.internal.tasks.zza.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                zzb zzbVar2 = zzbVar;
                zzaVar2.removeCallbacksAndMessages(null);
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                } else {
                    if (task2.isCanceled()) {
                        zzbVar2.zza();
                        return;
                    }
                    Exception exception = task2.getException();
                    exception.getClass();
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    private static Object zza(@NonNull Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzae zzaeVar) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzaeVar);
        task.addOnFailureListener(executor, zzaeVar);
        task.addOnCanceledListener(executor, zzaeVar);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task, long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        if (zzadVar.zzb(j10, timeUnit)) {
            return (TResult) zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    public static Task<Void> whenAll(Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll(Arrays.asList(taskArr));
        }
        return forResult(null);
    }
}
